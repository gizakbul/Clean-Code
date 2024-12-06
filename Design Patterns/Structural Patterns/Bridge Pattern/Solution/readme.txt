Bu senaryoda, Bridge Pattern kullanarak mevcut kodun karmaşıklığını ve kartesyen çarpan kombinasyonlarının tekrarını azaltacağız. 
Bunu yapmak için, Shape sınıfını bir Renderer arayüzü kullanarak yeniden yapılandıracağız. 
Bu arayüz, şeklin nasıl çizileceğini belirleyen bir metod içerecek. 
Sonrasında VectorRenderer ve RasterRenderer sınıfları bu arayüzü implemente edecek.

Adım Adım Çözüm

Renderer Arayüzü:

Renderer arayüzü, whatToRenderAs metodunu içerir.
Renderer Implementasyonları:

VectorRenderer ve RasterRenderer sınıfları Renderer arayüzünü implemente eder.
Shape Sınıfı:

Shape sınıfı, bir Renderer referansı alır ve toString metodunda bu referansı kullanır.
Özelleştirilmiş Şekil Sınıfları:

Triangle ve Square gibi şekiller Shape sınıfından türetilir ve isimlerini döndüren bir getName metoduna sahiptir.


Açıklamalar

Renderer Arayüzü:

Renderer arayüzü, şeklin nasıl çizileceğini tanımlar (whatToRenderAs metodu).
VectorRenderer ve RasterRenderer:

VectorRenderer ve RasterRenderer, Renderer arayüzünü implemente eder ve whatToRenderAs metodunu özelleştirir.
Shape Sınıfı:

Shape sınıfı, bir Renderer referansı alır ve toString metodunu kullanarak şeklin nasıl çizileceğini belirler.
Shape sınıfı, getName metodunu soyut olarak tanımlar ve alt sınıfların bu metodu implemente etmesini bekler.
Triangle ve Square:

Triangle ve Square, Shape sınıfından türetilir ve getName metodunu implemente eder.
Bu çözüm, Bridge Pattern kullanarak Shape ve Renderer sınıflarını ayırır, bu da şekilleri ve render türlerini bağımsız olarak genişletmeyi kolaylaştırır.