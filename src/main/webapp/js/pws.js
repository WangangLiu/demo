$(function(){
	$(".pws").hover(function(){
        $(".pwss").css("display","block")
    },$(this).click(function(){
        $(".pwss").css("display","none")
    }));
      $(".yc").hover(function(){
        $("#yc").css("display","block")
    },$(this).click(function(){
        $("#yc").css("display","none")
    }))
});
 
 
 /**
  * 轮播图
  */
 var index=0;
 var timer;
 $(function(){
     timer=setInterval("scroll()",1000);
 })
 function scroll(){
     //获得scroll_adv里面的img元素
     $(".tp img").hide();
     $(".tp img:eq("+index+")").show();
         index++;
     if(index==$(".tp img").size()){
         index=0;
     }
 } 
 
 function delet() {
    return confirm("是否删除");
 }
 function add() {
	return confirm("是否添加？");
 }
 function add1() {
	return confirm("添加角色信息");
 }
 function add2() {
	return confirm("添加成功~~");
 }
	 
 function GetTime() {
	var time = new Date();
	var year = time.getFullYear();
	var month = time.getMonth() + 1; // 月份从0开始
	var day = time.getDate(); // 注意是getDate()
	var hour = time.getHours();
	var minute = time.getMinutes();
	var sec = time.getSeconds();
	var timestring;
	if (minute < 10) {
		timestring = year + "年" + month + "月" + day + "日		" + hour + "时 :0"
				+ minute + "分 :" + sec+"秒";
	} else if (sec < 10) {
		timestring = year + "年" + month + "月" + day + "日		" + hour + "时 :"
				+ minute + "分 :0" + sec+"秒";
	} else {
		timestring = year + "年" + month + "月" + day + "日		" + hour+ "时 :"
				+ minute + "分 :" + sec +"秒";
	}
	$("#time1").html(timestring);
}
$(function() {
	window.setInterval("GetTime()", 1000);
});

function do_page(pageNo){
	$("[name='pageNo']").val(pageNo);
	$("form").submit();
}

	 
	 