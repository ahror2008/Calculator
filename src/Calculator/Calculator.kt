package Calculator

import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("1-Sonni kiriting: ")
    val a = reader.nextInt()
    print("2-Sonni kiriting: ")
    val b = reader.nextInt()
    println("Ishoralar + , - , * ,  /")
    println("Ishorani kiriting:")
    val operator=reader.next()[0]
    val natija:Int
    when(operator){

        '+'->natija=a+b
        '-'->natija=a-b
        '*'->natija=a*b
        '/'->natija=a/b
        else-> {
            System.out.printf("Ishora noto'g'ri kiritildi")
            return
        }
    }
    System.out.println("$a $operator $b = $natija")

}