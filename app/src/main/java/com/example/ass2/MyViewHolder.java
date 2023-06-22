package com.example.ass2;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView choice;

    public MyViewHolder(@NonNull View itemView , selectlister selectlisterr) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageview);
        choice = itemView.findViewById(R.id.choice);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(selectlisterr != null){
                   int pos = getAdapterPosition();
                   if (pos != RecyclerView.NO_POSITION) {
                       selectlisterr.OnItemClick(pos);

                   }
               }
            }
        });

    }
}