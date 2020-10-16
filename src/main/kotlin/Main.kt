import java.util.*
    fun main(){
        val reader = Scanner(System.`in`)
        println("Input Temperature Dalam Celcius")
        var inputCelcius: Double = reader.nextDouble()
        println("Input Temperature Dalam Farenheit")
        var inputFarenheit: Double = reader.nextDouble()
        println("Input Temperature Dalam Reamur")
        var inputReamur: Double = reader.nextDouble()
        println("Input Temperature Dalam Kelvin")
        var inputKelvin: Double = reader.nextDouble()

        val a = Celcius(inputCelcius)
        val b = Farenheit(inputFarenheit)
        val c = Reamur(inputReamur)
        val d = Kelvin(inputKelvin)

        println("$inputCelcius Derajat Celcius =  " + a.toFarenheit() + "  Derajat Farenheit")
        println("$inputCelcius Derajat Celcius =  " + a.toReamur() + "  Derajat Reamur")
        println("$inputCelcius Derajat Celcius =  " + a.toKelvin() + "  Derajat Kelvin")
        println()
        println("$inputFarenheit Derajat Farenheit =  " + b.toCelcius() + "  Derajat Celcius")
        println("$inputFarenheit Derajat Farenheit =  " + b.toReamur() + "  Derajat Reamur")
        println("$inputFarenheit Derajat Farenheit =  " + b.toKelvin() + "  Derajat Kelvin")
        println()
        println("$inputCelcius Derajat Celcius =  " + c.toCelcius() + "  Derajat Celcius")
        println("$inputCelcius Derajat Celcius =  " + c.toFarenheit() + "  Derajat Farenheit")
        println("$inputCelcius Derajat Celcius =  " + c.toKelvin() + "  Derajat Kelvin")
        println()
        println("$inputCelcius Derajat Celcius =  " + d.toCelcius() + "  Derajat Celcius")
        println("$inputCelcius Derajat Celcius =  " + d.toFarenheit() + "  Derajat Farenheit")
        println("$inputCelcius Derajat Celcius =  " + d.toReamur() + "  Derajat Reamur")

    }
