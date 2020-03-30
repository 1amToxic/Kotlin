package Basicz

fun main(){
    val list = listOf(1,2,3,4)
//    print(list.filter {
//        val shouldFilter = it > 2
//        shouldFilter
//    })

}
fun addToDevBranch(){

}
/**
 * Extension
--for swap in any list
fun <T> MutableList<T>.swap(index1:Int, index2:Int){
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}
--null check for any type of variable
fun Any?.toString() : String{
    if(this == null)    return "null"
    else return this.toString()
}
 */

/** infix Notation: Use to define an infix Function
fun infixNotation(){
    print(2 add 3)
}
infix fun Int.add(number:Int) = this + number
 */
