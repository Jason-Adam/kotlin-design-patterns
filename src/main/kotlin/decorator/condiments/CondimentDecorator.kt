package decorator.condiments

import decorator.beverages.Beverage

abstract class CondimentDecorator : Beverage() {
    override fun cost(): Double {
        TODO("Not yet implemented")
    }
}