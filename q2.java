import java.util.Hashtable;
class node{
    public char data;
    public node next;
    public node prev;

    public node(){
        this.data = ' ';
        this.next=null;
        this.prev=null;
    }
    public node(char data){
        this.data = data;
        this.next=null;
        this.prev=null;
    }
}
class FirstNonRepeatingStream{
    public node head;
    public node tail;
    int size;

    public FirstNonRepeatingStream(){
        this.head=null;
        this.tail=null;
        size=0;
    }
    public void add(char data){
        node temp= new node(data);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        size++;
    }
    public char getFirstNonRepeating(){
        int s=0;
        node temp=head;
       if(temp==null){
            return '-';
       }
       else if(temp.data!=temp.next.data && s!=size){
            ++s;
            if(temp.data!=temp.next.next.data && s!=size ){
                ++s;
                if(temp.data!=temp.next.next.next.data && s!=size ){
                ++s;
                return temp.data;
                }
                return temp.data;
            }
            return temp.data;
       }
       else{
            temp=temp.next;
       }
       return '-';

    }
}
public class q2{
    public static void main(String[] args){
        System.out.println("First non repeating char java");
        FirstNonRepeatingStream fnrs=new FirstNonRepeatingStream();
        fnrs.add('a');
        fnrs.add('b');
        fnrs.add('a');
        System.out.println(fnrs.getFirstNonRepeating());

    }
}