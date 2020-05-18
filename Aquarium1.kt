package Aquarium

//declaring a class with constructor
class Aquarium (length:Int, width:Int, height:Int){
    var length: Int = 10
    var width: Int = 70
    var height: Int = 30


    fun volume() =  length * height * width / 1000
}
