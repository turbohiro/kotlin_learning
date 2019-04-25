import com.chen.DynamicProxy.TargetObj;
import com.chen.DynamicProxy.Work;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class ProxyDemo {

    @Test
    public void testDemo1(){
        //1.创建真实对象
        Work obj = new TargetObj();

        //2.创建代理
        Work proxyObj = (Work) Proxy.newProxyInstance(obj.getClass().getClassLoader(),//真实类使用什么加载器，代理就用什么加载器
                obj.getClass().getInterfaces(),//真实类是用什么借口，代理类就是用什么接口
                new InvocationHandler() {//调用处理器
                   //参数一：代理对象，一般不会用；参数二：外面代理对象调用的方法。代理对象.sing();参数三：外面代理对象里面的参数
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        obj.sing();
                        return null;
                    }
                });
        //让代理工作
        proxyObj.sing();  //背后一定是真是对象唱歌
    }
}
