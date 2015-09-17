package com.cwsolutions.mytestapplication05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView txtInformation;
    public Button btnBeginProcess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtInformation = (TextView) findViewById(R.id.txtInformation);
        btnBeginProcess = (Button) findViewById(R.id.btnBeginProcess);

        btnBeginProcess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AsyncInterface(MainActivity.this).execute("All Done Again!");
            }
        });
    }


}
