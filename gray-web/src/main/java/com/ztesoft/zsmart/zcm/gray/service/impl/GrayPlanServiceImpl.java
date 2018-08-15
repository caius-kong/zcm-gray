package com.ztesoft.zsmart.zcm.gray.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ztesoft.zsmart.core.exception.BaseAppException;
import com.ztesoft.zsmart.zcm.gray.mapper.GrayPlanMapper;
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
 * @see com.ztesoft.zsmart.zcm.gray.service.impl <br>
 */
@Service
public class GrayPlanServiceImpl implements GrayPlanService {

    /**
     * grayplanMapper
     */
    @Autowired
    private GrayPlanMapper grayplanMapper;

    @Override
    public List<GrayPlanDo> queryGrayPlanList(GrayPlanDo grayplan) throws BaseAppException {
        return grayplanMapper.selectList(grayplan);
    }

    @Override
    public int addGrayPlan(GrayPlanDo grayplan) throws BaseAppException {
        return grayplanMapper.insert(grayplan);
    }

    @Override
    public int updateGrayPlan(GrayPlanDo grayplan) throws BaseAppException {
        return grayplanMapper.update(grayplan);
    }

    @Override
    public int removeGrayPlan(Long id) throws BaseAppException {
        return grayplanMapper.deleteByPrimaryKey(id);
    }
}
