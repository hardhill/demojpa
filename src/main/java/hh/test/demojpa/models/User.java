package hh.test.demojpa.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "testuser")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "username", length = 100,nullable = false)
    private String name;
    @Column(name = "teamname", length = 100)
    private String teamname;
    @Column(name = "salary", scale = 0)
    private Integer salary;

    public User() {
    }

    public User(Long id, String name, String teamname, Integer salary) {
        this.id = id;
        this.name = name;
        this.teamname = teamname;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
