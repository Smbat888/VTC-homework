package com.example.nelly.homework;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnPicsso;
    private Button btnGlide;
    private Button btnFresco;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPicsso = (Button) findViewById(R.id.picasso);
        btnGlide = (Button) findViewById(R.id.glide);
        btnFresco = (Button) findViewById(R.id.fresco);

        btnPicsso.setOnClickListener(this);
        btnGlide.setOnClickListener(this);
        btnFresco.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.picasso: {
                fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().add(R.id.container, PicassoFragment.newInstance()).addToBackStack(null).commit();
                break;
            }

            case R.id.glide: {
                fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.container, GlideFragment.newInstance()).addToBackStack(null).commit();
                break;
            }

            case R.id.fresco: {
                fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.container, FrescoFragment.newInstance()).addToBackStack(null).commit();
                break;
            }

        }
    }
}
