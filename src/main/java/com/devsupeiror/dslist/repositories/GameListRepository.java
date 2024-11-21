package com.devsupeiror.dslist.repositories;

import com.devsupeiror.dslist.entities.Game;
import com.devsupeiror.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
