package com.ztesoft.zsmart.zcm.gray.model;

import java.util.Date;

import com.ztesoft.zsmart.core.jdbc.api.BaseBean;
import com.ztesoft.zsmart.core.jdbc.api.annotation.GeneratedValue;
import com.ztesoft.zsmart.core.jdbc.api.annotation.GenerationType;
import com.ztesoft.zsmart.core.jdbc.api.annotation.Id;
import com.ztesoft.zsmart.core.jdbc.api.annotation.Table;

/**
 *
 * <Description> <br>
 *
 * @author XXX.XXX<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2018年07月20日 <br>
 * @since R9.0<br>
 * @see com.ztesoft.zsmart.zcm.gray.model <br>
 */
@Table("GRAY_STRATEGY")
public class GrayStrategyDo extends BaseBean {

    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    /**
     * name
     */
    private String name;

    /**
     * forwardReverse
     */
    private String forwardReverse;

    /**
     * state
     */
    private String state;


    public void setId(Long value) {
        this.id = value;
    }

    public Long getId() {
        return this.id;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getName() {
        return this.name;
    }

    public void setForwardReverse(String value) {
        this.forwardReverse = value;
    }

    public String getForwardReverse() {
        return this.forwardReverse;
    }

    public void setState(String value) {
        this.state = value;
    }

    public String getState() {
        return this.state;
    }

}
