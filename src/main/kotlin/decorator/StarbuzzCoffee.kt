package decorator

import decorator.beverages.Beverage
import decorator.beverages.Espresso
import decorator.beverages.HouseBlend
import decorator.condiments.Mocha

class StarbuzzCoffee {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            // Regular Espresso
            val beverage: Beverage = Espresso()
            println("${beverage.description} \$${beverage.cost()}")

            // Decorated House Blend with Mocha
            var beverage2: Beverage = HouseBlend()
            beverage2 = Mocha(beverage2)
            println("${beverage2.description} \$${beverage2.cost()}")
        }
    }
}