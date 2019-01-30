package com.example.mohammad.samplemyapp.View.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mohammad.samplemyapp.R;
import com.example.mohammad.samplemyapp.object.Venue;

import java.util.ArrayList;

public class PlaceRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<Venue> data;
    private final int VIEW_TYPE_ITEM_1 = 1;
    private final LayoutInflater inflater;
    private Context context;
    int view_type;

    public void setData(ArrayList<Venue> data) {
        this.data = data;
    }

    public PlaceRecyclerAdapter(Context ctx, ArrayList<Venue> data) {
        this.context = ctx;
        this.data = data;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getItemViewType(int position) {
        return ((view_type++) % 5) + 1;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == VIEW_TYPE_ITEM_1) {
            View view = inflater.inflate(R.layout.row_item_place_big, parent, false);
            return new Item1Holder(view);
        } else {
            View view = inflater.inflate(R.layout.row_item_place_small, parent, false);
            return new Item2Holder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof Item1Holder) {
            ((Item1Holder) holder).tvPlaceName.setText(data.get(position).getName());
        } else if (holder instanceof Item2Holder) {
            ((Item2Holder) holder).tvPlaceName.setText(data.get(position).getName());
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    class Item1Holder extends RecyclerView.ViewHolder {
        TextView tvPlaceName;
        TextView tvPlaceDistance;
        TextView tvPlaceComment;
        TextView tvPlaceCategory;

        public Item1Holder(View itemView) {
            super(itemView);
            tvPlaceName = itemView.findViewById(R.id.tvplacename);
            tvPlaceCategory = itemView.findViewById(R.id.tvPlaceCategory);
            tvPlaceComment = itemView.findViewById(R.id.tvCommentPlace);
            tvPlaceDistance = itemView.findViewById(R.id.tvDistancePlace);
        }
    }

    class Item2Holder extends RecyclerView.ViewHolder {
        TextView tvPlaceName;
        TextView tvPlaceDistance;
        TextView tvPlaceComment;
        TextView tvPlaceCategory;

        public Item2Holder(View itemView) {
            super(itemView);
            tvPlaceName = itemView.findViewById(R.id.tvplacename);
            tvPlaceCategory = itemView.findViewById(R.id.tvPlaceCategory);
            tvPlaceComment = itemView.findViewById(R.id.tvCommentPlace);
            tvPlaceDistance = itemView.findViewById(R.id.tvDistancePlace);

        }
    }
}