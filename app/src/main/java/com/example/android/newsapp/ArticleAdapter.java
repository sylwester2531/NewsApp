package com.example.android.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/**
 * Created by admin on 2017-07-18.
 */

public class ArticleAdapter extends ArrayAdapter<Article> {
    private static final String LOG_TAG = ArticleAdapter.class.getSimpleName();

    ArticleAdapter(Context context, List<Article> articles) {
        super(context, 0, articles);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            holder = new ViewHolder();
            holder.title = (TextView) convertView.findViewById(R.id.article_title);
            holder.sectionName = (TextView) convertView.findViewById(R.id.section);
            holder.trailText = (TextView) convertView.findViewById(R.id.trail_text);
            holder.thumbnail = (ImageView) convertView.findViewById(R.id.thumbnail);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Article currArticle = getItem(position);

        if (!currArticle.getTitle().isEmpty())
            holder.title.setText(currArticle.getTitle());
        if (!currArticle.getSectionName().isEmpty())
            holder.sectionName.setText(currArticle.getSectionName());
        if (!currArticle.getTrailText().isEmpty())
            holder.trailText.setText(currArticle.getTrailText());
        if (currArticle.getThumbnailBitmap() != null) {
            holder.thumbnail.setImageBitmap(currArticle.getThumbnailBitmap());
        }
        return convertView;
    }


    private static class ViewHolder {
        TextView title;
        TextView sectionName;
        TextView trailText;
        ImageView thumbnail;
    }
}
