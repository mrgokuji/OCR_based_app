package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class camPage extends AppCompatActivity {

    private TextView ten;
            TextView twelve;
            TextView grad;
            TextView postgrad;
            Button b10;
            Button b12;
            Button bgr;
            Button bpgr;
    static final int REQUEST_IMAGE_CAPTURE = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cam_page);

        ten = (TextView)findViewById(R.id.ten);
        twelve = (TextView)findViewById(R.id.twelve);
        grad = (TextView)findViewById(R.id.grad);
        postgrad = (TextView)findViewById(R.id.postgrad);
        b10 = (Button) findViewById(R.id.b10);
        b12 = (Button) findViewById(R.id.b12);
        bgr = (Button) findViewById(R.id.bgr);
        bpgr = (Button) findViewById(R.id.bpgr);

        ten.setText("PLEASE CLICK THE PICTURE OF YOUR 10TH MARKSHEET");
        twelve.setText("PLEASE CLICK THE PICTURE OF YOUR 12TH MARKSHEET");
        grad.setText("PLEASE CLICK THE PICTURE OF YOUR GRADUATION MARKSHEET");
        postgrad.setText("PLEASE CLICK THE PICTURE OF YOUR POST-GRADUATION MARKSHEET");

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(camPage.this, ocrpage.class);
                startActivity(intent);
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(camPage.this, ocrpage.class);
                startActivity(intent);
            }
        });

        bgr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(camPage.this, ocrpage.class);
                startActivity(intent);
            }
        });

        bpgr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(camPage.this, ocrpage.class);
                startActivity(intent);
            }
        });

    }
}
