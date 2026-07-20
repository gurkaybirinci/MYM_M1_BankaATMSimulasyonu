package ders6

fun main() {
    val kullaniciAdi = "admin"
    val sifre = "1234"

    when {
        kullaniciAdi == "" -> println("HATA! Kullanıcı adı alanı boş bırakılamaz!")
        sifre == "" -> println("HATA! Şidre alanı boş bırakılamaz!")
        kullaniciAdi == "admin" && sifre == "1234" -> println("Giriş başarılı!")
        else -> println("Girilen kullanıcı adı veya şifre hatalı.")
    }
}