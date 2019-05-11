package com.livekampus.friendservices.services;

import java.util.List;

import com.livekampus.friendservices.entity.Friend;

public interface FriendServices {
			
	public Friend addNewFriend(Friend friend);
	public Friend deleteFriend(Friend friend);
	public List<Friend> searchFriend(Friend friend);
}
