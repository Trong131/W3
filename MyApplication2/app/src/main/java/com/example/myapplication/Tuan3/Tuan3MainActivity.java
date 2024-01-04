package com.example.myapplication.Tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class Tuan3MainActivity extends AppCompatActivity {
    ListView lv;
    T3Adapter adapter;
    ArrayList<T3Contact> ls=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan22_main);
        lv=findViewById(R.id.tuan3lv);
        //tao nguon du lieu
        ls.add(new T3Contact("Lê Hữu Hiếu", "19 tuổi", R.drawable.hieu));
        ls.add(new T3Contact("Phạm Thuỳ Anh", "19 tuổi", R.drawable.thuyanh));
        ls.add(new T3Contact("Nguyễn Thị Hồng Ánh", "19 tuổi", R.drawable.anh));
        ls.add(new T3Contact("Phan Thị Mỹ Hằng", "19 tuổi", R.drawable.woman));
        ls.add(new T3Contact("Hoàng Đức Trọng", "19 tuổi", R.drawable.trong));
        //tao adapter
        adapter=new T3Adapter(ls, this);
        lv.setAdapter(adapter);
    }
}