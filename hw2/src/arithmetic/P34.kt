package arithmetic

fun Int.totient(): Int{
    var k = 0
    for(i in 1..this){
        if(i.isCoprimeTo(this)) k++
    }
    return k
}

fun main(){
    println(10.totient())
}