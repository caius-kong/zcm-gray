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
@Table("GRAY_BOOTSTRAP")
public class GrayBootstrapDo extends BaseBean {

    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, sequence = "GREY_BOOTSTRAPS_ID_SEQ")
    private Long id;

    /**
     * name
     */
    private String name;

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

    public void setState(String value) {
        this.state = value;
    }

    public String getState() {
        return this.state;
    }

}
