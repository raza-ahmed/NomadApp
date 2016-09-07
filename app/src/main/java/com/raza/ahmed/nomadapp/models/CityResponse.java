package com.raza.ahmed.nomadapp.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ahmedraza on 06/09/16.
 */
public class CityResponse {

    @SerializedName("result")
    private List<City> result;

    public List<City> getResult(){
        return result;
    }


    public static class City implements Parcelable{

        @SerializedName("name")
        public String workplaceName;

        @SerializedName("img")
        public String workplaceImage;

        @SerializedName("url")
        public String workplaceLink;

        @SerializedName("type")
        public String workplaceType;

        @SerializedName("price_per_day_in_usd")
        public String pricePerDay;



        protected City(Parcel in) {
            workplaceName = in.readString();
            workplaceImage = in.readString();
            workplaceLink = in.readString();
            workplaceType = in.readString();
            pricePerDay = in.readString();
        }

        public static final Parcelable.Creator<City> CREATOR = new Parcelable.Creator<City>() {
            @Override
            public City createFromParcel(Parcel in) {
                return new City(in);
            }

            @Override
            public City[] newArray(int size) {
                return new City[size];
            }
        };

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(workplaceName);
            parcel.writeString(workplaceImage);
            parcel.writeString(workplaceLink);
            parcel.writeString(workplaceType);
            parcel.writeString(pricePerDay);
        }
    }
}
