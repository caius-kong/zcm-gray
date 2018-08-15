package com.ztesoft.zsmart.zcm.gray.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ztesoft.zsmart.core.exception.BaseAppException;
import com.ztesoft.zsmart.zcm.gray.domain.GrayRuleOnGraying;
import com.ztesoft.zsmart.zcm.gray.model.GrayRuleDo;
import com.ztesoft.zsmart.zcm.gray.service.GrayRuleService;

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
@RequestMapping("grayrule")
public class GrayRuleController {

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
     * @taskId <br>
     * @param grayrule <br>
     * @return List<GrayRuleDo><br>
     * @throws BaseAppException <br>
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<GrayRuleDo> queryGrayRuleList(GrayRuleDo grayrule) throws BaseAppException {
        return grayruleService.queryGrayRuleList(grayrule);
    }

    /**
     *
     * Description: <br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param grayrule <br>
     * @return GrayRuleDo<br>
     * @throws BaseAppException <br>
     */
    @RequestMapping(method = RequestMethod.POST)
    public GrayRuleDo addGrayRule(@RequestBody GrayRuleDo grayrule) throws BaseAppException {
        grayruleService.addGrayRule(grayrule);
        return grayrule;
    }

    /**
     *
     * Description: <br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param grayrule <br>
     * @return GrayRuleDo<br>
     * @throws BaseAppException <br>
     */
    @RequestMapping(method = RequestMethod.PATCH)
    public GrayRuleDo updateGrayRule(@RequestBody GrayRuleDo grayrule) throws BaseAppException {
        grayruleService.updateGrayRule(grayrule);
        return grayrule;
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
    public int removeGrayRule(@PathVariable("id") Long id) throws BaseAppException {
        return grayruleService.removeGrayRule(id);
    }

    /**
     * 判断该入口下的规则值是否属于灰度
     *
     * @param bootstrap
     * @param ruleValue
     * @return
     */
    @RequestMapping(value = "isGrayRule", method = RequestMethod.GET)
    public boolean isGrayRule(@RequestParam(value = "bootstrap") String bootstrap, @RequestParam(value = "ruleValue") String ruleValue) throws BaseAppException{
        return grayruleService.isGrayRule(bootstrap, ruleValue);
    }

    /**
     * 获取正在进行中的灰度规则信息
     * @return List<Map(ruleId, ruleValue, bootstrapName, strategyForwardReverse)>
     */
    @RequestMapping(value = "qryGrayRuleListOnGraying")
    public List<GrayRuleOnGraying> qryGrayRuleListOnGraying(){
        return grayruleService.qryGrayRuleListOnGraying();
    }
}
