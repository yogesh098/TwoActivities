package com.example.twoactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE =
            "com.example.twoactivities.extra.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void StartActivity(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        /*switch(view.getId()){
            case R.id.button_one:
                intent.putExtra(message, 1);
                Log.d("button","button1");
                break;
            case R.id.button_two:
                intent.putExtra(message, 2);
                Log.d("button","button2");
                break;
            case R.id.button_three:
                intent.putExtra(message, 3);
                Log.d("button","button3");
                break;
        }
        startActivity(intent);
        */
        if(view.getId()==R.id.button_one){
            intent.putExtra(EXTRA_MESSAGE, 1);
        }
        else if(view.getId()==R.id.button_two){
            intent.putExtra(EXTRA_MESSAGE, 2);
        }
        else if(view.getId()==R.id.button_three){
            intent.putExtra(EXTRA_MESSAGE, 3);
        }
        startActivity(intent);
    }
}