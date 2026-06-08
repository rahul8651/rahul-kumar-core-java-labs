package com.ibm.core.java.Day3.Classroom;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class HttpClientDemo {
	
	
	public static void main(String[] args) throws IOException,InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Integer Value: ");
		int random=sc.nextInt();
		
		String url="https://jsonplaceholder.typicode.com/users/"+random;
		
		
		HttpClient client=HttpClient.newHttpClient();
		HttpRequest request=HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
		HttpResponse<String> response=client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.statusCode());;
		System.out.println(response.body());
		sc.close();
		
	}

}
