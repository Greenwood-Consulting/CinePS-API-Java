package com.greenwood.cineps_api_java;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String greeting(){ return "Hello Wolrd 2"; }
}
