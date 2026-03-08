package oopExtendsTest3;

public class TEst {
public static void main(String[] args) {
    //创建本科生对象
    BachelorStudent bs = new BachelorStudent("张三",20,"大一");
    bs.study();
    bs.sleep();

    //创建研究生对象
    MasterStudent ms = new MasterStudent("李四",24,"研一");
    ms.study();
    ms.sleep();

    //创建通识课教师对象
    GeneralTeacher gt = new GeneralTeacher("王五",35,"大学语文");
    gt.teach();

    //创建专业课教师对象
    MajorTeacher mt = new MajorTeacher("赵六",40,"数据结构");
    mt.teach();
}
}
