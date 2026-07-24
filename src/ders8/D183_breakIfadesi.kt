package ders8

fun main() {
    for (i in 1..100) {
        print("$i ")
        if (i == 5) {
            println("Aranan sayı bulundu. Döngü kapatılıyor.")
            break
        }
    }

    var secim: String
    while (true) {
        print("Seçimini yap (E/H): ")
        secim = readln()

        if (secim == "h") break
    }
}