package com.example.devindesktop.cookiesudacity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void runSwap(View v){
        changeImage();
        changeText();
    }

    private void changeText() {
        TextView tv = (TextView) findViewById(R.id.text_to_swap);
        tv.setText("I'm so full");
    }

    private void changeImage() {
        ImageView imageView = (ImageView) findViewById(R.id.cookie_image_view);
        imageView.setImageResource(R.drawable.after_cookie);
    }
}
