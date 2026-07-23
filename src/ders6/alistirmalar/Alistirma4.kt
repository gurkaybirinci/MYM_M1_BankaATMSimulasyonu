package ders6_kosul_yapilari_when.alistirmalar

fun main() {
    print("Lütfen bir komut yazın: ")
    val hamGirdi = readln()

    val temizKomut = hamGirdi.trim().lowercase()

    when {
        temizKomut == "merhaba" -> {
            println("Size de merhaba!")
        }
        temizKomut == "saat kaç" -> {
            println("Şu an saat 14:00")
        }
        temizKomut.contains("hava") -> {
            println("Dışarıda harika bir hava var.")
        }
        else -> {
            println("Ne demek istediğinizi anlayamadım.")
        }
    }
}