package br.com.ezway.app.services

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitService {

    //https://viacep.com.br/ws/01538001/json/
    @GET("{CEP}/json/")
    fun getCEP(@Path("CEP") CEP : String) : Call<CEP>

    //https://viacep.com.br/ws/SP/Sao%20Paulo/Avenida%20Lins%20de%20Vasconcelos/json/
    @GET("{estado}/{cidade}/{endereco}/json/")
    fun getRCE(@Path("estado") estado: String,
               @Path("cidade") cidade: String,
               @Path("endereco") endereco: String): Call<List<CEP>>
}