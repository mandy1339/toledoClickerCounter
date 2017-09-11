package com.example.armando.toledoclickcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.txtDisplayCount);
        quantityTextView.setText(""+count);
    }


    public void clickAction(View view){
        count ++;
        display(count);
    }

    public void clickClear(View view) {
        count = 0;
        display(count);
    }

}
