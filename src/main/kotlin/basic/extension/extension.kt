package basic.extension

import java.lang.StringBuilder

/**
 * Created by dhokim on 2020-08-14
 */

// 확장 함수를 만들려면 추가할려는 함수 이름 앞에 그 함수가 확장할 클래스의 이름을 덧붙이기만 하면된다.
// 클래스 이름을 수신객체타입 이라 부르며,
// 확장 함수가 호출 되는 대상이 되는값을 수신 객체라고 부른다.

// String.lastChar() : 수신 객체 타입
// this =  수신객체
fun String.lastChar(): Char = this.get(this.length -1)
fun String.lastCharWithOutThis(): Char = get(length -1) //  수신 객체에 this없이 접근 가능하다

fun <T> Collection<T>.joinToString(
    separator:  String  = " ",
    prefix:     String  = "",
    postfix:    String  = ""
):String{
    val result = StringBuilder(prefix)
    for((index, element) in this. withIndex()){
        if(index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun Collection<String>.join(
    separator:  String  = " ",
    prefix:     String  = "",
    postfix:    String  = ""
) = joinToString(separator, postfix,prefix)



