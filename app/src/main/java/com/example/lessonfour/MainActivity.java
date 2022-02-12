package com.example.lessonfour;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

private int One;
private String Two;
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

/*   @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("One", One);
        outState.putString("Two", Two);

    }
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        One = savedInstanceState.getInt("One");
        textInput.setText(String.format("%d", One));
        Two = savedInstanceState.getString("Two");
        textInput.setText(String.format("%d", Two));
    }
*/
    @SuppressLint("NonConstantResourceId")
    public void onClick(View view) {
        Button btn = (Button) view;
        textInput.setText(String.format("%s%s", textInput.getText().toString(), btn.getText().toString()));
        switch (view.getId()) {
            case (R.id.buttonOne):
            case (R.id.buttonTwo):
            case (R.id.buttonTen):
            case (R.id.buttonNine):
            case (R.id.buttonThree):
            case (R.id.buttonFour):
            case (R.id.buttonFive):
            case (R.id.buttonSix):
            case (R.id.buttonSeven):
            case (R.id.buttonEight):
            case (R.id.buttonEleven):
            case (R.id.buttonTwelve):
            case (R.id.buttonThirteen):
            case (R.id.buttonFourteen):
            case (R.id.buttonFifteen):
            case (R.id.buttonSixteen): {
                break;
            }
            case (R.id.buttonNumThemeOne): {
                MyApp.currentTheme = R.style.myStyleThemeRed;
                recreate();
                break;
            }
            case (R.id.buttonNumThemeTwo): {
                MyApp.currentTheme = R.style.myStyleThemeGreen;
                recreate();
                break;
            }
            case (R.id.buttonNumThemeThree): {
                MyApp.currentTheme = (R.style.MyThemeAll);
                recreate();
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
        ((MaterialButton) findViewById(R.id.buttonSecondActivity)).setOnClickListener(this);

    }


    private TextView textInput;
    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;
    private Button buttonFour;
    private Button buttonFive;
    private Button buttonSix;
    private Button buttonSeven;
    private Button buttonEight;
    private Button buttonNine;
    private Button buttonTen;
    private Button buttonEleven;
    private Button buttonTwelve;
    private Button buttonThirteen;
    private Button buttonFourteen;
    private Button buttonFifteen;
    private Button buttonSixteen;
    private Button buttonSecondActivity;


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