package basic

import basic.common.Person

/**
 * Created by dhokim on 2020-08-13
 */

/*
 * tempFunction : 함수 이름
 * (a:Int, b:Int) : 파라미터 목록
 * Int : 반환 타입
 */
fun tempFunction(a:Int, b:Int): Int {
    return 0;
}

fun main(args: Array<String>){

    // Kotlin If문 return 가능
    val name = if  (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name")
    println("Hello, ${args[0]}")
    println("Hello, \${args[0]}") // $를 그냥 출력시 \를 붙인다 => \$
    println("Hello, ${if(args.size> 0) args else "someone"}!")

    val person = Person("Bob", true)

}