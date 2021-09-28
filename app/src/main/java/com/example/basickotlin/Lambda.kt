package com.example.basickotlin

fun main() {
    message()
    printmessage("lugman")
    val mantap = messageLength("enak banget makan nasi goreng sumpah")
    println("print$mantap")

}//bentuk fuction diubah menjadi lambda
val message ={ println("Hello From Lambda") }

//lambda menggunakan parameter
val printmessage = {pesan : String -> println(pesan)}
val messageLength = { message : String -> message.length}


