package dev.service;

@org.springframework.stereotype.Service
public class ServiceImpl2 implements Service {

	@Override
	public String info() {
		return "IMPL 2";
	}
}
