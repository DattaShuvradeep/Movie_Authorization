package com.example.demo.Service;


import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Movie;

@Service
public class KafkaConsumerService {
	
	@KafkaListener(topics= {"movie-app"})
	public void consumeMoviesData(@Payload List<Movie> movieList)
	{
		System.out.println(movieList);
	}
}
