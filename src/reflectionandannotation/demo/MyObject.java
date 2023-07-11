package reflectionandannotation.demo;

import java.time.LocalDateTime;

public class MyObject {

    private String name;
    @FieldMapping(name = "Number")
    private Integer num;
    @FieldMapping(name = "Data")
    private String data;
    private LocalDateTime createdOn;

    public MyObject() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }
}
