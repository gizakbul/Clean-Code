Factory Pattern (Fabrika Deseni), bir nesne oluşturma işlemini alt sınıflara bırakarak, 
nesne oluşturma işlemi için bir arayüz sağlar. Bu desen, nesnelerin doğrudan yaratılmasını engelleyip, 
yerine bir factory method (fabrika metodu) kullanarak nesnelerin oluşturulmasını sağlar. 
Bu sayede nesnelerin oluşturulması merkezi bir noktada toplanır ve değişen nesne türlerini yönetmek daha kolay hale gelir.


Temel Özellikler:
Nesne yaratımı bir "fabrika" sınıfına taşınır.
Bağımsızlık sağlar: Yaratılan nesne türü, istemci sınıfından gizlenir.
Esneklik: Yeni nesne türleri eklemek kolaydır.

Kullanım Amacı:
Nesne oluşturma kodunu tek bir yerden yönetmek.
Nesne türlerini değiştirme esnekliği sağlamak.
Karmaşık nesne oluşturma işlemlerini merkezi hale getirmek.