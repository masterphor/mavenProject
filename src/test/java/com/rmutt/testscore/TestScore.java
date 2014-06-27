package com.rmutt.testscore;

import com.rmutt.score.Score;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TestScore extends TestCase{

	public void test_errorscore()
	{
		Assert.assertEquals(Score.grade(101), "Error input score 1-100");
		Assert.assertEquals(Score.grade(-1), "Error input score 1-100");	
	}
	
	public void test_gradeA(){
		Assert.assertEquals(Score.grade(80), "Score : 80 You Grade : B+");
		Assert.assertEquals(Score.grade(79), "Score : 79 You Grade : B+");
	}
	
	public void test_gradeBplus(){
		Assert.assertEquals(Score.grade(75), "Score : 75 You Grade : B+");
		Assert.assertEquals(Score.grade(74), "Score : 74 You Grade : B");
	}
	
	public void test_gradeB(){
		Assert.assertEquals(Score.grade(70), "Score : 70 You Grade : C+");
		Assert.assertEquals(Score.grade(69), "Score : 69 You Grade : C+");
	}
	
	public void test_gradeCplus(){
		Assert.assertEquals(Score.grade(65), "Score : 65 You Grade : C+");
		Assert.assertEquals(Score.grade(64), "Score : 64 You Grade : C");
	}
	
	public void test_gradeC(){
		Assert.assertEquals(Score.grade(60), "Score : 60 You Grade : C");
		Assert.assertEquals(Score.grade(59), "Score : 59 You Grade : D+");
	}
	
	public void test_gradeDplus(){
		Assert.assertEquals(Score.grade(55), "Score : 55 You Grade : D+");
		Assert.assertEquals(Score.grade(54), "Score : 54 You Grade : D");
	}
	
	public void test_gradeD(){
		Assert.assertEquals(Score.grade(50), "Score : 50 You Grade : D");
		Assert.assertEquals(Score.grade(49), "Score : 49 You Grade : F");
	}
	
	public void test_gradeF(){
		Assert.assertEquals(Score.grade(49), "Score : 49 You Grade : F");
		Assert.assertEquals(Score.grade(0), "Score : 0 You Grade : F");
	}
	
}// end of Class
