package com.car.manage.entity;

import java.io.Serializable;
import lombok.Data;
@Data
/**
 * (Carlist)实体类
 *
 * @author makejava
 * @since 2020-05-13 11:18:43
 */
public class Carlist implements Serializable {
    private static final long serialVersionUID = -87736525090397065L;
    
    private Integer carid;
    
    private String carnumber;
    
    private Integer cardriverid;
    
    private Integer carlicenseplateareacode;

}