package com.ztesoft.zsmart.zcm.gray.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ztesoft.zsmart.zcm.gray.domain.GrayRuleOnGraying;
import com.ztesoft.zsmart.zcm.gray.model.GrayRuleDo;
import com.ztesoft.zsmart.core.jdbc.mybatis.BaseMapper;

/**
 *
 * <Description> <br>
 *
 * @author XXX.XXX<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2018年07月20日 <br>
 * @since R9.0<br>
 * @see com.ztesoft.zsmart.zcm.gray.mapper <br>
 */
public interface GrayRuleMapper extends BaseMapper<GrayRuleDo> {
    /**
     * 判断是否能在灰度规则中找到该ruleValue，而且入口开启了灰度 + 所属策略开始了灰度 + 所属计划开启了灰度
     *
     * @param bootstrap
     * @param ruleValue
     * @return
     */
    boolean isGrayRule(@Param("bootstrap") String bootstrap, @Param("ruleValue") String ruleValue);

    /**
     * 获取灰度规则列表，满足入口开启了灰度 + 所属策略开始了灰度 + 所属计划开启了灰度
     *
     * @return
     */
    List<GrayRuleOnGraying> qryGrayRuleListOnGraying();
}
