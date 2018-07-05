import java.util.ArrayList;

/* 10001 Prime Number*/

public class Problem7 {
	
	public boolean mPrimeNoCheck1(int mNum) {
		int count=0;
		for(int x=1; x<=mNum; x++) {
			//mNum is a number we are checking to find whether it is a prime number
			//If mNum is a prime
			if(mNum%x == 0) {
				count++;
				//If count reaches a value of 3 then the method returns false as this tell us that it has more than 2 factors thus it cannot be a prime number. 
				if(count == 3) {
					//System.out.println(mNum+" is not a prime number this was found out on the "+countX+" iterative");
					return false;
				}
			}	
		}
		//After the forloop if count = 2 then mNum most be a prime number and the method returns true else return false
		if(count == 2) {
			//System.out.println(mNum+" is a prime number");
			return true;
			
		}else {
			//System.out.println(mNum+" is not a prime number this was found out on the "+countX+" iterative");
			return false;
		}
	}
	
	
	public void mPrimeNoCheck2(int x) {
		ArrayList<Integer> mPrimeList = new ArrayList();
		int mTempNum = 1; 
		while(mPrimeList.size() < x) {
			if(mPrimeNoCheck1(mTempNum) == true) {
				mPrimeList.add(mTempNum);
			}
			mTempNum++;
		}		
	}

	public static void main(String args[]) {
		
		Problem7 mClassObj = new Problem7();
		
		mClassObj.mPrimeNoCheck2(10001);

		
		
		
		
	}
}