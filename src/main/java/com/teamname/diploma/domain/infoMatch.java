package com.teamname.diploma.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class infoMatch {
    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String match_id;
    private String match_day;
    private String match_date;
    private String game_number;
    private String enemy;
    private String game_status;
    private String win;
    private String our_turn;
    private String enemy_turn;
    private String our_side;
    private String enemy_side;
    private String our_ban1;
    private String our_ban2;
    private String our_ban3;
    private String our_ban4;
    private String our_ban5;
    private String our_ban6;
    private String our_pick1;
    private String our_pick2;
    private String our_pick3;
    private String our_pick4;
    private String our_pick5;
    private String enemy_ban1;
    private String enemy_ban2;
    private String enemy_ban3;
    private String enemy_ban4;
    private String enemy_ban5;
    private String enemy_ban6;
    private String enemy_pick1;
    private String enemy_pick2;
    private String enemy_pick3;
    private String enemy_pick4;
    private String enemy_pick5;

    public infoMatch() {
    }

    public infoMatch
            (String match_id, String match_day, String match_date,
             String game_number, String enemy, String game_status,
             String win, String our_turn, String enemy_turn,
             String our_side, String enemy_side, String our_ban1,
             String our_ban2, String our_ban3, String our_ban4,
             String our_ban5, String our_ban6, String our_pick1,
             String our_pick2, String our_pick3, String our_pick4,
             String our_pick5, String enemy_ban1, String enemy_ban2,
             String enemy_ban3, String enemy_ban4, String enemy_ban5,
             String enemy_ban6, String enemy_pick1, String enemy_pick2,
             String enemy_pick3, String enemy_pick4, String enemy_pick5
            ) {
        this.match_id = match_id;
        this.match_day = match_day;
        this.match_date = match_date;
        this.game_number = game_number;
        this.enemy = enemy;
        this.game_status = game_status;
        this.win = win;
        this.our_turn = our_turn;
        this.enemy_turn = enemy_turn;
        this.our_side = our_side;
        this.enemy_side = enemy_side;
        this.our_ban1 = our_ban1;
        this.our_ban2 = our_ban2;
        this.our_ban3 = our_ban3;
        this.our_ban4 = our_ban4;
        this.our_ban5 = our_ban5;
        this.our_ban6 = our_ban6;
        this.our_pick1 = our_pick1;
        this.our_pick2 = our_pick2;
        this.our_pick3 = our_pick3;
        this.our_pick4 = our_pick4;
        this.our_pick5 = our_pick5;
        this.enemy_ban1 = enemy_ban1;
        this.enemy_ban2 = enemy_ban2;
        this.enemy_ban3 = enemy_ban3;
        this.enemy_ban4 = enemy_ban4;
        this.enemy_ban5 = enemy_ban5;
        this.enemy_ban6 = enemy_ban6;
        this.enemy_pick1 = enemy_pick1;
        this.enemy_pick2 = enemy_pick2;
        this.enemy_pick3 = enemy_pick3;
        this.enemy_pick4 = enemy_pick4;
        this.enemy_pick5 = enemy_pick5;
    }

    public String getMatch_id() {
        return match_id;
    }

    public void setMatch_id(String match_id) {
        this.match_id = match_id;
    }

    public String getMatch_day() {
        return match_day;
    }

    public void setMatch_day(String match_day) {
        this.match_day = match_day;
    }

    public String getMatch_date() {
        return match_date;
    }

    public void setMatch_date(String match_date) {
        this.match_date = match_date;
    }

    public String getGame_number() {
        return game_number;
    }

    public void setGame_number(String game_number) {
        this.game_number = game_number;
    }

    public String getEnemy() {
        return enemy;
    }

    public void setEnemy(String enemy) {
        this.enemy = enemy;
    }

    public String getGame_status() {
        return game_status;
    }

    public void setGame_status(String game_status) {
        this.game_status = game_status;
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }

    public String getOur_turn() {
        return our_turn;
    }

    public void setOur_turn(String our_turn) {
        this.our_turn = our_turn;
    }

    public String getEnemy_turn() {
        return enemy_turn;
    }

    public void setEnemy_turn(String enemy_turn) {
        this.enemy_turn = enemy_turn;
    }

    public String getOur_side() {
        return our_side;
    }

    public void setOur_side(String our_side) {
        this.our_side = our_side;
    }

    public String getEnemy_side() {
        return enemy_side;
    }

    public void setEnemy_side(String enemy_side) {
        this.enemy_side = enemy_side;
    }

    public String getOur_ban1() {
        return our_ban1;
    }

    public void setOur_ban1(String our_ban1) {
        this.our_ban1 = our_ban1;
    }

    public String getOur_ban2() {
        return our_ban2;
    }

    public void setOur_ban2(String our_ban2) {
        this.our_ban2 = our_ban2;
    }

    public String getOur_ban3() {
        return our_ban3;
    }

    public void setOur_ban3(String our_ban3) {
        this.our_ban3 = our_ban3;
    }

    public String getOur_ban4() {
        return our_ban4;
    }

    public void setOur_ban4(String our_ban4) {
        this.our_ban4 = our_ban4;
    }

    public String getOur_ban5() {
        return our_ban5;
    }

    public void setOur_ban5(String our_ban5) {
        this.our_ban5 = our_ban5;
    }

    public String getOur_ban6() {
        return our_ban6;
    }

    public void setOur_ban6(String our_ban6) {
        this.our_ban6 = our_ban6;
    }

    public String getOur_pick1() {
        return our_pick1;
    }

    public void setOur_pick1(String our_pick1) {
        this.our_pick1 = our_pick1;
    }

    public String getOur_pick2() {
        return our_pick2;
    }

    public void setOur_pick2(String our_pick2) {
        this.our_pick2 = our_pick2;
    }

    public String getOur_pick3() {
        return our_pick3;
    }

    public void setOur_pick3(String our_pick3) {
        this.our_pick3 = our_pick3;
    }

    public String getOur_pick4() {
        return our_pick4;
    }

    public void setOur_pick4(String our_pick4) {
        this.our_pick4 = our_pick4;
    }

    public String getOur_pick5() {
        return our_pick5;
    }

    public void setOur_pick5(String our_pick5) {
        this.our_pick5 = our_pick5;
    }

    public String getEnemy_ban1() {
        return enemy_ban1;
    }

    public void setEnemy_ban1(String enemy_ban1) {
        this.enemy_ban1 = enemy_ban1;
    }

    public String getEnemy_ban2() {
        return enemy_ban2;
    }

    public void setEnemy_ban2(String enemy_ban2) {
        this.enemy_ban2 = enemy_ban2;
    }

    public String getEnemy_ban3() {
        return enemy_ban3;
    }

    public void setEnemy_ban3(String enemy_ban3) {
        this.enemy_ban3 = enemy_ban3;
    }

    public String getEnemy_ban4() {
        return enemy_ban4;
    }

    public void setEnemy_ban4(String enemy_ban4) {
        this.enemy_ban4 = enemy_ban4;
    }

    public String getEnemy_ban5() {
        return enemy_ban5;
    }

    public void setEnemy_ban5(String enemy_ban5) {
        this.enemy_ban5 = enemy_ban5;
    }

    public String getEnemy_ban6() {
        return enemy_ban6;
    }

    public void setEnemy_ban6(String enemy_ban6) {
        this.enemy_ban6 = enemy_ban6;
    }

    public String getEnemy_pick1() {
        return enemy_pick1;
    }

    public void setEnemy_pick1(String enemy_pick1) {
        this.enemy_pick1 = enemy_pick1;
    }

    public String getEnemy_pick2() {
        return enemy_pick2;
    }

    public void setEnemy_pick2(String enemy_pick2) {
        this.enemy_pick2 = enemy_pick2;
    }

    public String getEnemy_pick3() {
        return enemy_pick3;
    }

    public void setEnemy_pick3(String enemy_pick3) {
        this.enemy_pick3 = enemy_pick3;
    }

    public String getEnemy_pick4() {
        return enemy_pick4;
    }

    public void setEnemy_pick4(String enemy_pick4) {
        this.enemy_pick4 = enemy_pick4;
    }

    public String getEnemy_pick5() {
        return enemy_pick5;
    }

    public void setEnemy_pick5(String enemy_pick5) {
        this.enemy_pick5 = enemy_pick5;
    }
}
