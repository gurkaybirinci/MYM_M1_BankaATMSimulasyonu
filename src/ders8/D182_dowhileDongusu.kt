package ders8

fun main() {
    // do-while Döngüsü, koşul false da olsa en bir kez mutlaka çalışır
    var sayac = 1

    do {
        println("Sayaç Değeri: $sayac")
        sayac++
    } while (sayac < 1)


    // Şifre kontrolü örneği
    var sifre: String
    var deneme = 3

    do {
        print("Şifrenizi girin: ")
        sifre = readln()

        if (sifre != "12345") println("Yanlış şifre. Tekrar deneyin!")
        deneme--

    } while (sifre != "12345" && deneme > 0)

    if (deneme != 0) println("Sisteme giriş yapıldı!")
    else println("Deneme hakkınız bitti")

}