package com.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class GridViewActivity extends AppCompatActivity {
GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        gridView=findViewById(R.id.mygrid);
        String names []={"Dinesh","Sangam","Nayan","Prachanda","Sgam"};
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.gridview_items,R.id.text,names);
        gridView.setAdapter(adapter);

    }
}