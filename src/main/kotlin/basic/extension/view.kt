package basic.extension

/**
 * Created by dhokim on 2020-08-14
 */

open class View{
    open fun click() = print("View Clicked")
}

class Button: View(){
    override fun click() = println("Button Clicked")
}

fun View.showOff() = println("I'm a View!")
fun Button.showOff() = println("I'm a button!")