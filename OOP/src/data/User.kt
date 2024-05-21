package data

// Properti dalam constructor adalah cara untuk menginisialisasi nilai properti objek saat pertama kali
// dibuat. Properti ini didefinisikan di dalam constructor dan langsung diberi nilai awal.
class User(var username: String, var password: String) {

    override fun toString(): String {
        return "User with username=$username"
    }

}