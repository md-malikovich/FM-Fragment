package com.example.filecabinet;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.filecabinet.Fragments.DetailsFragment;
import com.example.filecabinet.Fragments.FileFragment;
import com.example.filecabinet.Fragments.IOnFragment;

public class FileCabinetViewHolder extends RecyclerView.ViewHolder {

    TextView vh_fname;
    TextView vh_sname;
    TextView vh_specialization;
    Student student;
    MainActivity activity;
    IOnFragment fragment;
    DetailsFragment frag;

    public FileCabinetViewHolder(@NonNull View itemView) {
        super(itemView);
        vh_fname = itemView.findViewById(R.id.vh_fname);
        vh_sname = itemView.findViewById(R.id.vh_sname);
        vh_specialization = itemView.findViewById(R.id.vh_specialization);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //frag.someMethod();
                //activity.showDetailsFragment();
                //activity.showFragment(new DetailsFragment());
                IOnFragment fragment = (IOnFragment) getActivity();
                fragment.showDetailsFragment();
            }
        });
    }

    public void onBind(Student student) {
        this.student = student;
        vh_fname.setText(student.firstName);
        vh_sname.setText(student.secondName);
        vh_specialization.setText(student.specialization);
    }
}
