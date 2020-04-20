package com.example.twoproject.For_if_when

fun main(){
    println(getScore("Jim"))
    println(getScore2("Jim"))
    println(checkNumber(12))
    println(getScoreWhen("Tom"))
}
fun getScore(name:String) = if (name =="Tom"){
    86
}else if (name =="Jim"){
    77
}else if (name =="Jack"){
    95
}else if (name =="Lily"){
    100
}else{
    0
}

fun getScore2(name: String) = when(name){
    "Jim" -> 77
    "Jack" -> 95
    "Tom" -> 86
    "Lily" -> 100
    else -> 0
}
//Number是 Int Long Double Float的父类
fun checkNumber(num: Number){
    when(num){
        is Int -> println("num is Int")
        is Double -> println("num is Double")
        else -> println("num is support")
    }
}
fun getScoreWhen(name: String)= when {
    //所有以Tom开头的名字分数都是86
    name.startsWith("Tom") ->86
    name == "Tom" ->86
    name == "Jack" ->77
    name == "Lily" ->100
    name == "Jim" ->77
    else -> 0
}
