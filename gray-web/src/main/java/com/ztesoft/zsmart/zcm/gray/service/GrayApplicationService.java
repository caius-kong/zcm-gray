package com.ztesoft.zsmart.zcm.gray.service;

import java.util.List;

import com.ztesoft.zsmart.core.exception.BaseAppException;
import com.ztesoft.zsmart.zcm.gray.model.GrayApplicationDo;

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
public interface GrayApplicationService  {

    /**
     * Description: queryGrayApplicationList<br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param grayapplication <br>
     * @return List<GrayApplicationDo><br>
     * @throws BaseAppException <br>
     */
    List<GrayApplicationDo> queryGrayApplicationList(GrayApplicationDo grayapplication) throws BaseAppException;

    /**
     * Description: addGrayApplication<br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param grayapplication <br>
     * @return int<br>
     * @throws BaseAppException <br>
     */
    int addGrayApplication(GrayApplicationDo grayapplication) throws BaseAppException;

    /**
     * Description: addGrayApplication<br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param grayapplication <br>
     * @return int<br>
     * @throws BaseAppException <br>
     */
    int updateGrayApplication(GrayApplicationDo grayapplication) throws BaseAppException;

    /**
     * Description: addGrayApplication<br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param id <br>
     * @return int<br>
     * @throws BaseAppException <br>
     */
    int removeGrayApplication(Long id) throws BaseAppException;

    /**
     * 获取灰度应用ID列表（存在正在执行灰度计划的应用）
     *
     * @return
     */
    List<Long> qryAppIdListOnGraying();
}
