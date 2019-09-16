package com.example.filecabinet.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.filecabinet.FileCabinetAdapter;
import com.example.filecabinet.MainActivity;
import com.example.filecabinet.R;
import com.example.filecabinet.Student;

public class FileFragment extends Fragment {
    EditText file_fname;
    EditText file_sname;
    EditText file_gender;
    EditText file_specialization;
    Button file_save;
    Student student;
    FileCabinetAdapter adapter;

    public FileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_file, container, false);

        file_fname = v.findViewById(R.id.file_fname);
        file_sname = v.findViewById(R.id.file_sname);
        file_gender = v.findViewById(R.id.file_gender);
        file_specialization = v.findViewById(R.id.file_specialization);
        file_save = v.findViewById(R.id.file_button);

        file_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = file_fname.getText().toString();
                String secondName = file_sname.getText().toString();
                String gender = file_gender.getText().toString();
                String specialization = file_specialization.getText().toString();
                student = new Student(0, firstName, secondName, gender, specialization);

                MainActivity activity = (MainActivity) getActivity();
                activity.addStudent(student);

                //IOnFragment fragment = (IOnFragment) getActivity();
                //fragment.showFileFragment();
                //fragment.showDetailsFragment();
                //adapter.fileCabinet(student);

                Log.d("ololo", "add student to list");
            }
        });
        return v;
    }
}
