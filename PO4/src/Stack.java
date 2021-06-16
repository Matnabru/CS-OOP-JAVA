public class Stack {


    private int[] stack;
    private int len;
    public Stack(int i){
        this.stack = new int[i];
        this.len = 0;
    }
    public void push(int i) throws StackOutOfBoundsException {
        if(len>this.stack.length-1){
            throw new StackOutOfBoundsException("Stack is already full!");
        }else{
            this.stack[len] = i;
            setLen(++len);
        }
    }
    public void pop() throws StackOutOfBoundsException {
        if(len<=0){
            throw new StackOutOfBoundsException("Stack is already empty!");
        }else{
            this.stack[len-1] = 0;
            setLen(--len);
        }
    }
    public boolean isEmpty(){
        return this.stack == null;
    }
    public void print(){

        for(int i=0;i<this.len;i++){
            System.out.println(stack[i]);
        }
    }

    public void setLen(int len) {
        this.len = len;
    }
}
