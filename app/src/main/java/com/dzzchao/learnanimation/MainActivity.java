package com.dzzchao.learnanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.image_view)
    ImageView imageView;

    @OnClick(R.id.btn_alpha)
    void alpha() {
        AlphaAnimation animation = new AlphaAnimation(0, 1);
        animation.setDuration(1000);
        imageView.startAnimation(animation);
    }

    @OnClick(R.id.btn_rotate)
    void rotate() {
        RotateAnimation animation = new RotateAnimation(0, 360,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setDuration(1000);
        imageView.startAnimation(animation);
    }

    @OnClick(R.id.btn_translate)
    void translate() {
        TranslateAnimation animation = new TranslateAnimation(0, 200, 0, 400);
        animation.setDuration(1000);
        imageView.startAnimation(animation);
    }

    @OnClick(R.id.btn_scale)
    void scale() {
        ScaleAnimation animation = new ScaleAnimation(0, 1, 0, 1,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setDuration(1000);
        imageView.startAnimation(animation);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);


    }
}