// List
val numbers = listOf<Int>(1, 2, 3)
var numbers2 = mutableListOf(1, 2, 3)

numbers2.set(0,0)
println(numbers)
println(numbers2)
numbers2.add(30)
println(numbers2)
numbers2.addAll(numbers)
println(numbers2)
numbers2.removeAt(0)
println(numbers2)

numbers2.toA


// Set
val numbers3 = setOf<Int>(1, 1, 1, 2, 3, 4, 2, 3, 4)
println(numbers3)
val numbers4 = mutableSetOf(1, 1, 1, 2, 3, 2, 3, 4, 3)
println(numbers4)
println(numbers4.containsAll(numbers3))
numbers4.remove(1)
println(numbers4)

// Map
val numbers5 = mapOf<Int, String>(1 to "One", 2 to "Two")
println(numbers5)
val numbers6 = mapOf<Int, String>(Pair(1, "One"), Pair(2, "Two"))
println(numbers6)
