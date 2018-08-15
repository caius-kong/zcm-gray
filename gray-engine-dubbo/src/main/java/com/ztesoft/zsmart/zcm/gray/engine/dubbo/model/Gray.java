package com.ztesoft.zsmart.zcm.gray.engine.dubbo.model;

/**
 * @author kongyunhui on 2018/8/15.
 *
 * 灰度标识
 */
public class Gray {
    public static final String GRAY_FLAG = "GRAY_FLAG"; // 灰度标记key
    public static final String GRAY_YES = "1"; // 灰度标记值 1：灰度
    public static final String GRAY_NO = "0"; // 灰度标记值 0：非灰度

    private String key = GRAY_FLAG;
    private String value;

    public Gray(String value){
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
