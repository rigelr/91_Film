package com.rigelr.a91film.adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rigelr.a91film.R;
import com.rigelr.a91film.models.MovieModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {
    private List<MovieModel> items;
    private Context context;

    public GridAdapter(Context context,List<MovieModel> items) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_grid, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MovieModel item = items.get(position);
        Picasso.get().load(item.getPoster()).into(holder.posterImage);
        holder.titleText.setText(item.getTitle());
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleText;
        ImageView posterImage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            posterImage = itemView.findViewById(R.id.image_poster);
            titleText = itemView.findViewById(R.id.text_title);

        }
    }
}
