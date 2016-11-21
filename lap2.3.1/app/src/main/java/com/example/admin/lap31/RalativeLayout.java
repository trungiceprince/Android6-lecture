package com.example.admin.lap31;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * Created by Admin on 11/21/2016.
 */

public class RalativeLayout extends RelativeLayout {
    public RalativeLayout(Context context) {
        super(context);
    }

    public RalativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public RalativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int widthParent = MeasureSpec.getSize(widthMeasureSpec);
        int widthsize = (int) (widthParent /3);
        int newWidthMesureSpec = MeasureSpec.makeMeasureSpec(widthsize,MeasureSpec.EXACTLY);
        super.onMeasure(newWidthMesureSpec, heightMeasureSpec);
    }
}
