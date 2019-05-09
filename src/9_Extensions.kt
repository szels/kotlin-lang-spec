class Coder {
    val skills: MutableList<String> = mutableListOf()

    fun printSkills() {
        println("Skills: ${skills.joinToString(", ")}")
    }

    // object extension
    companion object {
        fun isFullStackCoder(c: Coder): Boolean {
            return c.skills.contains("Kotlin") && c.skills.contains("JavaScript")
        }
    }
}

fun main(args: Array<String>) {
    var jsCoder = Coder()
    jsCoder.skills.add("JavaScript")
    jsCoder.printSkills()

    var javaCoder = Coder()
    javaCoder.skills.add("Java")
    javaCoder.printSkills()

    javaCoder.addSkill("Kotlin")
    javaCoder.printSkills()

    println("Is full stack dev: " + Coder.isFullStackCoder(jsCoder))
    jsCoder.addSkill("Kotlin")
    println("Is full stack dev: " + Coder.isFullStackCoder(jsCoder))

}

// function extension
fun Coder.addSkill(skill: String) {
    this.skills.add(skill)
}
