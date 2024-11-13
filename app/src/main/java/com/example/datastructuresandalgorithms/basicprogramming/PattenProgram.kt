package com.example.datastructuresandalgorithms.basicprogramming

fun main() {
    print("Enter number = ")
    val input = readLine()
    val number = input?.toIntOrNull()
    if (number != null) {
//        for (i in 1..number){
//            println("*****")
//        }
//       // output
//        *****
//        *****
//        *****
//        *****
//        *****
//        *****

//
//        for (i in 0..<number){
//            for (j in 0..<number){
//                print(" # ")
//
//            }
//            println()
//        }
//        // output
//        12345
//        12345
//        12345
//        12345
//        12345


//        for (i in 0..number-1){
//            var char = 'A'
//            for (j in 0..number-1){
//                print(" $char ")
//                char+=1
//            }
//            println()
//        }
//        // output
//                A  B  C  D  E  F  G  H  I  J
//                A  B  C  D  E  F  G  H  I  J
//                A  B  C  D  E  F  G  H  I  J
//                A  B  C  D  E  F  G  H  I  J
//                A  B  C  D  E  F  G  H  I  J
//                A  B  C  D  E  F  G  H  I  J
//                A  B  C  D  E  F  G  H  I  J
//                A  B  C  D  E  F  G  H  I  J
//                A  B  C  D  E  F  G  H  I  J

//        var no = 1
//        for (i in 0..number-1){
//            for (j in 0..number-1){
//                print(" $no , ")
//                no+=1
//            }
//            println()
//    }
//            // output
//            1 ,  2 ,  3 ,
//            4 ,  5 ,  6 ,
//            7 ,  8 ,  9 ,

//       var char = 'A'
//        for (i in 0..number-1){
//            for (j in 0..number-1){
//                print(" $char")
//                char+=1
//            }
//            println()
//        }
//       // output
//        A B C
//        D E F
//        G H I

//        for(i in 0..number-1){
//           for (j in 0..i){
//               print("*")
//           }
//            println()
//        }
//        *
//        **
//        ***
//        ****
//        *****

//
//        for (i in 0..number - 1) {
//            for (j in 0..i-1) {
//                print(i)
//            }
//            println()
//        }
//
//        1
//        22
//        333
//        4444

//        var  char = 'A'
//        for (i in 1..number){
//            for (j in 1..i){
//                print(char)
//            }
//            char+=1
//            println()
//        }
//        A
//        BB
//        CCC
//        DDDD
//        EEEEE

//        for (i in 1..number){
//            for (j in 1..i){
//              print(j)
//            }
//       println()
//        }
//
//        1
//        12
//        123
//        1234
//        12345

//        for (i in 1..number){
//            for (j in i.downTo(1)){
//
//                print(j)
//            }
//            println()
//        }
//        1
//        21
//        321
//        4321
//        54321

//
//        // floyd's triangle patten
//        var no = 1
//        for (i in 1..number){
//            for (j in 1..i){
//                print(no)
//                no+=1
//            }
//            println()
//        }
//        1
//        23
//        456
//        78910


//        var char = 'A'
//        for(i in 1..number){
//            for (j in 1..i){
//               print(" $char ")
//                char+=1
//            }
//            println()
//        }
////        A
//// B  C
//// D  E  F
//// G  H  I  J
//// K  L  M  N  O


        //
//        A
//        BA
//        CBA
//            for (i in 1..number){
//                var char = 'A'
//                for (j in i.downTo(1) ){
//                    print(j)
//                    print(" $char ")
//                    char+=1
//                }
//                println()
//            }

//        for (i in 1..number){
//           for(j in 1..i) {
//               print(" ")
//           }
//               for (k in 1..number-i){
//                   print(i)
//               }
//               println()
//            }
//        1111
//        222
//        33
//        4

//        var char = 'A'
//        for (i in 1..number){
//
//            for (j in 1..i){
//                print(" ")
//            }
//
//            for (k in 1..number-i+1){
//                print(char)
//
//            }
//            char+=1
//            println()
//        }
//        AAAAA
//        BBBB
//        CCC
//        DD
//        E

//
//        for (i in 1..number){
//            for (j in 1..number-i){
//                print(" ")
//            }
//            for (k in 1..i-1){
//                print(k)
//            }
//            for (l in i.downTo(1)){
//                print(l)
//            }
//            println()
//        }
//          1
//         121
//        12321

//        for(i in 1..number){
//            for (j in 1..number-i){
//                print(" ")
//            }
//            var char = 'A'
//            for (k in 1..i){
//                print(char)
//                char+=1
//            }
//            char -=2
//            for (k in i.downTo(1)){
//                print(char)
//                char-=1
//            }
//            println()
//
//        }
//        A@
//        ABA@
//        ABCBA@
//        ABCDCBA@
//        ABCDEDCBA@


//        for (i in 1..number){
//            for (j in i until number){
//                print(" ")
//            }
//            var char ='A'
//            for (k in 1..i){
//                print("$char")
//                char+=1
//            }
//            char -=2
//            for (l in 1 until i){
//                print("$char")
//                char-=1
//            }
//            println()
//        }
//        A
//        ABA
//        ABCBA
//        ABCDCBA
//        ABCDEDCBA
//        ABCDEFEDCBA


//        //Hollow diamond patten
//        for (i in 1..number){
//            for (j in 1..number-i){
//                print(" ")
//            }
//            print("*")
//            for(k in 1..2*i-2){
//                print(" ")
//            }
//            if (i!=1){
//                print("*")
//            }
//          //  for (k in )
//            println()
//
//        }
//        for (i in 1..number-1) {
//            for (j in 1..i) {
//                print(" ")
//            }
//            print("*")
//            if (i!=number-1){
//
//            for (j in 1..2*(number -i)- 2){
//                print(" ")
//            }
//                print("*")
//            }
//
//            println()
//        }
//
//
//        //Butterfly  Patten
//        for (i in 1..number){
//            for (j in 1..i){
//                print("*")
//            }
//            for (k in 1.. 2*(number-i)){
//                print(" ")
//            }
//            for (l in 1..i){
//                print("*")
//            }
//            println()
//        }
//
//        // Lower half of the butterfly pattern
//        for (i in number downTo 1) {
//            for (j in 1..i) {
//                print("*")
//            }
//            for (k in 1..2 * (number - i)) {
//                print(" ")
//            }
//            for (l in 1..i) {
//                print("*")
//            }
//            println()
//        }

        for (i in 1..number) {
            for (j in 1..i) {
                print("*")
            }
            for (k in 1..number - i) {
                print(" ")
            }
            for (k in 1..number - i) {
                print(" ")
            }
            for (l in 1..i) {
                print("*")
            }
            println()
        }
        for (i in number.downTo(1)) {
            for (j in 1..i) {
                print("*")
            }
            for (k in 1..number-i) {
                print(" ")
            }
            for (k in 1..number-i) {
                print(" ")
            }
            for (l in 1..i) {
                print("*")
            }
            println()
        }
    }
}