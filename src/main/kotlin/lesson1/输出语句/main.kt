package lesson1.输出语句

/**
 *
 */
fun main(){
    //输出语句
    println("hello world") //换行
    print("Hi Jack") //不换行
    println("Hi Merry")

    //输出变量
    val name = "rose"
    println(name)

    //字符串模板
    println("my name is $name")

    //当输出的变量的值 是由多个部分组成 使用 ${var}
    println("my name is $name lenght is ${name.length}")


}