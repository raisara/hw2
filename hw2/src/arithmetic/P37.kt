package arithmetic

import kotlin.math.pow

fun phi(m:Int):Double{
    var phi: Double = 1.0
    var primeFactorsWithPairList=m.primeFactorMultiplicity()
    for((factor, mult) in primeFactorsWithPairList){
        phi *= (factor-1)*(factor.toDouble().pow(mult-1))
    }
    return phi.toDouble()
}

fun main(){
    println(phi(315))
}