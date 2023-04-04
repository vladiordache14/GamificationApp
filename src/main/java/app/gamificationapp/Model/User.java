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
    private List<String> badges;
    private int ranking;

    public User(String username) {
        this.username = username;
        this.tokens = 0;
        this.badges = new ArrayList<>();
        this.ranking = 0;
    }


    public User() {

    }

    public String getUsername() {
        return this.username;
    }

    public int getTokens() {
        return this.tokens;
    }

    public void addTokens(int tokens) {
        this.tokens += tokens;
    }

    public List<String> getBadges() {
        return this.badges;
    }

    public void addBadge(String badge) {
        this.badges.add(badge);
    }

    public int getRanking() {
        return this.ranking;
    }

    public void updateRanking(int ranking) {
        this.ranking = ranking;
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
