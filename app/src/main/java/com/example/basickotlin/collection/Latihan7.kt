package com.example.basickotlin.collection

fun main() {
    val array = arrayOf(
        "2021/2022 ",
        "Ajaran ",
        "Bidang ",
        "Tahun ",
        "RPL ",
        "Boarding school ",
        "Android ",
        "IDN ",
        "Developer ",
        "SMK ",
    )
    array.set(0, "2021/2022 ")
    array.set(1, "Ajaran ")
    array.set(2, "Bidang ")
    array.set(3, "Tahun ")
    array.set(4, "RPL ")
    array.set(5, "Boarding school ")
    array.set(6, "Android ")
    array.set(7, "IDN ")
    array.set(8, "Developer ")
    array.set(9, "SMK ")

for (nama in array){
    print(nama)
}


}