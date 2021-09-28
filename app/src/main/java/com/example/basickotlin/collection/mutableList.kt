package com.example.basickotlin.collection

fun main(){
    val anylist = mutableListOf('a', "kotlin", 4, true)
    anylist.add('d')//menambah item di akhir list
    println(anylist)
    anylist.add(1, "makan")//menambah item pada index ke 1
    println(anylist)
    anylist[3] = false//mengubah item pada index ke 3
    println(anylist)
    anylist.removeAt(1)//mengubah item user() berdasarkan index atau posisi nilai di dalam array
    println(anylist)
}