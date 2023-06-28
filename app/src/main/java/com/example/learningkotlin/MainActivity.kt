
fun main(){
    // variable basics
    var userName: String = "Arya"
    val ownerName: String="Joker"//val fixes the value
    var age:Int=5
    val maxInt:Int = Int.MAX_VALUE
    val myNumber =8929839845000000//automatically long
    val maxBy:Byte = Byte.MAX_VALUE
    println("Hello $userName")
    println("Age is $age")
    println("Maximum value in integer is $maxInt")
    println("Maximum value in byte is $maxBy")
    val deciNumber: Float=2.5f // add f for float and if not then automatic is double
    val alpha:Char='A'
    val answer:Boolean=false
    println("The alphabet is $alpha and the answer is $answer")

    //Operations
    var a= 5
    var b=6
    var c= a+ b
    println("Sum is : $c, product is : ${a*b}")// can add only expression in {}

    var truth: Boolean=true
    var op: Int = 10
    // Control statements
    var text=
        if(truth && op<11)// && is and, || is or,== is equality
        {
            println("It is true")
            "Text1"
        }
        else{
            println("Not true")
            "Text2"
        }

    println("$text")
    val alarm=27
    when (alarm){
        12-> println("The time is $alarm")

        7-> println("The time is $alarm")

        6,8-> println("The time is $alarm")
        in 20..45-> println("The time is $alarm")
        11-> println("The time is $alarm")
        else-> println("The time is $alarm")
    }// when alarm is 12 execute 12-> , if 7 then
    when{
        alarm<=30 -> println("Hello")
        else -> println("hi")
    }
    //Null
    val carName: String?= null// may or may not be null
    if (carName != null) {
        println(carName.length)
    }
    else println("No car")//lengthy method
    println(carName?.length)// print null if null
    //println(carName!!.length)// throw null pointer error if null else dont
    var text2 : String = "Hello"?: "is null" // if carname is null then second part is assigned else first part
    println(text2)

    sayHello(userName,20)
    var isAlive:Boolean= false
    if(isAlive)
        connect()
    else
        timerDisp(alarm)

}//main is an entry point

fun sayHello(userName: String,ageFunc: Int){
    println("Hello i am a function . Username $userName age: $ageFunc")
}//cannot use param names outside function
fun connect()
{
    println("Active Connection")
}
fun timerDisp(time:Int)
{
    println("Lost Connection at $time")
}