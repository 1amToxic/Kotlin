package Basicz
data class StringContainer(val values: List<String>)

fun main() {
    val listCat = mutableListOf<Cat>(Cat("Pho",2),Cat("Min",1),Cat("Tom",3))
    listCat.sort()
    listCat.forEach { println("${it.name} - ${it.age}") }
}
class Cat(val name:String, val age:Int) : Comparable<Cat>{
    override fun compareTo(other: Cat): Int {
        if(this.name == other.name){
            return this.age - other.age
        }
        return this.name.compareTo(other.name)
    }
}
/***
 * Initializer list with size and it's elements
 *
 * val listInitializer = List(3,{it*2})
        print(listInitializer)
 Zip: you can zip two collection to become a list of pair
 Unzip: you can unzip from a list of pair to 2 collection with 2 choose first or second
 Association: create a map from a collection elements with something
    Example: from a list [two, three, four] you can create a map {3=two, 5=three, 4=four}
 */
