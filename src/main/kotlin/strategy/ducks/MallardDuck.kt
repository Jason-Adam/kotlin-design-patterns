package strategy.ducks

import strategy.behavior.flying.FlyBehavior
import strategy.behavior.flying.FlyWithWings
import strategy.behavior.quacking.Quack
import strategy.behavior.quacking.QuackBehavior

class MallardDuck() : Duck() {
    override var flyBehavior: FlyBehavior = FlyWithWings()
    override var quackBehavior: QuackBehavior = Quack()

    override fun display() {
        println("I'm a Mallard Duck")
    }
}
