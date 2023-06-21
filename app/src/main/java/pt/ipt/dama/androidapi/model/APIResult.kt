package pt.ipt.dama.androidapi.model

import com.google.gson.annotations.SerializedName

/***
 * define the structure of data to send to API
 */
class APIResult(
    @SerializedName("code")
    val code :String?,
    @SerializedName("description")
    val description : String?
){

}