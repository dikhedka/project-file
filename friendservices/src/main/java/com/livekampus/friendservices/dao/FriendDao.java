package com.livekampus.friendservices.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.livekampus.friendservices.entity.Friend;


@Repository
public interface FriendDao extends MongoRepository<Friend, String>{

}
