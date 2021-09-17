package com.example.quizrecyclerveiwimage.model;

public class ModelClass {
    String name, topic, detail, time;

    public ModelClass(String name, String topic, String detail, String time) {
        this.name = name;
        this.topic = topic;
        this.detail = detail;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}


