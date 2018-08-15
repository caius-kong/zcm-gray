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
@Table("GRAY_APPLICATIONS")
public class GrayApplicationDo extends BaseBean {

    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    /**
     * plan
     */
    private Long plan;

    /**
     * applicationId
     */
    private Long applicationId;

    /**
     * applicationName
     */
    private String applicationName;

    /**
     * version
     */
    private String version;

    /**
     * containers
     */
    private Long containers;


    public void setId(Long value) {
        this.id = value;
    }

    public Long getId() {
        return this.id;
    }

    public void setPlan(Long value) {
        this.plan = value;
    }

    public Long getPlan() {
        return this.plan;
    }

    public void setApplicationId(Long value) {
        this.applicationId = value;
    }

    public Long getApplicationId() {
        return this.applicationId;
    }

    public void setApplicationName(String value) {
        this.applicationName = value;
    }

    public String getApplicationName() {
        return this.applicationName;
    }

    public void setVersion(String value) {
        this.version = value;
    }

    public String getVersion() {
        return this.version;
    }

    public void setContainers(Long value) {
        this.containers = value;
    }

    public Long getContainers() {
        return this.containers;
    }

}
