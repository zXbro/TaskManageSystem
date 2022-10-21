package org.zxbro.tms.infrasturcture.repository.mapper.model;

import lombok.Data;

import java.util.Date;

/**
 * @author : yu.zhang
 * @date : 2022/10/20 7:49 PM
 * Email : zephyrjung@126.com
 **/
@Data
public class EventPO extends BasicModel{
    /**
     * 序号
     */
    private Long eventSeq;
    /**
     * 租户编号
     */
    private Integer tenantId;
    /**
     * 事件编号
     */
    private Long eventId;
    /**
     * 事件类型
     */
    private Integer eventType;
    /**
     * 事件标题
     */
    private String eventTitle;
    /**
     * 事件内容
     */
    private String eventContent;
    /**
     * 事件级别
     */
    private Integer eventLevel;
    /**
     * 事件状态
     */
    private Integer eventState;
    /**
     * 事件开始时间
     */
    private Date eventStartDate;
    /**
     * 事件结束时间
     */
    private Date eventEndDate;
}
