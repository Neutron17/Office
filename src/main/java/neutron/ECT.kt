package neutron

import java.awt.AWTException
import java.awt.SystemTray
import java.awt.Toolkit
import java.awt.TrayIcon

/** @author Neutron17 */
class ECT {
    @Throws(AWTException::class)
    fun notification(caption:String,text:String,iconPath:String) {
        //Obtain only one instance of the SystemTray object
        val tray = SystemTray.getSystemTray()

        //If the icon is a file
        val image: java.awt.Image? = Toolkit.getDefaultToolkit().createImage(iconPath)
        //Alternative (if the icon is on the classpath):
        //Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));
        val trayIcon = TrayIcon(image, "Tray Demo")
        //Let the system resize the image if needed
        trayIcon.isImageAutoSize = true
        //Set tooltip text for the tray icon
        trayIcon.toolTip = "System tray icon demo"
        tray.add(trayIcon)
        trayIcon.displayMessage(caption,text,TrayIcon.MessageType.INFO)
    }
}