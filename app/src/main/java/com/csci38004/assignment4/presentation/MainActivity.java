package com.csci38004.assignment4.presentation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.csci38004.assignment4.R;
import com.csci38004.assignment4.domain.GetCategoriesTask;
import com.csci38004.assignment4.presentation.model.PresentationCategory;

import java.util.List;

public class MainActivity extends AppCompatActivity implements GetCategoriesTask.Listener {

    private PresentationCategoryAdapter adapter;
    private GetCategoriesTask getCategoriesTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = findViewById(R.id.recylcerView);
        adapter = new PresentationCategoryAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        getCategoriesTask = new GetCategoriesTask(this);
        getCategoriesTask.execute();
    }

    @Override
    protected void onDestroy() {
        if (getCategoriesTask != null) {
            getCategoriesTask.cancel(true);
            getCategoriesTask.clearListener();
            getCategoriesTask = null;
        }
        super.onDestroy();
    }

    /**
     * {@link GetCategoriesTask#onPostExecute(List)} will call this method when it completes. Pass
     * {@param presentationCategories} to {@link PresentationCategoryAdapter#updateCategoryItems(List)}.
     */
    @Override
    public void updateUI(List<PresentationCategory> presentationCategories) {

    }
}
