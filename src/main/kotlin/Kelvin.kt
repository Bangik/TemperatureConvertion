class Kelvin(inputKelvin: Double) : Temperature() {
    var num = inputKelvin
    override fun toCelcius(): Double {
        return num - 273.15
    }

    override fun toFarenheit(): Double {
        return num * 1.8 - 459.67
    }

    override fun toReamur(): Double {
        return (num - 273.15) * 0.8
    }
}