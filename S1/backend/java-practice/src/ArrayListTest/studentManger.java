package ArrayListTest;
//引用ArrayList类
import java.util.ArrayList;

public class studentManger {
    /*用ArrayList制作学生成绩管理系统
    功能有：
    添加学生
    删除学生
    查找学生
    打印列表
    */
//创建一个集合
    private ArrayList<Student> list=new ArrayList();
    //接下来写各种功能
    //1.添加学生
    public void addStudent(String name,String id,int age){
        //检查一下是否重复（还没写）
list.add(new Student(age,id,name));
System.out.println("添加成功");
    }
    //2.删除学生
    public void deleteStudent(String id){

    }
}
