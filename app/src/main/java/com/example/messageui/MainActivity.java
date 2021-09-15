package com.example.messageui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.messageui.adapter.ActiveUserAdapter;
import com.example.messageui.adapter.MessageUserAdapter;
import com.example.messageui.model.ActiveUser;
import com.example.messageui.model.MessageUser;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView activeUser = findViewById(R.id.active_users_recycler_view);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        activeUser.setLayoutManager(layoutManager);

        // now create a list off Active user

        List<ActiveUser> activeUserList = new ArrayList<>();
        activeUserList.add(new ActiveUser(R.drawable.chat_ui_image_1, "Violet"));
        activeUserList.add(new ActiveUser(R.drawable.chat_ui_image_2, "Jane"));
        activeUserList.add(new ActiveUser(R.drawable.chat_ui_image_3, "Dave"));
        activeUserList.add(new ActiveUser(R.drawable.chat_ui_image_4, "Mia"));
        activeUserList.add(new ActiveUser(R.drawable.chat_ui_image_5, "Hope"));
        activeUserList.add(new ActiveUser(R.drawable.chat_ui_image_6, "Christin"));

        ActiveUserAdapter adapter = new ActiveUserAdapter(activeUserList);

        activeUser.setAdapter(adapter);
        
        RecyclerView messageRecyclerView = findViewById(R.id.message_user_recycle_view);

        messageRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<MessageUser> messageUserList = new ArrayList<>();
        messageUserList.add(new MessageUser(R.drawable.chat_ui_image_1, "Violet",
                "have less visual emphasis than filled text fields. When", "24min"));
        messageUserList.add(new MessageUser(R.drawable.chat_ui_image_2, "Jane",
                "have less visual emphasis than filled text fields. When", "2min"));
        messageUserList.add(new MessageUser(R.drawable.chat_ui_image_3, "Dave",
                "have less visual emphasis than filled text fields. When", "7min"));
        messageUserList.add(new MessageUser(R.drawable.chat_ui_image_4, "Mia",
                "have less visual emphasis than filled text fields. When", "20min"));
        messageUserList.add(new MessageUser(R.drawable.chat_ui_image_5, "Hope",
                "have less visual emphasis than filled text fields. When", "56min"));
        messageUserList.add(new MessageUser(R.drawable.chat_ui_image_6, "Christin",
                "have less visual emphasis than filled text fields. When", "1min"));
        messageUserList.add(new MessageUser(R.drawable.chat_ui_image_3, "Dave",
                "have less visual emphasis than filled text fields. When", "7min"));
        messageUserList.add(new MessageUser(R.drawable.chat_ui_image_1, "Violet",
                "have less visual emphasis than filled text fields. When", "24min"));

        MessageUserAdapter messageUserAdapter = new MessageUserAdapter(messageUserList);

        messageRecyclerView.setAdapter(messageUserAdapter);

    }
}