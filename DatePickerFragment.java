package com.example.gymappfirst;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import android.widget.DatePicker;

import java.util.Calendar;


public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {


    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        MainActivity mainActivity=(MainActivity) getActivity();
        mainActivity.processedData(dayOfMonth,month,year);
    }

    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        final Calendar c=Calendar.getInstance();
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH);
        int day=c.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(getActivity(),this,year,month,day);
    }
}