package arithmetic

fun Int.goldbach(): Pair<Int, Int>{
    val primesList=listPrimesInRange(2..this)
    for(number1 in primesList){
        val number2 = this-number1
        if((number2).isPrime()){
            return number1 to number2
        }
    }
    return this to 0
}

fun main(){
    println(28.goldbach())
}