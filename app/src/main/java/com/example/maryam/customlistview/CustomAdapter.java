package com.example.maryam.customlistview;

import android.content.Context;
import android.support.v4.content.res.ResourcesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.maryam.customlistview.R;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<Item> mItem;

    public CustomAdapter(Context mContext, ArrayList<Item> mItem) {
        this.mContext = mContext;
        this.mItem = mItem;
    }

    @Override
    public int getCount() {
        return mItem.size();
    }

    @Override
    public Object getItem(int i) {
        return mItem.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.list_item, viewGroup, false);
        }

            Item currentItem = (Item) getItem(i);

            ImageView imgItemAvatar = view.findViewById(R.id.img_avatar);
            TextView txtItemName = view.findViewById(R.id.txt_name);
            //TextView txtItemTime = view.findViewById(R.id.txt_time);
            //TextView txtItemMessage = view.findViewById(R.id.txt_message);

            txtItemName.setText(currentItem.getTxtName());
            //txtItemTime.setText(currentItem.getTxtDate());
            //txtItemMessage.setText(currentItem.getTxtMessage());

            String mUri = "@drawable/" + currentItem.getImgAvatar();
            int imageSource = mContext.getResources().getIdentifier(mUri, null, mContext.getPackageName());
            imgItemAvatar.setImageDrawable(ResourcesCompat.getDrawable(mContext.getResources(), imageSource, null));

            return view;
        }

}
