package hello

fun main(args: Array<String>) {
	println("Hello World")
	JavaHello.jprint("Kotlin call Java")
}

fun kprint(message: String) = println(message)
