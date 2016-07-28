package com.ultimatech;

import com.ultimatech.shirodemo.authmgr.service.IAuthService;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        ApplicationContext cxt = new ClassPathXmlApplicationContext(
                "classpath*:conf/*-beans.xml");
        IAuthService svr= (IAuthService) cxt.getBean("authSvr");
//        svr.logIn("aaa","sss");
//        svr.logOut();
        assertTrue( true );
    }
}
