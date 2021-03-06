package facebook;

public class PhotoPost extends Post {
    private String filename;
    private String caption;

    public PhotoPost(String username, String filename, String caption) {
        super(username);
        this.filename = filename;
        this.caption = caption;
    }

    @Override
    public String toString() {
        return filename + " " + caption + "\n" + super.toString();
    }

    public String type() {
        return "PhotoPost";
    }
}

