package com.ga.roosevelt.project_3.recycler;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ga.roosevelt.project_3.ArticleDetailActivity;
import com.ga.roosevelt.project_3.R;
import com.ga.roosevelt.project_3.models.Multimedium;
import com.ga.roosevelt.project_3.models.Result;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by roosevelt on 8/15/16.
 */
public class ArticleRecyclerViewAdapter extends RecyclerView.Adapter<ArticleViewHolder> {

    List<Result> mResultList;

    public ArticleRecyclerViewAdapter(List<Result> mResultList) {
        this.mResultList = mResultList;
    }

    @Override
    public ArticleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View parentView = inflater.inflate(R.layout.article_list_card_layout, parent, false);

        return new ArticleViewHolder(parentView);
    }

    @Override
    public void onBindViewHolder(ArticleViewHolder holder, int position) {
        final Result article = mResultList.get(position);

        holder.setTitle(article.getTitle());

        String imgURL = "";

        //get image url (
        if (article.getMultimedia().size() > 2){
            imgURL = article.getMultimedia().get(3).getUrl();
        }

        //set image
        if(!imgURL.equals("")){
            Picasso.with(holder.itemView.getContext())
                    .load(imgURL)
                    .into(holder.getImgView());
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ArticleDetailActivity.class);
                intent.putExtra("URL", article.getUrl());
                view.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mResultList.size();
    }
}
