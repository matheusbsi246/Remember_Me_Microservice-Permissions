package com.api.remembermepermissions.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1/permissions")
public class PermissionsController {

    @GetMapping()
    public String hello(){
        return "Hello from permissions";
    }
}
