package br.com.heltonsouza.carsproject.activity;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import br.com.heltonsouza.carsproject.R;

/**
 * Created by heltonsouza on 12/12/17.
 */

public class BaseActivity extends livroandroid.lib.activity.BaseActivity {

    protected void setUpToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if(toolbar != null){
            setSupportActionBar(toolbar);
        }
    }
}
