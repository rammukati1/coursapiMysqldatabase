package io.javacoder.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicsService implements ITopicsService {

	private List<Topics> topics =  new ArrayList <> (Arrays.asList(new Topics("1","head first","to learn java"),
												new Topics("2" , "c" ,"learn c")))  ;
	@Autowired
	private TopicsRepository topicsRepository ;
	
	
	public List <Topics> getAllTopics() {
//		return topics;
		List<Topics> topics = new ArrayList<>();
		topicsRepository.findAll().forEach(topics::add);
		return topics; 
	}
	
	public Optional<Topics> getTopics(String id) {
//		return topics.stream().filter( t -> t.getId().equals(id)).findFirst().get();
		List<Topics>topics =new ArrayList<>();
		return 	topicsRepository.findById(id);
	
	}

	public void  addTopics(Topics topic) {
		// TODO Auto-generated method stub
//		topics.add(topic);
		topicsRepository.save(topic);
	}

	public void updateTopics(Topics topic, String id) {
		for(int i = 0 ;i <topics.size();i++) {
			Topics t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
			}
		}
	}

	public void deleteTopics(String id) {
		// TODO Auto-generated method stub
		topicsRepository.deleteById(id);
		
	}

	@Override
	public Optional<Topics> findById(String id) {
		// TODO Auto-generated method stub
		return topicsRepository.findById(id);
	}
	
}
