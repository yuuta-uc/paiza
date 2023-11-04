// https://paiza.jp/works/mondai/skillcheck_archive/word_chain

import java.util.*;

public class WordChain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int m = sc.nextInt();

        ArrayList<String> wordList = new ArrayList<>();
		ArrayList<String> log = new ArrayList<>();
		ArrayList<Boolean> alive = new ArrayList<>();
		ArrayList<String> usedLog = new ArrayList<>();

		for (int i = 0; i < k; i++) {
			wordList.add(sc.next());
		}
		
        for (int i = 0; i < m; i++) {
			log.add(sc.next());
		}
		
		for (int i = 0; i < n; i++) {
			alive.add(true);
		}

	    boolean rule2_flag = true;
		int speaker = 0;

		for (int i = 0; i < log.size(); i++) {
			
			if(rule1(log.get(i), wordList) 
			&& rule2(i, log, wordList, rule2_flag)
			&& rule3(log.get(i), usedLog)
			&& rule4(log.get(i))) 
		    {
				rule2_flag = false;
			} 
			else {
				alive.set(speaker,false);
				rule2_flag = true;
			}
			
			usedLog.add(log.get(i));
			speaker = is_alive(alive, speaker + 1);
		}

		long trueCount = alive.stream().filter(b -> b == true).count();

		System.out.println(trueCount);
		
		for (int i = 0; i < alive.size(); i++) {
			if (alive.get(i) == true) {
				System.out.println(i + 1);
			}
		}
		sc.close();
	}

    public static int is_alive(ArrayList<Boolean> alive, int speaker) {
		while (true) {
			if (speaker >= alive.size()) {
				speaker = 0;
			} 

			if (alive.get(speaker) == true) {
				return speaker;
			}
			speaker += 1;
		}
	}


	public static boolean rule1(String word, ArrayList<String> wordList) {
		return wordList.contains(word);
	}

	// public static boolean rule2(String word, String beforeWord, boolean rule2_flag) {
	// 	if (rule2_flag == false) {
	// 		System.out.println("2");
	// 		return  beforeWord.charAt(-1) == word.charAt(0);
	// 	} else {
	// 		return true;
	// 	}
	// }

	public static boolean rule2(int i, ArrayList<String> log, ArrayList<String> wordList, boolean rule2_flag) {
		if (rule2_flag == false && i > 0) {
			return  log.get(i - 1).charAt(log.get(i-1).length() - 1) == log.get(i).charAt(0);
		} else {
			return true;
		}
	}

	public static boolean rule3(String word, ArrayList<String> usedLog) {
		return  !usedLog.contains(word);
	}

	// public static boolean rule3(String word, ArrayList<String> usedLog) {
	// 	if(usedLog.contains(word)){
	// 		System.out.println("ruls3 seikou");
	// 		return true;
	// 	} else {
	// 		System.out.println("rule3 sippp");
	// 		return false;
	// 	}
	// }

	public static boolean rule4(String word) {
		return  !word.endsWith("z");
	}

	// public static boolean rule4(String word) {
	// 	 if(!word.endsWith("z")) {
	// 		return true;
	// 	 } else {
	// 		System.out.println("rule4 fail");
	// 		return false;
	// 	 }
	// }
}
