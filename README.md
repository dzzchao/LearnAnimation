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
