package com.example.basickotlin

fun main(){
    val number = sumNumbers (10,20,30,40)
    println(number)

    val number1 = intArrayOf(10,20,30)
    val number3 = sumNumbers(10,20,30,40,50,60, *number1)
    println(number3)

    val arrayNumber = arrayOf(1,2,3,4)
    println(arrayNbaberBaber(arrayNumber))

}


fun sumNumbers (vararg number : Int): Int{
    return number.sum()
}
fun arrayNbaberBaber(number: Array<Int>) : Int{
    return number.sum()
}
fun sumAngka(vararg angka: Int): Int{
    return angka.sum()
}