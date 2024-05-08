package com.example.labtest2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView shapeInfo;
    private TextView colorInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       shapeInfo = findViewById(R.id.shapeInfo);
        colorInfo = findViewById(R.id.colorInfo);

        // Shape buttons
        setupShapeButton(R.id.circle, new Circle("Circle", 5.0));
        setupShapeButton(R.id.square, new Square("Square", 4.0));
        setupShapeButton(R.id.triangle, new Triangle("Triangle", 3.0, 4.0, 5.0));

        // Color buttons
        setupColorButton(R.id.btnRed, new Red());
        setupColorButton(R.id.btnBlue, new Blue());
        setupColorButton(R.id.btnGreen, new Green());



    }

    private void setupShapeButton(int buttonId, shape shape) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(v -> displayShapeInfo(shape));
    }

    private void setupColorButton(int buttonId, Color color) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(v -> displayColorInfo(color));
    }

    private void displayShapeInfo(shape shape) {
       shapeInfo.setText(shape.name);
    }

    private void displayColorInfo(Color color) {

        colorInfo.setText(color.name);
    }
}