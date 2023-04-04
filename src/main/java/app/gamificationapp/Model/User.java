package app.gamificationapp.Model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private int tokens;
    @ManyToMany(mappedBy = "earnedBadges")
    private List<Badge> badges;
    private int ranking;


    public User(String username, int tokens, List<Badge> badges, int ranking) {
        this.username = username;
        this.tokens = tokens;
        this.badges = badges;
        this.ranking = ranking;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getTokens() {
        return tokens;
    }

    public void setTokens(int tokens) {
        this.tokens = tokens;
    }

    public List<Badge> getBadges() {
        return badges;
    }

    public void setBadges(List<Badge> badges) {
        this.badges = badges;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public User() {

    }



    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", tokens=" + tokens +
                ", badges=" + badges +
                ", ranking=" + ranking +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }
}
