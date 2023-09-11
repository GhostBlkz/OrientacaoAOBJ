/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3.exe2;

/**
 *
 * @author 1090482211010
 */
public class Person {
    private String name;
    private String user;

    public Person() {
    }

    public Person(String name, String user) {
        this.setName(name);
        this.setUser(user);
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public final void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", user=" + user + '}';
    }
    
    
    
    
}
