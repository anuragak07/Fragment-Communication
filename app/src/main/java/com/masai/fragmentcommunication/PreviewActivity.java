package com.masai.fragmentcommunication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PreviewActivity extends AppCompatActivity {

    private TextView mTvName;
    private TextView mTvAge;
    private TextView mGrade;
    private TextView mPercentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        initViews();
        getDataFromIntent();
    }

    private void getDataFromIntent() {
        Model model = (Model) getIntent().getSerializableExtra("model");
        mTvName.setText(model.getName());
        mTvAge.setText(model.getAge()+"");
        mGrade.setText(model.getGrade());
        mPercentage.setText(model.getPercentage());
    }

    private void initViews() {
        mTvName =findViewById(R.id.tvStudentName);
        mTvAge =findViewById(R.id.tvStudentAge);
        mGrade =findViewById(R.id.tvStudentGrade);
        mPercentage=findViewById(R.id.tvStudentPercentage);
    }
}