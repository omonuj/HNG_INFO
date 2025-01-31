package brightlogic.info.controller;

import brightlogic.info.dto.InformationRequest;
import brightlogic.info.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InfromationController {


    @Autowired
    private InformationService service;

    @GetMapping("/info")
    public ResponseEntity<InformationRequest> getEmailDateTime() {
        InformationRequest request = service.getInformation();
        return new ResponseEntity<>(request, HttpStatus.OK);
    }

}
