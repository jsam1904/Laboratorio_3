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

interface Dessert{
    fun eat(): String
}

class IceCream(name:String, price:Double) : Food(name,price){
    override fun cook(): String{
        return "Se enfria el helado $name por unos 15 horas"
    }
    override fun eat(): String{
        return "Se come el helado $name en un cono"
    }
}

abstract class Drink(name:String, price:Double) : Food(name,price){
    abstract fun pour(): String
}

class JuiceDrink(name:String, price:Double) : Drink(name,price){
    override fun pour(): String{
        return "Se hecha el jugo $name en un vaso"
    }

    override fun cook(): String {
        return "Se exprime el jugo $name con las manos"
    }
}

fun Food.discountPrice(discount:Double):Double{
    val discountP = price * (discount / 100.0)
    return price - discountP
}

fun main(){

}