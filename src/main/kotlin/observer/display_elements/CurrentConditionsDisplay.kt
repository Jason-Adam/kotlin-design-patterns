package observer.display_elements

import observer.subject.Subject
import kotlin.properties.Delegates

class CurrentConditionsDisplay(private var weatherData: Subject) : Observer, DisplayElement {
    private var temperature by Delegates.notNull<Float>()
    private var humidity by Delegates.notNull<Float>()
    private var pressure by Delegates.notNull<Float>()

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        this.pressure = pressure
        display()
    }

    override fun display() {
        println("Current conditions: ${temperature}F degrees and ${humidity}% humidity")
    }
}