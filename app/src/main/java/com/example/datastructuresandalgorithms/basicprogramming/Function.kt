package com.example.datastructuresandalgorithms.basicprogramming

fun main(){

    // bitwise operator
    //1 bitwise and & operator
    val a = 6
    val b = 10
    val result = b shr    1
    print(4*5%2)

//    for (i in 1..10) {
//        val binary = decimalToBinary(i)
//        println("Decimal: $i -> Binary: $binary")
//    }


//    var binary = convertBinaryToDecimal(1010)
//    println(binary)

//    fibonacci(5)
//    print("Enter a number: ")
//    val input = readLine()?.toIntOrNull()
//
//    if (input != null && input >= 1) {
//        println("Prime numbers from 1 to $input:")
//        for (num in 1..input) {
//            if (prime1(num)) {
//                println("$num ")
//            }
//        }
//    } else {
//        println("Please enter a valid number greater than or equal to 1.")
//    }
//   var fact = facXr(6,3)
//    print(fact)
//    val fact = factorial(5)
//    println(fact)
// val sum = sumOfDigit(122)
//    print(sum)

//    var x = 20
//    var y = 30
//    val sum = sum(x,y)
//    print(2*sum)
//  var p =  minOfTwo(4,3)
// val sum = sumNumber(5)
//    print(sum)
 //   val fact = factorial(5)
   // println(fact)
//   val f = calculateSumOfDigit(2356)
//    println(f)
//    var fact = factorial(5)
//    println(fact)

}
fun minOfTwo(a:Int ,b:Int):Int{
    if (a>b){
        return b
    }else{
        return  a
    }
}
fun add(a:Int , b:Int):Int{
    val sum = a+b
    print(sum)
    return sum
}
fun sumNumber(n:Int):Int{
    var sum = 0
    for (i in 1..n){
       sum +=i
    }
    return sum
}
//fun factorial(n:Int):Int{
//    var fact = 1
//    for (i in 1..n){
//        fact *=i
//        println(i)
//    }
//    return fact
//}
fun fan(): Int {
return 2
    println("Hello")
}
fun calculateSumOfDigit(num:Int):Int{
    var nums = num
    var lastDigit = 0
    while (nums>0){
       var digit  = nums%10
        nums/=10
        lastDigit+=digit
    }
    return lastDigit
}
//fun factorial(n:Int):Int{
//    var fact = 1
//    var n1 = n
//    while (n1>0){
//        fact*=n1
//        n1--
//        println(n1)
//      //  println(n)
//    }
//    return fact
//}
fun sum(a:Int, b:Int):Int{
    println("$a , $b")
    return a+b
}


// Calculate sum of digit
fun sumOfDigit(x: Int): Int {
    var num = x
    var sumOfDigit = 0
    while (num > 0) {
        val digit = num % 10

        num /= 10
        sumOfDigit += digit
    }
    return sumOfDigit
}
fun factorial(num:Int):Int{
    var fact = 1
    for (i in 1..num){
        fact *=i
    }
    return fact
}
fun facXr(n:Int , r:Int):Int{

    var facn = factorial(n)
    var facr = factorial(r)
    var facNr = factorial(n-r)
    return facn /(facr*facNr)

}
fun prime(num:Int):Int {
    for (i in 2..num-1) {
        if (num % i == 0) {
            print("not prime $num")
            return num
        } else {
            print("number is prime $num")
            return num
        }
    }
        return num
    }
fun allPrimeNumber(num:Int):Int{

    for (i in 2..num-1){
        if (num%i==0){
            print("This number is not prime $num = $i")
            return num
        }else{
            print("Number is prime $num = $i")
            return num
        }
    }
    return num
}
fun prime1(num: Int): Boolean {
    if (num < 2) {
        println("not prime $num")
        return false
    }

    for (i in 2 until num) {
        if (num % i == 0) {
            println("not prime $num")
            return false
        }
    }

    println("number is prime $num")
    return true
}

fun fibonacci(num:Int):Int{
    var count = 0
    var numFirst = 1
    var sum = 0
    println("$count  $numFirst")
    for (i in 1..num){
        sum = count + numFirst
        count = numFirst
        numFirst = sum
        println( sum)
    }
    return sum
}

fun decimalToBinary(num: Int):Int{
var nums = num
    var ans = 0
    var pow = 1
    while (nums>0){
        val rem = nums%2
        nums /= 2
        ans += (rem*pow)
        pow *= 10
    }
    return ans
}
fun convertBinaryToDecimal(num1:Int):Int {
    var num = num1
    var pow = 1
    var rev = 0
    var ans = 0
    while (num > 0) {
        rev = num % 10
        ans += (rev * pow)
        num /= 10
        pow *= 2

    }
    return ans
}








