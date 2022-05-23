package Model;

import org.springframework.beans.factory.InitializingBean;

public class User implements InitializingBean {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.name = "张无忌";
        this.age = 30;
        System.out.println("初始化方法");
    }

    // 销毁方法
    public void destroyMethod() {
        // 销毁操作业务
        System.out.println("user 销毁");
    }
}

