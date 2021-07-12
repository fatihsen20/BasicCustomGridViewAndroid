package com.example.hayvangalerisi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private GridView gridview ;
    private String [] hayvanlar = {"At", "Fil" , "Kedi"};
    private int[] resimler = {R.drawable.at , R.drawable.fil , R.drawable.kedi};
    private HayvanAdapter hayvanadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridview = findViewById(R.id.main_activity_grid);
        hayvanadapter = new HayvanAdapter(hayvanlar , resimler , MainActivity.this);
        gridview.setAdapter(hayvanadapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, hayvanlar[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}