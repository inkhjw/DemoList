package com.inkhjw.lottieandroiddemo.lottie;

import android.graphics.PointF;

public interface IAnimatablePathValue extends AnimatableValue<PointF> {
  PointF getInitialPoint();
}
