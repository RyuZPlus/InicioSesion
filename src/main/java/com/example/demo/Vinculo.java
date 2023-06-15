package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vinculo")
public class Vinculo {
    @Id
    private Integer menuid;

    private String descripcion;

    private String url;

    private Integer menupadreid;

    private Integer posicion;

    public Integer getMenuId(){
        return menuid;
    }

    public void setIdProducto(Integer menuid){
        this.menuid = menuid;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setProducto(String descripcion){
        this.descripcion = descripcion;
    }

    public String getUrl(){
        return url;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public Integer getMenuPadreId(){
        return menupadreid;
    }

    public void setMenuPadreId(Integer menupadreid){
        this.menupadreid = menupadreid;
    }

    public Integer getPosicion(){
        return posicion;
    }

    public void setTotal(Integer posicion){
        this.posicion = posicion;
    }
}
