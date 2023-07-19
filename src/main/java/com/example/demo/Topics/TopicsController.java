package com.example.demo.Topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//annotate as RestController to mark the class as a restful resource that can avail its members for API CALLS

@RestController
public class TopicsController {
    // A controller is a resource. Coresponding mappings/url path are defined here for API calls.
    //create a private variable of topicService instance.
    // Add the auto wired annotation since the controller will depend on the topic service -- in the variable
    // (Inject the dependency with @auto wired - spring boot manages dependency injection aka Inversion Of Control)
    @Autowired
    private TopicsService topicservvice;
    //with this injection we have a topic service instance available

    @GetMapping("/topicObject/")
   public Topic getTopicObjects(){
        //Map all get requests to the above path and perform all functionlity in the method mapped/matched
        //Spring can do conversion to json irregardless of type
        // i.e Topics type or List type are both returned to an api call as Json
        return topicservvice.getTopicAsTopicObject();
    }

    @GetMapping("/topicList/")
    //Map all get requests to the above path and perform all functionlity in the method mapped/matched below
    public List getTopicList(){
        return topicservvice.getTopicAsLst();
    }

    @GetMapping("/topic/{topicid}")
    //add curly braces to accept parameters from the user.
    public Topic getTopicById(@PathVariable("topicid") String Id) {

        return topicservvice.filterTopicById(Id);

    }




}
