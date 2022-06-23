package com.voter.services;

import java.util.List;
import com.voter.entities.Voter;

public interface IVoterService {

	public List<Voter> getAllVoter();

	public Voter getVoterById(int voterId);

	public void deleteVoterById(int voterId);
	
	public Voter updateVoter(Voter voter);

	public Voter addVoter(Voter voter);
}
