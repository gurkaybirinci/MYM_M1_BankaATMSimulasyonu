package ders6

fun main() {
    val gizemliObje: Any = 5

    when (gizemliObje) {
        is String -> println("Bu bir String ifadedir. Uzunluğu ${gizemliObje.length}")
        is Int -> println("Bu bir tamsayıdır. Bu sayının karesi: ${gizemliObje * gizemliObje}")
    }
}