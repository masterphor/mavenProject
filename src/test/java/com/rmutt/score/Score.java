package com.rmutt.score;

public class Score {
	
	public static void main(String[]args){
		
		System.out.println(grade(1));
		
	}
	
	public static String grade(int score){
		
		String result = null ;
		
		if(score<0 || score >100){
			result = "Error input score 1-100";
		}
		else if(score>=80 && score<=100){
			result = "Score : "+score+" You Grade : A";
		}
		else if(score>=75 && score<80){
			result = "Score : "+score+" You Grade : B+";
		}
		else if(score>=70 && score<75){
			result = "Score : "+score+" You Grade : B";
		}
		else if(score>=65 && score<70){
			result = "Score : "+score+" You Grade : C+";
		}
		else if(score>=60 && score<65){
			result = "Score : "+score+" You Grade : C";
		}
		else if(score>=55 && score<60){
			result = "Score : "+score+" You Grade : D+";
		}
		else if(score>=50 && score<55){
			result = "Score : "+score+" You Grade : D";
		}
		else if(score>=0 && score<50){
			result = "Score : "+score+" You Grade : F";
		}
		return result;		
	}
}
