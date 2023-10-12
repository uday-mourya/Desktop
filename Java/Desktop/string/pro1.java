class Test
{
	public static void main(String [] args)
	{
		String s1="Kamal";
		String s2=new String("Kamal");
		String s3="Systems";
		
		System.out.println(s2.indexOf('m'));
		
		System.out.println(s3.lastIndexOf('t'));
		
		System.out.println(s3.lastIndexOf('m'));
		
		System.out.println(s3.lastIndexOf('s'));
		
		System.out.println(s3.charAt(2));
		
		System.out.println(s3.length());
								
		System.out.println(s3.trim());
		
		System.out.println(s3.toUpperCase());
		
	        System.out.println(s2.toLowerCase());
	        
		//System.out.println(s2.charAt(6));
		System.out.println(s3.substring(2));
		
		System.out.println(s3.substring(1,5));
		
		System.out.println(s3.trim());//remove blank Space
	}
	
	
}	
