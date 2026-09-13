class SocialPost {
    private String content; private int likes;
    SocialPost(String content) { this.content = content; }
    void like() { likes++; }
    void showPost() { System.out.println("Post: " + content); System.out.println("Likes: " + likes); }
}
public class SocialMediaPost {
    public static void main(String[] args) { SocialPost p = new SocialPost("Hello World"); p.like(); p.like(); p.showPost(); }
}
