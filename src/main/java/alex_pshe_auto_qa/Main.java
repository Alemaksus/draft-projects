package alex_pshe_auto_qa;

public class Main {
    public static void main(String[] args) {
        TaskSolver ts = new TaskSolver();
        String result = ts.method1(2);
        System.out.println(result);

        int sum = ts.sum(2, 3);
        System.out.println(sum);
    }
}
