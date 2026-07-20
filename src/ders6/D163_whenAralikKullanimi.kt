package ders6

fun main() {
    val sinavNotu = 90

    when (sinavNotu) {
        in 90..100 -> println("AA")
        in 80..89 -> println("BA")
        in 0..79 -> println("Geliştirilebilir")
        else -> println("Geçeriz not!")
    }

}