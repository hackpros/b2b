
var getScriptArg=function( key) {
    var scripts=document.getElementsByTagName("script"),
    script=scripts[scripts.length-2],  
    src=script.src; 
    return (src.match(new RegExp("(?:\?|&)"+key+"=(.*?)(?=&|$)"))||['',null])[1];
}

var _WEB_NAME=getScriptArg("webName");


 $(function() {
    //
    $('#grid').datagrid({
        fit : true,
        pageNumber : 1,
        pageList : [ 10, 20, 30 ],
        nowrap : true,
        striped : true,
        collapsible : true,
        remoteSort : false,
        url:'doBrowser.json',
        columns : [ [ 
        	{title : "{0}",  field : "{1}", width : 80,sortable : true},
        	{title : "{0}",  field : "{1}", width : 80,sortable : true},
        	{title : "{0}",  field : "{1}", width : 80,sortable : true},
        	{title : "{0}",  field : "{1}", width : 80,sortable : true},
        	{title : "{0}",  field : "{1}", width : 80,sortable : true},
        	{title : "{0}",  field : "{1}", width : 80,sortable : true},
        	{title : "{0}",  field : "{1}", width : 80,sortable : true},
        ] ],
        pagination : true,
        singleSelect : true,
        rownumbers : true,
        toolbar:[{
            id:'btnadd',
            text:'添加',
            iconCls:'icon-add',
            handler:function(){
                location.href="append";
            }
        },{
            id:'btncut',
            text:'修改',
            iconCls:'icon-edit',
            handler:function(){
                var selected = $('#grid').datagrid('getSelected');
                if (selected){
                    location.href = 'modify?id='+selected.id+'&name='+selected.id;
                    //$("#usrrole",parent.document.body).attr("src",_WEB_NAME+"/${beanModeName}/usrRole/modify?id="+selected.id);
                }else{
                    $.messager.alert('提示',"请选择一条记录");
                }
            }
        },'-',{
            id:'btndel',
            text:'删除',
            disabled:false,
            iconCls:'icon-remove',
            handler:function(){
                var rows = $('#grid').datagrid('getSelections');
                if (rows.length==0){
                    $.messager.alert('提示',"请选择一条记录");
                    return;
                }
                var data = [];
                for (var i=0 ;i<rows.length;i++){
                    var ids = {"id":rows[i].id};
                    data.push(ids);
                }
                $.ajax( {
                    contentType : 'application/json',
                    url : 'delete.json',     
                    data :JSON.stringify(data),
                    type : 'post',
                    dataType:'text',
                    success : function(data) {
                        if (data.id!=0){
                            $.messager.alert('提示','删除成功!','info');
                        }else{
                            $.messager.alert('提示','删除失败!','info');
                        }
                        $('#grid').datagrid("reload");
                    },
                    error : function(data) {
                        console.log(data);
                        $.messager.alert('提示','删除失败!','info');
                    }
                });
            }
        }]
    });
}
     );

