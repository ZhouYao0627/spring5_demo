package com.atguigu.spring5;

/**
 @author：ZhouYao
 @create：2021-11-22 19:55
 */

/**
 * 使用有参构造注入
 */
public class Orders {

    private String oname;
    private String address;

    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void orderTest() {
        System.out.println(oname + "::" + address);
    }


}
