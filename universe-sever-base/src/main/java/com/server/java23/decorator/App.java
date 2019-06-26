package com.server.java23.decorator;


import com.server.java23.decorator.impl.Jacket;
import com.server.java23.decorator.impl.Man;
import com.server.java23.decorator.impl.WaistCoat;

/**
 * 装饰模式
 * <p>
 * <p>
 * 对客户端透明的方式扩展对象的功能(客户端不应该知道装饰的存在),保持被包装对象的api。强调的是增强
 * <p>
 * 用意是保持接口，从而增强所考虑对象的性能
 */
public class App {
    public static void main(String[] args) {
        Person person = new WaistCoat(new Jacket(new Man()));
        person.wear();
    }
}
