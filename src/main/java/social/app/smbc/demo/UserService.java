package social.app.smbc.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public String getUser() {
        return "User-test";
    }

    public Optional<User> getUserById(Long id) {

        return userRepository.findById(id);
    }

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    public User createUser(User user) {
       return userRepository.save(user);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }
}