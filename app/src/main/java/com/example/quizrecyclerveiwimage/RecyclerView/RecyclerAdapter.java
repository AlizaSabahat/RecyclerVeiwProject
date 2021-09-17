package com.example.quizrecyclerveiwimage.RecyclerView;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quizrecyclerveiwimage.R;
import com.example.quizrecyclerveiwimage.model.ModelClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

  Context context;

   ArrayList<ModelClass> modelClassArrayList=new ArrayList<>();

    public RecyclerAdapter(ArrayList<ModelClass> modelClassArrayList) {
        this.modelClassArrayList = modelClassArrayList;
    }

    public RecyclerAdapter( Context context) {

        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder( RecyclerAdapter.ViewHolder holder, int position) {

      holder.txtname.setText(modelClassArrayList.get(position).getName());
      holder.txttopic.setText(modelClassArrayList.get(position).getTopic());
      holder.txtdetails.setText(modelClassArrayList.get(position).getDetail());
      holder.txttime.setText(modelClassArrayList.get(position).getTime());
      holder.imgstar.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              if (holder.imgstar.getColorFilter() != null) {
                  holder.imgstar.clearColorFilter();
              } else {
                  Context context = null;
                  holder.imgstar.setColorFilter(ContextCompat.getColor(context,
                          R.color.colororange));
              }
     
          }
      });
        holder.txticon.setText(modelClassArrayList.get(position).getName().substring(0, 1));
        Random mRandom = new Random();
        int color = Color.argb(255, mRandom.nextInt(256), mRandom.nextInt(256), mRandom.nextInt(256));
        ((GradientDrawable) holder.txticon.getBackground()).setColor(color);
    }

    @Override
    public int getItemCount() {
        return modelClassArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtname,txttopic,txtdetails,txttime,txticon;
        ImageView imgstar;
        public ViewHolder(View itemView) {
            super(itemView);
            txticon=itemView.findViewById(R.id.icon);
            txtname=itemView.findViewById(R.id.txtname);
            txttopic=itemView.findViewById(R.id.txtTopic);
            txtdetails=itemView.findViewById(R.id.txtdetail);
            txttime=itemView.findViewById(R.id.txttime);
            imgstar=itemView.findViewById(R.id.imgstar);
        }


    }
}
