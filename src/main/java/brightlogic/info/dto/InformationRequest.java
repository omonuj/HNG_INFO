package brightlogic.info.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class InformationRequest {

    private String email;
    private String timeStamp;
    private String githubUrl;

    public InformationRequest() {
    }

    public InformationRequest(String email, String timeStamp, String githubUrl) {
        this.email = email;
        this.timeStamp = timeStamp;
        this.githubUrl = githubUrl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }
}
