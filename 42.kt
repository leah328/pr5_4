fun main(){
    try {
        println("введите трехзначное число")
        var x =readLine()
        var y=x!!.toInt()
        when (y/100>0)
        {
            true -> {
              when (x[0].toInt()==x[2].toInt()){
                  true-> println("первая и последняя цифра одинаковые")
                  false-> println("первая и последняя цифра не одинаковые")
              }
            }
           false -> println ("число не трехзначное")
        }

    }
   catch (e:Exception ){ println("error")}
}