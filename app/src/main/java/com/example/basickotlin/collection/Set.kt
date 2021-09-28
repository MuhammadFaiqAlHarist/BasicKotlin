package com.example.basickotlin.collection


//    val gorengan = setOf(1,2,4,2,1,5)
//    println(gorengan)
//
//    val A = setOf(1,2,4,1,2,5,7,8,9,0,0,8,9,0,0,0)
//    val B = setOf(1,2,4,5,8,9,0,7)
//    println(A==B)
//
fun main() {
/*val setC = setOf(1,2,4,2,1,5)
    val setB = setOf(1,7,2,5)
    val union = setC.union(setB)
    val intersect = setC.intersect(setB)

    println(union)
    println(intersect)*/
    val mutableSet = mutableSetOf(1,2,4,2,1,5)
    //mutableset[2] = 6 //tidak bisa mengubah set immutable
    mutableSet.add(6)//menambah item di akhir set
    mutableSet.remove(2)//menghapus
    println(mutableSet)
}