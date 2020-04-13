package com.thomaskuenneth.temperatureconverter;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.thomaskuenneth.temperatureconverter.android.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private final Model model = new Model();

    private RadioGroup tempSrc, tempDesti;
    private EditText input;
    private Button calculate;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tempSrc = findViewById(R.id.tempSrc);
        tempSrc.setOnCheckedChangeListener((group, checked) -> {
            switch (checked) {
                case R.id.srcCelsius:
                    model.setInUnit(Model.TEMPERATURE_UNIT.DEGREES_CELSIUS);
                    break;
                case R.id.srcFahrenheit:
                    model.setInUnit(Model.TEMPERATURE_UNIT.DEGREES_FAHRENHEIT);
                    break;
                case R.id.srcKelvin:
                    model.setInUnit(Model.TEMPERATURE_UNIT.KELVIN);
                    break;
                default:
                    Log.e(TAG, "Unexpected input unit");
            }
        });
        tempDesti = findViewById(R.id.tempDesti);
        tempDesti.setOnCheckedChangeListener((group, checked) -> {
            switch (checked) {
                case R.id.destiCelsius:
                    model.setOutUnit(Model.TEMPERATURE_UNIT.DEGREES_CELSIUS);
                    break;
                case R.id.destiFahrenheit:
                    model.setOutUnit(Model.TEMPERATURE_UNIT.DEGREES_FAHRENHEIT);
                    break;
                case R.id.destiKelvin:
                    model.setOutUnit(Model.TEMPERATURE_UNIT.KELVIN);
                    break;
                default:
                    Log.e(TAG, "Unexpected output unit");
            }
        });
        calculate = findViewById(R.id.calculate);
        input = findViewById(R.id.input);
        input.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                updateCalculateButton();
            }
        });
        input.setOnEditorActionListener((view, actionId, event) -> {
            calculate.performClick();
            return true;
        });
        result = findViewById(R.id.result);
        updateInputUnitFromModel();
        updateOutputUnitFromModel();
        updateInTemperatureFromModel();
        updateOutTemperatureFromModel();
        updateCalculateButton();
    }

    public void handleButtonAction(View view) {
        performComputation(input.getText().toString());
    }

    private void updateCalculateButton() {
        calculate.setEnabled(input.getText().length() > 0);
    }

    private void updateInputUnitFromModel() {
        model.calculateOutTemperature();
        switch (model.getInUnit()) {
            case DEGREES_CELSIUS:
                tempSrc.check(R.id.srcCelsius);
                break;
            case DEGREES_FAHRENHEIT:
                tempSrc.check(R.id.srcFahrenheit);
                break;
            case KELVIN:
                tempSrc.check(R.id.srcKelvin);
                break;
            default:
                throw new IllegalArgumentException("Unexpected input unit");
        }
    }

    private void updateOutputUnitFromModel() {
        switch (model.getOutUnit()) {
            case DEGREES_CELSIUS:
                tempDesti.check(R.id.destiCelsius);
                break;
            case DEGREES_FAHRENHEIT:
                tempDesti.check(R.id.destiFahrenheit);
                break;
            case KELVIN:
                tempDesti.check(R.id.destiKelvin);
                break;
            default:
                throw new IllegalArgumentException("Unexpected output unit");
        }
    }

    private void updateInTemperatureFromModel() {
        Double inTemperature = model.getInTemperature();
        input.setText(inTemperature == null ? "" : inTemperature.toString());
    }

    private void updateOutTemperatureFromModel() {
        result.setText(model.getOutTemperatureAsString());
    }

    private void performComputation(String txt) {
        model.setInTemperature(Double.valueOf(txt));
        model.calculateOutTemperature();
        updateOutTemperatureFromModel();
    }
}
