package com.livekampus.friendservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.livekampus.friendservices.dao.FriendDao;
import com.livekampus.friendservices.entity.Friend;

@Service
public class FriendServicesImpl implements FriendServices{
		
	@Autowired
	private FriendDao dao;

	@Override
	public Friend addNewFriend(Friend friend) {
		return dao.save(friend);
	}

	@Override
	public Friend deleteFriend(Friend friend) {
	dao.delete(friend);
	return friend;
		
	}

	@Override
	public List<Friend> searchFriend(Friend friend) {
		return dao.findAll();
	}

	
}
