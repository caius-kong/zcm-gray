package com.ztesoft.zsmart.zcm.gray.test;

import java.util.List;

import org.apache.commons.lang3.Validate;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ztesoft.zsmart.core.exception.BaseAppException;
import com.ztesoft.zsmart.zcm.gray.model.GrayBootstrapDo;
import com.ztesoft.zsmart.zcm.gray.service.GrayBootstrapService;
import com.ztesoft.zsmart.core.test.boot.AbstractCoreBootTests;




/**
 *
 * <Description> <br>
 *
 * @author XXX.XXX<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2018年07月20日 <br>
 * @since R9.0<br>
 * @see com.ztesoft.zsmart.zcm.gray.test <br>
 */
@Transactional
public class GrayBootstrapTest extends AbstractCoreBootTests {

    /**
     * graybootstrapService
     */
    @Autowired
    private GrayBootstrapService graybootstrapService;

    /**
     *
     * Description: <br>
     *
     * @author XXX.XXX<br>
     * @taskId  <br>
     */
    @Test
    public void queryGrayBootstrapList() throws BaseAppException {
        GrayBootstrapDo graybootstrap = new GrayBootstrapDo();
        List<GrayBootstrapDo> lists = graybootstrapService.queryGrayBootstrapList(graybootstrap);
        Validate.isTrue(lists != null);
    }

    /**
     *
     * Description: <br>
     *
     * @author XXX.XXX<br>
     * @taskId  <br>
     */
    @Test
    public void addGrayBootstrap() throws BaseAppException {
        GrayBootstrapDo graybootstrap = new GrayBootstrapDo();
        int count = graybootstrapService.addGrayBootstrap(graybootstrap);
        Validate.isTrue(count == 1);
    }

    /**
     *
     * Description: <br>
     *
     * @author XXX.XXX<br>
     * @taskId  <br>
     */
    @Test
    public void updateGrayBootstrap() throws BaseAppException {
        GrayBootstrapDo graybootstrap = new GrayBootstrapDo();
        // TODO
        int count = graybootstrapService.updateGrayBootstrap(graybootstrap);
        Validate.isTrue(count == 1);
    }

    /**
     *
     * Description: <br>
     *
     * @author XXX.XXX<br>
     * @taskId  <br>
     */
    @Test
    public void removeGrayBootstrap() throws BaseAppException {
        // TODO
        int count = graybootstrapService.removeGrayBootstrap(1L);
        Validate.isTrue(count == 1);
    }
}
