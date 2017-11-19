package com.punwald.iqdeneme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Oyun extends Activity {
    Intent a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyun);

        Button bölüm1=findViewById(R.id.bölüm1);
        Button bölüm2=findViewById(R.id.bölüm2);
        Button bölüm3=findViewById(R.id.bölüm3);

        bölüm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=new Intent(getApplicationContext(),Bolum1.class);
                startActivity(a);
            }
        });

        bölüm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=new Intent(getApplicationContext(),Bolum2.class);
                startActivity(a);
            }
        });
        bölüm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=new Intent(getApplicationContext(),Bolum3.class);
                startActivity(a);
            }
        });
    }
}
