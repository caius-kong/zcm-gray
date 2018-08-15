package com.ztesoft.zsmart.zcm.gray.engine.dubbo.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 灰度信息JVM缓存
 *
 * @author kongyunhui at 2018/07/24
 */
public class GrayDataCache {
    private static volatile GrayDataCache instance;
    private Set<String> grayHostList = new HashSet<>();
    private List<GrayRuleOnGraying> grayRuleOnGrayingList = new ArrayList<>();

    private GrayDataCache() {
    }

    public static GrayDataCache getInstance() {
        if (instance == null) {
            synchronized (GrayDataCache.class) {
                if (instance == null) {
                    instance = new GrayDataCache();
                }
            }
        }
        return instance;
    }

    /**
     * getter、setter
     */
    public Set<String> getGrayHostList() {
        return grayHostList;
    }

    public void setGrayHostList(Set<String> grayHostList) {
        this.grayHostList = grayHostList;
    }

    public List<GrayRuleOnGraying> getGrayRuleOnGrayingList() {
        return grayRuleOnGrayingList;
    }

    public void setGrayRuleOnGrayingList(List<GrayRuleOnGraying> grayRuleOnGrayingList) {
        this.grayRuleOnGrayingList = grayRuleOnGrayingList;
    }
}
