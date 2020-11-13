package facebook;

public class MessagePost extends Post {
    private String message;


    public MessagePost(String username, String message) {
       super(username);
       this.message = message;
    }

    @Override
    public String toString() {
        return message + "\n" + super.toString();
    }

    public String type() {
        return "MessagePost";
    }
}
