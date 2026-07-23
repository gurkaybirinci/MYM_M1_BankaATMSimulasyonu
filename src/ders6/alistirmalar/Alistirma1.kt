package ders6_kosul_yapilari_when.alistirmalar

fun main() {
    print("Lütfen 1 ile 12 arasında bir ay numarası giriniz: ")
    val girdi = readln()

    val ayNumarasi = girdi.toIntOrNull()

    if (ayNumarasi == null) {
        println("Hata: Lütfen geçerli bir sayı giriniz!")
    } else {
        val mevsim = when (ayNumarasi) {
            12, 1, 2 -> "Kış"
            3, 4, 5 -> "İlkbahar"
            6, 7, 8 -> "Yaz"
            9, 10, 11 -> "Sonbahar"
            else -> "Geçersiz Ay"
        }

        println("Seçtiğiniz ayın mevsimi: $mevsim")
    }
}