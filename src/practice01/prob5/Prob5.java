package practice01.prob5;

public class Prob5 {
	public static void main (String args[]) {
		for(int i=1 ; i<100; i++) {
			String[] s = Integer.toString(i).split("");
			int cnt=0;
			for(int j=0 ; j<s.length ; j++) {
				if(Integer.parseInt(s[j])%3==0 && Integer.parseInt(s[j])!=0) {
					cnt++;//cnt+=1, cnt=cnt+1
				}
			}
			if(cnt==2) {
				System.out.println(i+" 짝짝");
				
			}else if(cnt==1) {
				System.out.println(i+" 짝");
				
			}
		}
		
	}
}
