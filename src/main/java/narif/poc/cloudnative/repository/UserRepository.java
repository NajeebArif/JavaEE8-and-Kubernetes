package narif.poc.cloudnative.repository;

import narif.poc.cloudnative.model.BlogPost;
import narif.poc.cloudnative.model.BlogUser;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@ApplicationScoped
public class UserRepository {

    private List<BlogUser> users;

    @Inject
    private BlogPostRepo blogPostRepo;

    @PostConstruct
    void init(){
        users = new ArrayList<>();
        createUser("narif", "narif@xyz.com", "aVeryStrongPassword##87H58");
        createUser("JohnDoe","JohnDoe@xyz.com","HellYeah");
    }

    public List<BlogUser> getAllUsers(){
        return this.users;
    }

    public BlogUser createUser(String username, String email, String password) {
        BlogUser user = new BlogUser();
        user.setUserId(UUID.randomUUID());
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        user.setPosts(getThisUsersposts(email));
        users.add(user);
        return user;
    }

    private List<BlogPost> getThisUsersposts(String email) {
        return blogPostRepo.getAllBlogPosts().stream().filter(blogPost -> blogPost.getAuthorEmail().equalsIgnoreCase(email)).collect(Collectors.toList());
    }
}
