package com.example.twoproject.interfaces

fun main(){
    val student = StudyImpl("Jude", 18)
    doStudy(student)
}
//多态，面向接口编程
fun doStudy(study: StudyImpl){
    study.doHomework()
    study.readBooks()
}