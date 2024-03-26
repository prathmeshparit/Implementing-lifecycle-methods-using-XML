package dev.prathmesh.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    public static void main(String args[])
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("appC.xml");
        Student s = (Student) context.getBean("stud");
        context.registerShutdownHook();
        s.toString();
    }

}
