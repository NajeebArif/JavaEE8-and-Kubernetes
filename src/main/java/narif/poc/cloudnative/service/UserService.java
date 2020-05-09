package narif.poc.cloudnative.service;

import narif.poc.cloudnative.model.BlogUser;
import narif.poc.cloudnative.repository.UserRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class UserService {

    @Inject
    private UserRepository userRepository;

    public BlogUser createUser(String username, String email, String password){
        return userRepository.createUser(username, email, password);
    }

    public List<BlogUser> getAllUsers(){
        return userRepository.getAllUsers();
    }
}
