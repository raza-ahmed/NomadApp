package com.raza.ahmed.nomadapp.models;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ahmedraza on 06/09/16.
 */
public interface NomadServices {


    @GET("/mumbai-india/places/work")
    Call<CityResponse> getPlaceMumbai();

}
