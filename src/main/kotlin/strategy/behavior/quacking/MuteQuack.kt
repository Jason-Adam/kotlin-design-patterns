package strategy.behavior.quacking

class MuteQuack() : QuackBehavior {
    override fun quack() {
        println("<<< silence >>>")
    }
}
