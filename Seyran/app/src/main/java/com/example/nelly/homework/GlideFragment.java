package com.example.nelly.homework;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class GlideFragment extends Fragment {

    private ImageView imgGlide;

    public GlideFragment() {

    }

    public static GlideFragment newInstance() {

        return new GlideFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_glide, container, false);
        imgGlide = (ImageView) rootView.findViewById(R.id.img_glide);

        Glide.with(getActivity())
                .load("http://www.benjaminclasing.homepage.t-online.de/14.gif")
                .fitCenter()
                .into(imgGlide);

        return rootView;
    }

}
