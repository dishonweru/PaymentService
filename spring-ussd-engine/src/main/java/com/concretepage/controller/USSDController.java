package com.concretepage.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.concretepage.entity.Article;
import com.concretepage.service.IArticleService;
import com.concretepage.entity.Menu;
import com.concretepage.service.IMenuService;

@Controller
@RequestMapping("ussd")
public class USSDController {
	@Autowired
	private IArticleService articleService;
	@Autowired
	private IMenuService menuService;
	@PostMapping("login/{id}")
	public ResponseEntity<String> getMenuByStageId(HttpServletRequest request, @PathVariable("id") Integer id) {
		String response = menuService.getMenuByStageId(request, id);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	@PostMapping("init")
	public ResponseEntity<String> getInitMenuXML(HttpServletRequest request) {
		Menu menu = menuService.getInitMenuXML(1,request);
		return new ResponseEntity<String>(menu.getXmlPayLoad(), HttpStatus.OK);
	}
	@PostMapping("article")
	public ResponseEntity<Void> addArticle(@RequestBody Article article, UriComponentsBuilder builder) {
        boolean flag = articleService.addArticle(article);
        if (flag == false) {
        	return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/article/{id}").buildAndExpand(article.getArticleId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	@PutMapping("article")
	public ResponseEntity<Article> updateArticle(@RequestBody Article article) {
		articleService.updateArticle(article);
		return new ResponseEntity<Article>(article, HttpStatus.OK);
	}
	@DeleteMapping("article/{id}")
	public ResponseEntity<Void> deleteArticle(@PathVariable("id") Integer id) {
		articleService.deleteArticle(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}	
} 