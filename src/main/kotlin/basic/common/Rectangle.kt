package basic.common

import java.util.*


/**
 * Created by dhokim on 2020-08-13
 */

class Rectangle(var heigth: Int, val width:Int){
    val isSquare: Boolean
        get() { // 프로퍼티 게터 선언
            // heigth = 100 // 적용 안됨
            return heigth == width
        }
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}