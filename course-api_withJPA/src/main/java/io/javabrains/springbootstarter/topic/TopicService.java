package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		topicRepository.findEverything()
		.forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id ) {
		return topicRepository.findParticularTopic(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.addingNewTopic(topic.getId(),topic.getName(),topic.getDescription());
		
	}
	//public void addTopic(Topic topic) {
	//	topicRepository.addingNewTopic(topic);
	//}

	public void updateTopic(String id, Topic topic) {
		topicRepository.updatingTopic(id,topic.getId(),topic.getName(),topic.getDescription());
		
	}

	public void deleteTopic(String id) {
		topicRepository.deletingTopic(id);
		
	}
			
	
}
