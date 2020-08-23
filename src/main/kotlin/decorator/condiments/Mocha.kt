package decorator.condiments

import decorator.beverages.Beverage

class Mocha(private val beverage: Beverage) : CondimentDecorator() {
    override val description: String
        get() = beverage.description + ", Mocha"

    override fun cost(): Double {
        return beverage.cost() + .20
    }
}