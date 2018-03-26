# Android 动画

## 常规动画
- 透明度
```
AlphaAnimation animation = new AlphaAnimation(0, 1);
animation.setDuration(1000);
imageView.startAnimation(animation);
```
- 旋转
```
RotateAnimation animation = new RotateAnimation(0, 360,
        Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
animation.setDuration(1000);
imageView.startAnimation(animation);
```
- 位移
```
TranslateAnimation animation = new TranslateAnimation(0, 200, 0, 400);
animation.setDuration(1000);
imageView.startAnimation(animation);
```
- 缩放
```
ScaleAnimation animation = new ScaleAnimation(0, 1, 0, 1,
        Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
animation.setDuration(1000);
imageView.startAnimation(animation);
```

- 集合动画 **AnimationSet**


## 属性动画

- ObjectAnimator

ObjectAnimator animator = ObjectAnimator.ofFloat(imageView,"translationY",300);
animator.setDuration(1000);
animator.start();
```
- PropertyValuesHolder 的使用，多个动画一起执行
```
PropertyValuesHolder valuesHolder1 = PropertyValuesHolder.ofFloat("translationX", 300);
PropertyValuesHolder valuesHolder2 = PropertyValuesHolder.ofFloat("translationY", 300);
ObjectAnimator.ofPropertyValuesHolder(imageView,valuesHolder1, valuesHolder2).setDuration(1000).start();
```
- ValueAnimator
```
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
```
- AnimatorSet 可以实现更为精确的顺序控制
```
AnimatorSet set = new AnimatorSet();
set.setDuration(500);
set.setInterpolator(new BounceInterpolator());
set.playTogether(animator0, animator1, animator2, animator3, animator4);
set.start();
```
参考博客：
https://blog.csdn.net/harvic880925/article/details/50995268