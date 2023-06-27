fun factorial (n: Int): Int{
    var result = 1
    for(i in 1..n){
        result *= i
    }
    return result
}

fun main() {
    print("Enter a number: ")
    val n = readLine()!!.toInt()
    val result = factorial(n)
    println("Factorial of $n is $result")
}
