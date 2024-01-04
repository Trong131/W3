package com.example.myapplication.Tuan22

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.R

class T22Adapter (context: Context, ls:ArrayList<T22Contact>):BaseAdapter(){
    var ls:ArrayList<T22Contact> = ls
    var context: Context = context

    //lay ve tong so item
    override fun getCount(): Int {
        return ls.size
    }

    //lay ve item hien tai
    override fun getItem(position: Int): Any {
        return ls.get(position)
    }

    //lay ve id cua item
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    //tao view
    //gan du lieu cho view
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var c = convertView
        //1. tao view
        //neu chua co view -> tao view moi
        var vax: ViewAx
        if (convertView == null)
        {
            vax = ViewAx() // tao view moi
            //generate layout
            c = LayoutInflater.from(context).inflate(R.layout.tuan22_itemview_lv, null)
            //anh xa tưng thanh phan cua layout
            vax.img_hinh = c.findViewById(R.id.avtTuan3)
            vax.tv_ten = c.findViewById(R.id.Tuan3ten)
            vax.tv_tuoi = c.findViewById(R.id.Tuan3tuoi)
            //Tao template dde lan sau su dung
            c.tag=vax
        }
        //1.2. Neu da co view -> su dung view cu
        else
        {
            vax = c!!.tag as ViewAx
        }
        //2. Gan du lieu cho view
        vax.img_hinh!!.setImageResource(ls[position].hinh!!)
        vax.tv_ten!!.text=ls[position].ten!!
        vax.tv_tuoi!!.text=ls[position].tuoi!!
        return c!!
    }

    //khai bao lop anh xa ItemView
    inner class ViewAx{
        var img_hinh: ImageView? = null
        var tv_ten: TextView? = null
        var tv_tuoi: TextView? = null
    }
}