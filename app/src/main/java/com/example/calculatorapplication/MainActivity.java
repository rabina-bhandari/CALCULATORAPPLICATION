package com.example.calculatorapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button number0, number1, number2, number3, number4, number5, number6,
            number7, number8, number9, addition, substraction, division,
            multiplication, dot, clear, equal, brackets, ac , percentage;
     TextView data,output;

    private final char ADDITION ='+';
    private final char SUBTRACTION ='-';
    private final char MULTIPLICATION ='*';
    private final char DIVISION ='/';
    private final char PERSENTAGE = '%';
    boolean checkBracket = false;
    private final char EQU =0;
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        number0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText().toString() + "0");

                    }
                });
        number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText().toString() + "1");

            }
        });
        number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText().toString() + "2");

            }
        });
        number3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText().toString() + "3");

            }
        });
        number4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText().toString() + "4");

            }
        });
        number5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText().toString() + "5");

            }
        });
        number6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText().toString() + "6");

            }
        });
        number7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText().toString() + "7");

            }
        });
        number8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText().toString() + "8");

            }
        });
        number9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText().toString() + "9");

            }
        });
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = ADDITION;
                output.setText(String.valueOf(val1) + "+");
                data.setText(null);

            }
        });
        substraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = SUBTRACTION;
                output.setText(String.valueOf(val1) + "-");
                data.setText(null);

            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = SUBTRACTION;
                output.setText(String.valueOf(val1) + "-");
                data.setText(null);

            }
        });


        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                ACTION = DIVISION;
                output.setText(String.valueOf(val1) + "/");
                data.setText(null);

            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = EQU;
                output.setText(output.getText().toString() +String.valueOf(val2) + "=" + String.valueOf(val1));
                data.setText(null);

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (data.getText().length() > 0) {
                    CharSequence name = data.getText().toString();
                    data.setText(name.subSequence(0, name.length() - 1));
                } else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    data.setText(null);
                    output.setText(null);

                }
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText().toString() + ".");

            }
        });
        brackets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBracket) {
                    data.setText(data.getText().toString() + ")");
                        checkBracket = false;
                    }

                else
                    {
                        data.setText(data.getText().toString() + "(");
                        checkBracket = true;
                    }

            }

        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data.setText("");
                output.setText("");

            }
        });



    }
    private void setupUIView(){
        number0 = (Button) findViewById(R.id.number0);
        number1 = (Button) findViewById(R.id.number1);
        number2 = (Button) findViewById(R.id.number2);
        number3 = (Button) findViewById(R.id.number3);
        number4 = (Button) findViewById(R.id.number4);
        number5 = (Button) findViewById(R.id.number5);
        number6 = (Button) findViewById(R.id.number6);
        number7 = (Button) findViewById(R.id.number7);
        number8 = (Button) findViewById(R.id.number8);
        number9 = (Button) findViewById(R.id.number9);


        addition = (Button) findViewById(R.id.addition);
        substraction = (Button) findViewById(R.id.substracation);
        multiplication = (Button) findViewById(R.id.multiplication);
        division = (Button) findViewById(R.id.divison);
        ac = (Button) findViewById(R.id.ac);

        clear = (Button) findViewById(R.id.clear);
        dot = (Button) findViewById(R.id.dot);
        brackets = (Button) findViewById(R.id.brackets);
        percentage = (Button) findViewById(R.id.percentage);

        equal = (Button) findViewById(R.id.equal);


        data = (TextView) findViewById(R.id.data);
        output = (TextView) findViewById(R.id.output);


    }
    private void compute(){
        if (!Double.isNaN(val1)) {
            val2 = Double.parseDouble(data.getText().toString());
            switch (ACTION) {
                case ADDITION:
                    val1 = val1 + val2;
                    break;
                case SUBTRACTION:
                    val1= val1 - val2;
                    break;
                case MULTIPLICATION:
                    val1 = val1 * val2;
                    break;
                case DIVISION:
                    val1 = val1 / val2;
                    break;
                case PERSENTAGE:
                    val1 = val1 % val2;
                    break;
                case EQU:
                    break;
        }


        }
        else{
            val1 = Double.parseDouble(data.getText().toString());
        }
    }

}
