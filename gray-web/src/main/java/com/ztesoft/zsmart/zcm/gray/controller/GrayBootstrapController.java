package com.ztesoft.zsmart.zcm.gray.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ztesoft.zsmart.core.exception.BaseAppException;
import com.ztesoft.zsmart.zcm.gray.model.GrayBootstrapDo;
import com.ztesoft.zsmart.zcm.gray.service.GrayBootstrapService;

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
@RequestMapping("graybootstrap")
public class GrayBootstrapController {

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
     * @taskId <br>
     * @param graybootstrap <br>
     * @return List<GrayBootstrapDo><br>
     * @throws BaseAppException <br>
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<GrayBootstrapDo> queryGrayBootstrapList(GrayBootstrapDo graybootstrap) throws BaseAppException {
        return graybootstrapService.queryGrayBootstrapList(graybootstrap);
    }

    /**
     *
     * Description: <br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param graybootstrap <br>
     * @return GrayBootstrapDo<br>
     * @throws BaseAppException <br>
     */
    @RequestMapping(method = RequestMethod.POST)
    public GrayBootstrapDo addGrayBootstrap(@RequestBody GrayBootstrapDo graybootstrap) throws BaseAppException {
        graybootstrapService.addGrayBootstrap(graybootstrap);
        return graybootstrap;
    }

    /**
     *
     * Description: <br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param graybootstrap <br>
     * @return GrayBootstrapDo<br>
     * @throws BaseAppException <br>
     */
    @RequestMapping(method = RequestMethod.PATCH)
    public GrayBootstrapDo updateGrayBootstrap(@RequestBody GrayBootstrapDo graybootstrap) throws BaseAppException {
        graybootstrapService.updateGrayBootstrap(graybootstrap);
        return graybootstrap;
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
    public int removeGrayBootstrap(@PathVariable("id") Long id) throws BaseAppException {
        return graybootstrapService.removeGrayBootstrap(id);
    }
}
