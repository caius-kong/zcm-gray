package com.ztesoft.zsmart.zcm.gray.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ztesoft.zsmart.core.exception.BaseAppException;
import com.ztesoft.zsmart.zcm.gray.mapper.GrayBootstrapMapper;
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
 * @see com.ztesoft.zsmart.zcm.gray.service.impl <br>
 */
@Service
public class GrayBootstrapServiceImpl implements GrayBootstrapService {

    /**
     * graybootstrapMapper
     */
    @Autowired
    private GrayBootstrapMapper graybootstrapMapper;

    @Override
    public List<GrayBootstrapDo> queryGrayBootstrapList(GrayBootstrapDo graybootstrap) throws BaseAppException {
        return graybootstrapMapper.selectList(graybootstrap);
    }

    @Transactional
    @Override
    public int addGrayBootstrap(GrayBootstrapDo graybootstrap) throws BaseAppException {
        return graybootstrapMapper.insert(graybootstrap);
    }

    @Override
    public int updateGrayBootstrap(GrayBootstrapDo graybootstrap) throws BaseAppException {
        return graybootstrapMapper.update(graybootstrap);
    }

    @Override
    public int removeGrayBootstrap(Long id) throws BaseAppException {
        return graybootstrapMapper.deleteByPrimaryKey(id);
    }
}
