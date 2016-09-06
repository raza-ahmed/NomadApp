package com.raza.ahmed.nomadapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.raza.ahmed.nomadapp.models.CityResponse;

import java.util.ArrayList;

/**
 * Created by ahmedraza on 06/09/16.
 */
public class CityAdapter extends RecyclerView.Adapter<CityAdapter.CityViewHolder> {
    private ArrayList<CityResponse.City> cityArrayList;

    @Override
    public CityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(CityViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CityViewHolder extends RecyclerView.ViewHolder{

        public TextView imageWorkplace, nameWorkplace, pricePerDay, typeWorkPlace, linkWorkplace;

        public CityViewHolder(View itemView) {
            super(itemView);
            imageWorkplace = (TextView) itemView.findViewById(R.id.img_workplc);
            nameWorkplace = (TextView) itemView.findViewById(R.id.name_wrkplc);
            pricePerDay = (TextView) itemView.findViewById(R.id.price_pr_day);
            typeWorkPlace = (TextView) itemView.findViewById(R.id.type_wrkplc);
            linkWorkplace = (TextView) itemView.findViewById(R.id.link_wrkplc);
        }
    }
}
