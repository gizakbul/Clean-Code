Singleton Design Pattern (Tekil Nesne Tasarım Deseni), bir sınıfın sadece bir örneğini oluşturmayı ve 
bu örneğe global bir erişim sağlamayı amaçlayan bir yazılım tasarım desenidir. 
Bu desende, sınıf yalnızca bir kez örneklenir ve tüm uygulama boyunca bu tek örnek kullanılır. 
Singleton deseni, belirli bir kaynak veya işlevin yalnızca bir kez oluşturulması gerektiği durumlarda kullanılır, 
örneğin: veritabanı bağlantıları, loglama, konfigürasyon yöneticisi gibi.

Singleton Tasarım Deseni'nin Faydaları:
Global erişim: Singleton nesnesi, sınıfın kendisi tarafından erişilebilir olduğu için, 
tüm uygulama boyunca bu nesneye tek bir noktadan erişilebilir.
Kaynak verimliliği: Tek bir örnek oluşturulduğu için, 
her defasında yeni bir nesne yaratmanın maliyetinden kaçınılır. 
Bu, özellikle kaynak tüketimi yüksek işlemlerde (veritabanı bağlantıları gibi) önemlidir.