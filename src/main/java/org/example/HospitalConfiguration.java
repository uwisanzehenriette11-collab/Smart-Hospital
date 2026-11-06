@Component
public class HospitalConfig {

    @Value("${hospital.name:General City Hospital}")
    private String hospitalName;

    @Value("${hospital.api.secret}")
    private String apiSecret;

    public String getHospitalName() {
        return hospitalName;
    }

    public String getApiSecret() {
        return apiSecret;
    }
}

