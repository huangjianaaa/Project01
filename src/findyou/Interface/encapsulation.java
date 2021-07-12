package findyou.Interface;

/**
 * @Description: 封装
 * @Author huangjian
 * @Date 2021/7/9 -17:22
 */
public class encapsulation {
    public static void main(String[] args) {
        Animal a=new Animal ();
        a.name="大黄";
        a.age=1;
    }
}
class Animal{
    String name;
    int age;
    private int legs;//腿的个数

    public void setLegs(int l) {
        if( l >= 0 && l % 2 == 0){
            legs = 1;

        }else{
            legs = 0;
        }

    }
    public int getLegs(){
        return legs;

    }
    public void eat(){
        System.out.println("动物进食");
    }
    public void show(){
        System.out.println("name="+name+",age="+age+",legs="+legs);
    }
}

