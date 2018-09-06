package com.xx;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.xw.repo.BubbleSeekBar;
import com.xx.roundprogressbar.PixeUtils;
import com.xx.roundprogressbar.RoundProgressBar;

public class MainActivity extends AppCompatActivity implements BubbleSeekBar.OnProgressChangedListener {
    private RoundProgressBar mRpb;
    private BubbleSeekBar mBsbCurrent;
    private static final int CURRENT = 100;
    private BubbleSeekBar mBsbDuration;
    private BubbleSeekBar mBsbMax;
    private CheckBox mCbArgbColor;
    private BubbleSeekBar mBsbCircleThickness;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        mRpb = findViewById(R.id.rpb);
        mCbArgbColor = findViewById(R.id.cb_arg_color);

        mBsbCurrent = findViewById(R.id.bsb_current);
        mBsbDuration = findViewById(R.id.bsb_duration);
        mBsbMax = findViewById(R.id.bsb_max);
        mBsbCircleThickness = findViewById(R.id.bsb_circleThickness);


        //设置修改进度后的动画时长，默认时长为1000
        //如果想要初始化也奏效，则需要在设置当前进度和最大进度之前
        mRpb.setAnimationDuration(1000);
        //设置当前进度
        mRpb.setCurrentProgress(CURRENT);
        //设置最大进度
        mRpb.setMaxProgress(100);


        initListener();

    }

    private void initListener() {
        mBsbCurrent.setOnProgressChangedListener(this);
        mBsbDuration.setOnProgressChangedListener(this);
        mBsbMax.setOnProgressChangedListener(this);
        mBsbCircleThickness.setOnProgressChangedListener(this);

        mCbArgbColor.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mRpb.setProgressArgbColor(true);
                } else {
                    mRpb.setProgressArgbColor(false);
                }
            }
        });
    }

    @Override
    public void onProgressChanged(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat, boolean fromUser) {

    }

    @Override
    public void getProgressOnActionUp(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat) {
        switch (bubbleSeekBar.getId()) {
            case R.id.bsb_current:
                mRpb.setCurrentProgress(progressFloat);
                break;
        }

    }

    @Override
    public void getProgressOnFinally(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat, boolean fromUser) {
        switch (bubbleSeekBar.getId()) {

            case R.id.bsb_max:
                mRpb.setMaxProgress(progress);
                break;
            case R.id.bsb_duration:
                mRpb.setAnimationDuration((long) (progressFloat * 1000));
                break;
            case R.id.bsb_circleThickness:
                mRpb.setCircleThickness(PixeUtils.dip2px(MainActivity.this, progress));
                break;
        }
    }
}
