package in.pwskills.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id  	//very imp note: write @Id and then it will import the pacakage u have to delete that package and impot id from jakarta.persistance.id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cid;
	@Column(name = "CNAME")
	private String cname;
	@Column(name = "CPHNO")
	private Long cPhNo;
	@Column(name = "CADDRESS")
	private String caddress;
	@Column(name = "BILLAMOUNT")
	private double billAmount;
	
	public Customer() {
		System.out.println("ZERO PARAMETERIZED CONSTRUCTOR IS CALLED");
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Long getcPhNo() {
		return cPhNo;
	}
	public void setcPhNo(Long cPhNo) {
		this.cPhNo = cPhNo;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cPhNo=" + cPhNo + ", caddress=" + caddress
				+ ", billAmount=" + billAmount + "]";
	}
	
	
	
	
}
