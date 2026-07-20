package ders6

fun main() {
    val can = 50

    when (can) {
        0 -> println("Karakter öldü. Oyun bitti!")
        1, 2, 3 -> println("Kritik Seviye! Hemen iksir için!")
        in 4..50 -> println("Tehlikedesiniz, savunmada kalın.")
        in 51..100 -> println("Sağlığınız yerinde, savaşa devam.")
        else -> println("Geçersiz değer!")
    }



}