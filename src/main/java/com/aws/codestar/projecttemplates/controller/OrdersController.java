package com.aws.codestar.projecttemplates.controller;

import com.aws.codestar.projecttemplates.config.RestTemplateConfiguration;
import com.aws.codestar.projecttemplates.model.GenericObject;
import com.aws.codestar.projecttemplates.repository.GenericObjectRepository;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping(value = "/user")
public class OrdersController {

    private final GenericObjectRepository repo;
    private Gson gson;
    private RestTemplate restTemplate;

    public OrdersController(RestTemplateConfiguration restTemplateConfiguration, GenericObjectRepository repo) {
        this.restTemplate = restTemplateConfiguration.getRestTemplateWithTimeout();
        this.gson = new Gson();
        this.repo = repo;
    }

    @GetMapping(value = "/getUser/{userId}")
    public String saveUser(@PathVariable Integer userId) {
        try {

            GenericObject genericObject = new GenericObject(String.valueOf(userId), "1");
            repo.saveObj(genericObject, "todos");

            return "OK";
        }catch(Exception e){
            log.error("{}", e);
        }
        return "OK";
    }
}


//scp -i C:\Users\fabio.casini\Desktop\PimosProject\PimosBitBucket\soapWs\cartesio-web-master\pms-cartesio-web-service\sources\blink\src\main\resources\EC2KeypairBlink.pem C:\Users\fabio.casini\Desktop\PimosProject\PimosBitBucket\soapWs\cartesio-web-master\pms-cartesio-web-service\sources\blink\target\blink-0.0.1-SNAPSHOT.jar ec2-user@ec2-3-16-169-191.us-east-2.compute.amazonaws.com:~
//ssh -i C:\Users\fabio.casini\Desktop\PimosProject\PimosBitBucket\soapWs\cartesio-web-master\pms-cartesio-web-service\sources\blink\src\main\resources\EC2KeypairBlink.pem ec2-user@ec2-18-217-144-112.us-east-2.compute.amazonaws.com
//java -jar C:\Users\fabio.casini\Desktop\PimosProject\PimosBitBucket\soapWs\cartesio-web-master\pms-cartesio-web-service\sources\blink\target\blink-0.0.1-SNAPSHOT.jar

//db.createUser(
//        {
//        user: "blink",
//        pwd: "Blink1",
//        roles: [ { role: "readWrite", db: "muddle" }]
//        }
//        )