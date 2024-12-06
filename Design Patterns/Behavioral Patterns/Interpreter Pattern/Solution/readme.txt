Bu görevin amacı, basit sayısal ifadeleri değerlendiren bir ifade işlemcisi yazmaktır. 
İfadeler, tam sayı değerlerini (örneğin, '13'), değişkenleri (tek harfli) ve sadece + ve - operatörlerini kullanır.

Gereksinimler
İfadeler tam sayı değerlerini ve tek harfli değişkenleri içerebilir.
İfadeler + ve - operatörlerini kullanır.
Eğer bir değişken tanımlanmamışsa veya birden fazla harfli değişken kullanılmışsa, sonuç 0 (sıfır) döndürülür.
Herhangi bir ayrıştırma hatasında sonuç 0 döndürülür.
Çözüm
İfadeyi operatörlere ve operandlara bölmek için bir döngü kullanılır.
Değişkenler ve sayılar kontrol edilir, geçerli değilse 0 döndürülür.
Değişkenler variables haritasından alınır.
Sayılar ve değişkenler operatörlere göre toplanır veya çıkarılır.


Açıklamalar
variables: Tek harfli değişkenleri ve değerlerini saklar.
calculate: Verilen ifadeyi değerlendirir.
Döngü ile her karakter kontrol edilir.
Rakamlar birleşerek sayılar oluşturulur.
Harfler değişken olarak değerlendirilir ve variables haritasından değerleri alınır.
Operatörler işlenir ve sonuç güncellenir.
Geçersiz bir karakter bulunursa veya değişken variables haritasında yoksa 0 döndürülür.