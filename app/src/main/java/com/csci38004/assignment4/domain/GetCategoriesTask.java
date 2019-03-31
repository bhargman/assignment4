package com.csci38004.assignment4.domain;

import android.os.AsyncTask;

import com.csci38004.assignment4.data.model.CategoryItem;
import com.csci38004.assignment4.presentation.model.PresentationCategory;

import java.util.ArrayList;
import java.util.List;

public class GetCategoriesTask extends AsyncTask<Void, Void, List<PresentationCategory>> {

    private Listener listener;

    public GetCategoriesTask(Listener listener) {
        this.listener = listener;
    }

    public interface Listener {
        void updateUI(List<PresentationCategory> presentationCategories);
    }

    public void clearListener() {
        this.listener = null;
    }

    /**
     * Update this method to make a synchronous call to
     * ServiceCreator.createSpotifyService().getCategories().
     *
     * If the response is successful, convert each {@link CategoryItem} to a
     * {@link PresentationCategory}.
     * You can use {@link CategoryItemUtil#getRandomCategoryIconUrl(CategoryItem)}
     * to get a random category icon's url.
     *
     * If the response is not successful, or there is an exception, return a
     * new ArrayList<>().
     */
    @Override
    protected List<PresentationCategory> doInBackground(Void... voids) {
        return new ArrayList<>();
    }

    /**
     * The returned list from {@link this#doInBackground(Void...)} is passed into this method,
     * which is ran on the main UI thread. Pass {@param presentationCategories} to
     * {@link Listener#updateUI(List)}.
     */
    @Override
    protected void onPostExecute(List<PresentationCategory> presentationCategories) {

    }
}
