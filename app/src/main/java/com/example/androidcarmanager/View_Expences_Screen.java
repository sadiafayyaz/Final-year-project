package com.example.androidcarmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class View_Expences_Screen extends AppCompatActivity {
    BarChart barChart;
    BarData barData;
    BarDataSet barDataSet;
    ArrayList barEntries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view__expences__screen);
        setTitle(Html.fromHtml("<font color='#3477e3'>View Expenses</font>"));

        barChart = findViewById(R.id.barchart);
        getEntries();
        barDataSet = new BarDataSet(barEntries, "Data Set");
        barData = new BarData(barDataSet);
        barChart.setData(barData);
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLUE);
        barDataSet.setValueTextSize(16f);
    }
    private void getEntries() {
        barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(1f, 2));
        barEntries.add(new BarEntry(2f, 4));
        barEntries.add(new BarEntry(3f, 3));
        barEntries.add(new BarEntry(5f, 1));
        barEntries.add(new BarEntry(6f, 5));
        barEntries.add(new BarEntry(7f, 2));
    }

}
