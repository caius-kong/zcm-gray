package com.ztesoft.zsmart.zcm.gray.test;

import java.util.List;

import org.apache.commons.lang3.Validate;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ztesoft.zsmart.core.exception.BaseAppException;
import com.ztesoft.zsmart.zcm.gray.model.GrayStrategyDo;
import com.ztesoft.zsmart.zcm.gray.service.GrayStrategyService;
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
public class GrayStrategyTest extends AbstractCoreBootTests {

    /**
     * graystrategyService
     */
    @Autowired
    private GrayStrategyService graystrategyService;

    /**
     *
     * Description: <br>
     *
     * @author XXX.XXX<br>
     * @taskId  <br>
     */
    @Test
    public void queryGrayStrategyList() throws BaseAppException {
        GrayStrategyDo graystrategy = new GrayStrategyDo();
        List<GrayStrategyDo> lists = graystrategyService.queryGrayStrategyList(graystrategy);
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
    public void addGrayStrategy() throws BaseAppException {
        GrayStrategyDo graystrategy = new GrayStrategyDo();
        int count = graystrategyService.addGrayStrategy(graystrategy);
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
    public void updateGrayStrategy() throws BaseAppException {
        GrayStrategyDo graystrategy = new GrayStrategyDo();
        // TODO
        int count = graystrategyService.updateGrayStrategy(graystrategy);
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
    public void removeGrayStrategy() throws BaseAppException {
        // TODO
        int count = graystrategyService.removeGrayStrategy(1L);
        Validate.isTrue(count == 1);
    }
}
