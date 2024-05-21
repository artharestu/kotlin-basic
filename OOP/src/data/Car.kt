package data

// Constructor adalah blok kode khusus yang digunakan untuk menginisialisasi objek saat pertama kali dibuat.
// Constructor bertanggung jawab untuk menetapkan nilai awal ke properti objek.

// Constructor Primer (Primary Constructor): Constructor utama yang dideklarasikan setelah nama kelas.
// Dapat memiliki parameter untuk menerima nilai awal properti.
class Car(paramBrand: String, paramName: String, paramYear: Int) {

//   Initializer Block adalah blok kode khusus yang digunakan untuk menginisialisasi
//   properti objek setelah constructor dijalankan.
//   Initializer block dapat digunakan untuk melakukan tugas-tugas seperti:
//   - Mengatur nilai awal untuk properti yang nilainya bergantung pada properti lain.
//   - Melakukan validasi data yang dimasukkan ke dalam objek.
//   - Melakukan inisialisasi yang kompleks yang tidak dapat dilakukan di dalam constructor.
//  Akan dijalankan ketika objek dibuat (instance).
    init {
        println("Car $paramBrand dibuat")
    }

//   Constructor Sekunder (Secondary Constructor):
//   Constructor tambahan yang digunakan untuk inisialisasi yang lebih kompleks.
//   Harus selalu mendelegasikan ke constructor primer.
//   Secondary Contractor bisa dibuat berapapun, asal jumlah parameternya berbeda.
//   Dan Primary Constructor harus dipanggil oleh Secondary Constructor.
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