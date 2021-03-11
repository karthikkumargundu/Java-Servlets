package com.ltts.demowebproject.model;

public class User {
		private String emailid;
		private int mobile;
		private String name;
		private String password;
		private String address;
		private int DOB;
		public User(String emailid, int mobile, String name, String password, String address, int dOB) {
			super();
			this.emailid = emailid;
			this.mobile = mobile;
			this.name = name;
			this.password = password;
			this.address = address;
			DOB = dOB;
		}
		public String getEmailid() {
			return emailid;
		}
		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}
		public int getMobile() {
			return mobile;
		}
		public void setMobile(int mobile) {
			this.mobile = mobile;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getDOB() {
			return DOB;
		}
		public void setDOB(int dOB) {
			DOB = dOB;
		}
		@Override
		public String toString() {
			return "User [emailid=" + emailid + ", mobile=" + mobile + ", name=" + name + ", password=" + password
					+ ", address=" + address + ", DOB=" + DOB + "]";
		}
		
		
}

		