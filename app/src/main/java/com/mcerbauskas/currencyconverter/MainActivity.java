package com.mcerbauskas.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {


       public void convert (View view)
    {
        EditText eurosAmountEditText = (EditText)findViewById(R.id.eurosAmountEditText);
        Log.i("amount", eurosAmountEditText.getText().toString());

        double valiuta = Double.parseDouble(eurosAmountEditText.getText().toString()); // parseDouble konvertuoja is string i double

        double result = valiuta * 75.4625;

        Toast.makeText(getApplicationContext(), "Rubliai: " + result, LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
