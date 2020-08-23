package strategy

import strategy.behavior.flying.FlyWithWings
import strategy.ducks.Duck
import strategy.ducks.MallardDuck
import strategy.ducks.RubberDuck

class MiniDuckSimulator {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
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
    }
}

