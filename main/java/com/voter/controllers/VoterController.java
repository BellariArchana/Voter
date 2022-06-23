package com.voter.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.voter.constants.ConstantMessages;
import com.voter.entities.Voter;
import com.voter.statusinfo.SuccessInfo;
import com.voter.services.*;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("This is the voter to perform CRUD operation on Voter entity")
@CrossOrigin
@RequestMapping("/voter")
@RestController()
public class VoterController {

	@Autowired
	IVoterService iVoterService;

	@ApiOperation("This is to add Voter to the database")
	@PostMapping("/addVoter")
	public ResponseEntity<SuccessInfo> processPost(@RequestBody Voter voter) {
		iVoterService.addVoter(voter);
		SuccessInfo successinfo = new SuccessInfo(HttpStatus.CREATED.value(), HttpStatus.CREATED,
				ConstantMessages.INSERTMSG, voter.getvoterId());
		return new ResponseEntity<>(successinfo, HttpStatus.CREATED);
	}

	@ApiOperation("This is to get Voters by id from the database")
	@GetMapping("/getVoterById={voterId}")
	public Voter getById(@PathVariable("voterId") int voterId) {
		return iVoterService.getVoterById(voterId);
	}

	@ApiOperation("This is to view all the Voters available in the database")
	@GetMapping("/viewAllTheVoters")
	public List<Voter> processGet() {
		return iVoterService.getAllVoter();
	}
	
	@ApiOperation("This is to update the Voter available in the database")
	@PutMapping("/updateVoterById={voterId}")
	public ResponseEntity<SuccessInfo> processPut(@RequestBody Voter voter) {
		iVoterService.updateVoter(voter);
		SuccessInfo successinfo = new SuccessInfo(HttpStatus.CREATED.value(), HttpStatus.CREATED,
				ConstantMessages.UPDATEMSG, voter.getvoterId());
		return new ResponseEntity<>(successinfo, HttpStatus.CREATED);
	}
	
	@ApiOperation("This is to delete the Voter by id from the database")
	@DeleteMapping("/deleteVoterById={voterId}")
	public ResponseEntity<SuccessInfo> deleteVoterById(@PathVariable("voterId") int voterId) {
		iVoterService.deleteVoterById(voterId);
		SuccessInfo successInfo = new SuccessInfo(HttpStatus.CREATED.value(), HttpStatus.CREATED,
				ConstantMessages.DELETEMSG, voterId);
		return new ResponseEntity<>(successInfo, HttpStatus.CREATED);
	}
}
