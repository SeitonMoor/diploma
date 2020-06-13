package com.teamname.diploma.controller;

import com.teamname.diploma.domain.heroWR;
import com.teamname.diploma.domain.infoMatch;
import com.teamname.diploma.repos.HeroWRRepo;
import com.teamname.diploma.repos.MatchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DecimalFormat;
import java.util.Map;

import static java.lang.Math.sqrt;

@Controller
public class MainController {
    @Autowired
    private MatchRepo matchRepo;

    @Autowired
    private HeroWRRepo heroWRRepo;

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @GetMapping("/gameTable")
    public String gameTable(Map<String, Object> model) {
        Iterable<infoMatch> matches = matchRepo.findAll();

        model.put("matches", matches);

        return "gameTable";
    }

    @PostMapping("/gameTable")
    public String add(
            @RequestParam String match_id, @RequestParam String match_day, @RequestParam String match_date,
            @RequestParam String game_number, @RequestParam String enemy, @RequestParam String game_status,
            @RequestParam String win, @RequestParam String our_turn, @RequestParam String enemy_turn,
            @RequestParam String our_side, @RequestParam String enemy_side, @RequestParam String our_ban1,
            @RequestParam String our_ban2, @RequestParam String our_ban3, @RequestParam String our_ban4,
            @RequestParam String our_ban5, @RequestParam String our_ban6, @RequestParam String our_pick1,
            @RequestParam String our_pick2, @RequestParam String our_pick3, @RequestParam String our_pick4,
            @RequestParam String our_pick5, @RequestParam String enemy_ban1, @RequestParam String enemy_ban2,
            @RequestParam String enemy_ban3, @RequestParam String enemy_ban4, @RequestParam String enemy_ban5,
            @RequestParam String enemy_ban6, @RequestParam String enemy_pick1, @RequestParam String enemy_pick2,
            @RequestParam String enemy_pick3, @RequestParam String enemy_pick4, @RequestParam String enemy_pick5,
            Map<String, Object> model
    ) {
        infoMatch match = new infoMatch
                (match_id, match_day, match_date, game_number, enemy, game_status, win, our_turn,
                        enemy_turn, our_side, enemy_side, our_ban1, our_ban2, our_ban3,
                        our_ban4, our_ban5, our_ban6, our_pick1, our_pick2, our_pick3,
                        our_pick4, our_pick5, enemy_ban1, enemy_ban2, enemy_ban3, enemy_ban4,
                        enemy_ban5, enemy_ban6, enemy_pick1, enemy_pick2, enemy_pick3, enemy_pick4, enemy_pick5);

        matchRepo.save(match);

        setHeroWRRepo(our_pick1, win);
        setHeroWRRepo(our_pick2, win);
        setHeroWRRepo(our_pick3, win);
        setHeroWRRepo(our_pick4, win);
        setHeroWRRepo(our_pick5, win);

        Iterable<infoMatch> matches = matchRepo.findAll();

        model.put("matches", matches);

        return "gameTable";
    }

    @GetMapping("/heroWR")
    public String heroWR(Map<String, Object> model) {
        Iterable<heroWR> heroWRS = heroWRRepo.findAll();

        model.put("heroWRS", heroWRS);

        return "heroWR";
    }

    private void setHeroWRRepo(String pick, String win){
        heroWR heroWR = heroWRRepo.findByHeroname(pick);
        int games1 = heroWR.getHero_games();
        heroWR.setHero_games(games1+1);
        int wins = heroWR.getHero_wins();
        int losses = heroWR.getHero_losses();

        if (win.equals("Won")){
            heroWR.setHero_wins(wins + 1);
        } else if (win.equals("Lost")) {
            heroWR.setHero_losses(losses + 1);
        }

        double games2 = heroWR.getHero_games();
        double wins2 = heroWR.getHero_wins();
        double losses2 = heroWR.getHero_losses();

        DecimalFormat df = new DecimalFormat("###,##");

        String s1 = df.format(wins2/games2*100);

        double hwr;
        if (s1.equals("1 00")) {
            hwr = 100;
        } else {
            hwr = Double.parseDouble(s1);
        }

        heroWR.setHero_wrs(hwr);

        String s2 = df.format(
                (((wins2+1.9208)/(wins2+losses2)-1.96*sqrt((wins2*losses2)/(wins2+losses2)+0.9604)/
                        (wins2+losses2))/(1+3.8416/(wins2+losses2)))*100);

        double rate = Double.parseDouble(s2);

        heroWR.setHero_rate(rate);

        heroWRRepo.save(heroWR);
    }
}