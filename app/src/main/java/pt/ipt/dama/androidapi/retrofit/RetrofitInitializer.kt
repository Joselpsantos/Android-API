package pt.ipt.dama.androidapi.retrofit

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import pt.ipt.dama.androidapi.retrofit.service.INoteService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/***
 * we write here the link to API
 */
class RetrofitInitializer {

    //Link to API
    private val host = "https://adamastor.ipt.pt/dam-API/"

    // the GSON tools is the one that we used to convert JSON
    // read by Retrofit
    // the parameter .setLenient() should be used only at developer mode
    private val gson: Gson = GsonBuilder().setLenient().create()

    private val retrofit = Retrofit.Builder()
        .baseUrl(host)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    fun noteService(): INoteService = retrofit.create(INoteService::class.java)
}