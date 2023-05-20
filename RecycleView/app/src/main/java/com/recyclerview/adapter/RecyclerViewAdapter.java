package com.recyclerview.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.recyclerview.MainActivity;
import com.recyclerview.R;
import com.recyclerview.data.MyData;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
Activity context;
//int[] image;
//String[] name;
//String[] address;
    ArrayList<MyData>data;
//public RecyclerViewAdapter(Activity context,String[] name,String[] address,int[] image){
//    this.name=name;
//    this.address=address;
//    this.image=image;
//    this.context=context;
//}

    public RecyclerViewAdapter(MainActivity context, ArrayList<MyData> data) {
        this.context=context;
        this.data=data;
}


    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(context);
        View ListItem= layoutInflater.inflate(R.layout.recycler_view_items,parent,false);
  ViewHolder viewHolder=new ViewHolder(ListItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MyData current = data.get(position);
//        holder.txtName.setText(name[position]);
//        holder.txtAddress.setText(address[position]);
//        holder.imageView.setImageResource(image[position]);
    holder.txtName.setText(current.getName());
    holder.txtAddress.setText(current.getAddress());
    holder.imageView.setImageResource(current.getImage());
    }

    @Override
    public int getItemCount() {
//        return name.length;
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtName, txtAddress;
        ImageView imageView;
        public ViewHolder(View itemView){
            super(itemView);
            txtName=itemView.findViewById(R.id.txtName);
            txtAddress=itemView.findViewById(R.id.txtAddress);
            imageView=itemView.findViewById(R.id.image);
        }
    }
}
