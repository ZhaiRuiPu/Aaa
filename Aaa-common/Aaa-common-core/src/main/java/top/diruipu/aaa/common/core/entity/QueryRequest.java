package top.diruipu.aaa.common.core.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author diruipu
 * @create 2021-12-21 6:43 PM
 * @ClassName QueryRequest
 */
@Data
@ToString
public class QueryRequest implements Serializable {

    private static final long serialVersionUID = -6260980915987622388L;
    /**
     * 当前页面数据量
     */
    private int pageSize = 10;
    /**
     * 当前页码
     */
    private int pageNum = 1;
    /**
     * 排序字段
     */
    private String field;
    /**
     * 排序规则，asc升序，desc降序
     */
    private String order;
}