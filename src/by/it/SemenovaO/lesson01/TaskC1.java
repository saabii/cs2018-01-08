package by.it.SemenovaO.lesson01;


public class TaskC1{
	public static void main (String[] args) {
		System.out.printf("%-8s%8s%8s%8s%n","bin","dec","oct","hex");
		System.out.println("--------------------------------");
		
		// Бинарный формат числа
		
		for (byte i=-128; i<128;  i++) {
		String binary = Integer.toBinaryString(i); 		
		if (binary.length()>8) binary=binary.substring(binary.length()-8);
		binary = String.format("%8s", binary).replace(" ", "0");
			
		System.out.printf("%8s%8d", binary, i);
       
		
		 // Восьмеричная форма
		
		 String octal = Integer.toOctalString(i);
		 				
			if (i < 0){
			octal = Integer.toOctalString(-i);
				System.out.printf("%8s","-"+octal);
			}
			else 
			{octal = Integer.toOctalString(i);	
			System.out.printf("%8s", octal);
			}

		
		// Шеснадцатиричная форма
	   String hex = Integer.toHexString(i);
		if (i < 0){
		hex = Integer.toHexString(-i);
		System.out.printf("%8s%n","-"+hex);
		}
		else
		{			
        hex = Integer.toHexString(i);
        System.out.printf("%8s%n", hex);}
		
		if (i==127)
			break;
       
		}
	}
}	