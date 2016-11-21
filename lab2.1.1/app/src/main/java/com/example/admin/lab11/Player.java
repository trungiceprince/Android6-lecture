package com.example.admin.lab11;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Admin on 11/20/2016.
 */

public class Player extends RelativeLayout {
    private static final String TAG = Player.class.toString();

    @BindView(R.id.tv_number)
    TextView tvNumber;
    @BindView(R.id.tv_value)
    TextView tvValue;
    @BindView(R.id.bt_add)
    Button btAdd;
    @BindView(R.id.bt_remove)
    Button btRemove;

    public Player(Context context) {
        super(context);
        initFrom(context,null);
    }

    public Player(Context context, AttributeSet attrs) {
        super(context, attrs);
        initFrom(context,attrs);

    }

    public Player(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initFrom(context,attrs);

    }

    private void addListener(){
        final int number = Integer.parseInt(tvNumber.getText().toString());
        btRemove.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                tvNumber.setText(String.format("%s", number - 1));


            }
        });
        btAdd.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                tvNumber.setText(String.format("%s", number + 1));

            }
        });
    }

    private String toTimeToString(int number){
        return String.format("%s", number);
    }


    private void initFrom(Context context, AttributeSet attrs){
        View view = inflate(context,R.layout.player, this);
        ButterKnife.bind(this, view);
        if(attrs != null){
            TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.Player);
            //2
            int numberPlayer = typedArray.getInt(R.styleable.Player_number, -1);
            String valuePlayer = typedArray.getString(R.styleable.Player_value);
            //3
            typedArray.recycle();
            //4
            if(numberPlayer != -1) {
                tvNumber.setText(String.format("%s", toTimeToString(numberPlayer)));
            }
            tvValue.setText(valuePlayer);
        }


        addListener();
    }

}
