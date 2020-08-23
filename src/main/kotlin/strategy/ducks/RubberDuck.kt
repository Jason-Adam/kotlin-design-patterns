package strategy.ducks

import strategy.behavior.flying.FlyBehavior
import strategy.behavior.flying.FlyNoWay
import strategy.behavior.quacking.MuteQuack
import strategy.behavior.quacking.QuackBehavior

class RubberDuck() : Duck() {
    override var flyBehavior: FlyBehavior = FlyNoWay()
    override var quackBehavior: QuackBehavior = MuteQuack()

    override fun display() {
        println("I'm a Rubber Duck")
    }
}
