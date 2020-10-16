class Farenheit(inputFarenheit: Double) : Temperature() {
    var num = inputFarenheit

    override fun toReamur(): Double {
        return (num -32) / 2.25
    }

    override fun toCelcius(): Double {
        return (num -32) / 1.8
    }

    override fun toKelvin(): Double {
        return (num + 459.67) / 1.8
    }
}