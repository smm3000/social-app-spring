package social.app.smbc.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private static UserRepository userRepository;

    public UserService() {
    }

    public String getUser() {
        return "User-test";
    }

    public Optional<User> getUserById(Long id) {

        return userRepository.findById(id);
    }

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }
}
