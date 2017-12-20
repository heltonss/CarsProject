package br.com.heltonsouza.carsproject;

import android.app.Application;
import android.util.Log;

/**
 * Created by heltonsouza on 12/12/17.
 */

public class CarsApplication extends Application {
    private static final String TAG = "CarrosApplication";
    private static CarsApplication instance = null;

    public static CarsApplication getInstance(){
        return instance;
    }

    public void onCreate(){
        super.onCreate();
        Log.d(TAG, "CarrosApplication.onCreate()");
        //Salva a instancia para termos acesso como singletons
        instance = this;
    }

    public void onTerminate(){
        super.onTerminate();
        Log.d(TAG,"CarrosApplication.onTerminate()");
    }
}
