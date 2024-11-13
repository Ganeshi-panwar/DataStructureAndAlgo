package com.example.datastructuresandalgorithms.basicprogramming

fun main() {

    print("Enter the number = ")
    val inputs = readLine()
    val numbers = inputs?.toIntOrNull()
    // print factorial of n number

    if (numbers!=null && numbers>= 0){
        var count = 1
        var factorial = 1
        while (count<=numbers){
          factorial*=count
            count++
        }

        println("Factorial of $numbers is = $factorial")
    }


//
//
////Sum of all number from 1 to n which is divisible by 3.
//    if (numbers!=null){
//        var count = 0
//        var sum = 0
//        while (count<=numbers){
//            if (count%3==0){
//                print(count)
//                sum+=count
//            }
//            count++
//        }
//        println("number which is divider 3 = $sum")
//    }
//
//
//
//
//    // prime number
//    print("Enter the number = ")
//    val input = readLine()
//    var isPrime = true
//    var number = input?.toIntOrNull()
//    if (number!=null){
//        var count = 2
//        while (count<=number-1){
//            if (number%count==0){
//                isPrime = false
//            }
//            count++
//        }
//        if (isPrime == true){
//            println("not prime")
//        }else{
//            println("Is prime")
//        }
//    }
}