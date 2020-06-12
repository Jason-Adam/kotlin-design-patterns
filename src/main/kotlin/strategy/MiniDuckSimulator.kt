package strategy

fun main() {
    val mallard: Duck = MallardDuck()
    mallard.performFly()
    mallard.performQuack()
    mallard.display()

    val rubberDuck: Duck = RubberDuck()
    rubberDuck.performFly()
    rubberDuck.flyBehavior = FlyWithWings()
    rubberDuck.performFly()
    rubberDuck.display()
}

