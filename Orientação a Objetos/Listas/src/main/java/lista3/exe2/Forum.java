/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3.exe2;

import java.util.ArrayList;

/**
 *
 * @author 1090482211010
 */
public class Forum {
    private String name;
    private String url;
    private ArrayList<Message> ForumMessages; 

    public Forum() {
        ForumMessages = new ArrayList();
        
        
    }

    public Forum(String name, String url, ArrayList<Message> ForumMessages) {
        this.name = name;
        this.url = url;
        this.ForumMessages = ForumMessages;
        
    }
    public void postMessage(Message message){
        this.ForumMessages.add(message);
    }
    // remove um item do carrinho 
    public boolean deleteMessage(Message message){
        return this.ForumMessages.remove(message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<Message> getForumMessages() {
        return ForumMessages;
    }

    public void setForumMessages(ArrayList<Message> ForumMessages) {
        this.ForumMessages = ForumMessages;
    }

    @Override
    public String toString() {
        //messages => percorre o vetor e executa toString()de cada message
        return "Forum{" + "name=" + name + ", url=" + url + ", ForumMessages=" + ForumMessages + '}';
    }
    
    
    
    
    
}
