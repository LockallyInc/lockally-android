package com.lockally.sdk.auth

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

/** A page of results from a cursor-paginated endpoint. */
data class Page<T>(val items: List<T>, val nextCursor: String?)

/**
 * Iterate every item across all pages of a `cursor` / `next_cursor` endpoint as
 * a cold [Flow]. A loop guard caps pages so a misbehaving cursor can't spin.
 *
 * ```kotlin
 * paginate { cursor -> api.v1ContactsGet(cursor = cursor).let { Page(it.data, it.nextCursor) } }
 *   .collect { println(it.id) }
 * ```
 */
fun <T> paginate(maxPages: Int = 10_000, fetch: suspend (cursor: String?) -> Page<T>): Flow<T> = flow {
    var cursor: String? = null
    var pages = 0
    val seen = HashSet<String>()
    while (true) {
        if (pages >= maxPages) throw IllegalStateException("paginate exceeded maxPages ($maxPages) — possible cursor loop")
        val page = fetch(cursor)
        pages++
        page.items.forEach { emit(it) }
        val next = page.nextCursor
        if (next.isNullOrEmpty() || next == cursor || !seen.add(next)) return@flow
        cursor = next
    }
}
