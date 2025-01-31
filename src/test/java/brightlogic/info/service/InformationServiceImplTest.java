package brightlogic.info.service;

import static org.junit.jupiter.api.Assertions.*;

import brightlogic.info.dto.InformationRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



class InformationServiceImplTest {

        @Test
        void testGetInformation() {
            InformationServiceImpl service = new InformationServiceImpl();
            InformationRequest info = service.getInformation();

            assertEquals("Jonahodoh@gmail.com", info.getEmail());
            assertNotNull(info.getTimeStamp());
            assertEquals("https://github.com/omonuj/HNG_Task", info.getGithubUrl());
        }


}