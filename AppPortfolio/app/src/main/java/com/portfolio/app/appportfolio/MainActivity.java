package com.portfolio.app.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.content.Context;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view){
        Context context = getApplicationContext();
        CharSequence text;
        int duration = Toast.LENGTH_SHORT;

        Toast toast ;
        //toast.show();

        int id = view.getId();


        switch(id) {
            case R.id.button:
                text="This button will launch  Popular Movies App";
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
            case R.id.button2:
                text="This button will launch  Stock Hawk App";
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
            case R.id.button3:
                text="This button will launch  Build It Bigger App";
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
            case R.id.button4:
                text="This button will launch  Go Ubiquitous App";
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
            case R.id.button5:
                text="This button will launch  Capstone App";
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
            default:
                break;
        }
    }
}
