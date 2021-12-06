package com.example.gymappfirst;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button alertMsg;
    TextView tvSetDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        alertMsg=findViewById(R.id.alertMsg);
        alertMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        });



    }
    public void showDatePickerDialog(){
        DialogFragment newFragment=new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),"datePicker");

    }
    public void processedData(int day,int month ,int year){
        String day_string=Integer.toString(day);
        String month_string=Integer.toString(month+1);
        String year_string=Integer.toString(year);

        tvSetDate=findViewById(R.id.tvSetDate);
        tvSetDate.setText(day_string+"/"+month_string+"/"+year_string);

    }
}