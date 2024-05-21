package data

class Person {
    var firstName: String = ""
    var middleName: String? = null
    private var lastName: String = ""

    fun sayHello(name: String) {
        this.firstName = name
        println("Hello $name, My Name is ${this.firstName}")
    }

    fun sayHello(firstName: String, lastName: String) {
        this.firstName = firstName
        this.lastName = lastName
        println("Hello $firstName $lastName, My Name is ${this.firstName}")
    }

    fun run(){
        println("I'm Run")
    }

    fun getFullName(): String {
        return "$firstName $middleName $lastName"
    }
}