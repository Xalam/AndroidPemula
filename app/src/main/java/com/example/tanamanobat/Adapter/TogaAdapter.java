package com.example.tanamanobat.Adapter;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.tanamanobat.DetailActivity;
import com.example.tanamanobat.R;
import com.example.tanamanobat.Toga;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class TogaAdapter extends RecyclerView.Adapter<TogaAdapter.ListViewHolder> {

    private ArrayList<Toga> listToga;

    public TogaAdapter(ArrayList<Toga> list){
        this.listToga = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_toga, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Toga toga = listToga.get(position);
        Glide.with(holder.itemView.getContext())
                .load(toga.getPhoto_toga())
                .apply(new RequestOptions().override(55,55))
                .into(holder.img_Gambar);
        holder.txt_nama.setText(toga.getToga());
        holder.txt_detail.setText(toga.getDetail_toga());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Bitmap bitmap = BitmapFactory.decodeResource(holder.itemView.getContext().getResources(), toga.getPhoto_toga());
//                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
//                byte[] b = byteArrayOutputStream.toByteArray();

                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                intent.putExtra("image_toga", toga.getPhoto_toga());
                intent.putExtra("name_toga", toga.getToga());
                intent.putExtra("detail_toga", toga.getDetail_toga());
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listToga.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView img_Gambar;
        TextView txt_nama, txt_detail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            img_Gambar = itemView.findViewById(R.id.ci_photo);
            txt_nama = itemView.findViewById(R.id.tx_judultoga);
            txt_detail = itemView.findViewById(R.id.tx_detailtoga);
        }
    }
}
