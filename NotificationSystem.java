class NotificationBase { void send() { System.out.println("Sending notification"); } }
class EmailNotification extends NotificationBase { void send() { System.out.println("Sending Email"); } }
class SMSNotification extends NotificationBase { void send() { System.out.println("Sending SMS"); } }
class WhatsAppNotification extends NotificationBase { void send() { System.out.println("Sending WhatsApp message"); } }
public class NotificationSystem {
    public static void main(String[] args) {
        NotificationBase n = new EmailNotification(); n.send();
        n = new SMSNotification(); n.send(); n = new WhatsAppNotification(); n.send();
    }
}
