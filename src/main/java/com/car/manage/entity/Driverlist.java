package com.car.manage.entity;

import java.io.Serializable;
import lombok.Data;
@Data
/**
 * (Driverlist)实体类
 *
 * @author makejava
 * @since 2020-05-13 11:18:43
 */
public class Driverlist implements Serializable {
    private static final long serialVersionUID = -56949748285443756L;
    
    private Integer driverid;
    
    private String drivername;
    
    private String driverphonenumber;
    
    private String driveraddress;
    
    private String driveridcard;

}