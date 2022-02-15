fun main(args: Array<String>) {
    //variables and conditions
    /*
    val x = 1 + 2
    if(x == 2) {
        println("x is 2")
    }
    else if(x==3) {
        println("x is 3")
    }
    else {
        println("x is not 2 or 3")
    }
    val y = if(x==2) 10 else 20
    println("y is $y")
     */
    //null values and user input
    /*
    print("Enter first number: ")
    var number1 = readLine() ?: "0"
    print("Enter second number: ")
    var number2 = readLine() ?: "0"
    val result = number1.toInt() + number2.toInt()
    print("Result: $result")
     */
    //Lists
    /*
    val shoppingList = listOf<String>("Lamborghini","Mustang","Mercedes") //do not mutable
    println(shoppingList[0])

    val shoppingList2 = mutableListOf<String>("Lamborghini","Mustang","Mercedes") //mutable
    shoppingList2[0] = "BMW"
    shoppingList2.add("Ferrari")
    println(shoppingList2[0] + " " + shoppingList2[3])
    println("\n")

    //loops

    var counter = 0
    while(counter < shoppingList2.size) {
        println(shoppingList2[counter])
        counter++
    }

    val x = 11
    when(x) {
        in 1..3 -> println("x is between 1 and 3")
        in 4..8 -> println("x is between 4 and 8")
        else -> {
            println("x is not in the ranges")
        }
    }
     */
    //Functions
    /*
    print10Nums()
    println(isEven(11))
     */
    //classes
    /*val dog = Dog()
    dog.makeSound()
    val cat = Cat()
    cat.makeSound()

    val bear = object: Animal("Bear") {
        override fun makeSound() {
            println("ROAR!")
        }
    }
     */
    //exceptions
    /*
    print("Enter a number: ")
    val number = readLine() ?: "0"
    val parsedNumber = try {
        number.toInt()
    }catch (e: Exception) {
        0
    }
    println(parsedNumber)
     */
    //lambda
    val list = listOf("kotlin","is","nice")
    val count = list.count {currentString ->
        currentString.length == 2
    }
    println(count)
}
fun isEven(num:Int): Boolean {
    return num % 2 == 0
}
fun print10Nums() {
    for(i in 1..10)
        print("$i ")
    print("\n")
}