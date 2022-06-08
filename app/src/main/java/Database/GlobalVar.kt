package Database

import Models.User
import android.util.Base64

class GlobalVar {

    companion object {
        val STORAGEWrite_PERMISSION_CODE: Int = 3
        val STORAGERead_PERMISSION_CODE: Int= 2
        val listDataUser = ArrayList<User>()

        val ipAddress = "http://192.168.14.184/WebServicePP/"
        val readAll = ipAddress+"readAllUser.php"
        val readByID = ipAddress+"readAUserByID.php"
        val CreateUser = ipAddress+"createUser.php"
        val UpdateUser = ipAddress+"updateUser.php"
        val DeleteUser = ipAddress+"deleteUser.php"

        fun ByteArrToString(bArray: ByteArray): String {
            return Base64.encodeToString(bArray, Base64.DEFAULT)
        }

        fun StringToByteArr(raw: String):ByteArray{
            return Base64.decode(raw, Base64.DEFAULT)
        }
}