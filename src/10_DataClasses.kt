data class Book(val name: String, val author: String)

fun main(args: Array<String>) {
    val book: Book = Book("The Art of Programming", "Donald Knuth")

    println("Book name: ${book.name}")
    println("Written by ${book.author}")

    println("Book as string: $book")
    println("Hash code: ${book.hashCode()}")
}