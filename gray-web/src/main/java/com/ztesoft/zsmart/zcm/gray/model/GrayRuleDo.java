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
@Table("GRAY_RULE")
public class GrayRuleDo extends BaseBean {

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
     * iterm
     */
    private Long iterm;

    /**
     * value
     */
    private String value;


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

    public void setIterm(Long value) {
        this.iterm = value;
    }

    public Long getIterm() {
        return this.iterm;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
