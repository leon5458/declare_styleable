package com.hly.declare_styleable;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/8/31~~~~~~
 * ~~~~~~更改时间:2018/8/31~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
@SuppressLint("AppCompatCustomView")
public class PersonView extends TextView {
    public PersonView(Context context) {
        super(context);

    }

    public PersonView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

    }

    public PersonView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray tArray = context.obtainStyledAttributes(attrs, R.styleable.PersonAttr);//获取配置属性
        String name = tArray.getString(R.styleable.PersonAttr_name);//<span style="font-family: Arial, Helvetica, sans-serif;">//得到属性name</span>
        int age = tArray.getInt(R.styleable.PersonAttr_age, 15);
        Boolean adult = tArray.getBoolean(R.styleable.PersonAttr_adult, false);
        String str_adult = getAdultStatus(adult);
        int weight = tArray.getInt(R.styleable.PersonAttr_weight, 1);// 默认是中等身材，属性为:1
        String str_weight = getWeightStatus(weight);//获得肥胖属性
        @SuppressLint("ResourceAsColor")
        float textSize = tArray.getDimension(R.styleable.PersonAttr_textSize, R.dimen.default_text_size);// 如果你设置为DP等单位，会做像素转换
        tArray.recycle();//回收资源
//		setTextSize(textSize);//设置字体大小
        setText("姓名：" + name + "\n" + "年龄：" + age + "\n" + "是否成年：" + str_adult
                + "\n" + "体形：" + str_weight);//给自定义的控件赋值
    }

    /**
     * 根据传入的值判断是否成年
     */
    public String getAdultStatus(Boolean adult) {
        String str_adult = "未成年";
        if (adult) {
            str_adult = "成年";
        }
        return str_adult;
    }

    /**
     * 根据传入的值判断肥胖状态
     */
    public String getWeightStatus(int weight) {
        String str_weight = "中等";
        switch (weight) {
            case 0:
                str_weight = "瘦";
                break;
            case 1:
                str_weight = "中等";
                break;
            case 2:
                str_weight = "肥胖";
                break;
            default:
                break;
        }
        return str_weight;
    }
}