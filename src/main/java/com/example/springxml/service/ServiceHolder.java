package com.example.springxml.service;

import java.util.List;

public class ServiceHolder {

    private List<Service> services;


    public void setServices(List<Service> services) {
        this.services = services;
    }

    public void getServiceNames() {
        services.forEach(item -> System.out.println(item.getClassName()));
    }

}
