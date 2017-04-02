function addMessage(){
	
	var eleAddMessage = document.getElementById("addMessage");
	eleAddMessage.style.display = "block";
	
	var input = document.createElement('input');
	input.name = "method";
	input.value = "addMessage";
	input.style.display = "none";
	eleAddMessage.appendChild(input);
	
//	alert(eleAddMessage.style.diplay);
}

function alterMessage(index){
	var eleAddMessage = document.getElementById("alterMessage");
	eleAddMessage.style.display = "block";
	
	var input = document.createElement('input');
	input.name = "method";
	input.value = "alter";
	input.style.display = "none";
	eleAddMessage.appendChild(input);
	
	var input = document.createElement('input');
	input.name = "id";
	input.value = index;
	input.style.display = "none";
	eleAddMessage.appendChild(input);
	
	var input = document.createElement('input');
	input.name = "commandSearch";
	input.value = document.getElementById("commandSearch").value;
	input.style.display = "none";
	eleAddMessage.appendChild(input);
	
	var input = document.createElement('input');
	input.name = "descriptionSearch";
	input.value = document.getElementById("descriptionSearch").value;
	input.style.display = "none";
	eleAddMessage.appendChild(input);
}

function addMessageCheck(){
	
	var addCommand = document.getElementById("addCommand");
	if(!addCommand.value){
		alert("请输入指令名称");
		return;
	}
	
	var addDescription = document.getElementById("addDescription");
	if(!addDescription.value){
		alert("请输入描述");
		return;
	}
	
	var addContent = document.getElementById("addContent");
	if(!addContent.value){
		alert("请输入内容");
		return;
	}
	
	document.getElementById("addMessage").submit();
}