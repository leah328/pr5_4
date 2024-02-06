fun main(){
    try {
        println ("введите данные про путевку в Казахстан:")
        println("сколько она стоит?")
        var n1=readLine()!!.toDouble()
        println("сколько дней она длится?")
        var d1=readLine()!!.toDouble()
        println ("введите данные про путевку на Мальдивы:")
        println("сколько она стоит?")
        var n2=readLine()!!.toDouble()
        println("сколько дней она длится?")
        var d2=readLine()!!.toDouble()
        println ("введите данные про путевку в Токио:")
        println("сколько она стоит?")
        var n3=readLine()!!.toDouble()
        println("сколько дней она длится?")
        var d3=readLine()!!.toDouble()

        println ("введите сколько у вас денег")
        var x=readLine()!!.toDouble()
        println("сколько дней у вас длится отпуск?")
        var y=readLine()!!.toDouble()
        println("вам подойдет путевка:")
        when {
            (n1<=x&&d1<=y) -> println("в Казахстан")
            (n2<=x&&d2<=y) -> println("на Мальдивы")
            (n3<=x&&d3<=y) -> println("в Токио")
            (x<n1&&x<n2&&x<n3) -> println("к сожалению, вам ничего не подойдет")
        }
    }
    catch (e:Exception ){ println("error")}
}
