package com.example.nelly.homework;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;


public class FrescoFragment extends Fragment {

    private ImageView imgFresco;

    public FrescoFragment() {

    }

    public static FrescoFragment newInstance() {

        return new FrescoFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Fresco.initialize(getActivity());

        View rootView = inflater.inflate(R.layout.fragment_fresco, container, false);
        Uri imageUri = Uri.parse("http://cdn.searchpictures.ga/f8/ec/d2/7e/c1/71/63/1c/df/90/d3/87/17/1a/45/13/795c42d49764f6831bb1ee93c98a7a16.jpg");
        SimpleDraweeView draweeView = (SimpleDraweeView) rootView.findViewById(R.id.img_fresco);
        draweeView.setImageURI(imageUri);

        return rootView;
    }

}
