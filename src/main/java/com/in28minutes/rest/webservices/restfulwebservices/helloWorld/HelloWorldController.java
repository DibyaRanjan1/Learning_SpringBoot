package com.in28minutes.rest.webservices.restfulwebservices.helloWorld;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping( path = "/hello-world")
    public String helloWorld(){
        return "Hello World1";
    }

    @GetMapping( path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Test");
    }

    @GetMapping( path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World,%s",name));
    }

    @GetMapping( path = "/hello-world-internationalized")
    public String helloWorldinternationalized(){
        return "Hello World v4";
    }

}
