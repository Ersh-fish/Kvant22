package com.example.kvant22

class Group(num_group: String) {
    val aud : Array<Int> = arrayOf(12,22,32,31,5)
    val Prep: Array<String> = arrayOf("Vasiliy","Vadim","Volodya")
   val num_group: String = num_group
    var test : Array<Lesson> = arrayOf(Lesson(aud[2],Prep[2]), Lesson(aud[1],Prep[1]), Lesson(aud[0], Prep[0]) )
}