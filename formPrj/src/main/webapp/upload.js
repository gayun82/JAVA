document.addEventListener('DOMContentLoaded', function () { //코드실행 다 하고 실행
	tbl = document.querySelector('#show table');
	let capt = document.createElement('caption');
	capt.innerHTML = '회원리스트';
	tbl.append(capt); //tbl이 null값임(이벤트리스러하기전에)

	//리스트 출력
	let ajax = new XMLHttpRequest();
	ajax.open('get', 'member?cmd=list');
	ajax.send();
	ajax.onload = function () {
		let data = JSON.parse(this.responseText);

		let tbody = document.querySelector('#show tbody');
		data.forEach(member => {
			tbody.append(makeTr(member));
		})
	}
	//form 기본 기능 => ajax처리(XMLHttpRequest, fetch)둘다 ajax
	document.forms.memberFrm.addEventListener("submit", function (e) {
		e.preventDefault(); //기본기능 차단
		let formData = new FormData(e.target); //e.target = form

		for (let ent of formData.entries()) {
			console.log(ent);
		};
		fetch('memberUpload', {
				method: 'post',
				body: formData
			}) //get: url.post: 추가정보지정.
			.then(function (result) {
				return result.json();
			})
			.then(function (result) {
				console.log(result);
			})
			.catch(function (err) {
				console.error(err);
			})
	})


});



let fields = ['memebNo', 'membName', 'membPhone', 'membAddr', 'membBirth', 'membImage'];

function makeTr(member) {
	let tr = document.createElement('tr');
	tr.setAttribute('id', member.memebNo); //tr의 attribute중에 id활용
	//tr.addEventListener('click',showDetail);
	fields.forEach(field => {
		let td = document.createElement('td');
		//null,0,undefined, '' => false 이외 ture;
		td.innerHTML = member[field] ? (field == 'membImage' ? '<img width="60px" src="images/' + member[field] + '">' : member[field]) : '';
		//td.innerHTML = member[field];
		tr.append(td);
	})

	//삭제버튼
	let btn = document.createElement('button');
	btn.innerHTML = '삭제';
	btn.addEventListener('click', rowDelete, false); //bubble,capture
	let td = document.createElement('td');
	td.append(btn);
	tr.append(td);
	//체크박스 .input type = 'checkbox'
	let chk = document.createElement('input');
	chk.setAttribute('type', 'checkbox');
	td = document.createElement('td')
	tr.append(td);
	td.append(chk);



	return tr;
}

function rowDelete() {
	let delId = this.parentElement.parentElement.getAttribute('id'); //this는 button
	let formData = new FormData();
	formData.append("cmd", "delete");
	formData.append("delId", delId);
	//id=32&name=hong
	fetch('memberUpload', {
			method: 'post',
			headers: {
				'Content-type': 'application/x-www-form-urlencoded'
			},
			body: `cmd=delete&delId=${delId}`
		})
		.then(function (result) {
			return result.json();
		})
		.then(function (result) {
			console.log(result);
			//화면에서 지우도록 기능추가
		})
		.catch(function (err) {
			console.error(err);
		})
}