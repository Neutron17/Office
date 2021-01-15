package neutron

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

class Login:Application() {
    override fun start(primaryStage: Stage?) {
        val root:Parent = FXMLLoader.load<Parent>(javaClass.getResource("/login.fxml"))
        primaryStage!!.scene = Scene(root)
        primaryStage.show()
    }
}