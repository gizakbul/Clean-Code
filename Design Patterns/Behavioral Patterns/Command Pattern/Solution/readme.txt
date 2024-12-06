Bu görevin amacı, Account sınıfının process metodunu, verilen bir Command nesnesini işleyebilecek şekilde uygulamaktır. Command sınıfı, DEPOSIT (yatırma) ve WITHDRAW (çekme) eylemlerini temsil eder ve bu eylemlerin başarı durumunu belirtir.

Adımlar
Command Sınıfı:

Action enum'ı iki eylem tanımlar: DEPOSIT ve WITHDRAW.
Command sınıfı, eylem, miktar ve başarının durumunu içerir.
Account Sınıfı:

balance değişkeni, hesabın bakiyesini tutar.
process metodu, Command nesnesini işler ve eylemi gerçekleştirir.


Açıklamalar
Command Sınıfı:

Action enum'ı, DEPOSIT ve WITHDRAW eylemlerini tanımlar.
Command nesnesi, action (eylem), amount (miktar) ve success (başarı durumu) içerir.
Account Sınıfı:

balance değişkeni, hesabın mevcut bakiyesini tutar.
process metodu, Command nesnesini alır ve eyleme göre bakiyeyi günceller.
DEPOSIT eylemi için, miktar bakiyeye eklenir ve success true olarak ayarlanır.