package lesson1.when语句

fun main() {
    val num = 11

    //更简洁
    when(num){
        10 -> println("10")
        30 -> println("30")
        40 -> println("40")
        else -> println("其他")
    }

    //更灵活
    when(num){
        in 1..10 -> println("Z")
        in 11..59 -> println("E")
        in 60..79 -> println("B")
        else -> println("没有成绩")
    }

    //更方便
    val result = when(num){
        10 -> 'A'
        11 -> 'B'
        12 -> 'C'
        else -> "其他"
    }

    println("result is $result")

//    var temp = 20
//    when(temp){
//        is String -> println("是一个字符串")
//        is Int -> println("是一个整数")
//        else -> println("不知道什么类型")
//    }
}