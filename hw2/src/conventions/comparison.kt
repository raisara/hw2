package conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(date2: MyDate): Int {
        if(year!=date2.year){
            return year-date2.year
        }else if(month!=date2.month){
            return month-date2.month
        }else{
            return dayOfMonth-date2.dayOfMonth
        }
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
