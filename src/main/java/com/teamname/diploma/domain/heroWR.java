package com.teamname.diploma.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class heroWR {
    @Id
    private Long hero_id;
    private String heroname;
    private int hero_games;
    private int hero_wins;
    private int hero_losses;
    private double hero_wrs;
    private double hero_rate;

    public heroWR() {
    }

    public heroWR(Long hero_id, String hero_name, int hero_games, int hero_wins, int hero_losses, double hero_wrs, double hero_rate) {
        this.hero_id = hero_id;
        this.heroname = hero_name;
        this.hero_games = hero_games;
        this.hero_wins = hero_wins;
        this.hero_losses = hero_losses;
        this.hero_wrs = hero_wrs;
        this.hero_rate = hero_rate;
    }

    public Long getHero_id() {
        return hero_id;
    }

    public void setHero_id(Long hero_id) {
        this.hero_id = hero_id;
    }

    public String getHeroname() {
        return heroname;
    }

    public void setHeroname(String hero_name) {
        this.heroname = hero_name;
    }

    public Integer getHero_games() {
        return hero_games;
    }

    public void setHero_games(Integer hero_games) {
        this.hero_games = hero_games;
    }

    public Integer getHero_wins() {
        return hero_wins;
    }

    public void setHero_wins(Integer hero_wins) {
        this.hero_wins = hero_wins;
    }

    public Integer getHero_losses() {
        return hero_losses;
    }

    public void setHero_losses(Integer hero_losses) {
        this.hero_losses = hero_losses;
    }

    public double getHero_wrs() {
        return hero_wrs;
    }

    public void setHero_wrs(double hero_wrs) {
        this.hero_wrs = hero_wrs;
    }

    public double getHero_rate() {
        return hero_rate;
    }

    public void setHero_rate(double hero_rate) {
        this.hero_rate = hero_rate;
    }
}
