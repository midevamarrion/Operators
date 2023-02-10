fun main(){
    printName("Marrion")
    var m = 67 % 5
    println(m)
    var y = 34+678+55+290
    println(y)
    intrestingFact("I am determined and beautifull")
}
fun printName(name: String){
    println("Hello $name")

}
fun modulus(num1:Int, num2:Int):Int{
    var modulus = num1 % num2
    return modulus


}
fun sum(num1:Int, num2:Int, num3:Int, num4:Int):Int{
    var sum = num1 + num2 + num3 + num4
    return sum
}
fun intrestingFact(myself: String){
    println(myself)
}


