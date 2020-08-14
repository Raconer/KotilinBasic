package basic.collection

import java.lang.StringBuilder

/**
 * Created by dhokim on 2020-08-14
 */

// 클래스 생성 없이 선언하면 최상위 함수이다. 어디서든 함수명 만으로 호출할수있다.(import는 해야함)
// 프로퍼티도 이와 비슷하게 선언할수있다.
fun <T> joinToString(
    collection:Collection<T>,
    separator: String = ",", // Default Value Set
    prefix: String = "",
    postfix: String =""
) : String{
    val result = StringBuilder(prefix)
    for((index, element) in collection.withIndex()){
        if(index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)

    return result.toString()
}