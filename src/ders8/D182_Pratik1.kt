package ders8

fun main() {
    /*
    Problem 1 (while): Bakiye Tüketme
    var bakiye = 500 adında bir değişken oluşturun.
    Bakiye 0’dan büyük olduğu sürece dönecek bir while döngüsü kurun.
    Döngü içinde 50 ile 100 arasında rastgele bir harcama tutarı üretin (50..100).random() ve bunu bakiyeden düşürün.
    Her adımda “Harcama: [Tutar] TL, Kalan Bakiye: [Bakiye] TL” yazdırın. Bakiye eksiye düştüğünde döngünün
    kendiliğinden durduğunu gözlemleyin.
     */

    var bakiye = 500

    while (bakiye > 0) {
        var harcananTutar = (50..100).random()
        bakiye -= harcananTutar
        println("Harcama: $harcananTutar TL, Kalan Bakiye: $bakiye TL")
    }
}