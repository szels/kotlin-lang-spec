fun main(args: Array<String>) {
    val musician = Musician("Slash", 53)

    println("${musician.firstName} is ${musician.age} years old.")

    val comedian = Comedian("Ellen", 61)
    println("${comedian.firstName} is an ${comedian.age} years old, ${comedian.gender} comedian.")
}

// class declaration and primary constructor
class Musician(val firstName: String, var age: Int)


// secondary constructor
class Comedian(val firstName: String, var age: Int) {
    val gender = "female"
    constructor(firstName: String, age: Int, gender: String): this(firstName, age)
}