package com.teamname.diploma.repos;

import com.teamname.diploma.domain.heroWR;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroWRRepo extends JpaRepository<heroWR, Integer> {
    heroWR findByHeroname(String hero_name);
}
