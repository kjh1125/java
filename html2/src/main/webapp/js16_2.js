
var namedata = [
	{
	"Person":['김수빈','김정민','오유나','김진수','김창순','이유림','하윤성']
	},
	{
	"Email":['kim@nate.com','jungmin@gmail.com','ouna123@gmail.com','kimjsu@nate.com','soon0707@naver.com','limlee@gmail.com','hayounsong@naver.com']
	}
];


var bool = false;

function namesearch(s){

	for(var f=0;f<namedata[0]["Person"].length;f++){
		
		if(s==namedata[0]["Person"][f]){
			return ("결과값 - 고객명 :"+namedata[0]["Person"][f] +", 이메일 :"+namedata[1]["Email"][f]);
			bool = true;
			break;
		}
		
	}
	
	if(bool==false){
		
		return("없는 이름입니다.");
	}
	
	
}