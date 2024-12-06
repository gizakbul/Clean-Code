Bu problemde Mediator Design Pattern kullanarak katılımcılar arasında iletişim kurulmasını sağlayabiliriz. Her katılımcının değerini güncellemek için bir Mediator sınıfı kullanılacak ve say() metodu bir katılımcının mesajını diğer katılımcılara iletecek.
Mediator sınıfı tüm Participant örneklerini takip eder ve mesajları ilgili katılımcılara iletir.
say() metodu bir katılımcının mesajını mediator'e gönderir.
Mediator, gönderici hariç tüm katılımcıların değerini artırır.