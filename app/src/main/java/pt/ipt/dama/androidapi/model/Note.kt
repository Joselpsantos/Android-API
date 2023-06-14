package pt.ipt.dama.androidapi.model

import com.google.gson.annotations.SerializedName

class Note(
    @SerializedName("title") val title :String,
    @SerializedName("description") val description :String
)