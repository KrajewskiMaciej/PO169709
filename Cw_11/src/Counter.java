public class Counter <T>{
    int count =0;
    void add(T element){
        this.count+=1;
    }
    public int getCount(){
        return count;
    }
}
