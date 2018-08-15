package com.ztesoft.zsmart.zcm.gray.test;

import java.util.List;

import org.apache.commons.lang3.Validate;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ztesoft.zsmart.core.exception.BaseAppException;
import com.ztesoft.zsmart.zcm.gray.model.GrayPlanDo;
import com.ztesoft.zsmart.zcm.gray.service.GrayPlanService;
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
public class GrayPlanTest extends AbstractCoreBootTests {

    /**
     * grayplanService
     */
    @Autowired
    private GrayPlanService grayplanService;

    /**
     *
     * Description: <br>
     *
     * @author XXX.XXX<br>
     * @taskId  <br>
     */
    @Test
    public void queryGrayPlanList() throws BaseAppException {
        GrayPlanDo grayplan = new GrayPlanDo();
        List<GrayPlanDo> lists = grayplanService.queryGrayPlanList(grayplan);
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
    public void addGrayPlan() throws BaseAppException {
        GrayPlanDo grayplan = new GrayPlanDo();
        int count = grayplanService.addGrayPlan(grayplan);
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
    public void updateGrayPlan() throws BaseAppException {
        GrayPlanDo grayplan = new GrayPlanDo();
        // TODO
        int count = grayplanService.updateGrayPlan(grayplan);
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
    public void removeGrayPlan() throws BaseAppException {
        // TODO
        int count = grayplanService.removeGrayPlan(1L);
        Validate.isTrue(count == 1);
    }
}
