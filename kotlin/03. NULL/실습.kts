val number : Int? = null // nullable
println(number)

val number2 : Int? = 3
val number3 : Int? = 10
//val number4 : Int? = number2+number3 -> 오류
var number4 : Int = number2!! + number3!! // null이 아님을 보장
println(number4)

var number5 : Int? = null
if(number5 == null){
    println("number5 is null")
} else {
    println("number5 is 3")
}