import java.io.*;
 
public class CheckSum {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("file.txt"));
		String testInput = "";
	    String line = br.readLine();

	    while (line != null) {
	    	testInput += line;
	    	testInput += " ";
	        line = br.readLine();
	    }

		String[] answer = testInput.split("\\s+");
		int total = 0;
		int count = 0;
		int tempMin = Integer.parseInt(answer[0]);
		int tempMax = Integer.parseInt(answer[0]);
		for(int i = 0; i < answer.length; i++)
		{
			if(tempMin > Integer.parseInt(answer[i]))
			{
				tempMin = Integer.parseInt(answer[i]);
			}
			else if(tempMax < Integer.parseInt(answer[i]))
			{
				tempMax = Integer.parseInt(answer[i]);
			}
			
			if(count == 15)
			{
				total += tempMax - tempMin;
				if(i < answer.length-1)
				{
					tempMin =  Integer.parseInt(answer[i+1]);
					tempMax =  Integer.parseInt(answer[i+1]);;
				}
				count = -1;
			}
			count++;
		}
		System.out.print(total);
	}
}
