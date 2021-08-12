package com.example.jun.demo;

import com.example.jun.demo.calculator.entity.Item;
import com.example.jun.demo.calculator.entity.User;
import com.example.jun.demo.calculator.repository.ItemRepository;
import com.example.jun.demo.calculator.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired private UserRepository userRepository;
	@Autowired private ItemRepository itemRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("######## Application Beginning #########");
		userRepository.deleteAll();
		userRepository.save(new User(1, "유관순", "Alice", "alice@test.com", "1", new Date()));
		userRepository.save(new User(2, "김길동", "Bob", "Bob@test.com", "1", new Date()));
		userRepository.save(new User(3, "홍길동", "Charlie", "Charlie@test.com", "1", new Date()));
		List<User> users = userRepository.findAll();
		System.out.println("Print All Users");
		for (User u : users){
			System.out.println(u.toString());
		}
		System.out.println("Print only bob");
		for (User u : userRepository.findAllByName("Bob")){
			System.out.println(u.toString());
		}
		itemRepository.deleteAll();
		itemRepository.save(new Item(1, "갤럭시Z", 200, "신제품", new Date()));
		itemRepository.save(new Item(2, "노트북", 150, "지문인식", new Date()));
		itemRepository.save(new Item(3, "데스크탑", 100, "게이밍", new Date()));
		List<Item> items = itemRepository.findAll();
		System.out.println("Print All Items");
		for (Item u : items){
			System.out.println(u.toString());
		}
	}
}
