package com.car.manage.entity;

import java.io.Serializable;
import lombok.Data;
@Data
/**
 * (Cargolist)实体类
 *
 * @author makejava
 * @since 2020-05-13 11:18:40
 */
public class Cargolist implements Serializable {
    private static final long serialVersionUID = 149836481748430364L;
    
    private Integer cargoid;
    
    private String cargoname;

}