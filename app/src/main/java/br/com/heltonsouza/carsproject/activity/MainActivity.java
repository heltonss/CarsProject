package br.com.heltonsouza.carsproject.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.heltonsouza.carsproject.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpToolbar();

    }
}
