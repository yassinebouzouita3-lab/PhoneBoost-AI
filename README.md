# PhoneBoost AI

تطبيق Android احترافي لتحليل الأداء، البطارية، التخزين، وتجربة الألعاب.
Kotlin + Jetpack Compose + Material 3 + Hilt + MVVM/Clean Architecture.

## كيفية الفتح
1. افتح المجلد في Android Studio (إصدار Ladybug أو أحدث).
2. انتظر مزامنة Gradle (يتطلب اتصال إنترنت لتحميل الاعتماديات لأول مرة).
3. شغّل على محاكي أو جهاز حقيقي بـ Android 12 (API 31) فأعلى.

## أهم الملاحظات
- لا يستخدم Root ولا صلاحيات خطيرة (Dangerous Permissions).
- كل البيانات (بطارية/RAM/تخزين) حقيقية عبر Android APIs رسمية.
- صلاحية "الوصول لإحصاءات الاستخدام" اختيارية بالكامل، يفعّلها المستخدم يدويًا.
- minSdk = 31 (Android 12) — targetSdk/compileSdk = 36 (Android 16).
