import java.util.Calendar;
import java.util.Date;

// 배열 선언
var array1 = arrayOf(true, "Hi", 10, 2.3, null)
var array2 = arrayOf<Int>(1, 2, 3)
var array3 = intArrayOf(1, 2, 3, 4, 5)

var array4 = Array(10, {0})
var array5 = Array<String>(10, {"Hello"})

array5.set(3, "Hi")
println(array5[3])
array5[3]="HH"
println(array4.get(3))

if("l">"k") print("true")
else print("false")

array2.mapIndexed { index, i ->  }

var str: String = ""
str.mapIndexed()
array5.contains
str.toCharArray().sort().toString()