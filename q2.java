import java.util.ArrayList;

class node {
    public char data;
    public int count;
    public node next;

    public node() {
        this.data = ' ';
        this.count = 1;
        this.next = null;
    }

    public node(char data) {
        this.data = data;
        this.count = 1;
        this.next = null;
    }

    public char getData() {
        return data;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

class linkedList {
    private node head;
    ArrayList tempList;

    public linkedList() {
        this.head = new node();
        tempList = new ArrayList<Character>();
    }

    public node getNode() {
        return head;
    }

    public void add(char c) {
        node temp = new node(c);
        if (head == null) {
            head = temp;

        } else {
            temp.next = head;
            head = temp;
        }
        tempList.add(temp);
    }

    public boolean contains(char c) {
        if (tempList.contains(c)) {
            return true;
        } else {
            return false;
        }
    }

    public void sort() {
        node curr = head;
        while (curr != null) {
            node min = curr;
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

    public void display(linkedList l) {
        node temp = l.getNode();
        System.out.println("----List----");
        while (temp.next != null) {
            System.out.println(temp.data + " " + temp.count);
            temp = temp.next;
        }
    }
}

class FirstNonRepeatingStream {

    public linkedList checkList(linkedList l) {
        linkedList tempList = new linkedList();
        node temp = l.getNode();
        while (temp.next != null) {
            if (tempList.contains(temp.data)) {
                temp.count++;
            } 
            else {
                tempList.add(temp.data);
            }
            temp = temp.next;
        }
        return tempList;
    }

    public linkedList sortList(linkedList l) {
        l.sort();
        return l;
    }

    public char getFirstNonRepeating(linkedList l) {
        node temp = l.getNode();
        if (temp.getCount() == 0) {
            char c = temp.data;
            return c;
        }
        return '-';
    }
}

public class q2 {
    public static void main(String[] args) {
        System.out.println("First non repeating char java");
        linkedList l = new linkedList();
        linkedList l2 = new linkedList();
        l.add('a');
        l.add('b');
        l.add('a');
        l2.display(l);
        FirstNonRepeatingStream fnrs = new FirstNonRepeatingStream();
        l = fnrs.checkList(l);
        l2.display(l);
        l = fnrs.sortList(l);
        l2.display(l);
        System.out.println("First non-repeating character: " + fnrs.getFirstNonRepeating(l));
    }
}
