@Component("emergencyService")
public class EmergencyUrgentNotificationService
        implements NotificationService {

    @Override
    public void sendNotification(String message) {
        System.out.println("EMERGENCY ALERT: " + message);
    }

    }

