package com.example.ass2;

import androidx.appcompat.app.AppCompatActivity;
import com.example.ass2.newPackage.Rectangle;
import com.example.ass2.newPackage.RectangleDs;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;
import java.lang.Math;

public class MainActivity3 extends AppCompatActivity {

    TextView Question;
    EditText Answer;
    TextView Result;
    Button Submit;
    Button Next;
    int choice ;
    int length;
    int width;
    int Area;
    int Perimeter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getSupportActionBar().hide();
        Question = findViewById(R.id.question);
        Submit = findViewById(R.id.submit);
        Answer = findViewById(R.id.answer);
        Next = findViewById(R.id.next);
        Result = findViewById(R.id.result);
        Random rand = new Random();
        RectangleDs rectangleDs=new RectangleDs();
        int randomIndex = rand.nextInt(rectangleDs.rectangless.size());
        Rectangle randomElement = rectangleDs.rectangless.get(randomIndex);
        length=randomElement.getLength();
        width=randomElement.getWidth();
        Area=randomElement.getArea();
        Perimeter=randomElement.getPerimeter();
        choice=0;
        Question.setText("if length = "+(randomElement.getLength())+" and width = "+(randomElement.getWidth())+" , Area=??");

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice==0) {
                    if (Integer.toString(Area).equals(Answer.getText().toString())) {
                        Result.setVisibility(View.VISIBLE);
                        Result.setText("Correct!");
                    }
                    else {
                        Result.setVisibility(View.VISIBLE);
                        Result.setText("Wrong!");
                    }
                }
                if (choice==1) {
                    if (Integer.toString(Perimeter).equals(Answer.getText().toString())) {
                        Result.setVisibility(View.VISIBLE);
                        Result.setText("Correct!");
                    }
                    else {
                        Result.setVisibility(View.VISIBLE);
                        Result.setText("Wrong!");
                    }
                }

            }
        });
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RectangleDs rectangleDs1=new RectangleDs();
                Random rand1 = new Random();
                int randomIndex1 = rand1.nextInt(rectangleDs1.rectangless.size());
                Result.setVisibility(View.GONE);
                Rectangle randomElement1 = rectangleDs1.rectangless.get(randomIndex1);
                length=randomElement1.getLength();
                width=randomElement1.getWidth();
                Area=randomElement1.getArea();
                Perimeter=randomElement1.getPerimeter();
                choice= (int)(Math.random() * ((1 - 0 + 1) + 0));
                if (choice==0) {
                    Question.setText("if length = "+(randomElement1.getLength())+" and width = "+(randomElement1.getWidth())+" , Area=??");
                }


                if (choice==1) {
                    Question.setText("if length = "+(randomElement1.getLength())+" and width = "+(randomElement1.getWidth())+" ,  Perimeter=??");
                }



            }
        });

    }
}