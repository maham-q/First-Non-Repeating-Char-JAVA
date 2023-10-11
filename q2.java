import java.util.ArrayList;
import java.util.LinkedList;
class node{
    public char data;
    public int count;
    public node next;

    public node(){
        this.data = ' ';
        this.count=0;
        this.next=null;
    }
    public node(char data){
        this.data = data;
        this.count=0;
        this.next=null;
    }
    public char getData(){
        return data;
    }
    public int getCount(){
        return count;
    }
    public void setCount(int count){
        this.count=count;
    }
}
class linkedList{
    private node head;
    ArrayList tempList;
    public linkedList(){
        this.head=new node();
        tempList=new ArrayList<Character>();
    }
    public node getNode(node n){
        return n;
    }
    public void add(char c){
        node temp=new node(c);
        if(head==null){
            head=temp;
            
        }
        else{
            temp.next=head;
            head=temp;
        }
        tempList.add(temp);
    }
    public boolean contains(char c){
        if(tempList.contains(c)){
            return true;
        }
        else{
            return false;
        }
    }
    public void sort(){
        node curr=head;
        while (curr != null) {
            node min= curr;
            node temp = curr.next;
            while (temp != null) {
                if (temp.count < min.count) {
                    min = temp;
                }
                temp = temp.next;
            }
            char tempData = curr.data;
            int tempCount = curr.count;
            curr.data = min.data;
            curr.count = min.count;
            min.data = tempData;
            min.count = tempCount;
            curr = curr.next;
    }
}


public class q2{
    public static void main(String[] args){
        System.out.println("First non repeating char java");
        
       

    }
}