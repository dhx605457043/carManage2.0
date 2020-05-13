package com.car.manage.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;
@Data
/**
 * (Orderlist)实体类
 *
 * @author makejava
 * @since 2020-05-13 11:18:43
 */
public class Orderlist implements Serializable {
    private static final long serialVersionUID = 753842153614266682L;
    
    private Integer orderid;
    
    private Integer ownerofcargo;
    
    private Integer goodsname;
    
    private Date orderdate;
    
    private Integer drivercost;
    
    private Integer chinacost;
    
    private Integer koreacost;
    
    private Integer freight;
    
    private Integer ordercar;
    
    private Integer profit;
    
    private Integer ordertype;
    
    private Integer quarantinecost;
    
    private String carnumber;

}