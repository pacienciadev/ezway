package br.com.ezway.app.services

import com.google.gson.annotations.SerializedName

data class CEP(

    @SerializedName("cep")          val cep: String,
    @SerializedName("logradouro")   val logradouro: String,
    @SerializedName("complemento")  val complemento: String,
    @SerializedName("bairro")       val bairro: String,
    @SerializedName("localidade")   val localidade: String,
    @SerializedName("uf")           val uf: String,
    @SerializedName("unidade")      val unidade: String,
    @SerializedName("ibge")         val ibge: String,
    @SerializedName("gia")          val gia: String
)