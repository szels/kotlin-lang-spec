fun main(args: Array<String>) {
    condition()
    loops()
}

fun condition() {
    if ("".isEmpty()) {
        println("String is empty")
    } else {
        println("Dead branch")
    }

    when(2) {
        1,3,4 -> println("Dead branch")
        2 -> println("When 2 is 2")
        else -> {
            println("Default branch")
        }
    }
}

fun loops() {
    val ints = listOf(1, 2, 3)
    for (i in ints) println ("For $i")

    for ((index, i) in ints.withIndex()) {
        println ("For with index $index, value $i")
    }

    var x:Int = 0
    while(x < 3) {
        println("While $x")
        x++
    }

    do {
        println("Do while $x")
        x--
    } while (x > 0)

    println("Break and continue")
    myLabel@ for(x in 1..10) {
        if(x == 5) {
            println("If block with value$x")
            break@myLabel
        } else {
            println("Else block with value $x")
            continue@myLabel
        }
    }

    for(x in 1..10) {
        if(x == 5) {
            println("If block with value$x")
            break
        } else {
            println("Else block with value $x")
            continue
        }
    }
}