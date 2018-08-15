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
@Table("GRAY_PLAN")
public class GrayPlanDo extends BaseBean {

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
     * strategy
     */
    private Long strategy;

    /**
     * createTime
     */
    private Date createTime;

    /**
     * createUser
     */
    private Long createUser;

    /**
     * state
     */
    private String state;

    /**
     * comments
     */
    private String comments;


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

    public void setStrategy(Long value) {
        this.strategy = value;
    }

    public Long getStrategy() {
        return this.strategy;
    }

    public void setCreateTime(Date value) {
        this.createTime = value;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateUser(Long value) {
        this.createUser = value;
    }

    public Long getCreateUser() {
        return this.createUser;
    }

    public void setState(String value) {
        this.state = value;
    }

    public String getState() {
        return this.state;
    }

    public void setComments(String value) {
        this.comments = value;
    }

    public String getComments() {
        return this.comments;
    }

}
