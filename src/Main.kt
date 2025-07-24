// Autor: Javier Alvarado 24546 - Fecha: 31 de julio de 2025

//Clase abstracta de comida
abstract class Food(val name:String, val price:Double){
    abstract fun cook(): String
}

//Sub-clase de Food Burger
class Burger(name:String, price:Double) : Food(name,price){
    override fun cook(): String{
        return "Asando la hamburgesa $name por unos 15 min, volteandolo durante el proceso"
    }
}

//Sub-clase de Food Pizza
class Pizza(name:String, price:Double) : Food(name,price){
    override fun cook(): String{
        return "Cocinando la pizza $name hasta que el queso se mire derretido"
    }
}

//Interface de Postre
interface Dessert{
    fun eat(): String
}

//Clase Helado
class IceCream(name:String, price:Double) : Food(name,price), Dessert{
    override fun cook(): String{
        return "Se enfria el helado $name por unas 15 horas"
    }
    override fun eat(): String{
        return "Se come el helado $name en un cono"
    }
}

//Clase abstracta de tomar
abstract class Drink(name:String, price:Double) : Food(name,price){
    abstract fun pour(): String
}

//Sub clase de la clase tomar
class JuiceDrink(name:String, price:Double) : Drink(name,price){
    override fun pour(): String{
        return "Se hecha el jugo $name en un vaso"
    }

    override fun cook(): String {
        return "Se exprime el jugo $name con la fruta y lasmanos"
    }
}

//Descuento
fun Food.discountPrice(discount:Double):Double{
    val discountP = price * (discount / 100.0)
    return price - discountP
}

//Main
fun main() {
    val hamburgesa = Burger("Baconator", 50.0)
    val pizza = Pizza("5 carnes", 60.0)
    val helado = IceCream("Napolitano", 20.0)
    val jugo = JuiceDrink("Uva", 20.0)

    println("")
    println("--------------Como se cocina--------------")
    println(hamburgesa.cook())
    println(pizza.cook())
    println(helado.cook())
    println(jugo.cook())

    println("")
    println("--------------Como se come--------------")
    println(helado.eat())

    println("")
    println("--------------Descuento--------------")
    val newprice = hamburgesa.discountPrice(50.0)
    println("El precio de la hamburgesa ${hamburgesa.name} es Q$newprice")
}