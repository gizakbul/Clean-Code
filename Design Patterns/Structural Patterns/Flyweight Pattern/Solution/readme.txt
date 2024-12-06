Adım Adım Çözüm
Sentence Sınıfı:

Bir dizi kelime (words) tutacak.
Kelimelerin durumlarını yönetmek için bir WordToken listesi tutacak.
WordToken Sınıfı:

Kelimenin büyük harfle yazılıp yazılmayacağını belirten bir boolean (capitalize) alanına sahip olacak.
getWord Metodu:

Belirtilen indeks için bir WordToken döndürecek.
toString Metodu:

words dizisini kontrol ederek, WordToken listesindeki duruma göre kelimeleri büyük harfe dönüştürecek ve birleştirerek sonuç döndürecek.


Açıklamalar
Sentence Sınıfı:

words dizisi, giriş metnini kelimelere bölerek oluşturulur.
tokens haritası, her kelime için WordToken nesnelerini saklar.
WordToken Sınıfı:

capitalize boolean alanı, kelimenin büyük harfle yazılıp yazılmayacağını belirtir.
getWord Metodu:

Belirtilen indeks için bir WordToken döner. Eğer bu indeks için daha önce bir WordToken oluşturulmamışsa, yeni bir WordToken oluşturur ve haritaya ekler.
toString Metodu:

words dizisini iteratif olarak kontrol eder. Eğer bir kelime için WordToken varsa ve capitalize true ise, kelimeyi büyük harfe dönüştürür. Sonuç metnini birleştirerek döner.
Bu çözüm, Flyweight pattern'i kullanarak kelimelerin durumlarını yönetir ve gereksiz nesne oluşturmayı engeller. WordToken nesneleri yalnızca gerekli olduğunda oluşturulur ve yönetilir.