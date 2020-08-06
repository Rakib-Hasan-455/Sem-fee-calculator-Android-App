package com.rakib.semesterfeecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView;

import com.rakib.semesterfeecalculator.R;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private EditText num3;
    private Button add;
    private Button add1;
    private TextView result;
    private  TextView result1;
    private TextView result2;
    private TextView result3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=(EditText)findViewById(R.id.etNum1);
        num2=(EditText)findViewById(R.id.etNum2);
        num3=(EditText)findViewById(R.id.etNum3);
        add=(Button)findViewById(R.id.btnAdd);
        add1=(Button)findViewById(R.id.btnAdd1);
        result=(TextView)findViewById(R.id.tvAnswer);
        result1=(TextView)findViewById(R.id.tvAnswer1);
        result2=(TextView)findViewById(R.id.tvAnswer2);
        result3=(TextView)findViewById(R.id.tvAnswer3);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                {
                    try {
                        float number1 = Float.parseFloat(num1.getText().toString());
                        float number2 = Float.parseFloat(num2.getText().toString());
                        float sum0 = (number1 * 3850 + 3500);
                        float sum = (number1 * 3850 + 3500) - ((number2 / 100) * 3850 * number1);

                        float number3 = Float.parseFloat(num1.getText().toString());
                        float number4 = Float.parseFloat(num2.getText().toString());
                        float sum1 = (float) (((number3 * 3850 + 3500) - ((number4 / 100) * 3850 * number3)) * 0.40);
                        float sum2 = (float) (((number3 * 3850 + 3500) - ((number4 / 100) * 3850 * number3)) * 0.30);
                        float sum3 = (float) (((number3 * 3850 + 3500) - ((number4 / 100) * 3850 * number3)) * 0.30);

                        float sum4 = (float) (((sum0)) * 0.4);
                        float sum5 = (float) ((sum - sum4) / 2);
                        float sum6 = (float) ((sum - sum4) / 2);
                        //x=2;

                        if (number2 == 25) {
                            result.setText("Your Total tution fee=" + String.valueOf(sum) + " Taka");
                            result1.setText("Your 1st 40% fee==" + String.valueOf(sum1) + " Taka");
                            result2.setText("Your 2nd 30% fee==" + String.valueOf(sum2) + " Taka");
                            result3.setText("Your 3rd 30% fee==" + String.valueOf(sum3) + " Taka");
                        } else {
                            result.setText("Your total tution fee=" + String.valueOf(sum) + " Taka");
                            result1.setText("Your 1st 40% fee==" + String.valueOf(sum4) + " Taka");
                            result2.setText("Your 2nd 30% fee==" + String.valueOf(sum5) + " Taka");
                            result3.setText("Your 3rd 30% fee==" + String.valueOf(sum6) + " Taka");
                        }
                    } catch (Exception number1) {
                        System.out.println("Give input in both box");
                    }
                }

                add1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            float number1 = Float.parseFloat(num1.getText().toString());
                            float number2 = Float.parseFloat(num2.getText().toString());
                            float number5 = Float.parseFloat(num3.getText().toString());
                            float sum0 = (number1 * 3850 + 3500);
                            float sum = (number1 * 3850 + 3500) - ((number2 / 100) * 3850 * number1) + number5;

                            float number3 = Float.parseFloat(num1.getText().toString());
                            float number4 = Float.parseFloat(num2.getText().toString());
                            float sum1 = (float) (((number3 * 3850 + 3500) - ((number4 / 100) * 3850 * number3)) * 0.40 + number5);
                            float sum2 = (float) (((number3 * 3850 + 3500) - ((number4 / 100) * 3850 * number3)) * 0.30);
                            float sum3 = (float) (((number3 * 3850 + 3500) - ((number4 / 100) * 3850 * number3)) * 0.30);

                            float sum4 = (float) (((sum0)) * 0.4 + number3 + number5);
                            float sum5 = (float) ((sum - sum4) / 2);
                            float sum6 = (float) ((sum - sum4) / 2);

                            if (number2 == 25) {
                                result.setText("Your Total tution fee=" + String.valueOf(sum) + " Taka");
                                result1.setText("Your 1st 40% fee==" + String.valueOf(sum1) + " Taka");
                                result2.setText("Your 2nd 30% fee==" + String.valueOf(sum2) + " Taka");
                                result3.setText("Your 3rd 30% fee==" + String.valueOf(sum3) + " Taka");
                            } else {
                                result.setText("Your total tution fee=" + String.valueOf(sum) + " Taka");
                                result1.setText("Your 1st 40% fee==" + String.valueOf(sum4) + " Taka");
                                result2.setText("Your 2nd 30% fee==" + String.valueOf(sum5) + " Taka");
                                result3.setText("Your 3rd 30% fee==" + String.valueOf(sum6) + " Taka");
                            }
                        }catch (Exception e){
                            System.out.println("Yw buddy give any input");
                        }


                    }
                });
            }
        });
    }

}