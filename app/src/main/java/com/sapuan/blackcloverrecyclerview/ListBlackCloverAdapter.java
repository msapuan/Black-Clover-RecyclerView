package com.sapuan.blackcloverrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListBlackCloverAdapter extends RecyclerView.Adapter<ListBlackCloverAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<BlackClover> listBlackClover;

    public ListBlackCloverAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<BlackClover> getListBlackClover() {
        return listBlackClover;
    }

    public void setListBlackClover(ArrayList<BlackClover> listBlackClover) {
        this.listBlackClover = listBlackClover;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_black_clover, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvName.setText(getListBlackClover().get(position).getName());
        categoryViewHolder.tvRemarks.setText(getListBlackClover().get(position).getRemarks());

        Glide.with(context)
                .load(getListBlackClover().get(position).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListBlackClover().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
