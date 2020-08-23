package strategy.ducks

import strategy.behavior.flying.FlyBehavior
import strategy.behavior.quacking.QuackBehavior

abstract class Duck {
    abstract var flyBehavior: FlyBehavior
    abstract var quackBehavior: QuackBehavior

    abstract fun display()

    fun performQuack() {
        quackBehavior.quack()
    }

    fun performFly() {
        flyBehavior.fly()
    }
}