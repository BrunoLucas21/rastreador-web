package com.facisa.tap.projeto.webCrawler;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;

public class Synchronous {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		String url = URLEncoder.encode("https://www.forextradingbig.com/7-reasons-why-you-should-quit-forex-trading/", StandardCharsets.UTF_8.name());
		
		HttpClient client = HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest.newBuilder()
				.GET()
				.uri(URI.create("https://api.proxycrawl.com/?token=INSERT_TOKEN&url=" + url))
				.build();
		
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		
		System.out.println(response.body());
		
	}

}
