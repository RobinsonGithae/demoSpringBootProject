package com.example.demo.Topics;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
//spring boot registers all services marked with the @service annotation
@Service
public class TopicsService {
    //spring boot instanciates this service automatically
    //the service can have business logic
//spring services are singletons

//Add a dummy data variable
    private List<Topic> allTopicsAsAList= Arrays.asList(
            new Topic("Topic1","Java","A java core tutorial"),
            new Topic("Topic2","HTML","AN Html core tutorial"),
            new Topic("Topic3","CSS","A CSS core tutorial"),
            new Topic("Topic4","JavascriptL","A Javascript core tutorial")
    );





    public Topic getTopicAsTopicObject(){
        return new Topic("Topic2","HTML","AN Html core tutorial");
    }

    public List getTopicAsLst(){
        return allTopicsAsAList;
    }
    public Topic filterTopicById(String id){
        //filter the all topicAsList contents to return the requested id

        return allTopicsAsAList.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }
}
