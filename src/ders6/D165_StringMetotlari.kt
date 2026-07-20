package ders6

fun main() {
    val hamGirdi = " mERhaBa Kotlin "
    println("Ham Girdi: $hamGirdi")

    val temizGirdi = hamGirdi.trim().lowercase()
    println("Temiz Girdi: $temizGirdi")

    if (hamGirdi == "merhaba kotlin") {
        println("Doğru")
    }

    if (temizGirdi.contains("kotlin")) {
        println("İçeriyor")
    }

    println(temizGirdi.substring(0))
    println(temizGirdi.split(" ")[0])

    print("Adın: ")
    val ad = readln().trim().lowercase() // gürkay
    val temizlenmisAd = ad.replaceFirstChar { it.uppercase() }
    println(ad)
    println(temizlenmisAd)


}