package narif.poc.cloudnative.model;

public class BlogPostContent {

    private String textContent;

    public BlogPostContent(String textContent) {
        this.textContent = textContent;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    @Override
    public String toString() {
        return "BlogPostContent{" +
                "textContent='" + getSubstring() + "...'" +
                "}";
    }

    private String getSubstring() {
        return null== textContent? "" : textContent.substring(0,10);
    }
}
