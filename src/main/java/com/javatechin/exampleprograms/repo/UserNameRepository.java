package com.javatechin.exampleprograms.repo;

import com.javatechin.exampleprograms.enitiy.UserName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserNameRepository extends JpaRepository<UserName,Long> {
}
