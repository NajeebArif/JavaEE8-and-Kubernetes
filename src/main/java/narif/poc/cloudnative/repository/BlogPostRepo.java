package narif.poc.cloudnative.repository;

import narif.poc.cloudnative.model.BlogPost;
import narif.poc.cloudnative.model.BlogPostContent;
import narif.poc.cloudnative.model.CommonAuditEntries;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class BlogPostRepo {

    private List<BlogPost> postRepo;

    @PostConstruct
    public void init(){
        postRepo = new ArrayList<>();
        createPost("narif@xyz.com", "First blog post.","This is the first blog post and it has no meaning.");
        createPost("narif@xyz.com","Second blog post.","This is the second blog post which is useless.");
        createPost("narif@xyz.com","Third blog post.","This is the Third blog post which is useless.");
    }

    public List<BlogPost> getAllBlogPosts(){
        return postRepo;
    }

    public BlogPost createNewBlog(String authorEmail, String title, String textContent){
        return createPost(authorEmail,title,textContent);
    }

    private BlogPost createPost(String authorEmail, String title, String textContent) {
        BlogPost post = new BlogPost();
        post.setBlogPostId(UUID.randomUUID());
        post.setTitle(title);
        post.setAuthorEmail(authorEmail);
        post.setAuditEntries(getAuditEntries(authorEmail));
        post.setContent(new BlogPostContent(textContent));
        postRepo.add(post);
        return post;
    }

    private CommonAuditEntries getAuditEntries(final String userEmail){
        return new CommonAuditEntries(userEmail);
    }
}
