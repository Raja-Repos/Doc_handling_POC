package docsStorage.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import docsStorage.com.model.Docs;
import docsStorage.com.service.DocsService;

@RestController
@RequestMapping(path = "/docs")
public class DocController {

	@Autowired
	private DocsService docService;
	
	@PostMapping("/saveFile")
	public ResponseEntity<String> saveFile(@RequestPart MultipartFile file) {
		
		docService.saveFile(file);
		
		return new ResponseEntity<>(file.getOriginalFilename()+" file saved successfully!!",HttpStatus.OK);
	}
	
	@GetMapping(path = "/getAllFiles")
	public ResponseEntity<Object> getFiles(){
		
		List<Docs> docs = docService.getAllFile();
		
		return new ResponseEntity<>(docs,HttpStatus.OK);
	}
	
}
