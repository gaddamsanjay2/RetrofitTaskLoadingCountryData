package com.example.retrofittaskloadingcountrydata;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JsonResponse {

    public JsonResponse(List<CompanyModel> companyModelList) {
        this.companyModelList = companyModelList;
    }

    @SerializedName("companys")
    @Expose
   private List<CompanyModel> companyModelList;

    public List<CompanyModel> getCompanyModelList() {
        return companyModelList;
    }

    public void setCompanyModelList(List<CompanyModel> companyModelList) {
        this.companyModelList = companyModelList;
    }
}
