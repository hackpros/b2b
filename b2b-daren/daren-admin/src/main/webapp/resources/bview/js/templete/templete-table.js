var TableEditable = function () {

    return {

        //main function to initiate the module
        init: function () {
             debugger
            
            var formatTest0 = function (obj) {
            	 debugger
            	return obj.aData.better+"fnRender";
            }
            var formatTest1 = function (obj) {
            	return obj.aData.good+"_fnRender";
            }

            var oTable = $('#sample_editable_1').dataTable({
                "aLengthMenu": [
                    [5, 15, 20, -1],
                    [5, 15, 20, "All"] // change per page values here
                ],
                // set the initial value
                "iDisplayLength": 10,
                "sDom": "<'row-fluid'<'span6'l><'span6'f>r>t<'row-fluid'<'span6'i><'span6'p>>",
                "sPaginationType": "bootstrap",
                "oLanguage": {
                    "sLengthMenu": "_MENU_ records per page",
                    "oPaginate": {
                        "sPrevious": "Prevx",
                        "sNext": "Nexte"
                    }
                },
                       
               "sAjaxSource": 'http://localhost:8080/templete/doBrower' ,   
               "aoColumns": [
                             { "mData": "id",sTitle:"ID",sClass: "center","bSortable": true},
                             { "mData": "name",sTitle:"姓名"},
                             { "mData": "head",sTitle:"头像"},
                             { "mData": "code",sTitle:"编号"},
                             { "mData": "best",sTitle:"很满意","sClass": "center" },
                             { "mData": "better",sTitle:"满意", sClass: "center",  "fnRender": formatTest0 },
                             { "mData": "good", sTitle:"不满意", sClass: "center",  "fnRender": formatTest1 }
                         ],
                
                "aoColumnDefs": [{
                        'bSortable': false,
                        'aTargets': [0]
                    }
                ]
            });

            jQuery('#sample_editable_1_wrapper .dataTables_filter input').addClass("m-wrap medium"); // modify table search input
            jQuery('#sample_editable_1_wrapper .dataTables_length select').addClass("m-wrap small"); // modify table per page dropdown
            jQuery('#sample_editable_1_wrapper .dataTables_length select').select2({
                showSearchInput : false //hide search box with special css class
            }); // initialzie select2 dropdown

           
        }

    };

}();