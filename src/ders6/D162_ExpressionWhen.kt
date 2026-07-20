package ders6

fun main() {
    val biletSinifi = 'B'

    val sinifAciklamasi =
        when (biletSinifi) {
            'E' -> "Ekonomi Sınıfı"
            'B' -> "Business Sınıfı"
            'F' -> "First Class"
            else -> "Geçersiz sınıf!"
        }

    println("Bilet Sınıfınız: $sinifAciklamasi")
}