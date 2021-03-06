package com.dhoha.srt.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dhoha.srt.MaterielDescription;
import com.dhoha.srt.R;
import com.dhoha.srt.model.DataModel;

import java.util.List;

public class MaterielAdapter extends RecyclerView.Adapter<MaterielAdapter.ActorViewHolder> {
    List<DataModel> items;
    private Context ctx;
    public MaterielAdapter(List<DataModel> items, Context ctx) {
        this.items = items;
        this.ctx=ctx;


    }

    @Override
    public MaterielAdapter.ActorViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_rows_materiel,viewGroup,false);

        MaterielAdapter.ActorViewHolder Actionview = new MaterielAdapter.ActorViewHolder(v);
        return Actionview;
    }

    @Override
    public void onBindViewHolder(MaterielAdapter.ActorViewHolder holder, int position) {
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
                        Intent intent = new Intent(ctx, MaterielDescription.class);
                        intent.putExtra("reference", dm.getReference());
                        intent.putExtra("nom_m", dm.getNom_m());
                        intent.putExtra("format_m", dm.getFormat_m());
                        intent.putExtra("marque", dm.getMarque());
                        intent.putExtra("type_m", dm.getType_m());
                        ctx.startActivity(intent);

                }
            });

        }
    }

}
