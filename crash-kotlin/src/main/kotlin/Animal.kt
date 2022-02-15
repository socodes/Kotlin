abstract class Animal(
    val name: String,
    var legCount : Int = 2
) {
    //constructor
    init {
        println("Hello my name is $name")
    }

    abstract fun makeSound()
}