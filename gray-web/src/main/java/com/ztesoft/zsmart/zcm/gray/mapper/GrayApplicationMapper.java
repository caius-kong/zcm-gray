package com.ztesoft.zsmart.zcm.gray.mapper;

import java.util.List;

import com.ztesoft.zsmart.zcm.gray.model.GrayApplicationDo;
import com.ztesoft.zsmart.core.jdbc.mybatis.BaseMapper;

/**
 *
 * <Description> <br>
 *
 * @author XXX.XXX<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2018年07月20日 <br>
 * @since R9.0<br>
 * @see com.ztesoft.zsmart.zcm.gray.mapper <br>
 */
public interface GrayApplicationMapper extends BaseMapper<GrayApplicationDo> {

    /**
     * 获取灰度应用ID列表（存在正在执行灰度计划的应用）
     *
     * @return
     */
    List<Long> qryAppIdListOnGraying();
}
