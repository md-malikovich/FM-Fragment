package com.example.filecabinet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.filecabinet.Fragments.DetailsFragment;
import com.example.filecabinet.Fragments.FileFragment;
import com.example.filecabinet.Fragments.IOnFragment;

public class MainActivity extends FragmentActivity implements IOnFragment { //AppCompatActivity

    Button fc_button;
    RecyclerView fc_recyclerView;
    FileCabinetAdapter adapter;
    Student student;

    FileFragment fileFragment;
    FragmentManager manager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fileFragment = new FileFragment();

        fc_recyclerView = findViewById(R.id.fc_recyclerview);
        adapter = new FileCabinetAdapter();

        fc_recyclerView.setAdapter(adapter);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        fc_recyclerView.setLayoutManager(manager);

        fc_button = findViewById(R.id.fc_button);
        fc_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showFileFragment();
                //showFragment(new FileFragment());
                Log.d("ololo", "showFileFragment");
            }
        });
    }

    /*public void showFragment(Fragment fragment) {
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.commit();
        //adapter.fileCabinet(student);
    }*/

    @Override
    public void showFileFragment() {
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, new FileFragment());
        transaction.commit();
        //showFragment(new FileFragment());
    }

    @Override
    public void showDetailsFragment() {
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, new DetailsFragment());
        transaction.commit();
        //showFragment(new DetailsFragment());
    }

    public void addStudent(Student student) {
        adapter.fileCabinet(student);
    }

}
