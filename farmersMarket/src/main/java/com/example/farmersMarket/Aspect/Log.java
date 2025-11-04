package com.example.farmersMarket.Aspect;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class Log{



    @After("execution(* com.example.farmersMarket.Controller.*.*(..))")
    public void displayLogMessage(JoinPoint jp)
    {
        try(FileWriter fw= new FileWriter("log1.txt",true);)
        {
         
        Date d = new Date();
        fw.write(d+" "+jp.getTarget().getClass().getSimpleName()+" "+jp.getSignature().getName()+" is executed\n");
        fw.flush();
        System.out.println(d+" "+jp.getTarget().getClass().getSimpleName()+" "+jp.getSignature().getName()+" is executed");
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}

}