//
// This file generated by rdl 1.5.0. Do not modify!
//
package com.yahoo.athenz.zts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//
// ResourceContext
//
public interface ResourceContext {
    HttpServletRequest request();
    HttpServletResponse response();
    void authenticate();
    void authorize(String action, String resource, String trustedDomain);
}
