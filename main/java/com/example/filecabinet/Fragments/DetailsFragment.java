package com.example.filecabinet.Fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.filecabinet.MainActivity;
import com.example.filecabinet.R;
import com.example.filecabinet.Student;

public class DetailsFragment extends Fragment {

    TextView dFname;
    TextView dSname;
    TextView dGender;
    TextView dSpecialization;
    Student student;
    IOnFragment fragment;

    public DetailsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_file, container, false);
        dFname = v.findViewById(R.id.details_fname);
        dSname = v.findViewById(R.id.details_sname);
        dGender = v.findViewById(R.id.details_gender);
        dSpecialization = v.findViewById(R.id.details_specialization);

        //MainActivity activity = (MainActivity) getActivity();
        //activity.showDetailsFragment();

        Log.d("ololo", "DetailsFragment");
        return v;
    }

    public void someMethod() {
        dFname.setText(student.firstName);
        dSname.setText(student.secondName);
        dGender.setText(student.gender);
        dSpecialization.setText(student.specialization);
        String s = dFname + " " + dSname + " " + dGender + " " + dSpecialization;
    }
}
