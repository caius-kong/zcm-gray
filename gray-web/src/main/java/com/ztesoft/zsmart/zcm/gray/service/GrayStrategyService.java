package com.ztesoft.zsmart.zcm.gray.service;

import java.util.List;

import com.ztesoft.zsmart.core.exception.BaseAppException;
import com.ztesoft.zsmart.zcm.gray.model.GrayStrategyDo;

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
public interface GrayStrategyService  {

    /**
     * Description: queryGrayStrategyList<br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param graystrategy <br>
     * @return List<GrayStrategyDo><br>
     * @throws BaseAppException <br>
     */
    List<GrayStrategyDo> queryGrayStrategyList(GrayStrategyDo graystrategy) throws BaseAppException;

    /**
     * Description: addGrayStrategy<br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param graystrategy <br>
     * @return int<br>
     * @throws BaseAppException <br>
     */
    int addGrayStrategy(GrayStrategyDo graystrategy) throws BaseAppException;

    /**
     * Description: addGrayStrategy<br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param graystrategy <br>
     * @return int<br>
     * @throws BaseAppException <br>
     */
    int updateGrayStrategy(GrayStrategyDo graystrategy) throws BaseAppException;

    /**
     * Description: addGrayStrategy<br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param id <br>
     * @return int<br>
     * @throws BaseAppException <br>
     */
    int removeGrayStrategy(Long id) throws BaseAppException;
}
