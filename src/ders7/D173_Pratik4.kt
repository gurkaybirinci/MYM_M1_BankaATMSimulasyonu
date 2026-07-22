package ders7

fun main() {
    // Kullanıcıdan veri alırken for döngüsü kullanımı
    for (i in 1..3) {
        print("$i. ismi girin: ")
        val isim = readln()
        println("$i. isim: ${isim.uppercase()}")
    }

    for (i in 1..3){
        print("$i. sayıyı girin: ")
        val sayi = readln().toInt()
        println("$sayi sayısının karesi = ${sayi * sayi}")
    }
}