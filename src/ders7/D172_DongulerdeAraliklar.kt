package ders7

fun main() {
    // İki nokta (..)
    val birdenBese = 1..5
    val aDanZye = 'a'..'z' // Latin harfleri

    // until
    val birdenDorde = 1 until 5 // 1, 2, 3, 4

    // downTo
    val ondanBire = 10 downTo 1

    // step
    val tekSayilar = 1..10 step 2 // 1, 3, 5, 7, 9
    val geriyeCifter = 10 downTo 1 step 2
    val ucerUcer = 1..10 step 3

    // in
    val yas = 25
    if (yas in 18..65) {
        println("Çalışma çağındasınız.")
    }


}