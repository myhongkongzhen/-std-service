/**********************************************************************************************************************
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.                                       *
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.                        *
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.                                                   *
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.                     *
 * Vestibulum commodo. Ut rhoncus gravida arcu.                                                                       *
 **********************************************************************************************************************/

package zzwu.dubbo.std.impl;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zzwu.dubbo.std.DemoService;

/**************************************************************************
 * <pre>
 *     FileName: zzwu.dubbo.std.impl.DemoServiceImplTest
 *         Desc:
 *       author: Z_Z.W - myhongkongzhen@gmail.com
 *      version: 2015-12-30 22:46
 *   LastChange: 2015-12-30 22:46
 *      History:
 * </pre>
 **************************************************************************/
public class DemoServiceImplConsumerTest
{
    
    @Test
    public void testSayHello() throws Exception
    {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "classpath:spring/spring-consumer.xml" } );
        context.start();

        DemoService demoService = ( DemoService ) context.getBean( "demoService" ); // 获取远程服务代理
        String      hello       = demoService.sayHello( "zz-wu" ); // 执行远程方法

        System.out.println( hello ); // 显示调用结果

        System.in.read(); // 按任意键退出
    }
}