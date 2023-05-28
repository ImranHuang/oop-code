package Test2;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;



//针对每一个私有化的成员变量，都要提供get跟set方法
    //set方法：给成员变量赋值
    // get方法：获取成员变量的值

public void setName(String name){
    this.name=name;
}
public String getName(){
    return this.name;
}

    public void setAge(int a){
        if(a>=18&&a<=50){
            this.age=a;
        }else {
            System.out.println("输入的年龄格式不正确，请重新输入！");
        }
    }
    public int getAge(){
        return this.age;
    }

    public void setGender(String g){
        this.gender=g;
    }
    public String getGender(){
        return this.gender;
    }


    public void sleep() {
        System.out.println("正在睡觉");
    }

    public void eat() {
        System.out.println("正在吃饭");
    }

}
