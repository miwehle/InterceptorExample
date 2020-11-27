package com.baeldung.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Audited
@Interceptor
public class AuditedInterceptor {
  public static boolean calledBefore = false;
  public static boolean calledAfter = false;

  @AroundInvoke
  public Object auditMethod(InvocationContext ctx) throws Exception {
    calledBefore = true;
    Object result = ctx.proceed();
    
    System.out.println("method    : " + ctx.getMethod());
    System.out.println("parameters: " + ctx.getParameters()[0]);    
    //ctx.getMethod().getParameterAnnotations()
        
    calledAfter = true;
    return result;
  }
}
