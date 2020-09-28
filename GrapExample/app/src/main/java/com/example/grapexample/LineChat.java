package com.example.grapexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class LineChat extends AppCompatActivity {
GraphView gv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_chat);
    gv=findViewById(R.id.gv);
        LineGraphSeries<DataPoint>series =new LineGraphSeries<>(
                new DataPoint[]{
                        new DataPoint(0,1)
                        ,new DataPoint(1,6),
                        new DataPoint(3,3),
                        new DataPoint(4,8)
                }
        );
        gv.addSeries(series);
    }
}