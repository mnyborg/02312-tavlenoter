package facebook;

public class MessagePost extends Post {
    private String message;


    public MessagePost(String username, String message) {
       super(username);
       this.message = message;
    }


}
