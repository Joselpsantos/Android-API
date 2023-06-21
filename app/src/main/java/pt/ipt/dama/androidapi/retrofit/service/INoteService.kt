package pt.ipt.dama.androidapi.retrofit.service

import pt.ipt.dama.androidapi.model.APIResult
import pt.ipt.dama.androidapi.model.Note
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

/**
 *nterface where the endpoints of the API are defined
 */
interface INoteService {

    /**
     * function to read data from API
     * transform data in JSON format to kotlin objects
     */
    @GET("api/notes")
    fun listNodes(): Call<List<Note>>

    /**
     * function to write new note to API
     */
    @POST("api/notes")
    fun addNote(@Body note : Note) : Call<APIResult>

}