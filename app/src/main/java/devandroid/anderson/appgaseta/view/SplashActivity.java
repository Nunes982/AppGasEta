package devandroid.anderson.appgaseta.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import devandroid.anderson.appgaseta.R;
import devandroid.anderson.appgaseta.database.GasEtaDB;

public class SplashActivity extends AppCompatActivity {

    GasEtaDB db;

    public static final int TIME_OUT_SPLASH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        cumutarTelaSplash();


    }

    private void cumutarTelaSplash() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                db = new GasEtaDB(SplashActivity.this);

                Intent telaPrincipal = new Intent(
                        SplashActivity.this,
                        GasEtaActivity.class);

                startActivity(telaPrincipal);
                finish();

            }
        }, TIME_OUT_SPLASH);
    }
}