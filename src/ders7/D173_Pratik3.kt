package ders7

fun main() {
    /*
    Problem 3: Alfabe sıralama aracı için, 'a' harfinden başlayıp 'f' harfine kadar
    (f dahil) olan tüm harfleri sırayla yan yana ekrana bastıran bir döngü yazın.
     */
    println("*** Latin Harfleri ***")
    for (harf in 'a'..'f'){
        print("$harf ")
    }

    println("*** Türkçe Harfler ***")
    val turkceAlfabe = "abcçdefgğhıijklmnoöprsştuüvyz"

    for (harf in turkceAlfabe){
        print("$harf ")
    }
}