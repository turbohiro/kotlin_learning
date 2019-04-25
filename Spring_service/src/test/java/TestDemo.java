import com.chen.bean.Student;
import com.chen.proxy.ProxyObj;
import com.chen.proxy.Work;
import org.junit.Test;

import java.lang.reflect.Field;

public class TestDemo {

    @Test
    public void testDemo1(){
        /*
        Student student = new Student();
        student.setAge(12);
        student.setId(1);
        student.setName("aa");
        System.out.println(student.getAge());
         */

        //反射
        Class<Student> clazz = Student.class;

        //1.获取字段
        //System.out.println(clazz.getFields().length);
        //System.out.println(clazz.getDeclaredFields().length);
        Field[] fields = clazz.getDeclaredFields();
        for(Field field:fields){
            System.out.println(field.getName());
        }


        Student s = null;
        try {
            s = clazz.newInstance();
            Field field = null;

            try {
                //获取这个类中的某一个字段
                field = clazz.getDeclaredField("age");
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            //字段是私有的，必须加上这行
            field.setAccessible(true);

            //反射给这个变量赋值 参数一：对象 参数二：赋值
            field.set(s,12);

            System.out.println("age===="+s.getAge());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDemo2(){
        Work work =new ProxyObj();
        work.sing();

    }


}
