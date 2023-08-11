package com.example.temperature;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputTemperature;
    private TextView resultText;
    private RadioButton celsiusToFar, farToCelsius;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputTemperature = findViewById(R.id.inputTemperature);
        resultText = findViewById(R.id.resultText);
        celsiusToFar = findViewById(R.id.celsiusToFar);
        farToCelsius = findViewById(R.id.farToCelsius);
    }

    public void convertTemperature(View view) {
        double inputValue = Double.parseDouble(inputTemperature.getText().toString());
        double result;

        if (celsiusToFar.isChecked()) {
            result = (inputValue * 9/5) + 32;
            resultText.setText("Result: " + result + " °F");
        } else if (farToCelsius.isChecked()) {
            result = (inputValue - 32) * 5/9;
            resultText.setText("Result: " + result + " °C");
        }
    }
}
