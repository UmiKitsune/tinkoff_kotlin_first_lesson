package first_task

fun main() {
    countStringLetter("молоко не молоко", 'й' )
    countStringLetter("молоко не молоко", 'О' )
    countStringLetter("МОЛОКО НЕ МОЛОКО", 'о' )
}

fun countStringLetter(str: String, letter:Char) {
    var letterCount = 0
    val lowLetter = letter.lowercaseChar()

    for (char in str.lowercase()) {
        if (char == lowLetter) letterCount++
    }

    if (letterCount == 0) {
        println("Символ '$letter' в строке \"$str\" не найден")
    } else {
        println("Количество символов '$letter' в строке \"$str\" == $letterCount")
    }
}