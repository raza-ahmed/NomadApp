package com.raza.ahmed.nomadapp.models;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ahmedraza on 06/09/16.
 */
public class RetrofitClient {

    public static final String BASE_URL = "https://nomadlist.com/api/v2/list/cities/";

    private static Retrofit retrofit = null;


    public static Retrofit getRetrofitCity(){


        if (retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }


        return retrofit;

    }
}
