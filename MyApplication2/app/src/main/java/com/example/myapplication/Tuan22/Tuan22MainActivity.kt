package com.example.myapplication.Tuan22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.myapplication.R

class Tuan22MainActivity : AppCompatActivity() {
    var adap:T22Adapter? = null
    var ls:ArrayList<T22Contact> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan22_main)
        var lv=findViewById<ListView>(R.id.tuan3lv)
        //Tao nguon du lieu
        ls.add(T22Contact("Lê Hữu Hiếu", "19 tuổi", R.drawable.hieu))
        ls.add(T22Contact("Phạm Thuỳ Anh", "19 tuổi", R.drawable.thuyanh))
        ls.add(T22Contact("Nguyễn Thị Hồng Ánh", "19 tuổi", R.drawable.anh))
        ls.add(T22Contact("Phan Thị Mỹ Hằng", "19 tuổi", R.drawable.woman))
        ls.add(T22Contact("Hoàng Đức Trọng", "19 tuổi", R.drawable.trong))
        //gan vao adapter
        adap=T22Adapter(this,ls)
        lv.adapter=adap
    }
}