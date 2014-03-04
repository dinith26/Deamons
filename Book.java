/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *

 */
public class Book {
    
    int id;
    Book left;
    Book right;
    String fname;
    String sname;
    String title;
    String bname;  
    

    
public Book(){
    
}

 public Book(int id,String fname,String sname,String title,String bname,Book left,Book right){
        
        this.id = id;
        this.fname= fname;
        this.sname= sname;
        this.title= title;
        this.bname = bname;
        this.left = left;
        this.right = right;
        
        
                                           }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getLeft() {
        return left;
    }

    public void setLeft(Book left) {
        this.left = left;
    }

    public Book getRight() {
        return right;
    }

    public void setRight(Book right) {
        this.right = right;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }
 
 
}
