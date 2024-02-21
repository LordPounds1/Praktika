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

    private EditText weight;
    private RadioGroup group;
    private RadioButton grams, kg, cent, tons;
    private Button button;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = findViewById(R.id.weight);
        group = findViewById(R.id.group);
        grams = findViewById(R.id.grams);
        kg = findViewById(R.id.Kg);
        cent = findViewById(R.id.cent);
        tons = findViewById(R.id.tons);
        button = findViewById(R.id.button);
        result = findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateWeight();
            }
        });
    }

    private void calculateWeight() {
        double weight = Double.parseDouble(Weight.getText().toString());
        double result;

        if (grams.isChecked()) {
            result1 = weight;
            result.setText("Результат: " + result1 + " грамм");
        } else if (radioKilograms.isChecked()) {
            result2 = weight * 0.001;
            result.setText("Результат: " + result2 + " килограмм");
        } else if (radioCentners.isChecked()) {
            result3 = weight * 0.00001;
            result.setText("Результат: " + result3 + " центнер");
        } else if (radioTons.isChecked()) {
            result4 = weight * 0.000001;
            result.setText("Результат: " + result4 + " тонна");
        }
    }
}
