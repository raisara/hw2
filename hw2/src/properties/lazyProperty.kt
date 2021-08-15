package properties

class LazyProperty(val initializer: () -> Int) {
    var firstTime = true
    var number = 1
    val lazy: Int
        get() {
            if(firstTime){
                number=initializer()
                firstTime=false
            }
            return number
        }

}
