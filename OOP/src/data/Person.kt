package data

// Kelas (class) adalah blue print atau template untuk membuat objek.
// Kelas mendefinisikan karakteristik dan perilaku yang umum bagi semua objek yang dibuat darinya.

class Person {
    //  Properti (property) adalah variabel yang dideklarasikan di dalam kelas.
    //  Properti mewakili atribut atau karakteristik dari objek.
    var firstName: String = ""
    var middleName: String? = null
    private var lastName: String = ""

    // Function overloading adalah fitur dalam Kotlin yang memungkinkan Anda untuk mendefinisikan
    // beberapa fungsi dengan nama yang sama, tetapi dengan parameter atau tipe return yang berbeda.
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