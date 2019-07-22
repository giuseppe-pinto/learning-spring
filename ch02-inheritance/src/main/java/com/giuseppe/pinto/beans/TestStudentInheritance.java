package com.giuseppe.pinto.beans;

import com.giuseppe.pinto.beans.domain.EnggStudent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudentInheritance
{
  private static final String CONFIG_LOCATION = "beans-student-config.xml";

  public static void main(String[] args)
  {
    ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
    EnggStudent student = (EnggStudent) context.getBean("enggStudentId");
    System.out.println(student.toString());
  }

}