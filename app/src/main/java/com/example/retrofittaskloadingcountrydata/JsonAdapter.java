package com.example.retrofittaskloadingcountrydata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class JsonAdapter extends RecyclerView.Adapter<JsonAdapter.MyHolder> {

    Context context;
    List<CompanyModel> companyModelList = new ArrayList<>();

    public JsonAdapter(Context context, List<CompanyModel> countryModelList) {
        this.context = context;
        this.companyModelList = countryModelList;
    }

    @NonNull
    @Override
    public JsonAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View root = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_recycler,parent,false);
        return new MyHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull JsonAdapter.MyHolder holder, int position) {

        holder.companyname.setText(""+companyModelList.get(position).getCompanyName());
        holder.team.setText(""+companyModelList.get(position).getTeam());
        holder.teamleader.setText(""+companyModelList.get(position).getTeamLeader());
        holder.Directortxt.setText(""+companyModelList.get(position).getDetailModel().getDirector());
        holder.CEOtxt.setText(""+companyModelList.get(position).getDetailModel().getCEO());

        Glide.with(context).load(companyModelList.get(position).getUrl()).centerCrop()
                .placeholder(R.mipmap.ic_launcher).into(holder.flagImage);



    }

    @Override
    public int getItemCount() {
        return companyModelList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        TextView companyname, team, teamleader,Directortxt, CEOtxt;
        ImageView flagImage;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            companyname = itemView.findViewById(R.id.countryid);
            team = itemView.findViewById(R.id.capitalid);
            teamleader=itemView.findViewById(R.id.TLid);
            Directortxt = itemView.findViewById(R.id.Did);
            CEOtxt = itemView.findViewById(R.id.CEOid);
            flagImage = itemView.findViewById(R.id.flagid);


        }
    }
}
