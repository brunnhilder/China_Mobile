$(function() {
	//初始化
	init();
})

//初始化函数
function init(){
	//初始化显示积分列表的表格
	initScoreTab();
}

//初始化积分列表的函数
function initScoreTab(){
	//初始化bootstrap-table的内容
    $('#score_list_table').bootstrapTable({
        method : 'get',
        url: 'gs',
        contentType: "application/x-www-form-urlencoded",//必须要有！
        dataType: "json",
        pagination:false,                   //是否分页
        //toolbar: "#toolbar",				//工具栏
        striped: true,                      //是否显示行间隔色
        cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        search : true,						//搜索功能
        //strictSearch: true,
        sortable: true,                     //是否启用排序
        sortOrder: "asc",                   //排序方式
        showColumns: true,                  //是否显示所有的列（选择显示的列）
        showRefresh: true,                  //是否显示刷新按钮
        minimumCountColumns: 2,             //最少允许的列数
        clickToSelect: false,               //是否启用点击选中行
        showToggle: true,                   //是否显示详细视图和列表视图的切换按钮
        cardView: false,                    //是否显示详细视图
        detailView: false,                  //是否显示父子表
        locale:'zh-CN',                     //中文支持,
        
        uniqueId: "type",                   //每一行的唯一标识，一般为主键列
        //queryParamsType: "",				//请求服务器时所传的参数类型
        //queryParams:						//请求服务器时所传的参数
          
        //响应处理函数
        responseHandler: function (data){
        	//ajax获取到数据，在渲染表格之前，修改数据源
        	return dealResData(data);
        },

        //列信息
        columns: [
            {
                field: 'type',
                title: '积分类型'
            },
            {
                field: 'balance',
                title: '积分数额'
            },
        ]

    });
}

//处理服务器返回数据，转换成bootstrap-table支持的格式
function dealResData(data){

	//获得查询状态
	var status = data.status;
	
	//积分查询失败
	if(status == '0'){
		//提示查询失败
		alert(data.msg);
		//返回长度为0的数据
		return '{rows:0, rows:[]}';
	}
	
	//积分查询成功，修改数据格式
	//最终要返回的变量
	var res = {};
	//设置数据条数
	res.total = data.score.length;
	//保存查询结果的所有行
	var rows = [];
	for(var i=0;i<data.score.length;i++){
		//处理一行数据
		var scor = data.score[i];
		//保存一行数据
		var row = {};
		//把type-balance键值对转换成{type=tValue,balance=bValue}格式
		for (var key in scor) {
			row.type = key;
			row.balance = scor[key];
			break;
	    }
		//把该行数据添加到rows中
		rows.push(row);
	}
	//设置数据所有行
	res.rows = rows;
	
	//返回查询结果
    return res;
}