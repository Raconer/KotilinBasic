/**
 * Created by dhokim on 2020-08-13
 */


/*
 *  name과 age라는 property가 들어간 간단한 데이터 클래스를 정의 한다.
 *  age property의 디폴트 값은(따로 지정하지 않은 경우) null이다.
 *  사람 리스트를 만들면서 영희의 나이를 지정하지 않았기 때문에 null이 대신 쓰인다.
 *  리스트에서 가장 나이가 많은 사람을 찾기 위해 maxBy함수를 사용한다.
 *  maxBy함수에 전달한 람다식은 파라미터를 하나 받는다 it라는 이름을 사용하면(별도로 파라미터 이름을 정의 하지 않아도 된다.)
 *  람다식의 유일한 인자를 사용할수있다. 엘비스 연산자 라고 부르는 ?:는 age가 null일 경우 0을 반환하고 그렇지 않은 경우 age값을 반환한다.
 *  따라서 영희의 나이는 0이 므로 철수가 가장 나이가 많은 사람으로 선정 된다.
 */
data class Person(val name: String, val age:Int? = null)

fun main(args: Array<String>){
    val persons = listOf(Person("영희"),
                                        Person("철수", age = 20))
    val oldest = persons.maxBy { it.age ?: 0 }
    println("나이가 가장 많은 사람 : $oldest")
}