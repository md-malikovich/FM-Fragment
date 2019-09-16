package com.example.filecabinet;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.filecabinet.Fragments.IOnFragment;

import java.util.ArrayList;

public class FileCabinetAdapter extends RecyclerView.Adapter<FileCabinetViewHolder> {

    ArrayList<Student> student;
    IOnFragment fragment;

    public FileCabinetAdapter() {
        student = new ArrayList<>();
        student.add(new Student(0,"Meder", "Diushebekov", "male", "Law"));

    }

    @NonNull
    @Override
    public FileCabinetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.view_holder_file_cabinet, parent, false);
        FileCabinetViewHolder fc = new FileCabinetViewHolder(view);
        return fc;
    }

    @Override
    public void onBindViewHolder(@NonNull FileCabinetViewHolder holder, int position) {
        holder.onBind(student.get(position));
    }

    @Override
    public int getItemCount() {
        return student.size();
    }

    public void fileCabinet(Student students) {
        student.add(students);
        notifyDataSetChanged();
    }
}
