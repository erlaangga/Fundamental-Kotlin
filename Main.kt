fun main(args: Array<String>) {
    println("Hello, world!")

    /* Kotlin is very unique, but not radically different for semantic
    It is easy to use, full of features, very modern, and interoperability with Java
    Variable, function, and procedure are properties
    Kotlin uses Pascal Case for class and camelCase to properties
    No need to have getter and setter to get value
    Data types are static */
    val myByte: Byte = 6
    val myShort: Short = 15000
    val myInt: Int = 23000000
    val myLong: Long = 5300000000
    println((myLong - myInt) / (myShort * myByte))
    val myFloat: Float = 35E3F
    val myDouble: Double = 12E4
    println("My Float is $myFloat")
    println("My Double is $myDouble")
    println("Double divide float is ${myDouble/myFloat}")
    // To have null value variable must have safe sign in data type
    var isMyFloatBigger: Boolean? = null
    println(isMyFloatBigger)
    isMyFloatBigger = myFloat > myDouble
    println(isMyFloatBigger)

    /* Language Features
    Variable: val syntax for immutable, var syntax for mutable
    Data Types:
        - Number (Byte. Short, Int, Long, Float, Double)
        - Character (Char, String)
        - Boolean (Boolean)
        - Array (arrayOf)
    Operator: +, -, *, /, %, ++, --, =, +=, -=, *=, /=, %=, ==, !=, >, <, >=, <=, &&, ||, !, as, is, ?, as?, !is, in
    Branching: if, if else, if else if else, when, when else
    Looping: while, do while, for in
    Class can have constructor
    Function supports default parameter
    Exception: try catch finally
    * */


    // Pair
    val fruits = "banana" to "apple"
    println("I have ${fruits.first} and ${fruits.second}")
    // Triple
    val fruitsCount = Triple(1, 3, 8)
    println("I have ${fruitsCount.first} ${fruits.first}, ${fruitsCount.second} ${fruits.second}s, and ${fruitsCount.third} mangos.")

    // Extension
    // extension cannot access private property
//    fun String.hasSpace(): Boolean {
//        val found = this.find { it == ' ' }
//        return found != null
//    }

    // on line single expression function
    fun String.hasSpace() = find { it == ' ' } != null

    val question = "Does it have space?"
    println("${question} ${question.hasSpace()}.")

    // List and Map
    var lis = listOf("Nasi", "Daging", "Buah", "Telur", "Minyak")
    // list is immutable, mutableList is mutable
    val map = mapOf("lapar" to "makan", "haus" to "minum")
    // map is immutable, hashmap is mutable
    println(lis)
    println(map)

    // lambda
    val isOdd = {num: Int -> (num%2 != 0)}
    println("Is number 31 odd? " + isOdd(31))

}
