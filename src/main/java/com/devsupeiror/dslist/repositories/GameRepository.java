package com.devsupeiror.dslist.repositories;

import com.devsupeiror.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
