package com.home.currency;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edNTD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edNTD = findViewById(R.id.ntd);
        Button btCalcu = findViewById(R.id.btCalcu);
        btCalcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle(title)
                        .setMessage(message)
                        .setPositiveButton("OK",null)
                        .show();
            }
        });
    }
}
