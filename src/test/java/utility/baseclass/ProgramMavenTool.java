package utility.baseclass;

public class ProgramMavenTool extends ParentClass {

	public static void main(String[] args) {
		
		
		browser("chromebrowser");	
Launchurl("https://www.facebook.com/");	
String pagetitle = getPagetitle();
System.out.println(pagetitle);

	
	}
	
	
	
}
