
$(document).ready(function() {
	
	$("#btn").on("click", function() {
		
		var name = $("#name").val();

		$.ajax({
			type : "post",
			url : "http://localhost:18787/corsA/corsAction.do",
			data : "name=" + name,
			success : function(customerVO) {
				$("#printLayer1").html("이름 : " + customerVO.name);
				$("#printLayer2").html("이메일 : " + customerVO.email);
				$("#printLayer3").html("도메인A 통신 성공!");
			},
			error : function() {
				alert("도메인A와의 통신 실패");
			}
		})
		
	})
	
	$("#clean").on("click", function() {
		$("#printLayer1").text("");
		$("#printLayer2").text("");
		$("#printLayer3").text("");;
	})
})
