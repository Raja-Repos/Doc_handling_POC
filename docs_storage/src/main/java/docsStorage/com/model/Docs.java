package docsStorage.com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "docs")
public class Docs implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer doc_Id;
	
	private String docName;
	
	private String docType;
	
	@Lob
	private byte[] docSize;

	public Docs(String docName, String docType, byte[] docSize) {
		super();
		this.docName = docName;
		this.docType = docType;
		this.docSize = docSize;
	}

	public Integer getId() {
		return doc_Id;
	}

	public void setId(Integer doc_Id) {
		this.doc_Id = doc_Id;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public byte[] getDocSize() {
		return docSize;
	}

	public void setDocSize(byte[] docSize) {
		this.docSize = docSize;
	}
	
	

}
