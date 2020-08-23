package decorator.beverages

abstract class Beverage {
    open val description = "Unknown Beverage"

    abstract fun cost(): Double
}