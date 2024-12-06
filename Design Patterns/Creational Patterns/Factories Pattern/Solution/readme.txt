Bu görevde, bir PersonFactory sınıfı oluşturup, bu sınıfın createPerson metodunu implement etmemiz gerekiyor. 
createPerson metodu, verilen isme sahip yeni bir Person nesnesi oluşturmalı ve bu nesnenin id değeri, fabrikadan yaratılan nesnelerin sırasına göre 0'dan başlayan bir indeks olmalıdır.

Bunu yapabilmek için, PersonFactory sınıfının bir iç sayacı (counter) tutması ve her yeni Person nesnesi yaratıldığında bu sayacı arttırması gerekmektedir. 
Böylece her yeni Person nesnesi, sıralı bir id değeri alabilir.

Adım Adım Uygulama

Person Sınıfı:

Person sınıfı, id ve name adında iki alana sahip basit bir sınıftır.
Yapıcı metodu, bu iki alanı başlatır.


PersonFactory Sınıfı:

Bu sınıf, yeni Person nesneleri yaratmak için kullanılacak.
createPerson metodu, yeni bir Person nesnesi oluşturacak ve uygun id değeri atayacak.
PersonFactory sınıfı, her yeni Person yaratıldığında artacak bir sayaç tutmalı.

Açıklamalar
Person Sınıfı:

Person sınıfı, id ve name alanlarına sahip.
Yapıcı metot (constructor), bu alanları başlatıyor.


PersonFactory Sınıfı:

counter adında bir özel alan (private field) var. Bu alan, oluşturulan her yeni Person nesnesine sıra numarası vermek için kullanılıyor.