/*
 *    Copyright (c) 2011 XTRAC LLC. All Rights Reserved.
 *
 *    This software and all information contained herein is the property of
 *    XTRAC LLC.  Any dissemination, disclosure, use, or reproduction of this
 *    material for any reason inconsistent with express purpose for which it
 *    has been disclosed is strictly forbidden.
 */
package greetersvc;

import javax.jws.WebService;

@WebService(name="GreeterService", targetNamespace = "http://sample/")
public interface GreeterService {
    String hello();
}
