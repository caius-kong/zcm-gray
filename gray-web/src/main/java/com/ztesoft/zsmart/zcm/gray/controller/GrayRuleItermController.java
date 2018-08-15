package com.ztesoft.zsmart.zcm.gray.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ztesoft.zsmart.core.exception.BaseAppException;
import com.ztesoft.zsmart.zcm.gray.model.GrayRuleItermDo;
import com.ztesoft.zsmart.zcm.gray.service.GrayRuleItermService;

/**
 *
 * <Description> <br>
 *
 * @author XXX.XXX<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2018年07月20日 <br>
 * @since R9.0<br>
 * @see com.ztesoft.zsmart.zcm.gray.controller <br>
 */
@RestController
@RequestMapping("grayruleiterm")
public class GrayRuleItermController {

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
     * @taskId <br>
     * @param grayruleiterm <br>
     * @return List<GrayRuleItermDo><br>
     * @throws BaseAppException <br>
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<GrayRuleItermDo> queryGrayRuleItermList(GrayRuleItermDo grayruleiterm) throws BaseAppException {
        return grayruleitermService.queryGrayRuleItermList(grayruleiterm);
    }

    /**
     *
     * Description: <br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param grayruleiterm <br>
     * @return GrayRuleItermDo<br>
     * @throws BaseAppException <br>
     */
    @RequestMapping(method = RequestMethod.POST)
    public GrayRuleItermDo addGrayRuleIterm(@RequestBody GrayRuleItermDo grayruleiterm) throws BaseAppException {
        grayruleitermService.addGrayRuleIterm(grayruleiterm);
        return grayruleiterm;
    }

    /**
     *
     * Description: <br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param grayruleiterm <br>
     * @return GrayRuleItermDo<br>
     * @throws BaseAppException <br>
     */
    @RequestMapping(method = RequestMethod.PATCH)
    public GrayRuleItermDo updateGrayRuleIterm(@RequestBody GrayRuleItermDo grayruleiterm) throws BaseAppException {
        grayruleitermService.updateGrayRuleIterm(grayruleiterm);
        return grayruleiterm;
    }

    /**
     *
     * Description: <br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param id <br>
     * @return int<br>
     * @throws BaseAppException <br>
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public int removeGrayRuleIterm(@PathVariable("id") Long id) throws BaseAppException {
        return grayruleitermService.removeGrayRuleIterm(id);
    }
}
