class Person {
    // property
    private var name: String = "Donald"

    // member function
    fun printMe() {
        println("Name: $name")
    }

    // nested class
    class Gender {
        fun type() = "Who cares?"
    }

    // innner class has access to properties of outer class
    inner class Age {
        fun isAdult() = "Yes, $name is not a child!!"
    }

}

// an interface
interface Author {
    fun work()
}

fun main(args: Array<String>) {
    val person = Person()

    person.printMe()

    println(Person.Gender().type())

    println(Person().Age().isAdult())

    // anonymous inner class
    var author :Author = object: Author {
        override fun work() {
            println("Write books")
        }
    }

    author.work()
}

