@Component
public class PatientAlertProcessor {

    @Autowired
    private NotificationService notificationService

    @Autowired
    @Qualifier("emergencyService")
    private NotificationService emergencyService;

    public void processPatientAlert() {

        notificationService.sendNotification(
                "Patient information received"
        );

        emergencyService.sendNotification(
                "Critical ICU emergency alert"
        );
    }
}