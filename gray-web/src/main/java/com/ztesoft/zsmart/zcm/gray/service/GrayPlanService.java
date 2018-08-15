package com.ztesoft.zsmart.zcm.gray.service;

import java.util.List;

import com.ztesoft.zsmart.core.exception.BaseAppException;
import com.ztesoft.zsmart.zcm.gray.model.GrayPlanDo;

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
public interface GrayPlanService  {

    /**
     * Description: queryGrayPlanList<br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param grayplan <br>
     * @return List<GrayPlanDo><br>
     * @throws BaseAppException <br>
     */
    List<GrayPlanDo> queryGrayPlanList(GrayPlanDo grayplan) throws BaseAppException;

    /**
     * Description: addGrayPlan<br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param grayplan <br>
     * @return int<br>
     * @throws BaseAppException <br>
     */
    int addGrayPlan(GrayPlanDo grayplan) throws BaseAppException;

    /**
     * Description: addGrayPlan<br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param grayplan <br>
     * @return int<br>
     * @throws BaseAppException <br>
     */
    int updateGrayPlan(GrayPlanDo grayplan) throws BaseAppException;

    /**
     * Description: addGrayPlan<br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param id <br>
     * @return int<br>
     * @throws BaseAppException <br>
     */
    int removeGrayPlan(Long id) throws BaseAppException;
}
