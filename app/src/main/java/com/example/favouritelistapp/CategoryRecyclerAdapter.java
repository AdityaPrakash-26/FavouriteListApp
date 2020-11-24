package com.example.favouritelistapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CategoryRecyclerAdapter extends RecyclerView.Adapter<CategoryViewHolder>{

    //String[] categories = {"Hobbies", "Sports", "Games", "Gadgets", "Food", "Countries"};

    interface CategoryIsClickedInterface {
        void categoryIsClicked (Category category);
    }

    private ArrayList<Category> categories;
    private CategoryIsClickedInterface categoryIsClickedInterface;

    public CategoryRecyclerAdapter(ArrayList<Category> categories, CategoryIsClickedInterface categoryIsClickedInterface) {
        this.categories = categories;
        this.categoryIsClickedInterface = categoryIsClickedInterface;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.category_viewholder, parent, false); //generally, attachToRoot should be false

        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        holder.getTxtCategoryNumber().setText(Integer.toString(position+1));
        holder.getTxtCategoryName().setText(categories.get(position).getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                categoryIsClickedInterface.categoryIsClicked(categories.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public void addCategory(Category category) {
        categories.add(category);
        notifyItemInserted(categories.size()-1);
    }
}
