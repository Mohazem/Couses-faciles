package com.coursefacile.dao;

import com.coursefacile.model.Mission;
import com.coursefacile.model.User;

import java.util.List;

public interface IMissionHandler {
    boolean add(Mission mission);

    boolean update(Mission mission);

    boolean delete(Mission mission);

    Mission get(int missionId);

    List<Mission> relatedMissions(int cityId, int missionId);

    int getScore(User user);

    List<Mission> getMissions(String cityId, String date, String from, String to, String minP, String maxP, int start, int end);

    int getCountMissions(String cityId, String date, String from, String to, String minP, String maxP);
}
