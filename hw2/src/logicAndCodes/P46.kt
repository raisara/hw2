package logicAndCodes

fun Boolean.and_(that: Boolean): Boolean{
    return this&&that
}

fun Boolean.or_(that: Boolean): Boolean{
    return this||that
}

fun Boolean.nand_(that: Boolean): Boolean{
    return !(this.and_(that))
}

fun Boolean.nor_(that: Boolean): Boolean{
    return !(this.or_(that))
}

fun Boolean.xor_(that: Boolean): Boolean{
    return this.xor(that)
}

fun Boolean.impl_(that: Boolean): Boolean{
    return this.or(!that)
}

fun Boolean.equ_(that: Boolean): Boolean{
    return !(this.xor_(that))
}

fun main(){
    println(true.and_(true))
    println(true.xor_(true))
}