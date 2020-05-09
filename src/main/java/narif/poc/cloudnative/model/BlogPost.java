package narif.poc.cloudnative.model;

import java.util.Objects;
import java.util.UUID;

public class BlogPost {


    private UUID blogPostId;
    private String title;
    private BlogPostContent content;
    private CommonAuditEntries auditEntries;
    private String authorEmail;

    @Override
    public String toString() {
        return "BlogPost{" +
                "blogPostId=" + blogPostId +
                ", title='" + title + '\'' +
                ", content=" + content +
                ", auditEntries=" + auditEntries +
                ", authorEmail='" + authorEmail + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlogPost blogPost = (BlogPost) o;
        return Objects.equals(getBlogPostId(), blogPost.getBlogPostId()) &&
                Objects.equals(getTitle(), blogPost.getTitle()) &&
                Objects.equals(getContent(), blogPost.getContent()) &&
                Objects.equals(getAuditEntries(), blogPost.getAuditEntries()) &&
                Objects.equals(getAuthorEmail(), blogPost.getAuthorEmail());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getBlogPostId(), getTitle(), getContent(), getAuditEntries(), getAuthorEmail());
    }

    public String getAuthorEmail() {

        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public UUID getBlogPostId() {
        return blogPostId;
    }

    public void setBlogPostId(UUID blogPostId) {
        this.blogPostId = blogPostId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BlogPostContent getContent() {
        return content;
    }

    public void setContent(BlogPostContent content) {
        this.content = content;
    }

    public CommonAuditEntries getAuditEntries() {
        return auditEntries;
    }

    public void setAuditEntries(CommonAuditEntries auditEntries) {
        this.auditEntries = auditEntries;
    }

}
