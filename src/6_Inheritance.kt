fun main(args: Array<String>) {
    var marie = Scientist("Marie Curie")
    marie.echo()

    var ada = NaturalScientist("Ada Lovelace", "mathematician")
    ada.echo()
}

open class Scientist(open val name: String) {
    open fun echo() {
        println("Name: $name")
    }
}

class NaturalScientist(override val name: String, var speciality: String): Scientist(name) {
    override fun echo() {
        println("$name is an $speciality")
    }
}