package lesson1.变量定义

fun main() {
    //var 定义变量
    //val 定义常量

    //定义的时候明确指定类型
    val pi: Double = 3.23
    //类型自动推导
    val name: String = "中国"

    var temp = 20
    var score = 95.5
    //类型安全的语言 不一样的就不能够赋值
    //通过Number类提供的对应to方法进行显示转换

    score = temp.toDouble()
    temp = score.toInt()
}