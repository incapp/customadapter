package com.test.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class UserListAdapter extends ArrayAdapter<User> {

    private List<User> list;

    public UserListAdapter(Context context, List<User> list) {
        super(context, R.layout.row_for_user_list);
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_for_user_list, null);

            TextView textViewName = convertView.findViewById(R.id.textView_name);
            TextView textViewAge = convertView.findViewById(R.id.textView_age);

            textViewName.setText(list.get(position).getName());
            textViewAge.setText(String.valueOf(list.get(position).getAge()));
        }
        return convertView;
    }
}
