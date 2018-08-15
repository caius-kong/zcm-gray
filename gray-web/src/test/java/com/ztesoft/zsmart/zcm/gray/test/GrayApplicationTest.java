package com.ztesoft.zsmart.zcm.gray.test;

import java.util.List;

import org.apache.commons.lang3.Validate;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ztesoft.zsmart.core.exception.BaseAppException;
import com.ztesoft.zsmart.zcm.gray.model.GrayApplicationDo;
import com.ztesoft.zsmart.zcm.gray.service.GrayApplicationService;
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
public class GrayApplicationTest extends AbstractCoreBootTests {

    /**
     * grayapplicationService
     */
    @Autowired
    private GrayApplicationService grayapplicationService;

    /**
     *
     * Description: <br>
     *
     * @author XXX.XXX<br>
     * @taskId  <br>
     */
    @Test
    public void queryGrayApplicationList() throws BaseAppException {
        GrayApplicationDo grayapplication = new GrayApplicationDo();
        List<GrayApplicationDo> lists = grayapplicationService.queryGrayApplicationList(grayapplication);
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
    public void addGrayApplication() throws BaseAppException {
        GrayApplicationDo grayapplication = new GrayApplicationDo();
        int count = grayapplicationService.addGrayApplication(grayapplication);
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
    public void updateGrayApplication() throws BaseAppException {
        GrayApplicationDo grayapplication = new GrayApplicationDo();
        // TODO
        int count = grayapplicationService.updateGrayApplication(grayapplication);
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
    public void removeGrayApplication() throws BaseAppException {
        // TODO
        int count = grayapplicationService.removeGrayApplication(1L);
        Validate.isTrue(count == 1);
    }
}
