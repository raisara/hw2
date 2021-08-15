package arithmetic

import kotlin.math.sqrt

fun Int.primeFactors(): List<Int>{
    var that = this
    val list: ArrayList<Int> = ArrayList()
    var lim = sqrt(that.toDouble()).toInt()
    for(i in 2..lim){
        while(that%i==0){
            list.add(i)
            that /= i
        }
    }
if(that>2){
    list.add(that)
}
    return list
}

fun main(){
    println(315.primeFactors())
    println(7.primeFactors())
}