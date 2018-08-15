package com.ztesoft.zsmart.zcm.gray.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ztesoft.zsmart.core.exception.BaseAppException;
import com.ztesoft.zsmart.zcm.gray.model.GrayPlanDo;
import com.ztesoft.zsmart.zcm.gray.service.GrayPlanService;

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
@RequestMapping("grayplan")
public class GrayPlanController {

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
     * @taskId <br>
     * @param grayplan <br>
     * @return List<GrayPlanDo><br>
     * @throws BaseAppException <br>
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<GrayPlanDo> queryGrayPlanList(GrayPlanDo grayplan) throws BaseAppException {
        return grayplanService.queryGrayPlanList(grayplan);
    }

    /**
     *
     * Description: <br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param grayplan <br>
     * @return GrayPlanDo<br>
     * @throws BaseAppException <br>
     */
    @RequestMapping(method = RequestMethod.POST)
    public GrayPlanDo addGrayPlan(@RequestBody GrayPlanDo grayplan) throws BaseAppException {
        grayplanService.addGrayPlan(grayplan);
        return grayplan;
    }

    /**
     *
     * Description: <br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param grayplan <br>
     * @return GrayPlanDo<br>
     * @throws BaseAppException <br>
     */
    @RequestMapping(method = RequestMethod.PATCH)
    public GrayPlanDo updateGrayPlan(@RequestBody GrayPlanDo grayplan) throws BaseAppException {
        grayplanService.updateGrayPlan(grayplan);
        return grayplan;
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
    public int removeGrayPlan(@PathVariable("id") Long id) throws BaseAppException {
        return grayplanService.removeGrayPlan(id);
    }
}
