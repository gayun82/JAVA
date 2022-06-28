package co.edu.member;

public class MemberVO {
	private int memebNo;
	private String membName;
	private String membPhone;
	private String membAddr; 
	private String membBirth;
	private String membImage;
	public int getMemebNo() {
		return memebNo;
	}
	public void setMemebNo(int memebNo) {
		this.memebNo = memebNo;
	}
	public String getMembName() {
		return membName;
	}
	public void setMembName(String membName) {
		this.membName = membName;
	}
	public String getMembPhone() {
		return membPhone;
	}
	public void setMembPhone(String membPhone) {
		this.membPhone = membPhone;
	}
	public String getMembAddr() {
		return membAddr;
	}
	public void setMembAddr(String membAddr) {
		this.membAddr = membAddr;
	}
	public String getMembBirth() {
		return membBirth;
	}
	public void setMembBirth(String membBirth) {
		this.membBirth = membBirth;
	}
	public String getMembImage() {
		return membImage;
	}
	public void setMembImage(String membImage) {
		this.membImage = membImage;
	}
	@Override
	public String toString() {
		return "MemberVO [memebNo=" + memebNo + ", membName=" + membName + ", membPhone=" + membPhone + ", membAddr="
				+ membAddr + ", membBirth=" + membBirth + ", membImage=" + membImage + "]";
	}



}
