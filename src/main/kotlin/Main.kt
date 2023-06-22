fun main() {
    val amount = 5000
    val minComission = 35
    val comission = 0.0075
    val calcComission = amount * comission
    val result = if (calcComission < minComission) minComission else calcComission

    println("Комиссия за перевод $amount руб. составит $result руб")
}