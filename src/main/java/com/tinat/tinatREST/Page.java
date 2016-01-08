package com.tinat.tinatREST;

public class Page {
	
	private String title;
	private String paragraph1;
	private String paragraph2;
	private int pageNumber;
	
	public Page(int pageNumber){
		this.title="New Title";
		this.paragraph1="New Paragraph 1";
		this.paragraph2="New Paragraph 2";
		this.pageNumber = pageNumber;
	}

	public String getTitle() {
		return title;
	}

	public String getParagraph1() {
		return paragraph1;
	}

	public String getParagraph2() {
		return paragraph2;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	

}
