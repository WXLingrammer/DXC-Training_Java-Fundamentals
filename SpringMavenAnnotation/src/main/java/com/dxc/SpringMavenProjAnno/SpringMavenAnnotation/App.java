package com.dxc.SpringMavenProjAnno.SpringMavenAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		
		Trainer jt = (Trainer)context.getBean("javaTrainer");
		System.out.println(jt.getDailyTrainingSession());
		
		Trainer wt = (Trainer)context.getBean("webTechTrainer");
		System.out.println(wt.getDailyTrainingSession());
		
		Trainer sqlt = (Trainer)context.getBean("sqlTrainer");
		System.out.println(sqlt.getDailyTrainingSession());
    }
}
