package com.ztesoft.zsmart.zcm.gray.engine.dubbo.model;

import java.io.Serializable;

/**
 * 正在进行中的灰度规则
 *
 * @author kongyunhui on 2018/7/24.
 */
public class GrayRuleOnGraying implements Serializable{
    private Long appId; // 灰度应用ID
    private String ruleIterm; // 规则条目，例如WEB入口下，三种规则条目：User Id、User Group、Local Network
    private Long ruleId; // 规则ID
    private String ruleValue; // 规则值
    private String bootstrapName; // 所属入口
    private String strategyForwardReverse; // 策略正反向 0/1

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getRuleIterm() {
        return ruleIterm;
    }

    public void setRuleIterm(String ruleIterm) {
        this.ruleIterm = ruleIterm;
    }

    public Long getRuleId() {
        return ruleId;
    }

    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    public String getRuleValue() {
        return ruleValue;
    }

    public void setRuleValue(String ruleValue) {
        this.ruleValue = ruleValue;
    }

    public String getBootstrapName() {
        return bootstrapName;
    }

    public void setBootstrapName(String bootstrapName) {
        this.bootstrapName = bootstrapName;
    }

    public String getStrategyForwardReverse() {
        return strategyForwardReverse;
    }

    public void setStrategyForwardReverse(String strategyForwardReverse) {
        this.strategyForwardReverse = strategyForwardReverse;
    }
}
