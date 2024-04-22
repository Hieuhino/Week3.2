package com.example.tinhtongintent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Baittap32Adapter extends BaseAdapter {
    private ArrayList<Bt32> ls;
    private Context context;

    public Baittap32Adapter(ArrayList<Bt32> ls, Context context) {
        this.ls = ls;
        this.context = context;
    }

    @Override
    public int getCount() {
        return ls.size();
    }

    @Override
    public Object getItem(int position) {
        return ls.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewAX vax;
        if(convertView == null)
        {
            vax = new ViewAX();
            convertView = LayoutInflater.from(context).inflate(R.layout.baitaptuan3listviewitem, null);
            vax.img=convertView.findViewById(R.id.bt32itemImage);
            vax.tv_ten=convertView.findViewById(R.id.bt32itemTen);
            vax.tv_tuoi=convertView.findViewById(R.id.bt32itemTuoi);
        }
        else
        {
           vax = (ViewAX) convertView.getTag();
        }
        vax.img.setImageResource(ls.get(position).getHinh());
        vax.tv_ten.setText(ls.get(position).getTen());
        vax.tv_tuoi.setText(ls.get(position).getTuoi());
        return convertView;
    }

    class ViewAX{
        ImageView img;
        TextView tv_ten, tv_tuoi;
    }
}
