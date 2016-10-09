var TableEditable = function () {

    return {

        //main function to initiate the module
        init: function () {
            
            
            var formatTest0 = function (obj) {
            	return 'bad';
            }
            var formatTest1 = function (obj) {
            	return 'ok';
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

                "aaData2": [
                           /* Reduced data set */
                           [ "Trident", "Internet Explorer 4.0", "Win 95+", "4", "X","VR","VR" ],
                           [ "Trident", "Internet Explorer 4.0", "Win 95+", "4", "X","VR","VR" ],
                           [ "Trident", "Internet Explorer 4.0", "Win 95+", "4", "X","VR","VR" ],
                           [ "Trident", "Internet Explorer 4.0", "Win 95+", "4", "X","VR","VR" ],
                           [ "Trident", "Internet Explorer 4.0", "Win 95+", "4", "X","VR","VR" ],
                           [ "Trident", "Internet Explorer 4.0", "Win 95+", "4", "X","VR","VR" ],
                           [ "Trident", "Internet Explorer 4.0", "Win 95+", "4", "X","VR","VR" ],
                           [ "Trident", "Internet Explorer 4.0", "Win 95+", "4", "X","VR","VR" ],
                           [ "Trident", "Internet Explorer 4.0", "Win 95+", "4", "X","VR","VR" ],
                           [ "Trident", "Internet Explorer 4.0", "Win 95+", "4", "X","VR","VR" ],
                           [ "Trident", "Internet Explorer 4.0", "Win 95+", "4", "X","VR","VR" ],
                           [ "Trident", "Internet Explorer 4.0", "Win 95+", "4", "X","VR","VR" ],
                           [ "Trident", "Internet Explorer 4.0", "Win 95+", "4", "X","VR","VR" ],
                           [ "Trident", "Internet Explorer 4.0", "Win 95+", "4", "X","VR","VR" ],
                           [ "Trident", "Internet Explorer 4.0", "Win 95+", "4", "X","VR","VR" ],
                           [ "Trident", "Internet Explorer 4.0", "Win 95+", "4", "X","VR","VR" ],
                           [ "Trident", "Internet Explorer 4.0", "Win 95+", "4", "X","VR","VR" ],
                           [ "Trident", "Internet Explorer 4.0", "Win 95+", "4", "X","VR","VR" ],
                           [ "Trident", "Internet Explorer 4.0", "Win 95+", "4", "X","VR","VR" ],
                           [ "Trident", "Internet Explorer 4.0", "Win 95+", "4", "X","VR","VR" ],
                           [ "Trident", "Internet Explorer 4.0", "Win 95+", "4", "X","VR","VR" ],
                           [ "Trident", "Internet Explorer 4.0", "Win 95+", "4", "X","VR","VR" ],
                           [ "Trident", "Internet Explorer 4.0", "Win 95+", "4", "X","VR","VR" ],
                           [ "Trident", "Internet Explorer 4.0", "Win 95+", "4", "X","VR","VR" ],
                           [ "Trident", "Internet Explorer 4.0", "Win 95+", "4", "X","VR","VR" ],
                           [ "Trident", "Internet Explorer 4.0", "Win 95+", "4", "X","VR","VR" ]
                          
                ],
                       
                       
               "sAjaxSource": 'templete/doBrower' ,   
               "aoColumns": [
                             { "sTitle": "ext" },
                             { "sTitle": "Engine" },
                             { "sTitle": "Browser" },
                             { "sTitle": "Platform" },
                             { "sTitle": "Version", "sClass": "center" },
                             {  "sTitle": "Grade",   "sClass": "center",  "fnRender": formatTest0 },
                             {  "sTitle": "ss",   "sClass": "center",  "fnRender": formatTest1 }
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