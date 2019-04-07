package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signUPActivity extends AppCompatActivity {

    private
    EditText Usernam;
    EditText phone;
    EditText email;
    EditText password;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Usernam = (EditText)findViewById(R.id.Username);
        phone = (EditText)findViewById(R.id.phone);
        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);
        save = (Button)findViewById(R.id.save);

       save.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {

                Intent newpage = new Intent(signUPActivity.this, mainPage.class);
                startActivity(newpage);
            }
        });
    }
}
