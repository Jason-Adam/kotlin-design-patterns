package observer

import kotlin.properties.Delegates

class WeatherData : Subject {
    private var observers = mutableListOf<Observer>()
    private var temperature by Delegates.notNull<Float>()
    private var humidity by Delegates.notNull<Float>()
    private var pressure by Delegates.notNull<Float>()

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }
    

    override fun removeObserver(observer: Observer) {
        val idx: Int = observers.indexOf(observer)
        if (idx >= 0)
            observers.removeAt(idx)
    }

    override fun notifyObservers() {
        observers.forEach { observer ->
            observer.update(temperature, humidity, pressure)
        }
    }

    fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}