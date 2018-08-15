package com.ztesoft.zsmart.zcm.gray.service;

import java.util.List;
import java.util.Map;

import com.ztesoft.zsmart.core.exception.BaseAppException;
import com.ztesoft.zsmart.zcm.gray.domain.GrayRuleOnGraying;
import com.ztesoft.zsmart.zcm.gray.model.GrayRuleDo;

/**
 *
 * <Description> <br>
 *
 * @author XXX.XXX<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2018年07月20日 <br>
 * @since R9.0<br>
 * @see com.ztesoft.zsmart.zcm.gray.service <br>
 */
public interface GrayRuleService  {

    /**
     * Description: queryGrayRuleList<br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param grayrule <br>
     * @return List<GrayRuleDo><br>
     * @throws BaseAppException <br>
     */
    List<GrayRuleDo> queryGrayRuleList(GrayRuleDo grayrule) throws BaseAppException;

    /**
     * Description: addGrayRule<br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param grayrule <br>
     * @return int<br>
     * @throws BaseAppException <br>
     */
    int addGrayRule(GrayRuleDo grayrule) throws BaseAppException;

    /**
     * Description: addGrayRule<br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param grayrule <br>
     * @return int<br>
     * @throws BaseAppException <br>
     */
    int updateGrayRule(GrayRuleDo grayrule) throws BaseAppException;

    /**
     * Description: addGrayRule<br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param id <br>
     * @return int<br>
     * @throws BaseAppException <br>
     */
    int removeGrayRule(Long id) throws BaseAppException;

    /**
     * 判断该入口下的规则值是否属于灰度
     *
     * @param bootstrap
     * @param ruleValue
     * @return
     */
    boolean isGrayRule(String bootstrap, String ruleValue) throws BaseAppException;

    /**
     * 获取正在进行中的灰度规则信息
     *
     * @return
     */
    List<GrayRuleOnGraying> qryGrayRuleListOnGraying();
}
