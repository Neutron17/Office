package neutron.io

import java.io.*
import java.lang.NullPointerException

class Writer {
    companion object {
        fun bufferedWriter(text: String, path: String) {
            try {
                val fos = FileOutputStream(path)
                val bout = BufferedOutputStream(fos)
                val a = text.toByteArray()
                bout.write(a)
                bout.flush()
                bout.close()
            } catch (ex: IOException) {
                System.err.println("Error in bufferedWriter")
                ex.printStackTrace()
            } catch (ex: NullPointerException) {
                System.err.println("Path cannot be null")
                ex.printStackTrace()
            }
        }

        fun withoutOverwrite(text: String, path: String) {
            val log = File(path)
            try {
                if (!log.exists()) {
                    log.createNewFile()
                }
                val fileWriter = FileWriter(log, true)
                val bufferedWriter = BufferedWriter(fileWriter)
                bufferedWriter.write(text)
                bufferedWriter.close()
            } catch (e: IOException) {
                println("COULD NOT LOG!!")
            }
        }
    }
}