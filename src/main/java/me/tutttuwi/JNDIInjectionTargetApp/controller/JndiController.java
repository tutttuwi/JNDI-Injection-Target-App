package me.tutttuwi.JNDIInjectionTargetApp.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class JndiController {

    // static final Logger log = Logger.getLogger("JndiController");
    private static final Logger log = LogManager.getLogger(JndiController.class.getName());
    // /**
    // * Root Controller
    // */
    // @GetMapping(value = "info")
    // public String index(HttpServletRequest request) throws Throwable {
    // System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");
    // System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");
    // System.setProperty("og4j2.formatMsgNoLookups", "false");
    // System.setProperty("log4j2.enableJndiLookup", "true");
    //
    // String userAgent = request.getHeader("User-Agent");
    // log.info("##### Request Param");
    // log.info("UserAgent: " + userAgent);
    // return "hello world!!";
    // }

    /**
     * Root Controller
     */
    @GetMapping(value = "info")
    public String index(@RequestHeader("X-Api-Version") String apiVersion) throws Throwable {
        // System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");
        // System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");
        // System.setProperty("log4j2.formatMsgNoLookups", "false");
        // System.setProperty("log4j2.enableJndiLookup", "true");

        log.info("##### Request Param");
        log.info("UserAgent: " + apiVersion);
        return "hello world!!";
    }

}
