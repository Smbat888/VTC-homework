package com.example.nelly.homework;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class PicassoFragment extends Fragment {


    private ImageView imgPicasso;

    public PicassoFragment() {
    }

    public static PicassoFragment newInstance() {

        return new PicassoFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_picasso, container, false);
        imgPicasso = rootView.findViewById(R.id.img_picasso);


        Picasso.with(getActivity())
                .load("http://francais-moscow.ru/kartinki/593160647b5bf.jpg")
                .into(imgPicasso);

        return rootView;
    }

}
