package lang.print.gaps.task6;

public class IntegerTypeCasting {
    public static void main(String[] args) {
        Long first = 100l;

        int second = Math.toIntExact(first);
        System.out.println(first);
        System.out.println(second);

    }
}
