package com.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    TextView resultTV, solutionTv;

    MaterialButton buttonC, buttonBrackOpen, buttonBreakClose;
    MaterialButton buttonDivide, buttonMultiply, buttonPlus, buttonMinus, buttonEquals;
    MaterialButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;
    MaterialButton buttonAC, buttonDot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTV = findViewById(R.id.resultTv);
        solutionTv = findViewById(R.id.placeTV);

        assignId(buttonC, R.id.cBtn);
        assignId(buttonBrackOpen, R.id.openbrackBtn);
        assignId(buttonBreakClose, R.id.closebrackBtn);
        assignId(buttonPlus, R.id.addBtn);
        assignId(buttonDivide, R.id.divBtn);
        assignId(buttonMinus, R.id.subBtn);
        assignId(buttonMultiply, R.id.mulBtn);
        assignId(buttonEquals, R.id.equalBtn);
        assignId(buttonDot, R.id.pointBtn);
        assignId(buttonAC, R.id.acBtn);
        assignId(button1, R.id.oneBtn);
        assignId(button2, R.id.twoBtn);
        assignId(button3, R.id.threeBtn);
        assignId(button4, R.id.fourBtn);
        assignId(button5, R.id.fiveBtn);
        assignId(button6, R.id.sixBtn);
        assignId(button7, R.id.sevenBtn);
        assignId(button8, R.id.eightBtn);
        assignId(button9, R.id.nineBtn);
        assignId(button0, R.id.zeroBtn);
    }

    void assignId(MaterialButton btn, int id) {
        btn = findViewById(id);
        btn.setOnClickListener(this::onClick);
    }

    public void onClick(View view) {
        MaterialButton button = (MaterialButton) view;
        String buttonText = button.getText().toString();
        String dataToCalculate = solutionTv.getText().toString();

        if (buttonText.equals("AC")) {
            solutionTv.setText("");
            resultTV.setText("0");
            return;
        }

        if (buttonText.equals("=")) {
            solutionTv.setText(resultTV.getText());
            return;
        }
        if (buttonText.equals("C")) {
            if (dataToCalculate.equals("")) {
                return;
            } else {
                dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length() - 1);
            }
        } else {
            dataToCalculate = dataToCalculate + buttonText;
        }

        solutionTv.setText(dataToCalculate);

        String finalResult = getResult(dataToCalculate);

        if (!finalResult.equals("Err")) {
            resultTV.setText(finalResult);
        }
    }


    String getResult(String data) {
        try {
            Context context = Context.enter();
            context.setOptimizationLevel(-1);
            Scriptable scriptable = context.initStandardObjects();
            String finalResult = context.evaluateString(scriptable, data, "javascript", 1, null).toString();
            if (finalResult.endsWith(".0")) {
                finalResult = finalResult.replace(".0", "");
            }
            return finalResult;
        } catch (Exception e) {
            return "Err";
        }
    }
}