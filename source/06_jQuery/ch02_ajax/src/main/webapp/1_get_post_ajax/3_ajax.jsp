<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
	<script>
		$(document).ready(function(){
			/*
			$.get(요청경로, callback)  
			$.post(요청경로, 요청파라미터값의 객체, callback)
			$.ajax({	// 객체를 넘김({속성변수:속성값})
					url : 요청경로(★) ,
					type : get/post , // 생략시 get방식
					data : 요청 파라미터 이름과 값(get), 요청 파라미터 값의 객체(post) ,
					dataType : 'html'/'json'/... 요청한 경로로 실행한 결과의 타입 , // 안 쓰면 자동으로 html
					success : 요청경로 실행이 성공했을 경우, 수행할 콜백함수 (★) ,
					error : 요청경로 실행시 실패했을 경우, 수행할 콜백함수 (생략가능)
					});
			*/
			$('button').click(function(){
				var id = $('input[name="id"]').val();
				$.ajax({
					url : 'midConfirm.jsp',
					// type : 'get',
					// data : 'id='+id,
					type : 'post',
					data : {'id' : id},
					dataType : 'html',
					success : function(data){ /*data : 요청경로 성공시 응답받은 html*/
						$('span#idConfirm').html(data);
					},
					error : function(code){/*code : 요청경로 실패시 상태정보*/
						alert(code.status + '/' + code.statusText)	
					} //error 콜백함수
				}); // $.ajax함수
			}); // click함수
			
			$('input[name="id"]').keyup(function(){
				var id = $(this).val();
				if(id.length < 3){
					$('span#idConfirm').text('id는 3글자 이상');
				}else{
					$('button').click(function(){
						var id = $('input[name="id"]').val();
						$.ajax({
							url : 'midConfirm.jsp',
							// type : 'get',
							// data : 'id='+id,
							type : 'post',
							data : {'id' : id},
							dataType : 'html',
							success : function(data){ /*data : 요청경로 성공시 응답받은 html*/
								$('span#idConfirm').html(data);
							},
							error : function(code){/*code : 요청경로 실패시 상태정보*/
								alert(code.status + '/' + code.statusText)	
							} //error 콜백함수
						}); // $.ajax함수
					}); // click함수
				} //if
			}); // keyup
		});	// ready함수
	</script>
</head>
<body>
	아이디 <input type="text" name="id" autocomplete="off"> <button>중복체크</button><br>
	<span id="idConfirm"></span>
</body>
</html>





