package arithmetic

import java.lang.Math.sqrt

fun Int.isPrime(): Boolean{
    if(this<2) return false
    for(i in 2..sqrt(this.toDouble()).toInt()){ //
        if(this%i==0){
            return false
        }
    }
    return true
}

fun main(){
    println(7.isPrime())
}