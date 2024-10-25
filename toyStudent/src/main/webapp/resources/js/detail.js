const stdNo= new URLSearchParams(location.search).get("stdNo");



const goMain = document.querySelector("#goMain");

goMain.addEventListener("click",()=>{
	 
	 location.href="/";
});


const deleteBtn =document.querySelector("#deleteBtn");
deleteBtn.addEventListener("click",()=>{
	//삭제 버튼 (성공 시 메인페이지로, 실패 시 상세조회 화면으로)
	
	
	if(!confirm("삭제하시겠습니까")) 
		return;
		
		location.href="/studnet/delete?stdNo="+stdNo;
		
	
	
	
});

const updateBtn= document.querySelector("#updateBtn")

updateBtn.addEventListener("click",()=>{
	
location.href="/studnet/update?stdNo="+stdNo;
});
