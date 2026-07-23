package ders7_donguler1_araliklar_ve_for_dongusu.alistirmalar

fun main() {
    print("Faktöriyeli hesaplanacak pozitif bir sayı giriniz: ")
    val girdi = readln()
    val sayi = girdi.toIntOrNull()

    if (sayi == null || sayi < 0) {
        println("Hata: Lütfen geçerli bir pozitif tam sayı giriniz!")
    } else {
        var sonuc = 1
        for (i in sayi downTo 1) {
            sonuc *= i
        }

        println("$sayi! = $sonuc")
    }
}