# RoundProgressBar
一个自定义的圆形ProgressBar

[![](https://jitpack.io/v/ziyexiao/RoundProgressBar.svg)](https://jitpack.io/#ziyexiao/RoundProgressBar)

## 效果图

![](http://m.qpic.cn/psb?/V14Ej48r2rOT1E/aDa3ovrKl2xWwSPJD7H2mbMcZqAVb*DNrXTzRILv1bk!/b/dDQBAAAAAAAA&bo=OASABzgEgAcDCSw!&rf=viewer_4)

[点击查看gif效果图](https://img-blog.csdn.net/20180906124432826?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3ppeWV4aWFveGlhbw==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

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
	        implementation 'com.github.ziyexiao:RoundProgressBar:1.0.3'
	    }
	    
* step 3.在XML布局文件中添加 RoundProgressBar

          <com.xx.roundprogressbar.RoundProgressBar
                      android:id="@+id/rpb"
                      android:layout_width="200dp"
                      android:layout_height="200dp" />
                    
* step 4.添加代码

         RoundProgressBar rpb = findViewById(R.id.rpb);
         //设置当前进度
         rpb.setCurrentProgress(100);
         //设置最大进度
         rpb.setMaxProgress(100);
         

## 自定义属性说明

|属性|属性说明|类型|默认值|
|:--:|:--:|:--:|:--:|
|progressArgbColor|是否进行颜色argb变化（如果设置为true的话，则文字颜色与进度条颜色进行argb变化，并且单独给文字或进度条设置颜色将会无效）|boolean|false|
|topText|第一行文本|string|体重|
|topTextSize|第一行文本大小|dimension|16sp|
|secondTextSize|中间文本文本大小（进度）|dimension|16sp|
|thirdText|第三行文本|string|kg|
|animationDuration|修改当前进度后执行的动画时长|integer|1000ms|
|currentProgress|当前进度|integer|0|
|maxProgress|最大进度|integer|100|
|circleColor|圆环底色|color|#FFE4E4E4|
|circleThickness|圆环宽度|dimension|10dp|
|progressStartColor|圆弧渐变开始颜色|color|#F1E134|
|progressEndColor|圆弧渐变结束颜色|color|#F14A34|
|smallCircleColor|进度小圆的颜色|color|#FFFFFF|


**博客地址：** [https://blog.csdn.net/ziyexiaoxiao/article/details/82421854](https://blog.csdn.net/ziyexiaoxiao/article/details/82421854)


       
        
 
 

