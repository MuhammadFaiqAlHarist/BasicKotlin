package com.example.basickotlin

fun main() {
    //Literal Constant
    var decimalLiteral = 900
    var heksaDesimalLiteral = 0x0f
    var binaryLiteral = 0b00001011
    println(decimalLiteral)
    println(heksaDesimalLiteral)
    println(binaryLiteral)
    var number = 123_456_789
    println(number)

    //Conversion
    var float: Float = number.toFloat()
    println(float)
    var double: Double = number.toDouble()
    println(double)
}




