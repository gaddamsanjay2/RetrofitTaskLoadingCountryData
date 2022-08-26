package com.example.retrofittaskloadingcountrydata;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CompanyModel {

    private String CompanyName;
    private String url;
    private String Team;
    private String TeamLeader;


    @SerializedName("Details")
    @Expose
    private DetailModel detailModel;

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = team;
    }

    public String getTeamLeader() {
        return TeamLeader;
    }

    public void setTeamLeader(String teamLeader) {
        TeamLeader = teamLeader;
    }

    public DetailModel getDetailModel() {
        return detailModel;
    }

    public void setDetailModel(DetailModel detailModel) {
        this.detailModel = detailModel;
    }

    public CompanyModel(String companyName, String url, String team, String teamLeader, DetailModel detailModel) {
        CompanyName = companyName;
        this.url = url;
        Team = team;
        TeamLeader = teamLeader;
        this.detailModel = detailModel;


    }
}
