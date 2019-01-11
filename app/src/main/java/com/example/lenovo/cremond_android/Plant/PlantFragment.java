package com.example.lenovo.cremond_android.Plant;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.cremond_android.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class PlantFragment extends Fragment {

    @BindView(R.id.plantfragment_korean)
    TextView korean;
    @BindView(R.id.plantfragment_vietnamese)
    TextView vietnamese;
    @BindView(R.id.plantfragment_image)
    ImageView image;

    String korean_name, vietnamese_name;
    int image_id;

    public PlantFragment() {   }

    @SuppressLint("ValidFragment")
    public PlantFragment(String korean_name, String vietnamese_name, int image_id){
        this.korean_name = korean_name;
        this.vietnamese_name = vietnamese_name;
        this.image_id = image_id;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_plant, container, false);
        ButterKnife.bind(this, view);

        korean.setText(korean_name);
        vietnamese.setText(vietnamese_name);
        image.setImageResource(image_id);

        return view;
    }

}
