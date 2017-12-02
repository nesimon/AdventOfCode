import java.io.BufferedReader;
import java.io.FileReader;
 
public class Challenge2Part2 {
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
		for(int i = 0; i < answer.length; i++)
		{
			int count2 = 0;
			for(int j = i; count2 != (15-count); j++)
			{
				if(Integer.parseInt(answer[i])%Integer.parseInt(answer[j]) == 0)
				{
					total += Integer.parseInt(answer[i])/Integer.parseInt(answer[j]);
				}
				if(Integer.parseInt(answer[j])%Integer.parseInt(answer[i]) == 0)
				{
					total += Integer.parseInt(answer[j])/Integer.parseInt(answer[i]);
				}
				count2++;
			}
			count++;
			if(count == 15)
			{
				count = 0;
			}
		}
		System.out.print(total);
	}
}
