package pl.lamasoft.entity;


import java.io.Serializable;




public class User implements Serializable{

    /*
    public getters/setters
    public no-argument constructor

     */


    private String name;



    private Long id;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
