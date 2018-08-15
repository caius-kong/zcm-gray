package com.ztesoft.zsmart.zcm.gray.test;

import java.util.List;

import org.apache.commons.lang3.Validate;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.Transactional;

import com.ztesoft.zsmart.core.exception.BaseAppException;
import com.ztesoft.zsmart.zcm.gray.model.GrayRuleDo;
import com.ztesoft.zsmart.zcm.gray.service.GrayRuleService;
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
public class GrayRuleTest extends AbstractCoreBootTests {

    /**
     * grayruleService
     */
    @Autowired
    private GrayRuleService grayruleService;

    /**
     *
     * Description: <br>
     *
     * @author XXX.XXX<br>
     * @taskId  <br>
     */
    @Test
    public void queryGrayRuleList() throws BaseAppException {
        GrayRuleDo grayrule = new GrayRuleDo();
        List<GrayRuleDo> lists = grayruleService.queryGrayRuleList(grayrule);
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
    public void addGrayRule() throws BaseAppException {
        GrayRuleDo grayrule = new GrayRuleDo();
        int count = grayruleService.addGrayRule(grayrule);
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
    public void updateGrayRule() throws BaseAppException {
        GrayRuleDo grayrule = new GrayRuleDo();
        // TODO
        int count = grayruleService.updateGrayRule(grayrule);
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
    public void removeGrayRule() throws BaseAppException {
        // TODO
        int count = grayruleService.removeGrayRule(1L);
        Validate.isTrue(count == 1);
    }
}
