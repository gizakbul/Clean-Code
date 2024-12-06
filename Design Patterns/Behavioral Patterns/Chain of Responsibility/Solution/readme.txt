Bu senaryoda, Goblin ve GoblinKing sınıflarıyla ilgili kuralları uygulayan bir oyun tasarlamamız isteniyor. Bu kurallar, Chain of Responsibility (Sorumluluk Zinciri) tasarım deseni ile yönetilecek.

Plan
Game Sınıfı:

Goblin ve GoblinKing gibi yaratıkları yöneten bir liste tutar.
Creature Sınıfı (soyut):

getAttack() ve getDefense() metodlarını tanımlar.
Goblin Sınıfı:

Temel istatistiklerle başlar.
Oyun durumuna göre saldırı ve savunma değerlerini hesaplar.
GoblinKing Sınıfı:

Goblin sınıfını genişletir.
Temel istatistikleri geçersiz kılar.
Statistic Enum:

ATTACK ve DEFENSE değerlerini tanımlar.



Açıklamalar
Game Sınıfı: Tüm yaratıkların listesini yönetir.
Creature Sınıfı: getAttack() ve getDefense() metodlarını içeren soyut sınıf.
Goblin Sınıfı: Temel goblin sınıfı. Oyun durumuna göre saldırı ve savunmayı hesaplar.
GoblinKing Sınıfı: Goblin sınıfını genişletir ve sabit istatistikler sağlar.
Test: Goblinlerin saldırı ve savunma değerlerini Goblin Kral eklenmeden önce ve sonra kontrol eder.
Bu yaklaşım, Chain of Responsibility tasarım deseni ilkelerine uyarak oyun içindeki goblinlerin eklenip çıkarılmasıyla birlikte durumlarının tutarlı kalmasını sağlar.