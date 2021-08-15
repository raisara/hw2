package arithmetic

fun gcd(x: Int, y: Int): Int{
    return if(y==0) x else gcd(y,x%y)
}

fun main(){
    println(gcd(36, 63))
}