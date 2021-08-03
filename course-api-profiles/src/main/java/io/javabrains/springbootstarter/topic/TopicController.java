package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TopicController {
	@Autowired
	private TopicService topicService;
	
	@Autowired
	Topic topic_ini = new Topic();
	
	@RequestMapping("/initial_topics")
	public List<Topic> initialTopic(){
		topic_ini.getId();
		topic_ini.getName();
		topic_ini.getDescription();
		List<Topic> L =new ArrayList<>();
		L.add(topic_ini);
		
		return L;
	}
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopic() {
		return topicService.getAllTopics();
				
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping( method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping( method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id) {
		topicService.updateTopic(id, topic);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		 topicService.deleteTopic(id);
	}
}
