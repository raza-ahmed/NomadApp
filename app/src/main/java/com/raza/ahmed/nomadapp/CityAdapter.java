package com.raza.ahmed.nomadapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.raza.ahmed.nomadapp.models.CityResponse;

import java.util.List;

/**
 * Created by ahmedraza on 06/09/16.
 */
public class CityAdapter extends RecyclerView.Adapter<CityAdapter.CityViewHolder> {

    private List<CityResponse.City> cityList;
    private int rowLayout;
    private Context context;


    public CityAdapter(List<CityResponse.City> cityList, int rowLayout, Context context){
        this.cityList = cityList;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public CityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(rowLayout, parent, false);
        return new CityViewHolder(itemView);
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

    @Override
    public void onBindViewHolder(CityViewHolder holder,final int position) {

        CityResponse.City city = cityList.get(position);
        holder.imageWorkplace.setText(city.workplaceImage);
        holder.nameWorkplace.setText(city.workplaceName);
        holder.pricePerDay.setText(city.pricePerDay);
        holder.linkWorkplace.setText(city.workplaceLink);
        holder.typeWorkPlace.setText(city.workplaceType);
    }

    @Override
    public int getItemCount() {
        return cityList.size();
    }


}
