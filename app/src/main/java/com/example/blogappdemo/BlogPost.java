package com.example.blogappdemo;

import java.sql.Timestamp;
import java.util.Date;

public class BlogPost extends BlogPostId{

    public String image_url;
    public String desc;
    public String image_thumb;


    public Date timestamp;
    public String user_id;

    public BlogPost(String image_url, String desc, String image_thumb, Date timestamp, String user_id) {
        this.image_url = image_url;
        this.desc = desc;
        this.image_thumb = image_thumb;
        this.timestamp = timestamp;
        this.user_id = user_id;
    }

    public BlogPost(){}


    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage_thumb() {
        return image_thumb;
    }

    public void setImage_thumb(String image_thumb) {
        this.image_thumb = image_thumb;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }



}
