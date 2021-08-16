package arithmetic

fun printGoldbachList(range:IntRange){
    for(i in range){
        if(i%2==0){
            var gumareliner = i.goldbach()
            println("$i = ${gumareliner.first} + ${gumareliner.second}")
        }
    }
}

fun printGoldbachListLimited(range:IntRange, limit: Int){
    for(i in range){
        if(i%2==0){
            var gumareliner = i.goldbach()
            if(gumareliner.first<limit) continue
            println("$i = ${gumareliner.first} + ${gumareliner.second}")
        }
    }
}

fun main(){
    printGoldbachList(9..20)
    println("-------------------")
    printGoldbachListLimited(2..3000, 50)
}

