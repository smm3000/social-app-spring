package social.app.smbc.demo;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserService() {
    }

    public String getUser() {
        return "User-test";
    }
}
