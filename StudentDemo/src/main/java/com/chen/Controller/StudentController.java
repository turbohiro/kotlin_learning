package com.chen.Controller;

import com.chen.bean.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.*;

@RestController
public class StudentController {

    private int id=1;

    @RequestMapping("register")
    public String register(Student student){
        System.out.println("调用了register方法：" +student);
        return "register success!";
    }

    @RequestMapping("save")
    public String save(Student student){

        try {
            System.out.println("调用了save方法：" +student);
            FileWriter file = new FileWriter("stu.txt",true);
            String stu_inf = student.toString();
            file.write(id+"#"+stu_inf);
            id++;
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "save success!";
    }


    //删除学生  1.读出所有的学生  2.遍历匹配删除的学生  3.拼接未被删除的学生 4.写入文件
    @RequestMapping("delete")
    public String delete(String id){
        //System.out.println("删掉id:"+id);
        try {
            FileReader filereader = new FileReader("stu.txt");
            BufferedReader bufferedReader = new BufferedReader(filereader);
            StringBuilder stringBuilder = new StringBuilder();

            String line =null;
            //1. 遍历文件中每一行数据
            while((line=bufferedReader.readLine())!=null){
                System.out.println("line="+line);

                //2.判断是不是要删除的学生
                String sid =line.split("#")[0];

                //如果便利的每一个学生id 和传过来的id一样，表示找到该学生了
                if(!(sid.equals(id))){
                    stringBuilder.append(line+"\r\n");
                }

                //3.将剩余数据拼接放到原文件中
                System.out.println("result="+stringBuilder.toString());

                FileWriter file = new FileWriter("stu.txt");
                file.write(stringBuilder.toString());
                file.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        return "删除成功";
    }


    //更新学生信息,如年龄信息
    @RequestMapping("update")
    public String update(String id,int age){
        //1.读取所有学生信息  2.遍历每个学生的id 3.更新对应id的学生的年龄信息 4.再写回去
        //       System.out.println("调用了update方法：" +student);
        try {
            FileReader reader = new FileReader("stu.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line = null;
            while((line=bufferedReader.readLine())!=null){
                //System.out.println("line="+line+"\r\n");
                String sid = line.split("#")[0];
                if(sid.equals(id)){
                    //改学生的数据
                    line = "3#ka#"+age+"#female";
                    System.out.println("line="+line+"\r\n");
                }

                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(line+"\r\n");
                FileWriter file = new FileWriter("stu.txt");
                file.write(stringBuilder.toString());
                file.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return "update success!";
    }

    //查询操作
    @RequestMapping("Search")
    public String Search(String id){
        FileReader reader = null;
        try {
            reader = new FileReader("stu.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line =null;
            while((line=bufferedReader.readLine())!=null){
                String [] array = line.split("#");
                String sid = array[0];
                if(id.equals(sid)){
                    System.out.println("选定的学生信息为："+sid+":"+array[1]+":"+array[2]+":"+array[3]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "search success!";
    }
}
