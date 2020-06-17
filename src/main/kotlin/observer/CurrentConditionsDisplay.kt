package observer

import kotlin.properties.Delegates

class CurrentConditionsDisplay(private var weatherData: Subject) : Observer, DisplayElement {
    private var temperature by Delegates.notNull<Float>()
    private var humidity by Delegates.notNull<Float>()

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        TODO("Not yet implemented")
    }

    override fun display() {
        TODO("Not yet implemented")
    }
}