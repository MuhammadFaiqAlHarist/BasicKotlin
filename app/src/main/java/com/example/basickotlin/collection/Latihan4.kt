package com.example.basickotlin.collection

fun main() {
    calculator(1,'+',1)
    calculator(1, 'a', 1)


}

// TODO 1 Lengkapi fungsi berikut dengan program yang dapat menghitung operator
// penjumlahan +
// pengurangan -
// pembagian /
// perkalian *
// modulus %


fun calculator(ga: Int,ge:Char,go: Int) {
// TODO 2 Buat kondisi jika operator yang diinputkan salah
    // maka cetak text berikut sebagai output
    // "Operator tidak dikenali program"
    when (ge) {
        '+' -> println("$ga + $go = ${ga + go}")
        else -> println("operator tidak mengenali program")
    }
}



// ekspektasi output:
// 1 + 1 = 2
// Operator tidak dikenali program