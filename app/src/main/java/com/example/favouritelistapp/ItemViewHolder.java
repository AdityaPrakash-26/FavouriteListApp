package com.example.favouritelistapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {

    public TextView itemTextView;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);

        itemTextView = itemView.findViewById(R.id.item_TextView);
    }
}
