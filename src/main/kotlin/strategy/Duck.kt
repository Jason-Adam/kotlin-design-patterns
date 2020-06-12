package strategy

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

class MallardDuck() : Duck() {
    override var flyBehavior: FlyBehavior = FlyWithWings()
    override var quackBehavior: QuackBehavior = Quack()

    override fun display() {
        println("I'm a Mallard Duck")
    }
}

class RubberDuck() : Duck() {
    override var flyBehavior: FlyBehavior = FlyNoWay()
    override var quackBehavior: QuackBehavior = MuteQuack()

    override fun display() {
        println("I'm a Rubber Duck")
    }

}