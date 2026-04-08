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
    public void addStudent(String name,String id,int age) {
        //检查一下是否重复
        for (Student s : list) {
            if (s.getId().equals(id)) {
                System.out.println("错误：学号已存在！");
                return;
            }
        }
            list.add(new Student(age, id, name));
            System.out.println("添加成功！");
    }
    //2.删除学生
    public void deleteStudent(String id){
//找到id相同的删除掉就可以了
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId().equals(id)){
                list.remove(i);
                System.out.println("删除成功！");
                return;
            }
        }
    }
    //3.查找学生
    public void findStudent(String id){
        for(Student s:list){
            if(s.getId().equals(id)){
                System.out.println("学生信息如下："+s);
            }
        }
    }
    //4.打印列表
    public void printStudent(){
        //先判断集合是否为空
        if(list.isEmpty()){
            System.out.println("没有学生信息！");
            return;
        }
        for(Student s:list){
            System.out.println(s);
        }
    }
}
