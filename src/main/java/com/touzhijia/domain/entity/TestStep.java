package com.touzhijia.domain.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by chenxl on 2018/3/1.
 */

@Entity
@Data
@Table(name = "test_step")
@DynamicInsert
@DynamicUpdate
public class TestStep implements Serializable{

    public static final long serialVersionUID = 1L ;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**
     * 测试步骤编号
     */
    private Integer stepId ;

    /**
     * 测试步骤名称
     */
    private String stepName ;

    /**
     * 测试用例编号
     */
    private Integer caseId ;

    /**
     * 接口请求路径
     */
    private String requestPath ;

    /**
     * 接口请求方法
     */
    private String requestMethod ;

    /**
     * 接口请求参数
     */
    private String requestParams ;

    /**
     * 是否传递返回值的参数
     */
    private Integer needTransfer ;

    /**
     * 是否校验返回值
     */
    private Integer needVerifyValue ;

    /**
     * 传递的参数
     */
    private String transferParams;

    /**
     * 验证响应码
     */
    private Integer verifyCode ;

    /**
     * 验证返回值
     */
    private String checkString ;

    /**
     * 保存的返回值的信息
     */
    private String responseBody ;

    /**
     * 测试结果
     */
    private Integer testResult ;

    /**
     * 创建时间
     */
    private Date createTime ;

    /**
     * 更新时间
     */
    private Date updateTime ;
}