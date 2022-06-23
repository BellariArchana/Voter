package com.voter.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voter.constants.ConstantMessages;
import com.voter.entities.Voter;
import com.voter.exceptions.IdNotFoundException;
import com.voter.exceptions.NoSuchRecordException;
import com.voter.repository.IVoterRepository;

@Service("IVoterService")
public class VoterServiceImpl implements IVoterService {

	@Autowired
	IVoterRepository iVoterRepository;
	
	@Override
	public Voter addVoter(Voter voter) {
		return iVoterRepository.save(voter);
	}
	
	@Override
	public Voter updateVoter(Voter voter) {
		return iVoterRepository.save(voter);
	}

	@Override
	public List<Voter> getAllVoter() {
		List<Voter> list = iVoterRepository.findAll();
		if (!list.isEmpty()) {
			return iVoterRepository.findAll();
		}
		else{
			throw new NoSuchRecordException(ConstantMessages.RECORDMSG);
		}
	}

	@Override
	public Voter getVoterById(int voterId) {
		Optional<Voter> id = iVoterRepository.findById(voterId);
		if (id.isPresent())
			return id.get();
		else
			throw new IdNotFoundException(ConstantMessages.IDMSG + voterId);
	}

	@Override
	public void deleteVoterById(int voterId) {
		if (iVoterRepository.existsById(voterId)) {
			iVoterRepository.deleteById(voterId);
		} else
			throw new IdNotFoundException(ConstantMessages.FAILMSG + voterId);
	}
}
