package com.punwald.iqdeneme;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Anasayfa extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anasayfa);

        Button oyna=(Button) findViewById(R.id.oyna);
        Button ayarlar=findViewById(R.id.ayarlar);
        oyna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent a=new Intent(getApplicationContext(),Oyun.class);
                startActivity(a);
            }
        });
        ayarlar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),Oyun.class);
                startActivity(a);
            }
        });
    }
}
