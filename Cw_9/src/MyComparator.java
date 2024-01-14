public interface MyComparator {
    abstract int compare(int a, int b);
}

class TestMyComparator implements MyComparator{
    @Override
    public int compare(int a, int b) {
        if(a>b){
            return 1;
        } else if (a<b) {
            return -1;
        } else {
            return 0;
        }
    }
}
