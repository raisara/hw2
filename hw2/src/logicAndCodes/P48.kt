package logicAndCodes

fun Boolean.xor_(vararg those: Boolean): Boolean{
    var boolean = this
    for(that in those){
        boolean = boolean.xor(that)
    }
    return boolean
}

fun Boolean.and_(vararg those: Boolean): Boolean{
    var boolean = this
    for(that in those){
        boolean = boolean&&that
    }
    return boolean
}

fun Boolean.or_(vararg those: Boolean): Boolean{
    var boolean = this
    for(that in those){
        boolean = boolean||that
    }
    return boolean
}

fun Boolean.nand_(vararg those: Boolean): Boolean{
    var boolean = this
    for(that in those){
        boolean = !(boolean.and_(that))
    }
    return boolean
}

fun Boolean.nor_(vararg those: Boolean): Boolean{
    var boolean = this
    for(that in those){
        boolean = !(boolean.or_(that))
    }
    return boolean
}

fun Boolean.impl_(vararg those: Boolean): Boolean{
    var boolean = this
    for(that in those){
        boolean = boolean.or(!that)
    }
    return boolean
}

fun Boolean.equ_(vararg those: Boolean): Boolean{
    var boolean = this
    for(that in those){
        boolean = !(boolean.xor_(that))
    }
    return boolean
}


fun main() {
    println(true.xor_(true, false, true))
}
