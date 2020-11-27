import org.jfugue.player.Player

class Main {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Kotlin main is running here!")
            val a = Player()
            a.play("C D E F G A B")
        }
    }
}
