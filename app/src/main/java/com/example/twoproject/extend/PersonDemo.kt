package com.example.twoproject.extend

fun main(){
    val p = Person("Jude", 18)
   /* p.name = "Jude"
    p.age = 18*/
    p.eat()
    println("======================")
    //会自动调用Student类init的方法
    val s = Student("Tim", 18)
    println("======================")
    print(s.name+":"+s.age+":"+s.sno+":"+s.grade)
}