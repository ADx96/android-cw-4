package Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.R;


public class BlankFragment2 extends Fragment {



    public BlankFragment2() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View t = inflater.inflate(R.layout.fragment_blank2,null);
        TextView h = t.findViewById(R.id.h1);
        return  t;
    }
}