package org.batch;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        new ClassPathXmlApplicationContext("/batchContext.xml");
        System.out.println( "Bye World!" );
    }
}
