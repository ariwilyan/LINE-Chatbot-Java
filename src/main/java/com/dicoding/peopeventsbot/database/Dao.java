package com.dicoding.peopeventsbot.database;

import com.dicoding.peopeventsbot.model.JointEvents;
import com.dicoding.peopeventsbot.model.User;

import java.util.List;

public interface Dao
{
    public List<User> get();
    public List<User> getByUserId(String aUserId);
    public int registerLineId(String aUserId, String aLineId, String aDisplayName);
    public int joinEvent(String aEventId, String aUserId, String aLineId, String aDisplayName);
    public List<JointEvents> getEvent();
    public List<JointEvents> getByEventId(String aEventId);
    public List<JointEvents> getByJoin(String aEventId, String aUserId);
}