package com.example.admin.lab11;

import android.content.Context;
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

public class Player extends RelativeLayout{
    private static final String TAG = Player.class.toString();

    private int number;
    @BindView(R.id.tv_number)
    TextView tvNumber;
    @BindView(R.id.bt_add)
    Button btAdd;
    @BindView(R.id.bt_remove)
    Button btRemove;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        updateUI();
    }

    public Player(Context context) {
        super(context);
        initFromContext(context);
    }

    public Player(Context context, AttributeSet attrs) {
        super(context, attrs);
        initFromContext(context);
    }

    public Player(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initFromContext(context);
    }

    private void updateUI(){
        int numberUpdate = this.number;
        tvNumber.setText(String.format("%s", toTimeToString(numberUpdate)));
    }

    private void addListener(){
        btRemove.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, String.format("button click : %d", number));
                number = number - 1;
                Player.this.updateUI();

            }
        });
        btAdd.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, String.format("button click : %d", number));
                number = number + 1;
                Player.this.updateUI();
            }
        });
    }

    private String toTimeToString(int number){
        return String.format("%s", number);
    }

    private void initFromContext(Context context){
        View view = inflate(context,R.layout.player, this);
        ButterKnife.bind(this, view);
        addListener();
        updateUI();

    }
}
