package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private static SimpleDateFormat ftm1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    List<Comment> comments = new ArrayList<>();

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public void addComments(Comment comment){
        comments.add(comment);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes + "Likes - ");
        sb.append(ftm1.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments:\n");
        sb.append(comments);

        return sb.toString();
    }
}
