package com.livekampus.friendservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.livekampus.friendservices.entity.Friend;
import com.livekampus.friendservices.services.FriendServices;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/friend")
public class FriendController {

	@Autowired
	private FriendServices services;

	@PostMapping("/user/{userName}/")
	public ResponseEntity<Friend> addNewfriend(Friend friend) {
		Friend friend1 = services.addNewFriend(friend);
		return new ResponseEntity<Friend>(friend1, HttpStatus.ACCEPTED);

	}

	@GetMapping("/user/{userName}/")
	public ResponseEntity<Friend> delete(@PathVariable Friend friend) {
		System.out.println(friend);

		Friend friend1 = services.deleteFriend(friend);
		if (friend1 != null) {
			return new ResponseEntity<Friend>(friend1, HttpStatus.OK);
		}
		return new ResponseEntity<Friend>(HttpStatus.NOT_FOUND);

	}

	@GetMapping("/user{userName}/")
	public ResponseEntity<List<Friend>> searchFriend(@PathVariable Friend friend) {
		Friend friend1 = (Friend) services.searchFriend(friend);
		if (friend1 != null) {
			return new ResponseEntity<List<Friend>>(HttpStatus.OK);
		}
		return new ResponseEntity<List<Friend>>(HttpStatus.NOT_FOUND);
	}

}
