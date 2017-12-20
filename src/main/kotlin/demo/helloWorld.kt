package demo

fun getGreeting(): String {
    val words = mutableListOf<String>()
    words.add("Hello,")
    words.add("CentOS6!")

    return words.joinToString(separator = " ")
}

fun main(args: Array<String>) {
    println(getGreeting())
}
