package com.example.landingpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;

import android.widget.TextView;
import android.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.view.LayoutInflater;

import android.view.ViewGroup;



public class FormActivity extends AppCompatActivity implements View.OnClickListener{
    Button b1,info;
    EditText t1,t2,t3,t4;
    TextView tt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(this);
        info=(Button)findViewById(R.id.buttonShowDialog) ;
        info.setOnClickListener(this);
        t1=(EditText)findViewById(R.id.number1);
        t2=(EditText)findViewById(R.id.number2);
        t3=(EditText)findViewById(R.id.number4);
        t4=(EditText)findViewById(R.id.number3);
        tt1=(TextView)findViewById(R.id.emi);

        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        t1.setText(str);
    }

    public void onClick(View v){
        switch(v.getId()) {
            case R.id.button:
                double p,r,n,d,emi;
                p=Double.parseDouble(t1.getText().toString());
                d=Double.parseDouble(t2.getText().toString());
                p=p-d;
                r=Double.parseDouble(t3.getText().toString());
                n=Double.parseDouble(t4.getText().toString());

                emi=p*(r*Math.pow((1+r),n))/(Math.pow((1+r),n)-1);
                emi=Math.floor(emi/(12*12));
                tt1.setText(String.valueOf(emi));
                break;
            case R.id.buttonShowDialog:
                showCustomDialog();
                break;
        }

    }
    void showCustomDialog() {
        //before inflating the custom alert dialog layout, we will get the current activity viewgroup
        ViewGroup viewGroup = findViewById(android.R.id.content);

        //then we will inflate the custom alert dialog xml that we created
        View dialogView = LayoutInflater.from(this).inflate(R.layout.my_dialog, viewGroup, false);


        //Now we need an AlertDialog.Builder object
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        //setting the view of the builder to our custom view that we already inflated
        builder.setView(dialogView);

        //finally creating the alert dialog and displaying it
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}

