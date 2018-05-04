package wang.wincent.winstack.fragment.model;

public class TbUser {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Integer age;

    /**
     * 
     */
    private Integer gender;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return name 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 
     * @return age 
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 
     * @param age 
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 
     * @return gender 
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 
     * @param gender 
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "TbUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}