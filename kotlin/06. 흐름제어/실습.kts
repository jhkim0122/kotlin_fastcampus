// if
val number1: Int = 10
val number2: Int = if(number1>30) 40 else 30
println(number2)

// when = switch/case 문
val number = 10
when(number){
    5-> println("5입니다.")
    10 -> {
        println("10입니다.")
    }
    else -> {
        println("5, 10 둘 다 아닙니다.")
    }
}

when(number){
    in 1..10 -> println("number in 1..10")
    in 10..20 -> println("number in 10..20")
    in 30..40 -> println("number in 30..40")
}