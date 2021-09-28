package com.example.basickotlin

class Hewan(val name : String, val age : Int){
    override fun toString(): String {
        return "DataHewan(name=$name, age=$age)"
    }
}
data class DataHewan(val name : String, val age : Int)
    fun main(){
      //data = kunci untuk menandakan class berikut digunakan untuk menanganani data
       val manusia = Hewan ("Macan", 10)
         val datamanusia = DataHewan("rung", 9)

     println(manusia)
        println(datamanusia)

    //equals

    val dataluqman1 = DataHewan("garin", 35)
    val datagarin2 = DataHewan("tai", 35)

    //Copy()0
     val datajeky3 = datagarin2.copy("jekyy", 35)

      println(dataluqman1.equals(datagarin2))
     println(datagarin2.equals(datajeky3))

    //component

      val nama = dataluqman1.component1()
       val makan = datagarin2.component1()
       println("$nama adalah salah 1 component dari babi")
      println("dan $makan adalah makanannya")

}