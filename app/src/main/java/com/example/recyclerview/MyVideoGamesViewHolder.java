package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyVideoGamesViewHolder extends RecyclerView.ViewHolder {

    private TextView name;
    private TextView price;
    private ImageView im ;


        public MyVideoGamesViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.nameV);
            price = itemView.findViewById(R.id.priceV);
            im = itemView.findViewById(R.id.imageJV);

        }

    void display(JeuVideo jeuVideo){
        name.setText(jeuVideo.getName());
        price.setText(jeuVideo.getPrice() + "$");
        im.setImageResource(R.drawable.capture);
    }



}
