package com.example.tarefalayoutsimone;

import android.content.Context;

import android.view.LayoutInflater;

import android.view.View;

import android.view.ViewGroup;

import android.widget.ImageView;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

public class MorangoAdapter extends RecyclerView.Adapter<MorangoAdapter.MorangoViewHolder> {

    private int[] morangoImages;

    private Context context;

    public MorangoAdapter(Context context, int[] morangoImages) {

        this.context = context;

        this.morangoImages = morangoImages;

    }

    @NonNull

    @Override

    public MorangoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context)

                .inflate(R.layout.item_morango, parent, false);

        return new MorangoViewHolder(view);

    }

    @Override

    public void onBindViewHolder(@NonNull MorangoViewHolder holder, int position) {

        holder.imgMorango.setImageResource(morangoImages[position]);

    }

    @Override

    public int getItemCount() {

        return morangoImages.length;

    }

    static class MorangoViewHolder extends RecyclerView.ViewHolder {

        ImageView imgMorango;

        public MorangoViewHolder(@NonNull View itemView) {

            super(itemView);

            imgMorango = itemView.findViewById(R.id.imgMorango);

        }

    }

}