package strategy.behavior.flying

class FlyNoWay() : FlyBehavior {
    override fun fly() {
        println("I can't fly!")
    }
}
