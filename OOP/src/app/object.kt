package app

import data.Person

// Objek (object) adalah instansiasi dari kelas.
// Objek memiliki nilai spesifik untuk atribut (properti) yang didefinisikan di kelas
// dan dapat menjalankan fungsi/metode yang ada di kelas.

fun main() {
    val eko = Person()
    eko.firstName = "Eko"

    val joko = Person()
    joko.sayHello("Joko")

    val budi = Person()
    budi.sayHello("Budi", "Waluyo")
    budi.run()
    budi.middleName = "Wahyudi"
    println(budi.getFullName())

    println(eko.firstName)
    println(joko.firstName)
    println(budi.firstName)
}