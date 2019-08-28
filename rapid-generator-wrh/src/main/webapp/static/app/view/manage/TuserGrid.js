/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 * grid - Tuser
 */
Ext.define("ESSM.view.manage.TuserGrid", {
	extend: "Ext.grid.Panel",
	alias: "widget.tuserGrid",
	store: "manage.TuserStore",
	viewConfig: {
		loadMask: true
	},
	initComponent : function(){
		this.selModel = Ext.create('Ext.selection.CheckboxModel', {mode: "SINGLE", allowDeselect: true});
		this.callParent();
	},
    tbar: [
		{
			xtype: 'authcbutton',
			action: 'create',
			iconCls: 'add',
			text: '新增'
		},
		{
			xtype : 'authcbutton',
			action : 'update',
			iconCls : 'edit',
			disabled : true,
			text :'修改'
		},
			{
			xtype : 'authcbutton',
			action :'delete',
			iconCls : 'delete',
			disabled : true,
			text : '删除'
		}
	],

	columns: [
				{
					header: 'password', 
					dataIndex: 'password', 
					width: 120,
					align:'left',
					// hidden: true,
					renderer : function(value, row, record) {
						if(value) {
							return value;
						}
						return "";
					}
				},
				{
					header: 'userName', 
					dataIndex: 'userName', 
					width: 120,
					align:'left',
					// hidden: true,
					renderer : function(value, row, record) {
						if(value) {
							return value;
						}
						return "";
					}
				},
				{
					header: 'id', 
					dataIndex: 'id', 
					width: 120,
					align:'left',
					// hidden: true,
					renderer : function(value, row, record) {
						if(value) {
							return value;
						}
						return "";
					}
				}	],
	bbar: {
		xtype: 'pagingtoolbar',
		store: 'manage.TuserStore',
		displayInfo: true,
		displayMsg: '显示 {0} - {1} 条，共计 {2} 条',
		emptyMsg: '无数据'
	}
});