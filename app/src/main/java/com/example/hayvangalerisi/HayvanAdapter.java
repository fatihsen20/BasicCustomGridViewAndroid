package com.example.hayvangalerisi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class HayvanAdapter extends ArrayAdapter<String> {
    private String[] hayvanlar ;
    private int[] resimler ;
    Context context ;
    private ImageView hayvanresim ;
    private TextView hayvanisim ;

    public HayvanAdapter(String[] hayvanlar , int[] resimler , Context context){
        super(context , R.layout.hayvan , hayvanlar);
        this.hayvanlar = hayvanlar ;
        this.context = context;
        this.resimler =resimler;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = LayoutInflater.from(context).inflate(R.layout.hayvan , null);

        if (v != null){
            hayvanisim = v.findViewById(R.id.hayvan_txtview_hayvanadi);
            hayvanresim = v.findViewById(R.id.hayvan_imgview_hayvan);

            hayvanisim.setText(hayvanlar[position]);
            hayvanresim.setBackgroundResource(resimler[position]);


        }
        return v;
    }
}
