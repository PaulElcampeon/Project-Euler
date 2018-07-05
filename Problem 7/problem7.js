
	function mPrimeNoCheck1(mNum) {
		var count=0;
		var countX=0;
		
			//If mNum is a prime
			if(mNum%x == 0) {
		for(var x=1; x<=mNum; x++) {
			//mNum is a number we are checking to find whether it is a prime number
				count++;
				countX++;
				if(countX == 3) {
					//document.write(mNum+" is not a prime number this was found out on the "+countX+" iterative <br>");
					return false;
				}
			}	
		}
		if(count == 2) {
			//document.write(mNum+" is a prime number <br> <br>");
			return true;
		}else {
			//document.write(mNum+" is not a prime number this was found out on the "+countX+" iterative <br> <br>");
			return false;
		}
	}

	function mPrimeNoCheck2(x) {

		var mPrimeList = [];

		var mTempNum = 1; 
		
		while(mPrimeList.length < x) {
			if(mPrimeNoCheck1(mTempNum) == true) {
				mPrimeList.push(mTempNum);
			}
			mTempNum++;
		}
		
	}
	
	
		
	mPrimeNoCheck2(10001);
	
	