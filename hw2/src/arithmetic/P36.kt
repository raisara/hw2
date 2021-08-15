package arithmetic
//uncompleted
fun Int.primeFactorMultiplicity(): List<Pair<Int, Int>>{
    var count=1
    val primeFactors = (this.primeFactors()).toMutableList()//?
    val primeFactorsWithPair = ArrayList<Pair<Int, Int>>()
    var i =0;
    while(i<primeFactors.size-1){
        if(primeFactors[i] == primeFactors[i+1]){
            count++
        }else{
            primeFactorsWithPair.add(primeFactors[i] to count)
            count = 1
        }
        i++
    }

    return primeFactorsWithPair
}

fun main(){
    println(315.primeFactorMultiplicity())
}
