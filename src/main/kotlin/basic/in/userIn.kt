package basic.`in`

/**
 * Created by dhokim on 2020-08-14
 */


// c in 'a'..'z' ->  'a' <= c && c <= 'z' 로 변환 된다.
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c:Char) = when(c){
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else ->"I don't know..."
}

fun likeDictionary(){
    println("Kotlin" in "Java".."Scala") // "Java" <= "Kotlin" && "Kotlin" <= "Scala" 와 같다
}

fun likeDictionaryInCollection(){
    println("Kotlin" in setOf("Java", "Scala"))  //  이 집합에는 Kotlin이 들어가 있지 않다
}

