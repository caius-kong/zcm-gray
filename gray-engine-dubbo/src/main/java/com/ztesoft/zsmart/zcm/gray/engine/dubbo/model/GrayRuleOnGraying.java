package com.ztesoft.zsmart.zcm.gray.engine.dubbo.model;

/**
 * 正在进行中的灰度规则
 *
 * @author kongyunhui on 2018/7/24.
 */
public class GrayRuleOnGraying {
    private Long ruleId; // 规则ID
    private String ruleValue; // 规则值
    private String bootstrapName; // 所属入口
    private String strategyForwardReverse; // 策略正反向 0/1

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
