package com.example.rotatingimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/* **********************************************
 * 프로젝트명 :  RotatingImage
 * 작성자 : 2020039095 김상훈
 * 작성일 : 2022.04.02
 *프로그램 설명 : 이미지가 버튼을 누를시 10도씩 회전한다.
 ************************************************/


public class MainActivity extends AppCompatActivity {

    Button button;
    ImageView imageView;
    float degree = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        imageView = (ImageView) findViewById(R.id.imageView);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                degree = degree + 10;
                imageView.setRotation(degree);
            }
        });

    }
}