package com.techpenta.testrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;

    MyAdapter myAdapter;
    String[] s1;
    int pic[]={R.drawable.pic3,R.drawable.pic4,R.drawable.preloader,R.drawable.product1,
            R.drawable.red_cap,R.drawable.sell1,R.drawable.sell2,R.drawable.sell_icon1};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv=(RecyclerView)findViewById(R.id.rv);
        s1=getResources().getStringArray(R.array.pet);

        myAdapter=new MyAdapter(this,s1,pic);

        rv.setAdapter(myAdapter);
        rv.setLayoutManager(new LinearLayoutManager(this));

    }
}
