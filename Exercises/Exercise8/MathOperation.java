public class MathOperation {
    public static void main(String[] args) {
        try {
            long sum = 0;
            double avg;
            for (int i = 0; i < args.length; i++) {
                if (i > 4) {
                    break;
                }
                sum = sum + Integer.parseInt(args[i]);
            }
            System.out.println("Sum = " + sum);
            avg = (sum * 1.0) / 5;
            System.out.println("Average = " + avg);
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }
}
