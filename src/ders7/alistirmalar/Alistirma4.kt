package ders7_donguler1_araliklar_ve_for_dongusu.alistirmalar

fun main() {
    println("=== Mesaj Gönderme Paneli (Toplam 5 Mesaj Hakkı) ===")

    for (i in 1..5) {
        print("\n$i. Mesajınızı yazın: ")
        val hamMesaj = readln()

        val temizMesaj = hamMesaj.trim().lowercase()

        if (temizMesaj.contains("bedava") ||
            temizMesaj.contains("kazandınız") ||
            temizMesaj.contains("kampanya")) {
            println("Spam mesaj engellendi! 🚫")
        } else {
            println("Mesaj başarıyla gönderildi: $temizMesaj ✅")
        }
    }
}