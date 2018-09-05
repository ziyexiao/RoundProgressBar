package com.xx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.xx.roundprogressbar.RoundProgressBar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RoundProgressBar mRpb;
    private EditText mEtRoundProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        mRpb = findViewById(R.id.rpb);
        mEtRoundProgress = findViewById(R.id.et_round_progress);

        findViewById(R.id.btn_change).setOnClickListener(this);

        //设置修改进度后的动画时长，默认时长为1000
        //如果想要初始化也奏效，则需要在设置当前进度和最大进度之前
        mRpb.setAnimationDuration(1500);

        //设置当前进度
        mRpb.setCurrentProgress(100);
        //设置最大进度
        mRpb.setMaxProgress(100);


        //进度小圆的颜色
//        mRpb.setProgressCircleColor();
        //圆弧开始渐变的颜色
//        mRpb.setProgressStartColor();
        //圆弧结束渐变的颜色
//        mRpb.setProgressEndColor();

        mEtRoundProgress.setSelection(mEtRoundProgress.getText().length());

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_change:
                changeValue();
                break;
        }
    }
    /**
     * 修改体重值
     */
    private void changeValue() {
        String etString = mEtRoundProgress.getText().toString();

        int currentProgress = Integer.parseInt(etString);

        mRpb.setCurrentProgress(currentProgress);

    }

}
