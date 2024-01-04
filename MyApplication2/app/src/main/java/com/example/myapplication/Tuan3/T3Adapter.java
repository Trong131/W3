package com.example.myapplication.Tuan3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.myapplication.R;

import com.example.myapplication.R;
import com.example.myapplication.Tuan22.T22Adapter;

import java.util.ArrayList;

public class T3Adapter extends BaseAdapter {
    private ArrayList<T3Contact> ls;
    private Context context;
    public T3Adapter(ArrayList<T3Contact> ls, Context context) {
        this.ls = ls;
        this.context = context;
    }
    //Lay ve so lương item
    @Override
    public int getCount() {
        return ls.size();
    }
    //lay ve item
    @Override
    public Object getItem(int position) {
        return ls.get(position);
    }
    //Lay ve id
    @Override
    public long getItemId(int position) {
        return position;
    }
    //tao du lieu
    //gan du lieu
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Tao view
        ViewDN vax;
        // neu chua co view thi ta tao view moi
        if(convertView==null)
        {
            vax = new ViewDN();//tao view moi
            //anh xa layout
            convertView = LayoutInflater.from(context).inflate(R.layout.tuan22_itemview_lv, null);
            //Anh xa tung thanh phan layout
            vax.img_hinh=convertView.findViewById(R.id.avtTuan3);
            vax.tv_ten=convertView.findViewById(R.id.Tuan3ten);
            vax.tv_tuoi=convertView.findViewById(R.id.Tuan3tuoi);
            //tao template de lan sau su dung
            convertView.setTag(vax);
        }
        //neu da co view-> su dung lai view cu
        else
        {
            vax = (ViewDN) convertView.getTag();
        }
        //gan du lieu cho layout
        vax.img_hinh.setImageResource(ls.get(position).getHinh());
        vax.tv_ten.setText(ls.get(position).getTen());
        vax.tv_tuoi.setText(ls.get(position).getTuoi());
        return convertView;
    }
    //Dinh nghia view
    class ViewDN{
        ImageView img_hinh;
        TextView tv_ten, tv_tuoi;
    }
}
