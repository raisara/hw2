package arithmetic

fun Int.isCoprimeTo(number: Int): Boolean{
    return (gcd(this, number)==1)
}

fun main(){
    println(35.isCoprimeTo(64))
}