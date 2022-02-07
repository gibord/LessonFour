package com.example.lessonfour;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setTheme(R.style.myStyleThemeRed);
        // setTheme(R.style.MyThemeAll);
        // setTheme(R.style.myStyleThemeGreen);
        setTheme(MyApp.currentTheme);
        setContentView(R.layout.activity_main);
        initView();
        setListeners();

    }


    @SuppressLint("NonConstantResourceId")
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.buttonOne): {
                textInput.setText(String.format("%d", One));
                break;
            }
            case (R.id.buttonTwo): {
                textInput.setText(String.format("%d", Two));
                break;
            }
            case (R.id.buttonThree): {
                textInput.setText(String.format("%d", Three));
                break;
            }
            case (R.id.buttonFour): {
                textInput.setText(String.format("%d", Four));
                break;
            }
            case (R.id.buttonFive): {
                textInput.setText(String.format("%d", Five));
                break;
            }
            case (R.id.buttonSix): {
                textInput.setText(String.format("%d", Six));
                break;
            }
            case (R.id.buttonSeven): {
                textInput.setText(String.format("%d", Seven));
                break;
            }
            case (R.id.buttonEight): {
                textInput.setText(String.format("%d", Eight));
                break;
            }
            case (R.id.buttonNine): {
                textInput.setText(String.format("%d", Nine));
                break;
            }
            case (R.id.buttonTen): {
                textInput.setText(String.format("%d", Ten));
                break;
            }
            case (R.id.buttonEleven): {
                textInput.setText(Eleven);
                break;
            }
            case (R.id.buttonTwelve): {
                textInput.setText(Twelve);
                break;
            }
            case (R.id.buttonThirteen): {
                textInput.setText(Thirteen);
                break;
            }
            case (R.id.buttonFourteen): {
                textInput.setText(Fourteen);
                break;
            }
            case (R.id.buttonFifteen): {
                textInput.setText(Fifteen);
                break;
            }
            case (R.id.buttonSixteen): {
                textInput.setText(Sixteen);
                break;
            }
            case (R.id.buttonNumThemeOne): {
                MyApp.currentTheme = R.style.myStyleThemeRed;
                break;
            }
            case (R.id.buttonNumThemeTwo): {
                MyApp.currentTheme = R.style.myStyleThemeGreen;
                break;
            }
            case (R.id.buttonNumThemeThree): {
                MyApp.currentTheme = (R.style.MyThemeAll);
                break;
            }
            default: {

            }
        }
    }

    private void setListeners() {
        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
        buttonFour.setOnClickListener(this);
        buttonFive.setOnClickListener(this);
        buttonSix.setOnClickListener(this);
        buttonSeven.setOnClickListener(this);
        buttonEight.setOnClickListener(this);
        buttonNine.setOnClickListener(this);
        buttonTen.setOnClickListener(this);
        buttonEleven.setOnClickListener(this);
        buttonTwelve.setOnClickListener(this);
        buttonThirteen.setOnClickListener(this);
        buttonFourteen.setOnClickListener(this);
        buttonFifteen.setOnClickListener(this);
        buttonSixteen.setOnClickListener(this);
        ((MaterialButton) findViewById(R.id.buttonNumThemeOne)).setOnClickListener(this);
        ((MaterialButton) findViewById(R.id.buttonNumThemeTwo)).setOnClickListener(this);
        ((MaterialButton) findViewById(R.id.buttonNumThemeThree)).setOnClickListener(this);

    }


    private TextView textInput;
    private int One = 1;
    private Button buttonOne;
    private int Two = 2;
    private Button buttonTwo;
    private int Three = 3;
    private Button buttonThree;
    private int Four = 4;
    private Button buttonFour;
    private int Five = 5;
    private Button buttonFive;
    private int Six = 6;
    private Button buttonSix;
    private int Seven = 7;
    private Button buttonSeven;
    private Button buttonEight;
    private int Eight = 8;
    private Button buttonNine;
    private int Nine = 9;
    private Button buttonTen;
    private int Ten = 0;
    private Button buttonEleven;
    private String Eleven = "+";
    private Button buttonTwelve;
    private String Twelve = "-";
    private Button buttonThirteen;
    private String Thirteen = "/";
    private Button buttonFourteen;
    private String Fourteen = "*";
    private Button buttonFifteen;
    private String Fifteen = "=";
    private Button buttonSixteen;
    private String Sixteen = ".";


    private void initView() {
        textInput = findViewById(R.id.textInput);
        buttonOne = findViewById(R.id.buttonOne);
        buttonTwo = findViewById(R.id.buttonTwo);
        buttonThree = findViewById(R.id.buttonThree);
        buttonFour = findViewById(R.id.buttonFour);
        buttonFive = findViewById(R.id.buttonFive);
        buttonSix = findViewById(R.id.buttonSix);
        buttonSeven = findViewById(R.id.buttonSeven);
        buttonEight = findViewById(R.id.buttonEight);
        buttonNine = findViewById(R.id.buttonNine);
        buttonTen = findViewById(R.id.buttonTen);
        buttonEleven = findViewById(R.id.buttonEleven);
        buttonTwelve = findViewById(R.id.buttonTwelve);
        buttonThirteen = findViewById(R.id.buttonThirteen);
        buttonFourteen = findViewById(R.id.buttonFourteen);
        buttonFifteen = findViewById(R.id.buttonFifteen);
        buttonSixteen = findViewById(R.id.buttonSixteen);

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }


}