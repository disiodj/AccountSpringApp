package com.quicktutorials.learnmicroservices.AccountMicroservices.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {
    /*Questo permette di creare una risorsa web sull'uri, che risponde alla porta del server*/
    @RequestMapping("/hello")
    /*Specifica che questo metodo contiene la risposta che viene generata */
    @ResponseBody
    public String sayHello(){
        return "Hello everyone";
    }
}
