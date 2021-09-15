package com.example.messageui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.messageui.R;
import com.example.messageui.model.MessageUser;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MessageUserAdapter extends RecyclerView.Adapter<MessageUserAdapter.MessageUserAdapterViewHolder>{

    List<MessageUser> messageUserList;

    public MessageUserAdapter(List<MessageUser> messageUserList) {
        this.messageUserList = messageUserList;
    }

    @NonNull
    @Override
    public MessageUserAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MessageUserAdapterViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.message_user_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MessageUserAdapterViewHolder holder, int position) {

        MessageUser messageUser = messageUserList.get(position);

        holder.username.setText(messageUser.getUserName());
        holder.lastMessageTime.setText(messageUser.getLastMessageTime());
        holder.message.setText(messageUser.getLastMessage());
        holder.userImage.setImageResource(messageUser.getImage());

    }

    @Override
    public int getItemCount() {
        return messageUserList.size();
    }

    class MessageUserAdapterViewHolder extends RecyclerView.ViewHolder {


        CircleImageView userImage;
        TextView username;
        TextView message;
        TextView lastMessageTime;

        public MessageUserAdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            userImage = itemView.findViewById(R.id.user_image);
            username = itemView.findViewById(R.id.user_name);
            message = itemView.findViewById(R.id.message_text);
            lastMessageTime = itemView.findViewById(R.id.message_time);

        }
    }

}
