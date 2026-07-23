package ders6_kosul_yapilari_when.alistirmalar

fun main() {
    // Test etmek için Any tipindeki değişkene farklı türde veriler atayabilirsiniz:
    // val gelenVeri: Any = "Merhaba Kotlin"
    // val gelenVeri: Any = 12
    // val gelenVeri: Any = false
    val gelenVeri: Any = true

    when (gelenVeri) {
        is String -> {
            println("Metin uzunluğu: ${gelenVeri.length}")
        }
        is Int -> {
            println("Sayının 10 katı: ${gelenVeri * 10}")
        }
        is Boolean -> {
            val durumMesaji = if (gelenVeri) "Doğru" else "Yanlış"
            println("Durum: $durumMesaji")
        }
        else -> {
            println("Desteklenmeyen veri tipi")
        }
    }
}