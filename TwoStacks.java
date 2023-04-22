public class TwoStacks {
    int size;
    int top1,top2;
    int array[];

    public TwoStacks(int size) {
        this.size = size;
        array=new int[size];
        top1=-1;
        top2=size;
    }
public void push1(int x){
    if(top1<top2){
    top1++;
    array[top1]=x;
    System.out.println("inserted element at stack1 "+x);
    }else{
        System.out.println("stack overflow");
        System.exit(1);
    }
}
public void push2(int x){
  if(top1<top2-1){
    top2--;
    array[top2]=x;
    System.out.println("pushed element in stack2 "+x);
  }else{
    System.out.println("stack overflow");
    System.exit(1);

  }
}

private int pop1(){
if(top1>=0){
    int x = array[top1];
    System.out.println("popped element " + x);
    top1--;
    return x;
}else{
    System.out.println("stack underflow");
    System.exit(1);

}
return 0;
}

private int pop2(){
    if(top2<size){
        int x=array[top2];
        System.out.println("popped element "+x);
        top2--;
        return x;
    }else{
        System.out.println("stack underflow ");
        System.exit(1);

    }
    return 0;
}

public static void main(String[] args) {
    TwoStacks twoStacks = new TwoStacks(10);
    twoStacks.push1(10);
    twoStacks.push1(20);
    twoStacks.push1(30);
    twoStacks.pop1();
    twoStacks.push2(50);
    twoStacks.push2(70);
    twoStacks.push2(80);
    twoStacks.pop2();   

    
}
    
    
}
