package com.example.tanamanobat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getIntentFrom();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void getIntentFrom(){
        if (getIntent().hasExtra("image_toga") && getIntent().hasExtra("name_toga") && getIntent().hasExtra("detail_toga")){
            int imagetoga = getIntent().getIntExtra("image_toga", 0);
            String nametoga = getIntent().getStringExtra("name_toga");
            String detailtoga = getIntent().getStringExtra("detail_toga");

            setImage(imagetoga, nametoga, detailtoga);
        }
    }

    private void setImage(int image, String name, String detail){
        TextView tvname, tvdetail;

        tvname = findViewById(R.id.txt_juduldetail);
        tvdetail = findViewById(R.id.txt_isidetail);

        tvname.setText(name);
        tvdetail.setText(detail);

        ImageView imageview = findViewById(R.id.img_detailtoga);
        imageview.setImageResource(image);
    }
}
