package com.dhoha.srt.API;

import com.dhoha.srt.model.ResponseDataModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiRequest {


    /******************** Authentification Login*******************/
    @GET("Login.php")
    Call<ResponseDataModel> Login(@Query("email") String email);

    /******************** Select Materiels*******************/
    @GET("ConsulterMateriels.php")
    Call<ResponseDataModel> getMateriels();
    /******************** Select Composants*******************/
    @GET("ConsulterComposants.php")
    Call<ResponseDataModel> getComposants();
    /******************** Select Logiciels*******************/
    @GET("ConsulterLogiciels.php")
    Call<ResponseDataModel> getLogiciels();
}
