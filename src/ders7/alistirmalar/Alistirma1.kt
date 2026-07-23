package ders7_donguler1_araliklar_ve_for_dongusu.alistirmalar

fun main() {
    print("1 ile 10 arasında bir sayı girin: ")
    val sayi = readln().toIntOrNull()

    if (sayi == null || sayi !in 1..10) {
        println("Hata: Lütfen geçerli bir sayı giriniz!")
    } else {
        for (i in 1..10) {
            println("$sayi x $i = ${sayi * i}")
        }
    }
}