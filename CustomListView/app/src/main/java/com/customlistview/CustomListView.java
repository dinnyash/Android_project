package com.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.customlistview.adapter.MyListAdapter;

public class CustomListView extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
        listView=findViewById(R.id.mylist);
        String[] title={
                "Ttile 1","Ttile 2",
                "Title 3", "Title 4"};
        String[] description={
                "This is description 1",
                "This is description 2",
                "This is description 3",
                "This is description 4"};
        int[] image={
                R.drawable.ic_launcher,
                R.drawable.ic_launcher,
                R.drawable.ic_launcher,
                R.drawable.ic_launcher};
        MyListAdapter adapter= new MyListAdapter(this,title,description,image);
        listView.setAdapter(adapter);
    }
}