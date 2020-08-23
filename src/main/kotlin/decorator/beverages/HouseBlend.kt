package decorator.beverages

class HouseBlend : Beverage() {
    override val description = "House Blend"

    override fun cost(): Double {
        return .89
    }
}