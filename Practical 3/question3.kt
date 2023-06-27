fun ageGroup (n: Int): String{
    return when(n){
        in 0..17 -> "You are a minor"
        in 18..64 -> "You are an adult"
        else -> "You are a senior citizen"
    }
}

fun main() {
    print("Enter your age: ")
    val age = readLine()!!.toInt()
    val result = ageGroup(age)
    println(result)
}