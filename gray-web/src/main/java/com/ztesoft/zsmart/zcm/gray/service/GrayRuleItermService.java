package com.ztesoft.zsmart.zcm.gray.service;

import java.util.List;

import com.ztesoft.zsmart.core.exception.BaseAppException;
import com.ztesoft.zsmart.zcm.gray.model.GrayRuleItermDo;

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
public interface GrayRuleItermService  {

    /**
     * Description: queryGrayRuleItermList<br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param grayruleiterm <br>
     * @return List<GrayRuleItermDo><br>
     * @throws BaseAppException <br>
     */
    List<GrayRuleItermDo> queryGrayRuleItermList(GrayRuleItermDo grayruleiterm) throws BaseAppException;

    /**
     * Description: addGrayRuleIterm<br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param grayruleiterm <br>
     * @return int<br>
     * @throws BaseAppException <br>
     */
    int addGrayRuleIterm(GrayRuleItermDo grayruleiterm) throws BaseAppException;

    /**
     * Description: addGrayRuleIterm<br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param grayruleiterm <br>
     * @return int<br>
     * @throws BaseAppException <br>
     */
    int updateGrayRuleIterm(GrayRuleItermDo grayruleiterm) throws BaseAppException;

    /**
     * Description: addGrayRuleIterm<br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param id <br>
     * @return int<br>
     * @throws BaseAppException <br>
     */
    int removeGrayRuleIterm(Long id) throws BaseAppException;
}
