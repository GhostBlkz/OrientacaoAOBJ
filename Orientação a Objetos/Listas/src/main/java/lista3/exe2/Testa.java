/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3.exe2;

/**
 *
 * @author 1090482211010
 */
public class Testa {
    public static void main(String[] args) {
        Person Objperson1 = new Person("Marcio", "marcin01");
        Person Objperson2 = new Person("Joao", "zédaesfirra");
        Message Msg1 = new Message("Eai!", Objperson1);
        Message Msg2 = new Message("Opa!",Objperson2);
        Forum objForum1 = new Forum();
        objForum1.setName("Bagaceira");
        objForum1.setUrl("www.bagaceira.com");
        objForum1.postMessage(Msg1);
        objForum1.postMessage(Msg2);

        
        System.out.println(objForum1.toString());
        
    }
}
