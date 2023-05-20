package com.customlistview.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.customlistview.R;

import org.w3c.dom.Text;

public class MyListAdapter extends ArrayAdapter<String> {
    Activity context;
    String[] title;
    String[] description;
    int[] image;

    public MyListAdapter(Activity context, String[] title, String[] description,int[] image){
        super(context,R.layout.customlist_items,title);
        this.context=context;
        this.title=title;
        this.description=description;
        this.image=image;

    }
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView =inflater.inflate(R.layout.customlist_items,null,true);

        TextView txtTitle=(TextView) rowView.findViewById(R.id.titleTv);
        ImageView imageView=(ImageView) rowView.findViewById(R.id.imageTv);
        TextView txtDescription=(TextView) rowView.findViewById(R.id.descTv);
        txtTitle.setText(title[position]);
        imageView.setImageResource(image[position]);
        txtDescription.setText(description[position]);
        return rowView;
    };
}
