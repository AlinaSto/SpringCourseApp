package com.spring.apps.movieAPP;

import com.spring.apps.courseAPP.Team;
import com.spring.apps.courseAPP.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FranchizeRepository extends JpaRepository<Franchize, Long> {
 //   public Franchize findByMoviesContaining(Movie movie);
}
