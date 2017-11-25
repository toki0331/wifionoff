package com.example.toki.wifionoff;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private WifiManager wifiManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        triguer();
        finish();
    }

    private void triguer() {
            WifiManager wifiManager=(WifiManager)getApplicationContext().getSystemService(WIFI_SERVICE);
            Vibrator vibrator =(Vibrator)getApplicationContext().getSystemService(VIBRATOR_SERVICE);
            if(wifiManager.isWifiEnabled()){
                wifiManager.setWifiEnabled(false);
                Toast.makeText(getApplicationContext(),"Wifi off",Toast.LENGTH_SHORT).show();
                vibrator.vibrate(new long[]{0,500,500,500},-1);
            }
            else {
                wifiManager.setWifiEnabled(true);
                Toast.makeText(getApplicationContext(), "Wifi on", Toast.LENGTH_SHORT).show();
                vibrator.vibrate(new long[]{0, 500}, -1);

            }
    }
}
