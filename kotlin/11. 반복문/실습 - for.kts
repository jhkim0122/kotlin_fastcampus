
// Range
for (value in 0..3){
    print("반복")
}
println()

// range + Step
for(value in 0..10){
    print(value)
}
println()

//progression
for(value in 5 downTo 0){
    print(value)
}
println()

// collection
val numbers = listOf<Int>(0, 1, 2, 3)
for(num in numbers){
    print(num)
}
println()

for(i in 0..numbers.size){
    print(i)
}
println()

for(i in 0 until numbers.size){
    print(i)
}
println()

for((index, number) in numbers.withIndex()){
    println(index.toString()+" | "+number)
}


// forEach
numbers.forEach{
    print(it)
}
println()