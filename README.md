# RoundProgressBar
一个自定义的圆形ProgressBar

### 效果图

![效果图](http://m.qpic.cn/psb?/V14Ej48r2rOT1E/xF3UHkspNPUm4kCY70ABO3leri2yTmKguFV0d2VvafE!/b/dFkAAAAAAAAA&bo=aAGAAmgBgAICOR0!&rf=viewer_4)

## 简单使用
* Step 1. 添加如下代码至project的build.gradle里:

	    allprojects {
	    	repositories {
			...
			maven { url 'https://jitpack.io' }
		    }
	    }
	
* Step 2. 添加依赖

	    dependencies {
	        implementation 'com.github.ziyexiao:RoundProgressBar:1.0.2'
	    }
	    
* step 3.在XML布局文件中添加 RoundProgressBar

          <com.xx.roundprogressbar.RoundProgressBar
                      android:id="@+id/rpb"
                      android:layout_marginTop="100dp"
                      android:layout_width="200dp"
                      android:layout_height="200dp" />
                    
* step 4.添加代码

         RoundProgressBar rpb = findViewById(R.id.rpb);
         //设置当前进度
         rpb.setCurrentProgress(100);
         //设置最大进度
         rpb.setMaxProgress(100);
         //true为开始渐变特效，false则关闭
         rpb.setArgbColor(true);
         

## 自定义属性说明

|属性|属性说明|类型|默认值|
|:--:|:--:|:--:|:--:|
|argbColor|是否进行颜色argb变化（如果设置为true的话，则文字颜色与进度条颜色进行argb变化，并且单独给文字或进度条设置颜色将会无效）|boolean|false|
|topText|第一行文本|string|体重|
|topTextSize|第一行文本大小|dimension|16sp|
|secondTextSize|中间文本文本大小（进度）|dimension|16sp|
|thirdText|第三行文本|string|kg|
|animationDuration|修改当前进度后执行的动画时长|integer|1000ms|
|currentProgress|当前进度|integer|0|
|maxProgress|最大进度|integer|1000|
|circleColor|圆环底色|color|#FFE4E4E4|
|circleThickness|圆环宽度|dimension|12dp|
|progressStartColor|圆弧渐变开始颜色|color|#F1E134|
|progressEndColor|圆弧渐变结束颜色|color|#F14A34|



**博客地址：** [https://blog.csdn.net/ziyexiaoxiao/article/details/82421854](https://blog.csdn.net/ziyexiaoxiao/article/details/82421854)


       
        
 
 

