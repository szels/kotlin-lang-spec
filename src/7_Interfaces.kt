fun main(args: Array<String>) {
    val num = Num(-2)
    num.echo()
    num.abs()
    num.echo()
    num.sqr()
    num.echo()
}

interface INum {
    var num: Int
    fun echo() = println("$num")
}

interface IAbs : INum {
    fun abs()
}

interface ISqr : INum {
    fun sqr() {
        num = num * num
    }
}

// class implementing multiple interfaces
class Num(val value: Int): IAbs, ISqr {
    override var num: Int = value
    override fun abs() {
        if (num < 0) {
            num = (num * -1)
        }
    }
}