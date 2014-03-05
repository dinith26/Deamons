import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *

 */
public class Book {
    
    Functions root;
    int count;
    
    public Book(){
        
        root = null;
        count = 0;
        
                 }
    
    public boolean isEmpty(){        
        
        return root == null;
        
                            }
    
    public void Add(int id,String fname,String sname,String title,String bname){
        
                
        Functions newnode = new Functions(id,fname,sname,title,bname,null,null);
        
       
        if(isEmpty())           
            root = newnode;
        
        else{
            
            Functions temp = root;
            Functions parent = root;
            
             while(temp != null)
             {
                 parent = temp;
                 if(temp.id > id)
                     temp = temp.left;
                  else
                     temp = temp.right;           
             }
             
             if (parent.id > id)
                 
                 parent.left = newnode;
             else
                 parent.right = newnode;             
                      
             count++;    
            
            } 
            
        }
    

    public Functions searchNode(int id){
        
        Functions temp = root;
        
        while(temp!=null){
            
            if(temp.id == id)
                break;
            else{
                if(temp.id>id)
                    temp = temp.left;
                else 
                    temp = temp.right;
                
            }
            
        }
        
        return temp;   
        
        
                                  }
    
       public void delete(int k)
     {
         if (isEmpty())
             //System.out.println("Tree is Empty");
             JOptionPane.showMessageDialog(null,"Tree is Empty");
         else if (searchNode(k) == null)
             //System.out.println(+k+" "+"is not in the tree");
             JOptionPane.showMessageDialog(null,+k+" "+"is not in the current tree");
         else
         {
             root = delete(root, k);
             //System.out.println(k+ " deleted from the tree");
             JOptionPane.showMessageDialog(null,+k+" "+" deleted from the tree");
             
////             Home nm = new Home();
////             nm.fillTable(k);
             
             
         }
     }
      
      
     private Functions delete(Functions root, int k)
     {
         Functions p, p2, n;
         if (root.getId() == k)
         {
             Functions left, right;
             left = root.getLeft();
             right = root.getRight();        
             if (left == null && right == null)                 
                 return null;                                               
             else if (left == null)
             {
                 p = right;
                 
                 return p;
             }
             else if (right == null)
             {
                 p = left;
                 
                 return p;
             }
             else
             {
                 p2 = right;
                 p = right;
                 while (p.getLeft() != null)
                     p = p.getLeft();
                 p.setLeft(left);
                 return p2;
             }
         }
         if (k < root.getId())
         {
             n = delete(root.getLeft(), k);
             root.setLeft(n);
         }
         else
         {
             n = delete(root.getRight(), k);
             root.setRight(n);             
         }
         return root;
         
     }
    
   
    

    
     public Functions getRoot(){
         
         return root;
     }
 
                              }
