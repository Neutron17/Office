package neutron

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.image.Image
import javafx.scene.layout.Pane
import javafx.stage.Stage
import javax.swing.Icon
import javax.swing.text.IconView
import kotlin.jvm.Throws

class Settings: Application() {
    override fun start(primaryStage: Stage) {
        try {
            //val primaryStage: Stage = Stage()
            val root: Parent = FXMLLoader.load<Parent>(javaClass.getResource("/settings.fxml"))
            primaryStage.scene = Scene(root)
            primaryStage.icons.add(Image("/images/settings.jpeg"))
            primaryStage.show()
        }catch (e:NullPointerException) {
            e.printStackTrace()
        }
    }
}