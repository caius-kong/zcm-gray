package com.ztesoft.zsmart.zcm.gray.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ztesoft.zsmart.core.exception.BaseAppException;
import com.ztesoft.zsmart.zcm.gray.mapper.GrayApplicationMapper;
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
 * @see com.ztesoft.zsmart.zcm.gray.service.impl <br>
 */
@Service
public class GrayApplicationServiceImpl implements GrayApplicationService {

    /**
     * grayapplicationMapper
     */
    @Autowired
    private GrayApplicationMapper grayapplicationMapper;

    @Override
    public List<GrayApplicationDo> queryGrayApplicationList(GrayApplicationDo grayapplication) throws BaseAppException {
        return grayapplicationMapper.selectList(grayapplication);
    }

    @Override
    public int addGrayApplication(GrayApplicationDo grayapplication) throws BaseAppException {
        return grayapplicationMapper.insert(grayapplication);
    }

    @Override
    public int updateGrayApplication(GrayApplicationDo grayapplication) throws BaseAppException {
        return grayapplicationMapper.update(grayapplication);
    }

    @Override
    public int removeGrayApplication(Long id) throws BaseAppException {
        return grayapplicationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Long> qryAppIdListOnGraying() {
        return grayapplicationMapper.qryAppIdListOnGraying();
    }
}
