/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 * store - Tuser
 */
Ext.define('ESSM.store.manage.TuserStore',{
	extend: 'Ext.data.Store',
	// autoLoad : true,
	model : 'ESSM.model.manage.Tuser',
	remoteSort : true,
	pageSize : 20,
	proxy : {
		type: 'ajax',
		api : {
			read:'rest/manage/tuser/list.json',
			create:'rest/manage/tuser/add.json',
			update:'rest/manage/tuser/edit.json',
			destroy:'rest/manage/tuser/delete.json',
		},
        actionMethods: {
            read   : 'POST' // by default GET
        },
		reader: {
			type: 'json',
			root: 'data',
			totalProperty: 'total'
		},
		limitParam : 'pageSize',
		pageParam :'page',

	},
	sorters : [{
		property : 'id',
		direction : 'asc'
	}]
});
