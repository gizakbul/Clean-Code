
1. Token Sınıfı
Her token bir değere sahiptir ve bu değer başlangıçta sıfırdır. Token(int value) ile değeri belirlenir.

2. Memento Sınıfı
Sistemin anlık durumunu (token'ları) saklayan sınıftır. tokens listesi bu durumu içerir.

3. TokenMachine Sınıfı
Token'ları yönetir ve durumu kaydeder.

addToken(int value): Yeni bir token oluşturur ve listeye ekler, ardından durumu kaydeder.
addToken(Token token): Var olan bir token’ı listeye ekler ve durumu kaydeder.
saveState(): Sistemin mevcut durumunu (token'ları) memento olarak kaydeder.
revert(Memento m): Verilen memento'yu kullanarak sisteme geri yükler.
Özetle, TokenMachine token'ları ekler, mevcut durumu kaydeder ve geri alır. Memento, sistemin doğru durumunu korur.