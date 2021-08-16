package arithmetic

fun listPrimesInRange(range: IntRange): ArrayList<Int>{
    val primesList: ArrayList<Int> = ArrayList()
    for(number in range){
        if(number.isPrime()){
            primesList.add(number)
        }
    }
    return primesList
}

fun main(){
    println(listPrimesInRange(7..31))
}