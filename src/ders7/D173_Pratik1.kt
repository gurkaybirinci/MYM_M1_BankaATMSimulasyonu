package ders7

fun main() {
    /*
    Problem 1: Bir e-ticaret uygulamasındaki kredi kartı son kullanma yılı seçimi için konsola
    yılları bastıran bir kod yazacaksınız. for döngüsünü kullanarak, bulunduğumuz yıl olan
    2026‘dan başlayarak, 2036 yılı hariç olmak üzere önümüzdeki yılları alt alta ekrana yazdırın.
     */

    println("*** Kredi Kartı Kullanım Yılları ***")
    for (yil in 2026 until 2036){
        println(yil)
    }
}