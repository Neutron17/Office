package neutron.io

import java.io.File
import java.io.FileNotFoundException
import java.util.*

class Reader {
    companion object{
        fun read(path:String): String {
            try {
                val file = File(path)
                val sc = Scanner(file)
                while (sc.hasNextLine()) {
                    val data = sc.nextLine()
                    println(data)
                    return data
                }
                sc.close()
            } catch (e: FileNotFoundException) {
                e.printStackTrace()
            }
            return ""
        }
    }
}