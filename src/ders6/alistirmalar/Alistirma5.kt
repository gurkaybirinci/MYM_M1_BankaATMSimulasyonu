package ders6_kosul_yapilari_when.alistirmalar

fun main() {
    print("Lütfen yaşınızı giriniz: ")
    val girdi = readln()

    val yas = girdi.toIntOrNull()

    if (yas == null) {
        println("Hata: Lütfen yaşınızı rakamlarla giriniz!")
    } else {
        val biletBilgisi = when (yas) {
            in 0..6 -> "Ücretsiz Tarife: 0 TL"
            in 7..18 -> "Öğrenci Tarifesi: 50 TL"
            in 19..64 -> "Tam Tarife: 100 TL"
            in 65..120 -> "Emekli İndirimi: 40 TL"
            else -> "Hata: Geçersiz yaş girdiniz!"
        }

        println("Bilet Durumunuz: $biletBilgisi")
    }
}