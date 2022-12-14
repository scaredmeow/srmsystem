package com.code.srmsystem.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.code.srmsystem.model.Request;

@Component
public interface RequestDao {
    public boolean createRequests(Request request);

    public boolean createLatestRequests(Request request);

    public List<Request> getAllRequests();

    public List<Request> getRecentRequests();

    public List<Request> getSpecificRequests(String snumber);

    public Request getRequest(int RID);

    public boolean updateRequest(int RID, String method);
}
