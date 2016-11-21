package com.example.admin.lab11;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Admin on 11/20/2016.
 */

public class PlayerNumber extends TextView{
    public int numberPlayer;

    public int getNumberPlayer() {
        return numberPlayer;
    }

    public PlayerNumber(Context context) {
        super(context);
        initFrom(context, null);
    }

    public PlayerNumber(Context context, AttributeSet attrs) {
        super(context, attrs);
        initFrom(context, attrs);
    }

    public PlayerNumber(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initFrom(context, attrs);
    }

    private void initFrom(Context context, AttributeSet attr){
//        if(attr != null){
//            TypedArray typedArray = context.obtainStyledAttributes(attr,R.styleable.PlayerNumber);
//
//            int number = typedArray.getInt(R.styleable.PlayerNumber_number, -1);
//
//            typedArray.recycle();
//
//            if(number != -1){
//                    numberPlayer = number;
//            }
//        }
    }
}
