package com.ft.mytomcat;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ServletMapping {
    private String servletName;
    private String url;
    private String clazz;
}
