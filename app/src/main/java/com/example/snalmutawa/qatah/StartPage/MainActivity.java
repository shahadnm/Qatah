package com.example.snalmutawa.qatah.StartPage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.snalmutawa.qatah.R;

public class MainActivity extends AppCompatActivity implements View {

    private ProgressBar progressBar;
    private EditText username;

    private presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progress);
        username = findViewById(R.id.username);

        findViewById(R.id.button).setOnClickListener(v -> validateCredentials());

        presenter = new presenter(this, new Contractor());
    }



    @Override
    public void showProgress() {
        progressBar.setVisibility(android.view.View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(android.view.View.GONE);
    }

    @Override
    public void setUsernameError() {
        username.setError(getString(R.string.username_error));
    }



    private void validateCredentials() {
        presenter.validateCredentials(username.getText().toString(), "123");
    }
}