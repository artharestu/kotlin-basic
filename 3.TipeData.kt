fun main() {
  val age:Byte = 10
  val weight:Short = 80
  val height:Int = 180
  
  // Untuk memaksakan tipe data menjadi Long, kita perlu menambahkan 'L'
  val balance:Long = 1_000_000_000_000L

  // Untuk memaksakan tipe data menjadi Float, kita perlu menambahkan 'f'
  // Selain itu juga untuk membedakan dengan tipe double.
  val temperature:Float = 36.5f
  
  // Tipe Double digunakan untuk penghitungan yang lebih akurat dengan angka desimal dari 64 bit
  val humidity:Double = 50.0
  val isHappy:Boolean = true

  println("Age: $age, Weight: $weight, Height: $height, Balance: $balance, Temperature: $temperature, Humidity: $humidity, Is Happy: $isHappy")
}