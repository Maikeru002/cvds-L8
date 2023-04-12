package com.logicbig.example;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.springframework.stereotype.Component;

@Component
@ManagedBean(name = "userBean")
@ApplicationScoped
public class userBean {

    private String name;

    public userBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String Nombre) {
        this.name = Nombre;
    }

    public void begin() {

    }

}
