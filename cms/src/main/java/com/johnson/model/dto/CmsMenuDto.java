package com.johnson.model.dto;


import lombok.Data;

@Data
public class CmsMenuDto {

    // cms 菜单名
    String menuName;
    // cms 菜单代码
    String menuCode;
    // cms url
    String url;

    public CmsMenuDto() {
    }

    public CmsMenuDto(String menuName, String menuCode, String url) {
        this.menuName = menuName;
        this.menuCode = menuCode;
        this.url = url;
    }

}
