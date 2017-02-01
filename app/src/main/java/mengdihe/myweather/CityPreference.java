package mengdihe.myweather;

import android.app.Activity;
import android.content.SharedPreferences;

public class CityPreference {

    SharedPreferences prefs;

    public CityPreference(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }
    //use SD as the default city
    String getCity(){
        return prefs.getString("city", "San Diego");
    }

    void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }

}