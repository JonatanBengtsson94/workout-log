package com.github.jonatanbengtsson94.workoutlog.ui.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.github.jonatanbengtsson94.workoutlog.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnStartFromTemplate, btnStartEmpty, btnHistory;

    @Override
    public void onClick(View v)
    {
        if (v == btnStartFromTemplate)
        {
            // Go to templates
        } else if (v == btnStartEmpty)
        {
            // Start empty
        } else if (v == btnHistory)
        {
            // Go to history
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnStartFromTemplate = findViewById(R.id.btnStartFromTemplate);
        btnStartEmpty = findViewById(R.id.btnStartEmpty);
        btnHistory = findViewById(R.id.btnHistory);

        setOnClickListeners();
    }

    public void setOnClickListeners()
    {
        btnStartFromTemplate.setOnClickListener(this);
        btnStartEmpty.setOnClickListener(this);
        btnHistory.setOnClickListener(this);
    }
}