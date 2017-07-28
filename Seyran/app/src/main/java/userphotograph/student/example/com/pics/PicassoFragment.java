package userphotograph.student.example.com.pics;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class PicassoFragment extends Fragment {
ImageView pic;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_picasso, container, false);
        pic=(ImageView) view.findViewById(R.id.picassoImage);
        Picasso.with(getContext()).load("http://www.celesteprize.com/_files/opere/2014_68287_266667.jpg").fit().centerCrop().into(pic);
        // Inflate the layout for this fragment
        return view;
    }

}