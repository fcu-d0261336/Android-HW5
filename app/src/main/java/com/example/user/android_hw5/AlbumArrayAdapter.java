package com.example.user.android_hw5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 2017/5/1.
 */

public class AlbumArrayAdapter extends ArrayAdapter<AlbumItem> {

    Context context;

    public AlbumArrayAdapter(Context context, ArrayList<AlbumItem> items){
        super(context, 0, items);
        this.context = context;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater  inflater = LayoutInflater.from(context);

        LinearLayout itemlayout = null;
        if(convertView == null){
            itemlayout = (LinearLayout)inflater.inflate(R.layout.listitem, null);
        }   else{
            itemlayout = (LinearLayout) convertView;
        }
        AlbumItem item = (AlbumItem)getItem(position);

        ImageView hostImg = (ImageView)itemlayout.findViewById(R.id.img_host);
        hostImg.setImageResource(item.getHostImgId());
        TextView hostName = (TextView)itemlayout.findViewById(R.id.tv_host_name);
        hostName.setText(item.getHostName());
        TextView hostScore = (TextView)itemlayout.findViewById(R.id.tv_host_score);
        hostScore.setText(item.getHostScore());

        ImageView guestImg = (ImageView)itemlayout.findViewById(R.id.img_guest);
        guestImg.setImageResource(item.getGuestImdId());
        TextView guestName = (TextView)itemlayout.findViewById(R.id.tv_guset_name);
        guestName.setText(item.getGuestName());
        TextView guestScore = (TextView)itemlayout.findViewById(R.id.tv_guset_score);
        guestScore.setText(item.getGuestScore());

        return itemlayout;
    }

}
