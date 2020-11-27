package com.capg.lab10;
@FunctionalInterface
interface CredentialCheck{
	Boolean isValidCredentials(String uid,String pass);
}

public class Exercise3 {
	public static void main(String[] args) {
		CredentialCheck check=(uid,pass)->{
			if(uid.equals("admin") && pass.equals("admin@123")) {
				return true;
				
			}
			return false;
			
		};
		System.out.println(check.isValidCredentials("admin", "admin@12"));
		
	}

}
