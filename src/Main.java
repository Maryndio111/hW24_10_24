import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите способ отправки: 1 - DHL; 2 - Email; 3 - Owl");
        int  choice = scanner.nextInt();
        MailDeliveryService deliveryService = null;
        switch (choice){
            case 1:
                deliveryService = new DHL();
                break;
            case 2:
                deliveryService = new Email();
                break;
            case 3:
                deliveryService = new Owl();
                break;
            default:
                System.out.println("Неверный выбор");
                return;
        }
        Sender sender = new Sender();
        sender.send(deliveryService);
    }
}