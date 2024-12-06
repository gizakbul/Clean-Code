Bu senaryoda, ResponsiblePerson adında bir proxy sınıfı oluşturulması istenmektedir.
Bu sınıf, Person sınıfını sarmalayacak ve belirli koşullara göre davranışlarını kontrol edecektir. 
ResponsiblePerson sınıfı, kişinin içme ve araba kullanma davranışlarını kontrol edecek ve uygun mesajları dönecektir. 
Eğer kişi içki içerken araba kullanmaya çalışırsa, "dead" mesajını döndürecektir.


Açıklamalar
ResponsiblePerson sınıfı, Person sınıfını sarmalar ve kişinin davranışlarını kontrol eder.
drink ve drive metodları, kişinin yaşına göre içki içme ve araba kullanma yetkilerini kontrol eder.
drinkAndDrive metodunda ise kişi içki içerken araba kullanmaya çalıştığında "dead" mesajını döndürür.
setAge metodu, kişinin yaşını değiştirmek için kullanılır.