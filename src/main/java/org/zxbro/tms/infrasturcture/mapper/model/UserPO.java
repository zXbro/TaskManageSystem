package org.zxbro.tms.infrasturcture.mapper.model;

import lombok.Data;

import java.util.Date;

/**
 * @author : yu.zhang
 * @date : 2022/10/20 7:49 PM
 * Email : zephyrjung@126.com
 **/
@Data
public class UserPO extends BasicModel{
    /**
     * 序号
     */
    private Long userSeq;
    /**
     * 租户编号
     */
    private Integer tenantId;
    /**
     * 用户编号
     */
    private Long userId;
    /**
     * 用户类型
     */
    private Integer userType;
    /**
     * 用户级别
     */
    private Integer userLevel;
    /**
     * 用户状态
     */
    private Integer userState;
    /**
     * 最后登录时间
     */
    private Date lastLoginDate;
}
