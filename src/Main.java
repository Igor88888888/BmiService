public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        System.out.println("Индекс тела:");
        System.out.println(service.calculate(175, 78));


    }

}
