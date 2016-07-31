import java.util.List;

import kr.co.shineware.nlp.komoran.core.analyzer.Komoran;
import kr.co.shineware.util.common.model.Pair;

public class main 
{
	public static void main(String args[])
	{
		System.out.println("test");
		
		Komoran komoran = new Komoran("/Users/apple/Desktop/Programmingfile/Java/models");
		
		List<List<Pair<String,String>>> result = komoran.analyze(""
				+ "안녕하세요? 좋은 아침입니다.");
		
		for (List<Pair<String, String>> eojeolResult : result) 
		{
			for (Pair<String, String> wordMorph : eojeolResult) 
			{
				System.out.println(wordMorph);
			}
			
			System.out.println();
		}

	}
}

