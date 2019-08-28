/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 * form - Tuser
 */
Ext.define("ESSM.view.manage.TuserForm",{
	extend:"Ext.form.Panel",
	alias:"widget.tuserForm",
	width:600,
	bodyPadding: '10',
    autoScroll: true,
	border : 0,
	fieldDefaults: {
        msgTarget: 'side',
        labelWidth: 90,
        anchor : '80%'
    },
    initComponent : function(){
		this.items =  [
			{
				xtype: 'textfield',
				fieldLabel: 'password',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入password',
				name:'password'
			},
			{
				xtype: 'textfield',
				fieldLabel: 'userName',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入userName',
				name:'userName'
			},
			{
				xtype: 'textfield',
				fieldLabel: 'id',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入id',
				name:'id'
			}		],
		this.callParent();
	},
    bbar : [
        {
            xtype: 'button',
            width: 60,
            margin: '0 0 0 30',
            name: 'save',
            allowBlank: false,
            action:'save',
            iconCls : 'edit',
            text: '保存',
            handler : function(btn, e){
                var editForm = this.up("form") || {};
                var saveFn = editForm.saveFn;
                var saveFnContext = editForm.saveFnContext || editForm;
                saveFn && saveFn.call(saveFnContext, editForm);
            }
        },
        {
            xtype: 'button',
            width: 60,
            margin: '0 0 0 30',
            name: 'cancel',
            allowBlank: false,
            action:'query',
            iconCls : 'cancel',
            text: '取消',
            listeners : {
                'click' : function(){
                    this.up("window").close();
                }
            }
        }
    ]
});