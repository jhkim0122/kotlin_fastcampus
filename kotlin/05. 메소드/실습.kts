fun plusNumbers(first:Int, second:Int):Int{
    val result:Int = first+second
    return result
}

var result:Int = plusNumbers(first=10, second=5)
result = plusNumbers(10, 5)
println(result)

// 기본값이 있는 함수
fun plusNumbersWithDefault(first:Int, second:Int = 10) : Int{
    return first+second
}

val result2:Int = plusNumbersWithDefault(10)
println(result2)

// 반환값이 없는 함수
fun plusNumberWithNoReturn(first:Int, second:Int):Unit{
    val result = first+second
    println(result)
}
fun plusNumberWithNoReturn2(first:Int, second:Int){
    val result = first+second
    println(result)
}
plusNumberWithNoReturn(10, 10)

// 간단 선언
fun shortPlusNumber(first:Int, second:Int) = first + second
val result3 = shortPlusNumber(100, 200)
println(result3)

// 가변인자를 갖는 함수
fun plusMultipleNumbers(vararg numbers:Int){
    for(n in numbers) println(n)
}
plusMultipleNumbers(1, 2, 3, 4, 5)

var numbers : IntArray = []
