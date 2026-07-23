package ders6_kosul_yapilari_when.alistirmalar

fun main() {
    print("Lütfen sepet toplam tutarını giriniz (Örn: 150.50): ")
    val girdi = readln()

    val sepetTutari = girdi.toDoubleOrNull()

    if (sepetTutari == null) {
        println("Hata: Lütfen geçerli bir sayısal tutar giriniz!")
    } else {
        val tutarInt = sepetTutari.toInt()

        when (tutarInt) {
            in 0..99 -> {
                val kargoUcreti = 30.0
                println("Kargo Ücreti: $kargoUcreti TL")
                println("Toplam Ödenecek Miktar: ${sepetTutari + kargoUcreti} TL")
            }
            in 100..299 -> {
                val kargoUcreti = 15.0
                println("Kargo Ücreti: $kargoUcreti TL")
                println("Toplam Ödenecek Miktar: ${sepetTutari + kargoUcreti} TL")
            }
            in 300..Int.MAX_VALUE -> {
                println("Kargo Bedava!")
                println("Toplam Ödenecek Miktar: $sepetTutari TL")
            }
            else -> {
                println("Hata: Sepet tutarı negatif bir değer olamaz!")
            }
        }
    }
}