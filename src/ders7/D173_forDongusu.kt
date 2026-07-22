package ders7

fun main() {
    // ..
    for (i in 1..5){
        println("$i. Madde$i")
    }

    println("-----------------")

    for (harf in 'a'..'e'){
        println("$harf. ")
    }

    println("-----------------")

    // until
    for (i in 1 until 5) {
        println(i) // 1, 2, 3, 4
    }

    println("-----------------")

    // downTo ve step
    for (i in 10 downTo 2 step 2) {
        println(i)
    }


}