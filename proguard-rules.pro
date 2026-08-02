-keepattributes *Annotation*, InnerClasses
-dontnote kotlinx.serialization.AnnotationsKt # core serialization annotations

# kotlinx-serialization-json specific. Add this if you have java.lang.NoClassDefFoundError kotlinx.serialization.json.JsonObjectSerializer
-keepclassmembers class kotlinx.serialization.json.** { *** Companion; }
-keepclasseswithmembers class kotlinx.serialization.json.** { kotlinx.serialization.KSerializer serializer(...); }

# project specific.
-keep,includedescriptorclasses class com.lockally.sdk.model.**$$serializer { *; }
-keepclassmembers class com.lockally.sdk.model.** { *** Companion; }
-keepclasseswithmembers class com.lockally.sdk.model.** { kotlinx.serialization.KSerializer serializer(...); }
