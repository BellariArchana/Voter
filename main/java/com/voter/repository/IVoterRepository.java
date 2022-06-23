package com.voter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.voter.entities.Voter;

@Repository
public interface IVoterRepository extends JpaRepository<Voter,Integer>{

}
