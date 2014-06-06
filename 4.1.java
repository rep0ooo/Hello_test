class Circle {
  public static void main(String args[])
     {
     	int i = Integer.valueOf(args[0]).intValue();
     	if(i<0)
     		System.out.println("negative");
     	else if(i==0)
     		System.out.println("Zero");
     	else if(i>0)
     		System.out.println("positive");
     }
}
