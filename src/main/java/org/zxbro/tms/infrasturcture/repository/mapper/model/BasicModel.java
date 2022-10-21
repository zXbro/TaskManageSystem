package org.zxbro.tms.infrasturcture.repository.mapper.model;

import lombok.Data;

import java.util.Date;

/**
 * @author : yu.zhang
 * @date : 2022/10/20 7:56 PM
 * Email : zephyrjung@126.com
 **/
@Data
public class BasicModel {
    /**
     * 创建时间
     */
    private Date created;
    /**
     * 更新时间
     */
    private Date modified;
    /**
     * 创建人
     */
    private String creator;
    /**
     * 最后操作人
     */
    private String operator;
    /**
     * 版本号
     */
    private Long version;
}
