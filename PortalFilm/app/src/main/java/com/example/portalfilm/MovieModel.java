package com.example.portalfilm;

import com.google.gson.annotations.SerializedName;

public class MovieModel {


    @SerializedName("title")
    private String JudulFilm;

    @SerializedName("poster_path")
    private  String posterFilm;

    public String getJudulFilm() {
        return JudulFilm;
    }

    public void setJudulFilm(String judulFilm) {
        this.JudulFilm = judulFilm;
    }

    public String getPosterFilm() {
        return posterFilm;
    }

    public void setPosterFilm(String posterFilm) {
        this.posterFilm = posterFilm;
    }
    //setter and getter

    //kilk kanan generate pilih setter and getter




}
