package com.ztesoft.zsmart.zcm.gray.test;

import java.util.List;

import org.apache.commons.lang3.Validate;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ztesoft.zsmart.core.exception.BaseAppException;
import com.ztesoft.zsmart.zcm.gray.model.GrayRuleItermDo;
import com.ztesoft.zsmart.zcm.gray.service.GrayRuleItermService;
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
public class GrayRuleItermTest extends AbstractCoreBootTests {

    /**
     * grayruleitermService
     */
    @Autowired
    private GrayRuleItermService grayruleitermService;

    /**
     *
     * Description: <br>
     *
     * @author XXX.XXX<br>
     * @taskId  <br>
     */
    @Test
    public void queryGrayRuleItermList() throws BaseAppException {
        GrayRuleItermDo grayruleiterm = new GrayRuleItermDo();
        List<GrayRuleItermDo> lists = grayruleitermService.queryGrayRuleItermList(grayruleiterm);
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
    public void addGrayRuleIterm() throws BaseAppException {
        GrayRuleItermDo grayruleiterm = new GrayRuleItermDo();
        int count = grayruleitermService.addGrayRuleIterm(grayruleiterm);
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
    public void updateGrayRuleIterm() throws BaseAppException {
        GrayRuleItermDo grayruleiterm = new GrayRuleItermDo();
        // TODO
        int count = grayruleitermService.updateGrayRuleIterm(grayruleiterm);
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
    public void removeGrayRuleIterm() throws BaseAppException {
        // TODO
        int count = grayruleitermService.removeGrayRuleIterm(1L);
        Validate.isTrue(count == 1);
    }
}
