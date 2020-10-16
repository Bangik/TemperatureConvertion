class Celcius(inputCelcius: Double) : Temperature() {
    val num = inputCelcius
    override fun toFarenheit(): Double {
        return num * 1.8 + 32
    }

    override fun toReamur(): Double {
        return num * 0.8
    }

    override fun toKelvin(): Double {
        return num + 273.15
    }
}