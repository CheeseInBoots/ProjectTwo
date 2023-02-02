public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static int passByValue(int a ){
      a = 10;

      return a;
    }
    public static void nothing(){
        System.out.println("Print out nothing!");
    }
    public static int sumOf10 (int num){
        int sum = 0;

        for (int i = 5; i < num; i++) {
            if (i % 2 == 0){
                sum = sum + i;
            }
            }

        return sum;

    }
    public static String lastestChange(){
        String s = "laterst chante ";
        return s;
    }
}
