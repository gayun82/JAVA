package com.yedam.java.hw;

public class PortableNotebook implements Notebook, Tablet{
	private int mode;
	private String document;
	private String brower;
	private String video;
	private String app;
	
	
	public PortableNotebook(String document, String brower, String video,String app) {
		super();
		this.mode = Notebook.NOTEBOOK_MODE;
		this.searchInternet();
	}
	
	@Override
	public void writeDocumentaion() {
		System.out.println(document + "을 통해 문서 작성");
	}

	@Override
	public void searchInternet() {
		System.out.println(brower + "을 통해 인터넷을 검색");
		
	}
	
	@Override
	public void watchVideo() {
		System.out.println("'영상종류'를 시청.");
						
	}
	
	@Override
	public void useApp() {
		if(this ) {
			System.out.println("'앱종류'를 실행.");
		}else {
			System.out.println("'앱종류'를 실행.");
		}
	}
	


		
	public void changeMode() {
		if(this.mode {
			System.out.println(" TABLET_MODE -> NOTEBOOK_MODE.");
		}else {
			System.out.println("'NOTEBOOK_MODE -> TABLET_MODE.");
	}
	}
}


