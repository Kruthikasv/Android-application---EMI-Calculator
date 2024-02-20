package com.example.landingpage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class laptop extends AppCompatActivity implements View.OnClickListener{

    TextView price1, price2, price3, price4, price5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop);

        // to make the Navigation drawer icon always appear on the action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        price1 = (TextView)findViewById(R.id.textView9);
        price2 = (TextView)findViewById(R.id.textView13);
        price3 = (TextView)findViewById(R.id.textView16);
        price4 = (TextView)findViewById(R.id.textView21);
        price5 = (TextView)findViewById(R.id.textView25);

        Button myButton = findViewById(R.id.button);
        Button myButton1 = findViewById(R.id.button1);
        Button myButton2 = findViewById(R.id.button2);
        Button myButton3 = findViewById(R.id.button3);
        Button myButton4 = findViewById(R.id.button4);

        myButton.setOnClickListener(this);
        myButton1.setOnClickListener(this);
        myButton2.setOnClickListener(this);
        myButton3.setOnClickListener(this);
        myButton4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String[] priceAsStr;
        switch(v.getId()) {
            case R.id.button:
                priceAsStr = price1.getText().toString().split(":", 2);
                break;
            case R.id.button1:
                priceAsStr = price2.getText().toString().split(":", 2);
                break;
            case R.id.button2:
                priceAsStr = price3.getText().toString().split(":", 2);
                break;
            case R.id.button3:
                priceAsStr = price4.getText().toString().split(":", 2);
                break;
            case R.id.button4:
                priceAsStr = price5.getText().toString().split(":", 2);
                break;
            default:
                priceAsStr = price1.getText().toString().split(":", 2);
                break;
        }


        /*long priceAsLong = Long.parseLong(priceAsStr[1]);*/

        Intent intent = new Intent(getApplicationContext(), FormActivity.class);
        intent.putExtra("message", priceAsStr[1]);

        startActivity(intent);
    }


}

