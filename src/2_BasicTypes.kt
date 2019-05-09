fun main(args: Array<String>) {
    numbers()
    charcters()
    boolean()
    strings()
    arrays()
    collections()
    ranges()
}

fun numbers() {
    println("\n### numbers ###\n")

    val a: Int = 10000
    println("Int Value: " + a)

    val d: Double = 100.00
    println("Double  Value: " + d)

    val f: Float = 100.00f
    println("Float Value: " + f)

    val l: Long = 1000000004
    println("Long Value: " + l)

    val s: Short = 10
    println("Short Value: " + s)

    val b: Byte = 1
    println("Byte Value: " + b)
}

fun charcters() {
    println("\n### chars ###\n")

    val char: Char = 'A'
    println("Char: $char")
}

fun boolean() {
    println("\n### boolean ###\n")

    val bool: Boolean = true
    println("Boolean: $bool")
}

fun strings() {
    println("\n### strings ###\n")

    val s: String = "Hello"
    println("$s World!")
}

fun arrays() {
    println("\n### arrays ###\n")

    val arrays: IntArray = intArrayOf(1, 2, 3, 4)
    println("Size of array: ${arrays.size}")
    println("Second item: ${arrays[1]}")
}

fun collections() {
    println("\n### collections ###\n")

    val numbers: MutableList<Int> = mutableListOf(1, 2, 3)
    val immutableNumbers: List<Int> = numbers
    println("Mutable list: $numbers")

    numbers.add(4)
    println("Mutable list: $numbers")
    println("Immuutable list: $immutableNumbers")

    // immutableNumbers.add(5) // unresolved reference: add

    val items = listOf(1, 2, 3, 4)
    println("First element: ${items.first()}")
    println("Last element: ${items.last()}")
    println("Fitler even element: ${items.filter { it % 2 == 0 }}")

    val map = hashMapOf("foo" to 1, "bar" to 2)
    println("Map: ${map["foo"]}")

    val set = hashSetOf("a", "b", "b")
    println("Set: $set")
}

fun ranges() {
    println("\n### ranges ###\n")

    for (i in 1..4) {
        println(i)
    }

    val v: Int = 2
    if (v in 1..10) {
        println("Ranges: $v")
    }
}