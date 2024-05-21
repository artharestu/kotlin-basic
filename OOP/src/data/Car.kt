package data

// Constructor adalah blok kode khusus yang digunakan untuk menginisialisasi objek saat pertama kali dibuat.
// Constructor bertanggung jawab untuk menetapkan nilai awal ke properti objek.

// Constructor Primer (Primary Constructor): Constructor utama yang dideklarasikan setelah nama kelas.
// Dapat memiliki parameter untuk menerima nilai awal properti.
class Car(paramBrand: String, paramName: String, paramYear: Int) {

    init {
        println("Car $paramBrand dibuat")
    }

//   Constructor Sekunder (Secondary Constructor):
//   Constructor tambahan yang digunakan untuk inisialisasi yang lebih kompleks.
//   Harus selalu mendelegasikan ke constructor primer.
    constructor(paramBrand: String, paramName: String) : this(paramBrand, paramName, 2020) {
        println("Secondary Constructor 1")
    }

    constructor(paramBrand: String) : this(paramBrand, "") {
        println("Secondary Constructor 2")
    }

    var brand: String = paramBrand
    var name: String = paramName
    var year: Int = paramYear
}