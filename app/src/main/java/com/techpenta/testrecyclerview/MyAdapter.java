package com.techpenta.testrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by Snikdha on 2/8/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    String[] s1;
    int[] img;
    //Make a constructer to import the values from Main Activity
    public MyAdapter(Context ct,String[] data1,int[] imagedata){
        context=ct;
        s1=data1;
        img=imagedata;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.txt1.setText(s1[position]);
        holder.imageView.setImageResource(img[position]);

    }

    @Override
    public int getItemCount() {
        return s1.length;
    }

    //here MyViewHolder is a class created by me ,
    // and this class should extend ViewHolder class
    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txt1;
        ImageView imageView;
        public MyViewHolder(View itemView) {
            super(itemView);
            txt1=(TextView)itemView.findViewById(R.id.txt1);
            imageView=(ImageView)itemView.findViewById(R.id.imageView);


        }
    }


}
