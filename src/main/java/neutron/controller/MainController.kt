package neutron.controller

import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Control
import javafx.scene.control.MenuBar
import javafx.scene.layout.AnchorPane
import javafx.stage.Stage
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.launch
import neutron.Login
import neutron.Main
import neutron.Settings
import java.awt.event.ActionListener
import java.net.URL
import java.util.*

class MainController():Initializable, Control() {
    val fxScope:CoroutineScope = CoroutineScope(Job()+Dispatchers.JavaFx)
    @FXML
    val menuBar:MenuBar = MenuBar()
    @FXML
    val rootPane:AnchorPane = AnchorPane()

    @FXML
    fun handleSettings() {
        fxScope.launch {
            Settings().start(Stage())
        }
    }
    @FXML
    fun handleLogin() {
        Login().start(Stage())
    }

    override fun initialize(location: URL?, resources: ResourceBundle?) {
        menuBar.prefWidthProperty().bind(Main.stage.widthProperty())
    }
}