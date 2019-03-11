package com.dhoha.srt.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dhoha.srt.R;
import com.dhoha.srt.model.DataModel;

import java.util.List;

public class LogicielAdapter extends RecyclerView.Adapter<LogicielAdapter.ActorViewHolder> {
    List<DataModel> items;
    private Context ctx;
    public LogicielAdapter(List<DataModel> items, Context ctx) {
        this.items = items;
        this.ctx=ctx;


    }

    @Override
    public LogicielAdapter.ActorViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_rows_logiciel,viewGroup,false);

        LogicielAdapter.ActorViewHolder Actionview = new LogicielAdapter.ActorViewHolder(v);
        return Actionview;
    }

    @Override
    public void onBindViewHolder(LogicielAdapter.ActorViewHolder holder, int position) {
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
                   /* if(btnClicked.equals("voyage")) {
                        Intent intent = new Intent(ctx, VoyageDescription.class);
                        intent.putExtra("titre", dm.getTitre());
                        intent.putExtra("description", dm.getDescription());
                        ctx.startActivity(intent);
                    }else {
                        Intent intent = new Intent(ctx, ReserverPlaces.class);
                        intent.putExtra("id_voyage", dm.getId());
                        intent.putExtra("id_client", idClient);
                        ctx.startActivity(intent);
                    }*/

                }
            });

        }
    }


}
