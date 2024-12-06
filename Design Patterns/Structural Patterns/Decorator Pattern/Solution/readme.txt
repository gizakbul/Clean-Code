Bu senaryoda, Dragon sınıfı, hem Bird hem de Lizard özelliklerine sahip olmalıdır. Dragon sınıfı setAge, fly ve crawl metodlarını implemente edecek ve bu metodlar Bird ve Lizard sınıflarının ilgili metodlarını kullanacaktır.

Adım Adım Çözüm
Dragon Sınıfı:
Dragon sınıfının age alanı olmalıdır.
setAge metodu age alanını ayarlamalı ve bu değeri Bird ve Lizard nesnelerine yansıtmalıdır.
fly ve crawl metodları, Bird ve Lizard nesnelerinin ilgili metodlarını çağırmalıdır.

Açıklamalar
Bird Sınıfı:

age alanına bağlı olarak fly metodu ya "flying" ya da "too old" döner.
Lizard Sınıfı:

age alanına bağlı olarak crawl metodu ya "crawling" ya da "too young" döner.
Dragon Sınıfı:

Dragon sınıfı, hem Bird hem de Lizard nesnelerine sahiptir.
setAge metodu, age değerini hem bird hem de lizard nesnelerine yansıtır.
fly metodu bird nesnesinin fly metodunu çağırır.
crawl metodu lizard nesnesinin crawl metodunu çağırır.
Bu çözüm, Dragon nesnesinin yaşına göre uygun şekilde uçabilmesini ve sürünebilmesini sağlar.
