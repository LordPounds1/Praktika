package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextWeight;
    private RadioGroup radioGroupUnits;
    private RadioButton radioGrams, radioKilograms, radioCentners, radioTons;
    private Button buttonCalculate;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextWeight = findViewById(R.id.editTextWeight);
        radioGroupUnits = findViewById(R.id.radioGroupUnits);
        radioGrams = findViewById(R.id.radioGrams);
        radioKilograms = findViewById(R.id.radioKilograms);
        radioCentners = findViewById(R.id.radioCentners);
        radioTons = findViewById(R.id.radioTons);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateWeight();
            }
        });
    }

    private void calculateWeight() {
        double weight = Double.parseDouble(editTextWeight.getText().toString());
        double result;

        if (radioGrams.isChecked()) {
            result = weight;
            textViewResult.setText("Результат: " + result + " грамм");
        } else if (radioKilograms.isChecked()) {
            result = weight * 0.001;
            textViewResult.setText("Результат: " + result + " килограмм");
        } else if (radioCentners.isChecked()) {
            result = weight * 0.00001;
            textViewResult.setText("Результат: " + result + " центнер");
        } else if (radioTons.isChecked()) {
            result = weight * 0.000001;
            textViewResult.setText("Результат: " + result + " тонна");
        }
    }
}
