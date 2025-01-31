package brightlogic.info.service;

import brightlogic.info.dto.InformationRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class InformationServiceImpl implements InformationService {


    @Override
    public InformationRequest getInformation() {
        InformationRequest informationRequest = new InformationRequest();
        String email = "Jonahodoh@gmail.com";
        LocalDateTime now = LocalDateTime.now();
        String timestamp = now.format(DateTimeFormatter.ISO_DATE_TIME);
        String githubUrl = "https://github.com/omonuj/HNG_INFO";



        informationRequest.setEmail(email);
        informationRequest.setTimeStamp(timestamp);
        informationRequest.setGithubUrl(githubUrl);

        return informationRequest;
    }
}
