package co.micol.prj20220504.dto;

import java.sql.Date;

public class NoticeVO {
	private int id;
	private String writer;
	private String title;
	private String contents;//내용
	private Date wdate;//작성일자
	private int hit;
	
	public NoticeVO() {
		
	}
	
	
	
	public int getId() {
		return id;
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getWdate() {
		return wdate;
	}
	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	@Override
	public String toString() {
		System.out.println(id + " : ");
		System.out.println(writer + " : ");
		System.out.println(title + " : ");
		System.out.println(wdate + " : ");
		System.out.println(hit);
		return null;
	}
	
	
}
