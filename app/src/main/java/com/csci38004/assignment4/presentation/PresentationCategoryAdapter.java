package com.csci38004.assignment4.presentation;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.csci38004.assignment4.presentation.model.PresentationCategory;

import java.util.ArrayList;
import java.util.List;

/**
 * This class allows us to adapt a {@link PresentationCategory} to a {@link PresentationCategoryViewHolder}.
 * Study slide 18 from lecture 10, and implement {@link this#onCreateViewHolder(ViewGroup, int)},
 * {@link this#onBindViewHolder(PresentationCategoryViewHolder, int)} and {@link this#getItemCount()}.
 *
 * Note: You can use {@link Glide} in order to load the image url into {@link PresentationCategoryViewHolder#imageView}.
 */
public class PresentationCategoryAdapter extends RecyclerView.Adapter<PresentationCategoryViewHolder> {

    private List<PresentationCategory> presentationCategories = new ArrayList<>();

    @NonNull
    @Override
    public PresentationCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PresentationCategoryViewHolder presentationCategoryViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    void updateCategoryItems(List<PresentationCategory> presentationCategoryItems) {
        this.presentationCategories = presentationCategoryItems;
        notifyDataSetChanged();
    }
}
