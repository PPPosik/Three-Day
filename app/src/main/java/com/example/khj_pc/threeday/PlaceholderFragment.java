package com.example.khj_pc.threeday;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class PlaceholderFragment extends Fragment {

    private EditText editText;

    public PlaceholderFragment() {
    }

    public String getText() {
        return editText.getText().toString();
    }

    public void setText(String s) {
        editText.setText(s);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(com.example.khj_pc.threeday.R.layout.fragment_tex, container, false);
        editText = rootView.findViewById(com.example.khj_pc.threeday.R.id.editText);
        editText.setCustomSelectionActionModeCallback(new CustomCallback(getContext(), editText));

        return rootView;
    }
}