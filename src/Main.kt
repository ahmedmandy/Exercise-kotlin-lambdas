val greetSeaCreatures = { println("Hello, Deep Sea Adventurer!") }

val findPearl = {pearlsInChest: Int -> pearlsInChest * pearlsInChest}

val divideTreasure = {totalTreasure: Double, numberOfExplorers: Double -> totalTreasure / numberOfExplorers}

fun calculateDepth(locationOne: Int, locationTwo: Int, calculate: (Int, Int) -> Int): Int {
    return calculate(locationOne, locationTwo)
}

val calculator = {locationOne: Int, locationTwo: Int -> locationOne - locationTwo}

fun String.loud(): String {
    return this.uppercase() + "!"
}

val diveMessage = {inputText: String -> inputText.loud()}

inline fun exploreWaters(exploring: () -> Unit): Long {
    val start = System.currentTimeMillis()
    exploring()
    return System.currentTimeMillis() - start
}

fun main() {
    greetSeaCreatures()
    println(findPearl(6))
    println(divideTreasure(1000.0, 5.0))
    println(calculateDepth(1500, 800, calculator))
    println(diveMessage("deep sea"))
    val timeTaken = exploreWaters {
        println("Exploring the unknown depths...")
    }
    println("Time taken: $timeTaken milliseconds")
}