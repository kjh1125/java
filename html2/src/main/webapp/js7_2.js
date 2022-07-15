/**
 * 20~40까지의 합을 모두 더하여 getter로 전송
 */
 
 function b1(){
	
	var total=0;
	for(f=20;f<41;f++)
	{
		total+=f;
		
	}
	
	var result = rb(total);
	console.log(result);
	
}