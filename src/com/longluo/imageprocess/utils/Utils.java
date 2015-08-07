package com.longluo.imageprocess.utils;

/**
 * 
 * @author luolong
 * @date 2015-05-21 01:03:22
 * 
 */
public class Utils {
    public static final String TAG = "ImageProcess";

    /**
     * SeekBar Middle Value
     */
    public static final int MIDDLE_VALUE = 127;

    /**
     * SeekBar Max Value
     */
    public static final int MAX_VALUE = 255;

    public static int mColorFlag = 0;

    public static void setFlag(int flag) {
        mColorFlag = flag;
    }
}
