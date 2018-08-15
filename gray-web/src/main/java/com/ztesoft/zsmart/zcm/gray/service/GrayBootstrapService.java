package com.ztesoft.zsmart.zcm.gray.service;

import java.util.List;

import com.ztesoft.zsmart.core.exception.BaseAppException;
import com.ztesoft.zsmart.zcm.gray.model.GrayBootstrapDo;

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
public interface GrayBootstrapService  {

    /**
     * Description: queryGrayBootstrapList<br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param graybootstrap <br>
     * @return List<GrayBootstrapDo><br>
     * @throws BaseAppException <br>
     */
    List<GrayBootstrapDo> queryGrayBootstrapList(GrayBootstrapDo graybootstrap) throws BaseAppException;

    /**
     * Description: addGrayBootstrap<br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param graybootstrap <br>
     * @return int<br>
     * @throws BaseAppException <br>
     */
    int addGrayBootstrap(GrayBootstrapDo graybootstrap) throws BaseAppException;

    /**
     * Description: addGrayBootstrap<br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param graybootstrap <br>
     * @return int<br>
     * @throws BaseAppException <br>
     */
    int updateGrayBootstrap(GrayBootstrapDo graybootstrap) throws BaseAppException;

    /**
     * Description: addGrayBootstrap<br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param id <br>
     * @return int<br>
     * @throws BaseAppException <br>
     */
    int removeGrayBootstrap(Long id) throws BaseAppException;
}
