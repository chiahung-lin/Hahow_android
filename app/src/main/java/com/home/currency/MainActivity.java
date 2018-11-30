package com.home.currency;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void trans(View view){
        EditText edNTD = findViewById(R.id.ntd);
        String moneyData = edNTD.getText().toString();
        String title;
        String message;
        if (moneyData.equals("")){
            title = "Problem";
            message ="Please enter you NTD amount";
        }
        else{
            float money = Float.parseFloat(moneyData) / 30.9f;
            title="Result";
            message="USD is "+money;
        }
        new AlertDialog.Builder(this)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("OK",null)
                .show();
    }
}
