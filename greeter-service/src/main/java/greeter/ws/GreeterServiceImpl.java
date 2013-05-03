/*
 *    Copyright (c) 2011 XTRAC LLC. All Rights Reserved.
 *
 *    This software and all information contained herein is the property of
 *    XTRAC LLC.  Any dissemination, disclosure, use, or reproduction of this
 *    material for any reason inconsistent with express purpose for which it
 *    has been disclosed is strictly forbidden.
 */
package greeter.ws;

import greeter.Greeter;

import javax.jws.WebService;

@WebService(targetNamespace = "http://sample/",
        endpointInterface = "greeter.ws.GreeterService",
        portName = "GreeterServicePort",
       serviceName= "GreeterSvc")
public class GreeterServiceImpl implements GreeterService {

    private Greeter greeter;

    public void setGreeter(Greeter greeter) {
        this.greeter = greeter;
    }

    @Override
    public String hello() {
        return greeter.greeting();
    }


}
