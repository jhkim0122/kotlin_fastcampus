// Range
val range1 = 1..10
println(range1)
val range2 = 1 until 10
println(range2)
val range3 = 'A'..'Z'
println(range3)
val range4 = 'ㄱ'..'ㅎ'
println(range4)
for(i in range4) print(i)
println()

// Progression
val range5 = 1..10 step 2
println(range5)
val range6 = 10 downTo 1 step 2
println(range6)
val range7 = (1..10).reversed()
println(range7)


// Collection
val collection1 = listOf<Int>(1, 2, 3, 4)
