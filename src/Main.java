public class Main {
    public static void main(String[] args) {

        int ticketPrise = 13676; // Цена билета
        int milesPerRuble = 20; //  Количество рублей за милю
        int miles = (int) ( ticketPrise / milesPerRuble);// Количество начисленных миль

        System.out.println("Количество начисленных миль:" + miles);

    }
}