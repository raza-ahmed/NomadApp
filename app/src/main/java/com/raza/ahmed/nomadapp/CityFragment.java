package com.raza.ahmed.nomadapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.raza.ahmed.nomadapp.models.CityResponse;
import com.raza.ahmed.nomadapp.models.NomadServices;
import com.raza.ahmed.nomadapp.models.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class CityFragment extends Fragment {

    private static final String TAG = MainActivity.class.getSimpleName();

    public CityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_city, container, false);

        final RecyclerView recyclerView = (RecyclerView) rootview.findViewById(R.id.city_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        NomadServices nomadServices = RetrofitClient.getRetrofitCity().create(NomadServices.class);

        Call<CityResponse> call = nomadServices.getPlaceMumbai();
        call.enqueue(new Callback<CityResponse>() {
            @Override
            public void onResponse(Call<CityResponse> call, Response<CityResponse> response) {
                List<CityResponse.City> city = response.body().results;
                Log.d(TAG, "Number of movies received: " + city.size());
            }

            @Override
            public void onFailure(Call<CityResponse> call, Throwable t) {
                Log.e(TAG, t.toString());
            }
        });
        return rootview;
    }

}
