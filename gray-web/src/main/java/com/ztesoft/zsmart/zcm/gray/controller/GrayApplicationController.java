package com.ztesoft.zsmart.zcm.gray.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ztesoft.zsmart.core.exception.BaseAppException;
import com.ztesoft.zsmart.zcm.gray.model.GrayApplicationDo;
import com.ztesoft.zsmart.zcm.gray.service.GrayApplicationService;

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
@RequestMapping("grayapplication")
public class GrayApplicationController {

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
     * @taskId <br>
     * @param grayapplication <br>
     * @return List<GrayApplicationDo><br>
     * @throws BaseAppException <br>
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<GrayApplicationDo> queryGrayApplicationList(GrayApplicationDo grayapplication) throws BaseAppException {
        return grayapplicationService.queryGrayApplicationList(grayapplication);
    }

    /**
     *
     * Description: <br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param grayapplication <br>
     * @return GrayApplicationDo<br>
     * @throws BaseAppException <br>
     */
    @RequestMapping(method = RequestMethod.POST)
    public GrayApplicationDo addGrayApplication(@RequestBody GrayApplicationDo grayapplication) throws BaseAppException {
        grayapplicationService.addGrayApplication(grayapplication);
        return grayapplication;
    }

    /**
     *
     * Description: <br>
     *
     * @author XXX.XXX<br>
     * @taskId <br>
     * @param grayapplication <br>
     * @return GrayApplicationDo<br>
     * @throws BaseAppException <br>
     */
    @RequestMapping(method = RequestMethod.PATCH)
    public GrayApplicationDo updateGrayApplication(@RequestBody GrayApplicationDo grayapplication) throws BaseAppException {
        grayapplicationService.updateGrayApplication(grayapplication);
        return grayapplication;
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
    public int removeGrayApplication(@PathVariable("id") Long id) throws BaseAppException {
        return grayapplicationService.removeGrayApplication(id);
    }

    @RequestMapping(value = "qryAppIdListOnGraying", method = RequestMethod.GET)
    public List<Long> qryAppIdListOnGraying() throws BaseAppException{
        return grayapplicationService.qryAppIdListOnGraying();
    }
}
