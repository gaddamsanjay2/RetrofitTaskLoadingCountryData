package com.example.retrofittaskloadingcountrydata;

import retrofit2.Call;
import retrofit2.http.GET;

public interface myApiCall {

   //https://run.mocky.io/v3/972feafa-5917-4e4c-bbde-e4c7291f7921
//    https://run.mocky.io/v3/686dc1a5-f234-4cc6-b1af-4432c9552bd8

    @GET("686dc1a5-f234-4cc6-b1af-4432c9552bd8")
    Call<JsonResponse> getResponseList();
}
