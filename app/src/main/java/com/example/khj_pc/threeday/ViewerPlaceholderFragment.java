package com.example.khj_pc.threeday;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daquexian.flexiblerichtextview.FlexibleRichTextView;

public class ViewerPlaceholderFragment extends Fragment {


    private FlexibleRichTextView mathView;

    public ViewerPlaceholderFragment() {
    }


    public void setText(String s) {
        mathView.setText(s);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(com.example.khj_pc.threeday.R.layout.fragment_viewer_tex, container, false);
        mathView = rootView.findViewById(com.example.khj_pc.threeday.R.id.math_view);
        return rootView;
    }
}