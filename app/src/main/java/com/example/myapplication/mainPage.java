package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class mainPage extends AppCompatActivity {

    private TextView user;
            Button subs;
            TextView rules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        user = (TextView)findViewById(R.id.user);
        subs = (Button)findViewById(R.id.subscribe);
        rules = (TextView)findViewById((R.id.rules));

        subs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(mainPage.this, camPage.class);
                startActivity(intent);
            }
        });
    }
}
