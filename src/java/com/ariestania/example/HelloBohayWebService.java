/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ariestania.example;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ariestania.winda
 */
@WebService(serviceName = "HelloBohayWebService")
public class HelloBohayWebService {

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "doSummary")
    public int doSummary(@WebParam(name = "valOne") int valOne, @WebParam(name = "valTwo") int valTwo) {
        return valOne + valTwo;
    }

}
