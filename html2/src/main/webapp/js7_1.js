/**
 * 구구단 5단 결과값 모두 더하여 getter로 전송
 */
 
 function a1(){
	var total = 0;
	
	for(f=1;f<10;f++)
	{
		total+=6*f;
		
	}
	var result = re(total);
	console.log(result);
	
}