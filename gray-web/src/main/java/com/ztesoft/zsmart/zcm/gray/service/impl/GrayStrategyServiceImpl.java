package com.ztesoft.zsmart.zcm.gray.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ztesoft.zsmart.core.exception.BaseAppException;
import com.ztesoft.zsmart.zcm.gray.mapper.GrayStrategyMapper;
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
 * @see com.ztesoft.zsmart.zcm.gray.service.impl <br>
 */
@Service
public class GrayStrategyServiceImpl implements GrayStrategyService {

    /**
     * graystrategyMapper
     */
    @Autowired
    private GrayStrategyMapper graystrategyMapper;

    @Override
    public List<GrayStrategyDo> queryGrayStrategyList(GrayStrategyDo graystrategy) throws BaseAppException {
        return graystrategyMapper.selectList(graystrategy);
    }

    @Override
    public int addGrayStrategy(GrayStrategyDo graystrategy) throws BaseAppException {
        return graystrategyMapper.insert(graystrategy);
    }

    @Override
    public int updateGrayStrategy(GrayStrategyDo graystrategy) throws BaseAppException {
        return graystrategyMapper.update(graystrategy);
    }

    @Override
    public int removeGrayStrategy(Long id) throws BaseAppException {
        return graystrategyMapper.deleteByPrimaryKey(id);
    }
}
