package ders7_donguler1_araliklar_ve_for_dongusu.alistirmalar

fun main() {
    var toplam = 0

    for (i in 2..100 step 2) {
        toplam += i
    }

    println("1 ile 100 arasındaki çift sayıların toplamı (Performanslı): $toplam")
}