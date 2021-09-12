package com.masai.fragmentcommunication;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class StudentPersonalDetailsFragment extends Fragment {
    private EditText mName;
    private EditText mAge;
    private Button mBtnNext;
    private CommunicationListener listener;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_student_peronal_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
    }

    @Override
    public void onAttach(@NonNull  Context context) {
        super.onAttach(context);
        listener =(CommunicationListener) context;

    }

    private void initViews(View view) {
        mName =view.findViewById(R.id.etStudentName);
        mAge = view.findViewById(R.id.etStudentAge);
        mBtnNext=view.findViewById(R.id.btnNext);

        mBtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mName.getText().toString();
                int age = Integer.parseInt(mAge.getText().toString());
                Bundle bundle = new Bundle();
                bundle.putString("name",name);
                bundle.putInt("Age",age);
                if(listener!=null){
                    listener.launchPerformanceFragment(bundle);
                }
            }
        });

    }
}