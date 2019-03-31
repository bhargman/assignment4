package com.csci38004.assignment4.presentation;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

class PresentationCategoryViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView textView;

    /**
     * Update this method to initialize {@link this#imageView} and {@link this#textView}.
     * You can use {@param itemView#findViewById()} to get the appropriate view ids. See
     * view_holder_presentation_category.xml for the view ids
     */
    PresentationCategoryViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}
