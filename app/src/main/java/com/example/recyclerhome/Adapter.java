package com.example.recyclerhome;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.AbstractList;

public class Adapter extends RecyclerView.Adapter<Adapter.VHholder> {
AbstractList<model> list;

    public Adapter(AbstractList<model> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public VHholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= (View) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item,viewGroup,false);
        return new VHholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VHholder vHholder, int i) {

        vHholder.textViewname.setText(list.get(i).getName());
        vHholder.imageViewcall.setImageResource(R.drawable.ic_call_black);
    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }
    public  class VHholder extends  RecyclerView.ViewHolder {
        TextView textViewname;
        ImageView imageViewcall;

        public VHholder(@NonNull View itemView) {
            super(itemView);
            textViewname=itemView.findViewById(R.id.name);
            imageViewcall=itemView.findViewById(R.id.call);
        }
    }

}
