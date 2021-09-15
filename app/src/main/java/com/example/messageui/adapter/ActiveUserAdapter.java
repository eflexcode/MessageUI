package com.example.messageui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.messageui.R;
import com.example.messageui.model.ActiveUser;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ActiveUserAdapter extends RecyclerView.Adapter<ActiveUserAdapter.ActiveUserAdapterViewHolder>{

    //here it takes a list of the model class

    List<ActiveUser> activeUserList;

    public ActiveUserAdapter(List<ActiveUser> activeUserList) {
        this.activeUserList = activeUserList;
    }

    @NonNull
    @Override
    public ActiveUserAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ActiveUserAdapterViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.active_user_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ActiveUserAdapterViewHolder holder, int position) {

        ActiveUser activeUser = activeUserList.get(position);

        holder.userName.setText(activeUser.getUserName());
        holder.userImage.setImageResource(activeUser.getImage());

    }

    @Override
    public int getItemCount() {
        return activeUserList.size();
    }

    class ActiveUserAdapterViewHolder extends RecyclerView.ViewHolder{

        CircleImageView userImage;
        TextView userName;

        public ActiveUserAdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            userImage = itemView.findViewById(R.id.user_image);
            userName = itemView.findViewById(R.id.user_name);


        }
    }

}
