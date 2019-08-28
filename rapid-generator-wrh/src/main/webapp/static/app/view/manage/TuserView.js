/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 * view - Tuser
 */
Ext.define("ESSM.view.manage.TuserView",{
	extend: "Ext.panel.Panel",
	alias : "widget.tuserView",
    requires : [
        'ESSM.store.manage.TuserStore',
        "ESSM.view.manage.TuserGrid",
        "ESSM.view.manage.TuserForm"
    ],
	tbar : [
		{
			xtype : 'authcbutton',
			action : 'create',
			iconCls : 'add',
			disabled : false,
			text :'新增'
		},
		{
			xtype : 'authcbutton',
			action : 'update',
			iconCls : 'edit',
			disabled : true,
			text :'修改'
		}
		,{
			xtype : 'authcbutton',
			action :'delete',
			iconCls : 'delete',
			disabled : false,
			text : '删除'
		}
	],
	items : [
		{
			xtype : "TuserGrid",
			anchor: "100% -60",
			border : false
		}
	]
});