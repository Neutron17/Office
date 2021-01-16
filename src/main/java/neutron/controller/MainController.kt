package neutron.controller
//https://www.tutorialspoint.com/javafx/javafx_text.htm

import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.fxml.Initializable
import javafx.scene.Node
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.*
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.layout.AnchorPane
import javafx.scene.layout.StackPane
import javafx.stage.Stage
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.launch
import neutron.Main
import java.net.URL
import java.util.*

/** @author Neutron17
 * @since 1.0 */
class MainController():Initializable, Control() {
    val fxScope:CoroutineScope = CoroutineScope(Job()+Dispatchers.JavaFx)
    @FXML
    val menuBar:MenuBar = MenuBar()
    @FXML
    val rootPane:AnchorPane = AnchorPane()
    @FXML
    val menuPane:StackPane = StackPane()
    @FXML
    val fileMenu:Menu = Menu()
    @FXML
    val editMenu:Menu = Menu()
    @FXML
    val closeMenuItem:MenuItem = MenuItem()
    @FXML
    fun handleClose() {
        val stage:Stage = Stage()
//        val yesButt = Button("Yes")
//        val noButt = Button("No")
        stage.isResizable = true
        stage.width = 200.0
        stage.height = 120.0
//        yesButt.setOnAction {
//            exitProcess(0)
//        }
//        noButt.setOnAction {
//            stage.close()
//        }
        val text = Label("Are you sure")
        text.styleClass.add("my-label")
        val scene = Scene(AnchorPane(text,/*yesButt,noButt*/))
        scene.stylesheets.add("/css/close.css")
        stage.scene = scene
        stage.show()
    }
    @FXML
    fun handleSettings() {
        fxScope.launch {
            try {
                val primaryStage = Stage()
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
    @FXML
    fun handleLogin() {
        fxScope.launch {
            val primaryStage = Stage()
            val root: Parent = FXMLLoader.load<Parent>(javaClass.getResource("/login.fxml"))
            val scene = Scene(root)
            scene.stylesheets.add("/css/login.css")
            primaryStage.scene = scene
            primaryStage.show()
            neutron.Math.square(2)
        }
    }
    fun setMenuData() {
        val treeItemRoot:TreeItem<String> = TreeItem("Menu")
        val treeView:TreeView<String> = TreeView(treeItemRoot)
        treeView.isShowRoot = true

        val nodeItemA = TreeItem<String>("MENU_CONTACTS")
        val nodeItemB = TreeItem<String>("MENU_EXIT")

        val contactNode: Node = ImageView(Image(javaClass.getResourceAsStream("/images/settings.jpeg")))
        val exportNode: Node = ImageView(Image(javaClass.getResourceAsStream("/images/settings.jpeg")))
        val nodeItemA1 = TreeItem<String>("MENU_LIST", contactNode)
        val nodeItemA2 = TreeItem<String>("MENU_EXPORT", exportNode)

        nodeItemA.children.addAll(nodeItemA1, nodeItemA2)
        treeItemRoot.children.addAll(nodeItemA, nodeItemB)
        menuPane.children.add(treeView)

        treeView.selectionModel.selectedItemProperty().addListener { observable, oldValue, newValue ->
            val selectedItem = newValue as TreeItem<String>
            val selectedMenu: String?
            selectedMenu = selectedItem.value
            println(selectedMenu)
        }
    }
    override fun initialize(location: URL?, resources: ResourceBundle?) {
        setMenuData()
        menuBar.prefWidthProperty().bind(Main.stage.widthProperty())
    }
}