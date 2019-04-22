package com.dhoha.srt.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dhoha.srt.ComposantDescription;
import com.dhoha.srt.R;
import com.dhoha.srt.model.DataModel;

import java.util.List;

public class ComposantAdapter extends RecyclerView.Adapter<ComposantAdapter.ActorViewHolder> {
    List<DataModel> items;
    private Context ctx;
    public ComposantAdapter(List<DataModel> items, Context ctx) {
        this.items = items;
        this.ctx=ctx;


    }

    @Override
    public ComposantAdapter.ActorViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_rows_composant,viewGroup,false);

        ComposantAdapter.ActorViewHolder Actionview = new ComposantAdapter.ActorViewHolder(v);
        return Actionview;
    }

    @Override
    public void onBindViewHolder(ComposantAdapter.ActorViewHolder holder, int position) {
        DataModel dm = items.get(position);
        holder.txtReference.setText(dm.getReference());
        holder.dm=dm;

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public  class ActorViewHolder extends RecyclerView.ViewHolder{
        TextView txtReference;
        ImageView tvImage;
        DataModel dm;
        public ActorViewHolder(View itemView) {
            super(itemView);

            txtReference =  itemView.findViewById(R.id.txtReference);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                        Intent intent = new Intent(ctx, ComposantDescription.class);
                        intent.putExtra("Ref", dm.getReference());
                        intent.putExtra("Lib", dm.getLib_comp());
                        intent.putExtra("Etat", dm.getEtat_comp());
                        intent.putExtra("Marque", dm.getMarque());
                        ctx.startActivity(intent);


                }
            });

        }
    }


}
