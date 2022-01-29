package clone.issuetracker;

import java.text.AttributedCharacterIterator;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Issue {
    private String name;
    private LocalDateTime time;
    private Status status;
    private List<Comment> comments = new ArrayList<>();

    public Issue(String name, LocalDateTime time, Status status) {
        this.name = name;
        this.time = time;
        this.status = status;
    }

    public Issue(Issue issue, CopyMode copyMode) {
        name = issue.name;
        time = issue.time;
        status = issue.status;
        if (copyMode == CopyMode.WITH_COMMENTS) {
            this.comments = copyComments(issue);
        }
    }

    private List<Comment> copyComments(Issue issue) {
        List<Comment> copiedComments = new ArrayList<>();
        for (Comment comment : issue.comments) {
            copiedComments.add(new Comment(comment));
        }
        return copiedComments;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Status getStatus() {
        return status;
    }

    public List<Comment> getComments() {
        return comments;
    }
}