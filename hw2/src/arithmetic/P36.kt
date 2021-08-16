package arithmetic
//uncompleted
/*fun Int.primeFactorMultiplicity(): List<Pair<Int, Int>>{
    var count=1
    val primeFactors = (this.primeFactors()).toMutableList()//?
    val primeFactorsWithPair = ArrayList<Pair<Int, Int>>()
    var i =0;
    while(i<primeFactors.size-1){
        if(i!=primeFactors.size-1){
            if(primeFactors[i] == primeFactors[i+1]){
                count++
            }else{
                primeFactorsWithPair.add(primeFactors[i] to count)
                count = 1
            }
            i++
        } else{
            primeFactorsWithPair.add(primeFactors[i] to 1)
        }
    }
    return primeFactorsWithPair
}
*/

fun Int.primeFactorMultiplicity(): List<Pair<Int, Int>>{
    var count=1
    val primeFactors = (this.primeFactors()).toMutableList()//?
    var that = primeFactors[0]
    val primeFactorsWithPair = ArrayList<Pair<Int, Int>>()
    var i =0;
    while(i<primeFactors.size-1){
        if(primeFactors[i] == primeFactors[i+1]){
            count++
        }else{
            primeFactorsWithPair.add(primeFactors[i] to count)
            that=primeFactors[i+1]
            count = 1
        }
        i++
    }
    primeFactorsWithPair.add(that to 1)
    return primeFactorsWithPair
}

fun main(){
    println(315.primeFactorMultiplicity())
}
