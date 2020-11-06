package facebook;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Post {
    private String username;
    private long timestamp;
    private int likes;
    private String[] comments;
    private int commentindex;

    public Post(String username) {
        this.username = username;
        this.timestamp = System.currentTimeMillis();
        this.likes = 0;
        this.comments = new String[100];
        this.commentindex = 0;
    }

    public void like() {
        likes++;
    }

    public void unlike() {
        if (likes > 0 )
            likes--;
    }

    public void addComment(String c) {
        if (commentindex < comments.length)
            comments[commentindex++] = c;
    }

    public String toString() {
        String result;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(timestamp);
        result = "" + formatter.format(date) + "\n";

        result = result + " " + username + "\n";

        if (likes > 0)
            result = result + " " + likes + " person(er) har liked det" + "\n";

        if (commentindex == 0)
            result = result + " ingen kommentarer" + "\n";
        else
            for (int i = 0; i < commentindex; i++)
                result = result + comments[i] + "\n";

            return result;
    }
}
