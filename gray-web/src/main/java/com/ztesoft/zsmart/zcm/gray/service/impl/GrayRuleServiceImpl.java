package com.ztesoft.zsmart.zcm.gray.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.ztesoft.zsmart.core.exception.BaseAppException;
import com.ztesoft.zsmart.zcm.gray.domain.GrayRuleOnGraying;
import com.ztesoft.zsmart.zcm.gray.mapper.GrayRuleMapper;
import com.ztesoft.zsmart.zcm.gray.model.GrayBootstrapDo;
import com.ztesoft.zsmart.zcm.gray.model.GrayRuleDo;
import com.ztesoft.zsmart.zcm.gray.service.GrayBootstrapService;
import com.ztesoft.zsmart.zcm.gray.service.GrayRuleService;

/**
 * <Description> <br>
 *
 * @author XXX.XXX<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2018年07月20日 <br>
 * @see com.ztesoft.zsmart.zcm.gray.service.impl <br>
 * @since R9.0<br>
 */
@Service
public class GrayRuleServiceImpl implements GrayRuleService {

    /**
     * grayruleMapper
     */
    @Autowired
    private GrayRuleMapper grayruleMapper;

    @Autowired
    private GrayBootstrapService grayBootstrapService;

    @Override
    public List<GrayRuleDo> queryGrayRuleList(GrayRuleDo grayrule) throws BaseAppException {
        return grayruleMapper.selectList(grayrule);
    }

    @Override
    public int addGrayRule(GrayRuleDo grayrule) throws BaseAppException {
        return grayruleMapper.insert(grayrule);
    }

    @Override
    public int updateGrayRule(GrayRuleDo grayrule) throws BaseAppException {
        return grayruleMapper.update(grayrule);
    }

    @Override
    public int removeGrayRule(Long id) throws BaseAppException {
        return grayruleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public boolean isGrayRule(String bootstrap, String ruleValue) throws BaseAppException {
        return grayruleMapper.isGrayRule(bootstrap, ruleValue);
    }

    @Override
    public List<GrayRuleOnGraying> qryGrayRuleListOnGraying() {
        return grayruleMapper.qryGrayRuleListOnGraying();
    }
}
