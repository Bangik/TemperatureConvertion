class Reamur(inputReamur: Double) : Temperature() {
    var num = inputReamur

    override fun toCelcius(): Double {
        return num / 0.8
    }

    override fun toFarenheit(): Double {
        return num * 2.25 + 32
    }

    override fun toKelvin(): Double {
        return num / 0.8 + 237.15
    }
}