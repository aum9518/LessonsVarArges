public class VarArgs {
    public static void main(String[] args) {
        method(0,1,2,3,4,5,111,222,333,456,7687);
    }
    static void method(int sum,int...varargs){

        for (int a:varargs) {
            sum = sum+a;
            System.out.print(a+" ");
        }
        System.out.println("\nobshiy summa "+sum);
    }
}
