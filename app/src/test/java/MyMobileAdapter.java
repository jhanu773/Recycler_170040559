package com.example.recycler_170040559;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class MyMobileAdapter extends RecyclerView.Adapter<MyMobileAdapter.ViewHolder> {
    public MyMobileAdapter() {

        public class ViewHolder extends RecyclerView.ViewHolder{
            public  ViewHolder(@NonNull View itemView) {
                super(itemView);
            }
        }
    }

    @NonNull
    @Override
    public MyMobileAdapter.onCreateViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyMobileAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
