package com.example.appgk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FragmentTrangChu extends Fragment {
        private ListView listView;
        private User_Adapter adapter;
        private ArrayList<User> userList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_trang_chu,container,false);
        listView= view.findViewById(R.id.listview);
        userList = new ArrayList<>();
        userList.add(new User("Mono",R.drawable.c,"Quốc gia: Việt Nam","Nghệ danh:Mono","Số sao bình chọn:3 sao"));
        userList.add(new User("Sơn Tùng",R.drawable.b,"Quốc gia: Việt Nam","Nghệ danh:MTP","Số sao bình chọn:4 sao"));
        userList.add(new User("Đàm Vĩnh Hưng",R.drawable.a,"Quốc gia: Việt Nam","Nghệ danh: Mr Đàm","Số sao bình chọn:5 sao"));
        userList.add(new User("Hiền Hồ",R.drawable.d,"Quốc gia: Việt Nam","Nghệ danh:Hiền Hồ","Số sao bình chọn:3 sao"));
        userList.add(new User("Jack",R.drawable.e,"Quốc gia: Việt Nam","Nghệ danh:5 củ","Số sao bình chọn:3 sao"));
        userList.add(new User("Trịnh Thăng Bình",R.drawable.f,"Quốc gia: Việt Nam","Nghệ danh:Thăng Bình","Số sao bình chọn:3 sao"));
        userList.add(new User("Trịnh Đình Quang",R.drawable.g,"Quốc gia: Việt Nam","Nghệ danh:Trịnh Đình Quang","Số sao bình chọn:3 sao"));
        adapter= new User_Adapter(getContext(),R.layout.custom_item,userList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(),MoTa.class);
                intent.putExtra("key1",userList.get(i).getImg());
                intent.putExtra("key2",userList.get(i).getTen());
                intent.putExtra("key3",userList.get(i).getquocgia());
                intent.putExtra("key4",userList.get(i).getnghedanh());
                intent.putExtra("key5",userList.get(i).getSao());
                startActivity(intent);
            }
        });



        return view;
    }
}