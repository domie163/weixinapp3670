const base = {
    get() {
        return {
            url : "http://localhost:8080/shuiguoxiaoshou/",
            name: "shuiguoxiaoshou",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/shuiguoxiaoshou/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "水果销售系统"
        } 
    }
}
export default base
