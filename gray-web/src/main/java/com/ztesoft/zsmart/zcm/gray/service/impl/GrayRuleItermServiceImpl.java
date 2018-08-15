package com.ztesoft.zsmart.zcm.gray.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ztesoft.zsmart.core.exception.BaseAppException;
import com.ztesoft.zsmart.zcm.gray.mapper.GrayRuleItermMapper;
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
 * @see com.ztesoft.zsmart.zcm.gray.service.impl <br>
 */
@Service
public class GrayRuleItermServiceImpl implements GrayRuleItermService {

    /**
     * grayruleitermMapper
     */
    @Autowired
    private GrayRuleItermMapper grayruleitermMapper;

    @Override
    public List<GrayRuleItermDo> queryGrayRuleItermList(GrayRuleItermDo grayruleiterm) throws BaseAppException {
        return grayruleitermMapper.selectList(grayruleiterm);
    }

    @Override
    public int addGrayRuleIterm(GrayRuleItermDo grayruleiterm) throws BaseAppException {
        return grayruleitermMapper.insert(grayruleiterm);
    }

    @Override
    public int updateGrayRuleIterm(GrayRuleItermDo grayruleiterm) throws BaseAppException {
        return grayruleitermMapper.update(grayruleiterm);
    }

    @Override
    public int removeGrayRuleIterm(Long id) throws BaseAppException {
        return grayruleitermMapper.deleteByPrimaryKey(id);
    }
}
