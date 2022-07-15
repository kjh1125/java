
var iddata = [
	{
	"Person":['김수빈','김정민','오유나','김진수','김창순','이유림','하윤성']
	},
	{
	"Userid":['kimsubin','min1004','yuna0809','jinsulove','soon777','lim_lee79','hayunsung1313']
	}
];

var bool = false;

function idsearch(s){

	for(var f=0;f<iddata[1]["Userid"].length;f++){
		
		if(s==iddata[1]["Userid"][f]){
			console.log("결과값 - 아이디 :"+iddata[1]["Userid"][f] +", 고객명 :"+iddata[0]["Person"][f]);
			bool = true;
			break;
		}
		
	}
	
	if(bool==false){
		
		console.log("없는 아이디입니다.")
	}
	
	
}