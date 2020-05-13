package com.car.manage.entity;

import java.io.Serializable;
import lombok.Data;
@Data
/**
 * (Consignorlist)实体类
 *
 * @author makejava
 * @since 2020-05-13 11:18:43
 */
public class Consignorlist implements Serializable {
    private static final long serialVersionUID = -77141530389411629L;
    
    private Integer consignorid;
    
    private String consignorname;

}