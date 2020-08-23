package observer.display_elements

interface Observer {
    fun update(temp: Float, humidity: Float, pressure: Float)
}