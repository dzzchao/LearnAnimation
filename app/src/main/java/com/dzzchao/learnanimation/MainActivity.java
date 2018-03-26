package com.dzzchao.learnanimation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;

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
//        TranslateAnimation animation = new TranslateAnimation(0, 200, 0, 400);
//        animation.setDuration(1000);
//        imageView.startAnimation(animation);
        //属性动画写法
        ObjectAnimator animator = ObjectAnimator.ofFloat(imageView, "translationY", 300);
        animator.setDuration(1000);
        animator.start();
        //动画监听
        animator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationCancel(Animator animation) {
                super.onAnimationCancel(animation);
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                super.onAnimationRepeat(animation);
            }

            @Override
            public void onAnimationStart(Animator animation) {
                super.onAnimationStart(animation);
            }

            @Override
            public void onAnimationPause(Animator animation) {
                super.onAnimationPause(animation);
            }

            @Override
            public void onAnimationResume(Animator animation) {
                super.onAnimationResume(animation);
            }
        });
    }

    @OnClick(R.id.btn_scale)
    void scale() {
        ScaleAnimation animation = new ScaleAnimation(0, 1, 0, 1,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setDuration(1000);
        imageView.startAnimation(animation);
    }

    @BindView(R.id.text_view)
    TextView textView;

    @OnClick(R.id.button_value_animator)
    void valueAnimator() {
        ValueAnimator valueAnimator = ValueAnimator.ofInt(0, 100);
        valueAnimator.addUpdateListener(
                new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        (textView).setText(animation.getAnimatedValue() + "");
                    }
                });
        valueAnimator.setDuration(3000);
        valueAnimator.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }
}