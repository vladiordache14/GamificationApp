package app.gamificationapp.Model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Quest implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String title;
    private String description;
    private int reward;
    private String creator;
    private String status;


    public Quest(String title, String description, int reward, String creator) {
        this.title = title;
        this.description = description;
        this.reward = reward;
        this.creator = creator;
        this.status = "Pending";
    }

    public Quest() {

    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public int getReward() {
        return this.reward;
    }

    public String getCreator() {
        return this.creator;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Quest{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", reward=" + reward +
                ", creator='" + creator + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }
}
