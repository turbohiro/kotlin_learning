import com.chen.beans.Student;
import com.google.gson.Gson;

class paesrJSON{
    public static void main(String [] args){

            Student stu = new Student(1,"zhangsan",18);

            //对象 ---》 json
            Gson gson = new Gson();
            String json = gson.toJson(stu);
            System.out.println("json=" + json);


            //json ---> 对象

            Student student = gson.fromJson(json ,Student.class);
            System.out.println("student=" + student);
            }

        }
