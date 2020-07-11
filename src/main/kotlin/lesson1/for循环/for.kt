package lesson1.for循环

import java.util.*

fun main() {
    //使用 .. 表示范围
    for (i in 1..10){
        //print("$i ")
    }

    //使用until 不包括最后一个值
    for (i in 1 until 10){
        //print("$i ")
    }

    //使用step 改变增量
    for (i in 1..10 step 3){
        //print("$i ")
    }

    //使用downTo递减
    for (i in 10 downTo 1 step 2){
        //print("$i ")
    }

    val names = arrayOf("jack","rose","merry")
    for (i in 0 until names.size){
        //println(names[i])
    }

    //一次获取每一个item
    for (item in names){
        //println(item)
    }

    //获取对应的索引值
    for (i in names.indices){
        //println(names[i])
    }

    for ((index,item) in names.withIndex()){
        println("$index-$item")
    }

}