package kulo.sgg;

import kulo.sgg.entity.RmDealerInfoEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@Setter
@Getter
@ToString
public class Person {
    private String name;
    private Integer age;
    private List<RmDealerInfoEntity> dealers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<RmDealerInfoEntity> getDealers() {
        return dealers;
    }

    public void setDealers(List<RmDealerInfoEntity> dealers) {
        this.dealers = dealers;
    }

    public Person() {
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dealers=" + dealers +
                '}';
    }
}
