package com.ztesoft.zsmart.zcm.gray.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ztesoft.zsmart.core.exception.BaseAppException;
import com.ztesoft.zsmart.zcm.gray.model.GrayStrategyDo;
import com.ztesoft.zsmart.zcm.gray.service.GrayStrategyService;

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
@RequestMapping("graystrategy")
public class GrayStrategyController {

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
     * @taskId <br>
     * @param graystrategy <br>
     * @return List<GrayStrategyDo><br>
     * @throws BaseAppException <br>
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<GrayStrategyDo> queryGrayStrategyList(GrayStrategyDo graystrategy) throws BaseAppException {
        return graystrategyService.queryGrayStrategyList(graystrategy);
    }

    /**
     *
     * Description: <br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param graystrategy <br>
     * @return GrayStrategyDo<br>
     * @throws BaseAppException <br>
     */
    @RequestMapping(method = RequestMethod.POST)
    public GrayStrategyDo addGrayStrategy(@RequestBody GrayStrategyDo graystrategy) throws BaseAppException {
        graystrategyService.addGrayStrategy(graystrategy);
        return graystrategy;
    }

    /**
     *
     * Description: <br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param graystrategy <br>
     * @return GrayStrategyDo<br>
     * @throws BaseAppException <br>
     */
    @RequestMapping(method = RequestMethod.PATCH)
    public GrayStrategyDo updateGrayStrategy(@RequestBody GrayStrategyDo graystrategy) throws BaseAppException {
        graystrategyService.updateGrayStrategy(graystrategy);
        return graystrategy;
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
    public int removeGrayStrategy(@PathVariable("id") Long id) throws BaseAppException {
        return graystrategyService.removeGrayStrategy(id);
    }
}
