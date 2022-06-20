package com;

public class Coder  implements Comparable<Coder>{
	
	private int cid;
	private String cname;
	private String tech;
	public Coder(int cid, String cname, String tech) {
		super();
		this.cid=cid;
		this.cname=cname;
		this.tech=tech;
		}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid=cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname=cname;
		
	}
	public String getTech() {
		return tech;
	}
     
	public void setTech(String tech)
	{
		this.tech=tech;
	}
		public String toString() {
			return "Coder[cid="  +cid + ", cname="+ cname +",tech=" + tech + "]";
		}
		 public int compareTo(Coder c) {
			 //int i=this.cid-c.cid;
			 //int i=this.cname.compareTo(c.cname);
			 int i=this.tech.compareTo(c.tech);
			 return i;
		}
	}

