package com.guruprasad.android.weather;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by Guruprasad on 2/23/2017.
 */

public class CityPreference {
    SharedPreferences prefs;

    public CityPreference(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    // If the user has not chosen a city yet, return
    // Sydney as the default city
    String getCity(){
        return prefs.getString("city", "London, Lon");
    }

    void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }

}
