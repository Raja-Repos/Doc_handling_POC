package docsStorage.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import docsStorage.com.model.Docs;
import docsStorage.com.repository.DocRepository;

@Service
public class DocsService{
	
	@Autowired
	DocRepository docRepo;
	
	//Save file function
	public Docs saveFile(MultipartFile file) {
		
		String name = file.getOriginalFilename();
		
		try {
			Docs doc = new Docs(name, file.getContentType(), file.getBytes());
			
			docRepo.save(doc);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	public List<Docs> getAllFile() {
				
		return docRepo.findAll();
	}
	
	

}
