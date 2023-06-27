fun main(){
    print("Enter a number: ")
    val n = readLine()!!.toInt()
    var sum = 0
    var i = 2
    while(i <= n){
        sum += i
        i += 2
    }
    println("Sum of even numbers from 1 and $n is $sum")
}