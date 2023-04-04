package app.gamificationapp.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Badge {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToMany
    @JoinTable(
            name = "winnings",
            joinColumns = @JoinColumn(name = "badge_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> earnedBadges;

    public Badge(List<User> earnedBadges) {
        this.earnedBadges = earnedBadges;
    }

    public List<User> getEarnedBadges() {
        return earnedBadges;
    }

    public void setEarnedBadges(List<User> earnedBadges) {
        this.earnedBadges = earnedBadges;
    }

    public Badge() {

    }

    public void setId(Long id) {
        this.id = id;
    }



    public Long getId() {
        return id;
    }
}
