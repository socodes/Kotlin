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
    print("Enter first number: ")
    var number1 = readLine()
    print("Enter second number: ")
    var number2 = readLine()
    val result = number1!!.toInt() + number2!!.toInt()
    print("Result: $result")
}