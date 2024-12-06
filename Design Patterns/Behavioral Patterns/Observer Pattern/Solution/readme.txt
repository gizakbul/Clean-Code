Bu problemde, bir oyunda bir veya daha fazla sıçan, bir oyuncuya saldırıyor. Her sıçanın saldırı değeri başlangıçta 1. Ancak sıçanlar, bir sürü olarak saldırdıkları için her sıçanın saldırı değeri, oyundaki toplam sıçan sayısına eşit olmalıdır. Sıçanlar, oyun başladığında constructor ile girer ve close() metodu ile ölürler.

Bu durumu çözmek için Game ve Rat sınıflarını, her sıçanın saldırı değerinin her zaman tutarlı olmasını sağlayacak şekilde implement edebiliriz. Bunun için Observer desenini kullanarak, oyundaki sıçan sayısı değiştikçe tüm sıçanların saldırı değerini güncelleyebiliriz.

Açıklama:
Game Sınıfı:

addRat(Rat rat): Bir sıçanı oyuna ekler ve tüm sıçanların saldırı değerlerini günceller.
removeRat(Rat rat): Bir sıçanı oyundan çıkarır ve kalan sıçanların saldırı değerlerini günceller.
updateRatsAttackValue(): Oyundaki tüm sıçanları dolaşarak, her bir sıçanın saldırı değerini günceller.
Rat Sınıfı:

attack: Sıçanın saldırı değeri, başlangıçta 1 olarak ayarlanır.
setAttackValue(int totalRats): Bu metot, sıçanın saldırı değerini, oyun içindeki toplam sıçan sayısına göre günceller.
close(): Closeable arayüzünü implement eder. Sıçan "ölürse", oyundan çıkarılır ve kalan sıçanların saldırı değerleri güncellenir.