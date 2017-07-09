Ext.define('MyDesktop.SafeMonitor.DeptTreeModel', {
    extend: 'Ext.data.Model',
    fields: [
        {name: 'name',  type: 'string'},
        {name: 'age',   type: 'int', convert: null},
        {name: 'phone', type: 'string'},
        {name: 'alive', type: 'boolean', defaultValue: true, convert: null}
    ],

    changeName: function() {
        var oldName = this.get('name'),
            newName = oldName + " The Barbarian";

        this.set('name', newName);
    }
});




[{"attributes":{"no":"00","deptno":null},"checked":false,"children":[{"attributes":{"deptno":"0007001"},"checked":false,"children":[{"attributes":{"deptno":"0007001001004"},"checked":false,"children":[],"iconCls":"","id":"167","state":"open","text":"井工一矿"},{"attributes":{"deptno":"0007001001005"},"checked":false,"children":[],"iconCls":"","id":"168","state":"open","text":"井工二矿"},{"attributes":{"deptno":"0007001001006"},"checked":false,"children":[],"iconCls":"","id":"169","state":"open","text":"井工三矿"},{"attributes":{"deptno":"0015001"},"checked":false,"children":[],"iconCls":"","id":"170","state":"open","text":"井东矿"},{"attributes":{"deptno":null},"checked":false,"children":[],"iconCls":"","id":"171","state":"open","text":"安太堡矿"},{"attributes":{"deptno":null},"checked":false,"children":[],"iconCls":"","id":"172","state":"open","text":"安家岭矿"},{"attributes":{"deptno":null},"checked":false,"children":[],"iconCls":"","id":"173","state":"open","text":"东露天矿"},{"attributes":{"deptno":null},"checked":false,"children":[],"iconCls":"","id":"174","state":"open","text":"洗选中心"}],"iconCls":"","id":"5","state":"open","text":"平朔公司"},{"attributes":{"deptno":"0081001"},"checked":false,"children":[{"attributes":{"deptno":"0259001"},"checked":false,"children":[],"iconCls":"","id":"175","state":"open","text":"徐庄矿"},{"attributes":{"deptno":"0258001"},"checked":false,"children":[],"iconCls":"","id":"176","state":"open","text":"孔庄矿"},{"attributes":{"deptno":"0257001"},"checked":false,"children":[],"iconCls":"","id":"177","state":"open","text":"姚桥矿"},{"attributes":{"deptno":"0260001"},"checked":false,"children":[],"iconCls":"","id":"178","state":"open","text":"龙东矿"}],"iconCls":"","id":"165","state":"open","text":"大屯公司"},{"attributes":{"deptno":"0094001"},"checked":false,"children":[{"attributes":{"deptno":"0101001"},"checked":false,"children":[],"iconCls":"","id":"179","state":"open","text":"唐山沟矿"},{"attributes":{"deptno":"0119001"},"checked":false,"children":[],"iconCls":"","id":"180","state":"open","text":"南梁矿"},{"attributes":{"deptno":"0292001"},"checked":false,"children":[],"iconCls":"","id":"182","state":"open","text":"甘庄矿"},{"attributes":{"deptno":"0294001"},"checked":false,"children":[],"iconCls":"","id":"313","state":"open","text":"上深涧矿"},{"attributes":{"deptno":"0293001"},"checked":false,"children":[],"iconCls":"","id":"316","state":"open","text":"北辛窑矿"},{"attributes":{"deptno":"0295002"},"checked":false,"children":[],"iconCls":"","id":"317","state":"open","text":"小梁沟矿"},{"attributes":{"deptno":"0099001"},"checked":false,"children":[],"iconCls":"","id":"318","state":"open","text":"担水沟矿"},{"attributes":{"deptno":"0096001"},"checked":false,"children":[],"iconCls":"","id":"319","state":"open","text":"杨涧矿"},{"attributes":{"deptno":"0100001"},"checked":false,"children":[],"iconCls":"","id":"349","state":"open","text":"西沙河矿"},{"attributes":{"deptno":"0066001"},"checked":false,"children":[],"iconCls":"","id":"350","state":"open","text":"东坡矿"}],"iconCls":"","id":"20","state":"open","text":"进出口公司"},{"attributes":{"deptno":"0285001"},"checked":false,"children":[{"attributes":{"deptno":"0321001"},"checked":false,"children":[],"iconCls":"","id":"183","state":"open","text":"五家沟矿"},{"attributes":{"deptno":"0322001"},"checked":false,"children":[],"iconCls":"","id":"184","state":"open","text":"南阳坡矿"},{"attributes":{"deptno":"0323001"},"checked":false,"children":[],"iconCls":"","id":"185","state":"open","text":"马营矿"},{"attributes":{"deptno":"0325001"},"checked":false,"children":[],"iconCls":"","id":"409","state":"open","text":"元宝湾矿"}],"iconCls":"","id":"19","state":"open","text":"金海洋公司"},{"attributes":{"deptno":"0462001"},"checked":false,"children":[{"attributes":{"deptno":"0466003"},"checked":false,"children":[],"iconCls":"","id":"186","state":"open","text":"王家岭矿"},{"attributes":{"deptno":"0465001"},"checked":false,"children":[],"iconCls":"","id":"410","state":"open","text":"韩咀矿"}],"iconCls":"","id":"166","state":"open","text":"中煤华晋"},{"attributes":{"deptno":null},"checked":false,"children":[],"iconCls":"","id":"326","state":"open","text":"其他"}],"iconCls":"","id":"1","state":"open","text":"中煤集团"}]