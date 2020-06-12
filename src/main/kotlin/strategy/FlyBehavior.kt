package strategy

interface FlyBehavior {
    fun fly()
}

class FlyWithWings() : FlyBehavior {
    override fun fly() {
        println("I'm flying with wings!")
    }
}

class FlyNoWay() : FlyBehavior {
    override fun fly() {
        println("I can't fly!")
    }
}