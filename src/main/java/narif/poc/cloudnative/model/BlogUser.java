package narif.poc.cloudnative.model;

import javax.security.enterprise.credential.Password;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class BlogUser {

    private UUID userId;
    private String username;
    private String password;
    private String email;
    private List<BlogPost> posts = new ArrayList<>();

    @Override
    public String toString() {
        return "BlogUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", posts=" + posts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlogUser blogUser = (BlogUser) o;
        return Objects.equals(getUserId(), blogUser.getUserId()) &&
                Objects.equals(getUsername(), blogUser.getUsername()) &&
                Objects.equals(getPassword(), blogUser.getPassword()) &&
                Objects.equals(getEmail(), blogUser.getEmail()) &&
                Objects.equals(getPosts(), blogUser.getPosts());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getUserId(), getUsername(), getPassword(), getEmail(), getPosts());
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<BlogPost> getPosts() {
        return posts;
    }

    public void setPosts(List<BlogPost> posts) {
        this.posts = posts;
    }

}
