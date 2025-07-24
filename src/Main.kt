import kotlin.math.roundToInt

abstract class Food(val name:String, val price:Double){
    abstract fun cook(): String
}

class Burguer(name:String, price:Double) : Food(name,price){
    override fun cook(): String{
        return "Asando la hamburgesa $name por unos 15 min, volteandolo durante el proceso"
    }
}

class Pizza(name:String, price:Double) : Food(name,price){
    override fun cook(): String{
        return "Cocinando la pizza $name hasta que "
    }
}

fun main(){

}