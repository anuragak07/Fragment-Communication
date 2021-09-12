package com.masai.fragmentcommunication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

public class StudentDetailsActivity extends AppCompatActivity implements CommunicationListener {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager =getSupportFragmentManager();
        launchPersonalDetailFragment();
    }

    private void launchPersonalDetailFragment() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        StudentPersonalDetailsFragment studentPersonalDetailsFragment = new StudentPersonalDetailsFragment();
        fragmentTransaction.add(R.id.container,studentPersonalDetailsFragment,"Personal Details").commit();
    }

    @Override
    public void launchPerformanceFragment(Bundle bundle) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        StudentPerformanceDetailsFragment performanceDetailsFragment =new StudentPerformanceDetailsFragment();
        performanceDetailsFragment.setArguments(bundle);
        fragmentTransaction.add(R.id.container,performanceDetailsFragment,"performance detail").addToBackStack("").commit();

    }
}