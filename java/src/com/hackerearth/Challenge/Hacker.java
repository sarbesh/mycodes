interface IntNumber{
    public void ins(int item);
    public int delt();
}

class HackerEarth implements IntNumber{

    private int stck[];
    private int pos;

    HackerEarth(int size){
        stck = new int[size];
        pos = -1;
    }

    @Override
    public void ins(int item) {
        if(pos == stck.length-1){
            System.out.println("Overflow");
        } else {
            stck[++pos] = item;
        }
    }

    @Override
    public int delt() {
        if(pos<0){
            System.out.println("Underflow");
            return 0;
        } else {
            return stck[pos--];
        }
    }
}

public class Hacker {
    public static void main(String[] args) {
        HackerEarth obj = new HackerEarth(3);
        for (int i=0;i<4;i++) obj.ins(i);
        for(int i=0;i<=3;i++){
            System.out.println(obj.delt());
        }
    }
}
