/**********************************************************************************************************************
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.                                       *
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.                        *
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.                                                   *
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.                     *
 * Vestibulum commodo. Ut rhoncus gravida arcu.                                                                       *
 **********************************************************************************************************************/

package zzwu.dubbo.std.impl;

import zzwu.dubbo.std.DemoService;

/**************************************************************************
 * <pre>
 *     FileName: DemoServiceImpl
 *         Desc:
 *       author: Z_Z.W - myhongkongzhen@gmail.com
 *      version: 2015-12-30 22:16
 *   LastChange: 2015-12-30 22:16
 *      History:
 * </pre>
 **************************************************************************/
public class DemoServiceImpl implements DemoService
{
    public String sayHello( String s )
    {
        return "hello : " + s;
    }
}
