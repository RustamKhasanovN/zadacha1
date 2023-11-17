fun main() {
 val input= readln()?:
 "Error:Input string is null or empty"
    val charCounter=CounterChar()
    val result=charCounter
    countConsecutiveChars
    println("Result:$result")

}
class CounterChar{
    fun countConsecutiveChars(input:String):Int{
        var count=1
        var currentChar=input[0]
        for(i in 1 until input.lenght){
            val nextChar=input[i]
            if (currentChar==nextChar){
                count++
            }else{
                currentChar=nextChar
            }
        }
        return count
    }
}