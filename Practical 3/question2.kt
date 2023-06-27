fun isPrime(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2 until n) {
        if (n % i == 0) return false
    }
    return true
}

fun main() {
    print("Enter a number: ")
    val num = readLine()!!.toInt()
    val result = if (isPrime(num)) "is a prime number" else "is not a prime number"
    println("$num $result")
}