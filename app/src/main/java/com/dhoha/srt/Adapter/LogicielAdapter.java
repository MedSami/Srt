package com.dhoha.srt.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dhoha.srt.LogecielDescription;
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

                        Intent intent = new Intent(ctx, LogecielDescription.class);
                        intent.putExtra("reference", dm.getReference());
                        intent.putExtra("nom_log", dm.getNom_log());
                        intent.putExtra("type_log", dm.getType_log());
                        intent.putExtra("version_log", dm.getVersion_log());
                        intent.putExtra("licence", dm.getLicence());
                        ctx.startActivity(intent);


                }
            });

        }
    }


}
