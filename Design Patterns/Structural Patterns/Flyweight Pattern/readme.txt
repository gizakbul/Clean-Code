Flyweight pattern, nesne sayısını azaltmak ve bellek kullanımını optimize etmek için yaygın olarak kullanılan bir tasarım desenidir.


Flyweight Pattern, bir yazılım tasarım desenidir ve büyük miktarda benzer nesnelerin oluşturulmasını ve yönetilmesini daha verimli hale getirmeyi amaçlar. Bu desen, nesneleri yeniden kullanarak bellek tüketimini azaltır. Özellikle, aynı veriyle birden çok nesne oluşturulması gerektiğinde, nesnelerin çoğunun yalnızca paylaşılan verilerini tutup, özelleşen kısmı dışarıda tutarak belleği daha verimli kullanmaya olanak tanır.

Flyweight deseninin ana prensibi, ortak verilerin tek bir nesnede saklanması ve her benzer nesne için yalnızca gerektiğinde farklılaşan verilerin saklanmasıdır. Bu sayede benzer nesneler çoğaltıldığında bellekte sadece bir tane ortak nesne bulunur, yalnızca özgül veriler (örneğin, kullanıcı ayarları veya özel durumlar) her nesneye ait olarak saklanır.

Örneğin, bir grafik uygulamasında farklı renklerdeki birçok şekil (örneğin, daireler veya kareler) çiziliyorsa, her şekil için sadece şeklin konumunu ve boyutunu tutan nesneler oluşturulabilirken, renk ve çizim tarzı gibi ortak veriler bir Flyweight nesnesinde tutulabilir. Bu sayede, aynı özelliklere sahip yüzlerce nesne bellekte yalnızca bir kez tutulur.