package com.dhoha.srt.API;

import com.dhoha.srt.model.ResponseDataModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiRequest {


    /******************** Authentification Login*******************/
    @GET("Login.php")
    Call<ResponseDataModel> Login(@Query("email") String email);


}
