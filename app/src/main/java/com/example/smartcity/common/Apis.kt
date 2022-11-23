package com.example.smartcity.common

object Apis {
    /**1.1.1.用户登录 POST
    接口描述
    请求数据类型
    application/json
    请求示例
    {
    "username":"test01",
    "password":"123456"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    username 用户名 true string
    password 用户密码 true string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    token 返回 token 信息 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功",
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJsb2dpbl91c2VyX2tleSI6ImY2NT
    g5NjlhLWJmMDMtNDM0Mi1iYjFmLTRiNzAxYmQzNGViMCJ9.rsmLIODdu3p7DszpItwEyL
    XEJc20RejFXtjBITxYDA7q4PKyborAdyAsLGAtR4YEuRiq9XQIGdchtrLovGRpFA"
    }
    1.1.2.用户注册
     */
    const val post_api_login= "/prod-api/api/login"

    /**1.1.2.用户注册 POST
    接口描述
    请求数据类型
    application/json
    请求示例
    {
    "avatar": "/profile/2020/10/26/27e7fd58-0972-4dbf-941c-590624e6a886.
    png",
    "userName": "David",
    "nickName": "大卫",
    "password": "123456",
    "phonenumber": "15840669812",
    "sex": "0",
    "email": "David@163.com",
    "idCard": "210113199808242137"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    avatar 头像 false string
    userName 用户名 true string
    nickName 昵称 false string
    password 密码 true string
    phonenumber 电话号码 true string
    sex 性别 0 男 1 女 true string
    email 邮箱 false string
    idCard 身份证 false string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200
    }
    1.2.用户信息
    1.2.1.查询个人基本信息
     */
    const val post_api_register= "/prod-api/api/register"

    /**1.2.1.查询个人基本信息 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    user 返回用户信息数据 用户信息
    avatar 用户头像 string
    balance 账户余额 number
    email 邮箱 string
    idCard 身份证号 string
    nickName 用户昵称 string
    phonenumber 手机号 string
    参数名称 参数说明 类型
    score 用户积分 integer(int32)
    sex 用户性别 0 男 1 女 string
    userId 用户 ID integer(int64)
    userName 用户名 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "user": {
    "userId": 2,
    "userName": "test01",
    "nickName": "测试用户 01",
    "email": "ljxl@qq.com",
    "phonenumber": "13800000000",
    "sex": "0",
    "avatar": "",
    "idCard": "210211199909090014",
    "balance": 9800,
    "score": 10000
    }
    }
    1.2.2.修改个人基本信息
     */
    const val get_api_common_user_getInfo= "/prod-api/api/common/user/getInfo"

    /**1.2.2.修改个人基本信息 PUT
    接口描述：请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "email": "lixl@163.com",
    "idCard": "210882199807251656",
    "nickName": "大卫王",
    "phonenumber": "15898125461",
    "sex": "0"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    avatar 用户头像 false string
    email 邮箱 false string
    idCard 身份证号 false string
    nickName 用户昵称 true string
    phonenumber 手机号 false string
    sex 用户性别 0 男 1 女 false string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200
    }
    1.2.3.查询用户列表
     */
    const val put_api_common_user= "/prod-api/api/common/user"

    /**1.2.3.查询用户列表 GET
    接口描述：请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    /prod-api/system/user/list
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    userName 用户名称 F string
    phonenumber 手机号码 F string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    total 数量
    rows 返回数据列
    注：sex 0 为男 1 为女
    响应示例
    {
    "total": 1,
    "rows": [
    {
    "searchValue": null,
    "createBy": "admin",
    ],
    "code": 200,
    "msg": "查询成功"
    }
    1.2.4.修改用户密码
     */
    const val get_system_user_list= "/prod-api/system/user/list"

    /**1.2.4.修改用户密码 PUT
    接口描述：请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "newPassword": "123789",
    "oldPassword": "123456"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    newPassword 用户新密码 true string
    oldPassword 用户旧密码 true string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    参数名称 参数说明 类型
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200
    }
    1.3.电子钱包
    1.3.1.金额变动记录
     */
    const val put_api_common_user_resetPwd= "/prod-api/api/common/user/resetPwd"

    /**1.3.1.金额变动记录 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/common/balance/list?pageNum=1&pageSize=8
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 钱包金额变动记录
    appType 应用类别 string
    参数名称 参数说明 类型
    changeAmount 变更金额 number
    changeTime 变更日期 string(date-time)
    changeType 变更类型 string
    event 变更事件 string
    id integer(int64)
    userId 用户 id integer(int64)
    userName 用户名 string
    total 总记录数 string
    响应示例
    {
    "total": 10,
    "rows": [
    {
    "id": 2,
    "appType": null,
    "userId": 1,
    "event": "缴纳违章罚款",
    "changeAmount": 200,
    "changeType": "支出",
    "userName": null,
    "changeTime": "2021-04-21 10:30:45"
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    1.3.2.充值
     */
    const val get_api_common_balance_list= "/prod-api/api/common/balance/list"

    /**1.3.2.充值 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    /prod-api/api/common/balance/recharge?money=1000
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    money 充值金额 query true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": "200",
    "msg": "操作成功"
    }
    1.4.意见反馈
    1.4.1.新增意见反馈
     */
    const val post_api_common_balance_recharge= "/prod-api/api/common/balance/recharge"

    /**1.4.1.新增意见反馈 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "content": "反馈内容",
    "title": "发现错误"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    content 反馈内容 false string
    title 反馈标题 false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    响应示例
    {
    "code": "操作成功",
    "msg": " 200 "
    }
    1.4.2.查询意见反馈列表
     */
    const val post_api_common_feedback= "/prod-api/api/common/feedback"

    /**1.4.2.查询意见反馈列表 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数 支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    title 反馈标题 query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 反馈实体
    content 反馈内容 string
    id 反馈 ID integer(int64)
    title 反馈标题 string
    userId 反馈人用户 ID integer(int64)
    total 总记录数 string
    appType app 类型 string
    响应示例
    {
    "code": "200",
    "msg": "查询成功",
    "rows": [{
    "id": 4, “appType”:“movie”，
    "title": "发现错误",
    "content": "反馈内容",
    "userId": 1
    }],
    "total": "1"
    }
    1.4.3.获取意见反馈详情
     */
    const val get_api_common_feedback_list= "/prod-api/api/common/feedback/list"

    /**1.4.3.获取意见反馈详情 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 反馈实体
    content 反馈内容 string
    id 反馈 ID integer(int64)
    title 反馈标题 string
    userId 反馈人用户 ID integer(int64)
    msg 返回消息内容 string
    参数名称 参数说明 类型
    appType app 类型 string
    响应示例
    {
    "code": " 200 ",
    "data": {
    "id": 4,
    "appType": "movie",
    "title": "发现错误",
    "content": "反馈内容",
    "userId": 1
    },
    "msg": "操作成功"
    }
    1.5.新闻资讯
    1.5.1.获取新闻分类
     */
    const val get_api_common_feedback__id_= "/prod-api/api/common/feedback/{id}"

    /**1.5.1.获取新闻分类 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    参数名称 参数说明 类型
    rows 列表数据（数组类型） 新闻分类实体
    id 分类编号 integer(int64)
    name 分类名称 string
    sort 分类序号 integer(int32)
    total 总记录数 string
    appType app 类型 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 9,
    "appType": "smart_city",
    "name": "今日要闻",
    "sort": 1,
    }],
    "total": "1"
    }
    1.5.2.获取新闻评论列表
     */
    const val get_press_category_list= "/prod-api/press/category/list"

    /**1.5.2.获取新闻评论列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    commentDate 评论时间 query false string(date-time)
    newsId 新闻 ID query true integer(int64)
    userId 评论人 id query false integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 新闻评论实体
    commentDate 评论时间 string(date-time)
    content 评论内容 string
    id 评论 ID integer(int64)
    likeNum 点赞数 integer(int64)
    newsId 新闻 ID integer(int64)
    userId 评论人 id integer(int64)
    userName 用户名 string
    total 总记录数 string
    appType app 类型 string
    newsTitle 新闻标题 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 8,
    "appType": "smart_city",
    "newsId": 28,
    "content": "支持",
    "commentDate": "2021-05-11 17:30:25",
    "userId": 2,
    "likeNum": 0,
    "userName": "test01",
    "newsTitle": "iPhone 13 再爆猛料：不止刘海屏有望缩小，超大杯或
    将搭载 LTPO 屏"
    }],
    "total": "1"
    }
    1.5.3.获取新闻评论详细信息
     */
    const val get_press_comments_list= "/prod-api/press/comments/list"

    /**1.5.3.获取新闻评论详细信息 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 新闻评论 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 新闻评论实体
    参数名称 参数说明 类型
    commentDate 评论时间 string(date-time)
    content 评论内容 string
    id 评论 ID integer(int64)
    likeNum 点赞数 integer(int64)
    newsId 新闻 ID integer(int64)
    userId 评论人 id integer(int64)
    msg 返回消息内容 string
    appType app 类型 string
    newsTitle 新闻标题 string
    响应示例
    {
    "code": 200,
    "data": {
    "id": 8,
    "appType": "living",
    "newsId": 28,
    "content": "支持",
    "commentDate": "2021-05-11 17:30:25",
    "userId": 2,
    "likeNum": 0,
    "userName": "test01",
    "newsTitle": "卓创资讯：猪价放量急跌 多地猪价破“10”"
    },
    "msg": "操作成功"
    }
    1.5.4.新闻点赞
     */
    const val get_press_comments__id_= "/prod-api/press/comments/{id}"

    /**1.5.4.新闻点赞 PUT
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 新闻 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    1.5.5.获取新闻列表
     */
    const val put_press_press_like__id_= "/prod-api/press/press/like/{id}"

    /**1.5.5.获取新闻列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    hot 是否热点，参见字典名：系统是否 query false string
    publishDate 发布日期 query false string(date-time)
    title 新闻标题 query false string
    top 是否推荐，参见字典名：系统是否 query false string
    type 新闻类型 id query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 新闻实体
    commentNum 评论数 integer(int64)
    content 新闻内容 string
    cover 新闻封面图片地址 string
    hot 是否热点，参见字典名：系统是否 string
    id 新闻 ID integer(int64)
    likeNum 点赞数 integer(int64)
    publishDate 发布日期 string(date-time)
    readNum 阅读数 integer(int64)
    subTitle 新闻副标题 string
    title 新闻标题 string
    参数名称 参数说明 类型
    top 是否推荐，参见字典名：系统是否 string
    total 总记录数 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 5,
    "cover": "/dev-api/profile/upload/image/2021/04/01/c1eb74b2-e96
    4-4388-830a-1b606fc9699f.png",
    "title": "测试新闻标题",
    "subTitle": "测试新闻子标题",
    "content": "<p>内容<img src=\"/dev-api/profile/upload/image/202
    1/04/07/a9434ccf-5acf-4bf5-a06e-c3457c6762e9.png\"></p>",
    "status": "Y",
    "publishDate": "2021-04-01",
    "tags": null,
    "commentNum": 1,
    "likeNum": 2,
    "readNum": 10,
    "type": "2",
    "top": "Y",
    "hot": "N"
    }],
    "total": 1
    }
    1.5.6.获取新闻详细信息
     */
    const val get_press_press_list= "/prod-api/press/press/list"

    /**1.5.6.获取新闻详细信息 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 新闻 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 新闻实体
    commentNum 评论数 integer(int64)
    content 新闻内容 string
    cover 新闻封面图片地址 string
    hot 是否热点，参见字典名：系统是否 string
    id 新闻 ID integer(int64)
    likeNum 点赞数 integer(int64)
    publishDate 发布日期 string(date-time)
    readNum 阅读数 integer(int64)
    subTitle 新闻副标题 string
    title 新闻标题 string
    top 是否推荐，参见字典名：系统是否 string
    msg 返回消息内容 string
    appType app 类型 string
    响应示例
    {
    "code": 200,
    "data": {
    "id": 5,
    "appType": "movie",
    "cover": "/dev-api/profile/upload/image/2021/04/01/c1eb74b2-e964-
    4388-830a-1b606fc9699f.png",
    "title": "驱蚊器无去",
    "subTitle": "123123123",
    "content": "<p>企鹅王请问<img src=\"/dev-api/profile/upload/image
    /2021/04/07/a9434ccf-5acf-4bf5-a06e-c3457c6762e9.png\"></p>",
    "status": "Y",
    "publishDate": "2021-04-01",
    "tags": null,
    "commentNum": null,
    "likeNum": 3,
    "readNum": null,
    "type": "2",
    "top": "Y",
    "hot": "N"
    },
    "msg": "操作成功"
    }
    1.5.7.发表新闻评论
     */
    const val get_press_press__id_= "/prod-api/press/press/{id}"

    /**1.5.7.发表新闻评论 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "newsId": 5
    "content": "新闻评论测试"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    content 评论内容 false string
    newsId 新闻 ID true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    1.5.8.评论点赞
     */
    const val post_press_pressComment= "/prod-api/press/pressComment"

    /**1.5.8.评论点赞 PUT
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 新闻 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    1.6.广告轮播
    1.6.1.查询引导页及主页轮播
     */
    const val put_press_pressComment_like__id_= "/prod-api/press/pressComment/like/{id}"

    /**1.6.1.查询引导页及主页轮播 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数 支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    type 广告类型 1 引导页轮播 2 主页轮播 query true string
    请求示例：/prod-api/api/rotation/list?pageNum=1&pageSize=8&type=2
    响应参数
    参数名称 参数说明 类型
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 广告轮播实体
    advImg 广告图片 string
    advTitle 广告标题 string
    id 广告 ID integer(int64)
    servModule 业务模块 string
    sort 排序 integer(int64)
    targetId 跳转详情 id integer(int64)
    total 总记录数 string
    响应示例
    {
    "code": " 200 ",
    "msg": "查询成功",
    "rows": [
    {
    "id": 14,
    "sort": 1,
    "advTitle": "测试首页轮播",
    "advImg": "http://152.136.210.130:7777/profile/upload/image/202
    1/04/26/183e63c6-a59d-4551-a5b4-7055ff7a9575.jpg",
    "servModule": "新闻",
    "targetId": 1,
    "type": "2"
    }
    ],
    "total": "1"
    }
    1.7.文件上传
    1.7.1.通用上传接口
     */
    const val get_api_rotation_list= "/prod-api/api/rotation/list"

    /**1.7.1.通用上传接口 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    multipart/form-data
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    file 上传的文件对象 formData false file
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    fileName 文件名 string
    url 文件访问地址 string
    响应示例
    {
    "code": 200,
    "fileName": "test.txt",
    "url": "/profile/upload/file/test.txt",
    "msg": "操作成功"
    }
    1.8.地理位置
    1.8.1.获取城市的区域
     */
    const val post_common_upload= "/prod-api/common/upload"

    /**1.8.1.获取城市的区域 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    cityName 城市 query true string
    name 区域 query false string
    provinceName 省份 query true string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据，数组类型
    cityName 城市 string
    name 区域 string
    provinceName 省份 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "data": [{
    " provinceName ": "辽宁省",
    " cityName ": "大连市",
    " name ": "五一广场"
    }],
    "msg": "操作成功"
    }
    1.8.2.获取省的城市
     */
    const val get_api_common_gps_area= "/prod-api/api/common/gps/area"

    /**1.8.2.获取省的城市 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    name 城市 query false string
    provinceName 省份 query true string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据，数组类型
    name 城市 string
    provinceName 省份 string
    参数名称 参数说明 类型
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "data": [{
    " provinceName ": "辽宁省",
    " name ": "大连市"
    }],
    "msg": "操作成功"
    }
    1.8.3.获取当前地理位置
     */
    const val get_api_common_gps_city= "/prod-api/api/common/gps/city"

    /**1.8.3.获取当前地理位置 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    无
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据，数组类型
    city 城市 string
    area 区域 string
    province 省份 string
    参数名称 参数说明 类型
    location 位置
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "area": "沙河口区",
    "province": "辽宁省",
    "city": "大连市",
    "location": "五一广场"
    }
    }
    1.8.4.获取全国省份
     */
    const val get_api_common_gps_location= "/prod-api/api/common/gps/location"

    /**1.8.4.获取全国省份 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    name 省份 query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据，数组类型
    name 省份 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "data": [{
    " name ": "辽宁省"
    }],
    "msg": "操作成功"
    }
    1.9.全部服务
    1.9.1.获取系统全部服务
     */
    const val get_api_common_gps_province= "/prod-api/api/common/gps/province"

    /**1.9.1.获取系统全部服务 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    isRecommend 是否推荐，参看字
    典名：系统是否
    query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 服务管理
    id ID integer(int64)
    imgUrl 服务图片 string
    link 跳转链接 string
    isRecommend 是否推荐，参见字典名：系统是否 string
    serviceDesc 服务简介 string
    serviceName 服务名称 string
    serviceType 服务类别 string
    sort 序号 integer(int64)
    total 总记录数 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 17,
    "serviceName": "停车场",
    "serviceDesc": "查询停车场",
    "serviceType": "车主服务",
    "imgUrl": "http://localhost:7777/profile/upload/image/2021/05/1
    0/814fc6c4-de48-48a1-95f8-de3e749e348d.png",
    "link": "park/index",
    "sort": 1,
    "isRecommend": "N"
    }],
    "total": 1
    }
    1.10.全部订单
    1.10.1.获取系统当前人全部订单
     */
    const val get_api_service_list= "/prod-api/api/service/list"

    /**1.10.1.获取系统当前人全部订单 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    name 商家 query false string
    orderNo 订单编号 query false string
    orderStatus 订单状态：已付款；未付款 query false string
    orderType 订单类型：movie 电影；takeout 外卖订餐 query false string
    payTime 支付时间 query false string(date-time)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 全部订单
    参数名称 参数说明 类型
    amount 订单金额 number
    id ID integer(int64)
    name 商家 string
    orderNo 订单编号 string
    orderStatus 订单状态：已付款；未付款 string
    orderType 订单类型：movie 电影；takeout 外卖订餐 string
    orderTypeName 订单类型名称 string
    payTime 支付时间 string(date-time)
    total 总记录数 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 21,
    "orderNo": "2021051001061885228",
    "amount": 58,
    "orderStatus": "已付款",
    "userId": 2,
    "payTime": "2021-05-10",
    "name": "中影华臣影城",
    "orderType": "movie",
    "orderTypeName": "看电影"
    }],
    "total": 1
    }
    1.11.天气信息
    1.11.1.获取当天天气信息
     */
    const val get_api_allorder_list= "/prod-api/api/allorder/list"

    /**1.11.1.获取当天天气信息 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    无
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 object
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "maxTemperature": "12",
    "uv": "弱",
    "minTemperature": "24",
    "temperature": "21",
    "weather": "晴",
    "humidity": "60",
    "air": "无污染",
    "apparentTemperature": "15",
    "label": "今天",
    "day": 1
    }
    }
    1.11.2.获取 7 天天气信息
     */
    const val get_api_common_weather_today= "/prod-api/api/common/weather/today"

    /**1.11.2.获取 7 天天气信息 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    无
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 object
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "today": {
    "hours": [
    {
    "hour": "13:00",
    "weather": "晴",
    "temperature": 19
    },
    {
    "maxTemperature": "12",
    "uv": "弱",
    "minTemperature": "23",
    "temperature": "10",
    "weather": "晴",
    "humidity": 50,
    "air": "良好",
    "apparentTemperature": "15",
    "label": "昨天",
    "day": "4 月 26 日昨天"
    },
    {
    "maxTemperature": "12",
    "uv": "弱",
    "minTemperature": "24",
    "temperature": "21",
    "weather": "晴",
    "humidity": "60",
    "air": "无污染",
    "apparentTemperature": "15",
    "label": "今天",
    "day": "4 月 27 日今天"
    } ……
    ]
    }
    }
    1.12.系统字典
    1.12.1.根据字典类型查询字典数据信息
     */
    const val get_api_common_weather= "/prod-api/api/common/weather"

    /**1.12.1.根据字典类型查询字典数据信息 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    dictType 字典类型，参见字典说明 path true string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 字典实体
    dictLabel 字典标签 string
    dictValue 字典键值 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "data": [{
    "dictLabel": "是",
    "dictValue": "Y",
    }],
    "msg": "操作成功"
    }
    2 停哪儿
    2.1 信息纠错接口
    2.2.1.提交纠错信息
     */
    const val get_system_dict_data_type__dictType_= "/prod-api/system/dict/data/type/{dictType}"

    /**2.2.1.提交纠错信息 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "content": "停车场数量错误",
    "name": "测试停车场",
    "photo": "http://localhost/pic/a.jpg",
    "remark": "",
    "spotCount": 12
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    content 问题描述 true string
    name 停车场名称 true string
    photo 纠错照片 true string
    remark 备注 true string
    spotCount 停车位数 true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200
    }
    2.2 停车场相关接口
    2.2.2.查询车辆信息
    GET /prod-api/park/car/list
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数 支持分页 参数参见表格分页
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型）
    userId 用户 ID Long
    plateNo 车牌号 Int
    type 汽车类型 string
    userName 用户名 String
    userId 用户 Id Int
    响应示例
    {
    "total": 24,
    "rows": [
    "params": {},
    "id": 1,
    "userId": 2,
    "plateNo": "辽 B12345",
    "type": "新能源车",
    "userName": "user1"
    ],
    "code": 200,
    "msg": "查询成功"
    }
    o
    2.2.3.查询停车场列表
     */
    const val post_api_park_correct= "/prod-api/api/park/correct"

    /**2.2.3.查询停车场列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数 支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    address 地址 query false string
    open 对外开放，参见字典名：系统是否 query false string
    parkName 停车场名称 query false string
    响应参数
    参数名称 参数说明 类型
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 停车场
    address 地址 string
    allPark 总停车位 string
    distance 距离（米） string
    id 主键 id integer(int64)
    imgUrl 图片地址 string
    open 对外开放 string
    parkName 停车场名称 string
    priceCaps 封顶价格 string
    rates 收费 string
    vacancy 空位个数 string
    total 总记录数 string
    响应示例
    {
    "total": 24,
    "rows": [
    {
    "id": 1,
    "parkName": "国际大厦停车场",
    "vacancy": "30",
    "priceCaps": "30",
    "imgUrl": "/dev-api/profile/upload/image/2021/04/11/ac978c51-d7
    5a-4797-9845-86a73527c55d.jpg",
    "rates": "5",
    "address": "大连市国际大厦 F1 楼",
    "distance": "20",
    "allPark": "90",
    "open": "Y"
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    2.2.4.查询停车记录列表
     */
    const val get_api_park_lot_list= "/prod-api/api/park/lot/list"

    /**2.2.4.查询停车记录列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数 支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    entryTime 入场时间 query false string(date-time)
    outTime 出场时间 query false string(date-time)
    parkName 停车场名称 query false string
    plateNumber 车牌号 query false string
    响应参数
    参数名称 参数说明 类型 schema
    code 状态码 string
    参数名称 参数说明 类型 schema
    msg 消息内容 string
    rows 列表数据（数组类型） 停车记录 停车记录
    entryTime 入场时间 string(date-time)
    id 主键 id integer(int64)
    lotId 停车场 id integer(int64)
    monetary 消费金额 string
    outTime 出场时间 string(date-time)
    parkName 停车场名称 string
    parkNo 车位号 string
    plateNumber 车牌号 string
    address 停车场地址 string
    total 总记录数 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [
    {
    "id": 1,
    "lotId": 4,
    "entryTime": "2021-04-11 17:24:37",
    "outTime": "2021-04-11 18:24:45",
    "plateNumber": "辽 B12345",
    "monetary": "5",
    "parkName": "天津市邦仓储威物流停车场",
    "parkNo": "1",
    "address": "天津市邦仓储威物流"
    }
    ],
    "total": "1"
    }
    2.2.5.查询停车场详情
     */
    const val get_api_park_lot_record_list= "/prod-api/api/park/lot/record/list"

    /**2.2.5.查询停车场详情 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 停车场主键 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 停车场
    address 地址 string
    allPark 总停车位 string
    distance 距离（米） string
    id 主键 id integer(int64)
    imgUrl 图片地址 string
    open 对外开放，参见字典名：系统是否 string
    参数名称 参数说明 类型
    parkName 停车场名称 string
    priceCaps 封顶价格 string
    rates 收费 string
    remark 备注 string
    vacancy 空位个数 string
    msg 返回消息内容 string
    响应示例
    {
    "code": "200",
    "data": {
    "id": 1,
    "parkName": "国际大厦停车场",
    "vacancy": "30",
    "priceCaps": "30",
    "imgUrl": "/dev-api/profile/upload/image/2021/04/11/ac978c51-d75a
    -4797-9845-86a73527c55d.jpg",
    "rates": "5",
    "address": "大连市国际大厦 F1 楼",
    "distance": "20",
    "allPark": "90",
    "open": "Y"
    },
    "msg": "操作成功"
    }
    2.3 充值相关接口
    2.3.1.查询充值记录列表
     */
    const val get_api_park_lot__id_= "/prod-api/api/park/lot/{id}"

    /**2.3.1.查询充值记录列表 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数 支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    暂无
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 充值记录
    id 主键 id integer(int64)
    money 充值金额（元） integer(int64)
    payType 支付方式，参见字典名：支付类型 string
    rechargeDate 充值时间 string(date-time)
    remark 备注 string
    userId 用户 integer(int64)
    total 总记录数 string
    响应示例
    {
    "code": "200",
    "msg": "查询成功",
    "rows": [
    {
    "id": 4,
    "userId": 2,
    "money": 200,
    "rechargeDate": "2021-05-08 12:48:42",
    "payType": "支付宝",
    }
    ],
    "total": "1"
    }
    2.3.2.充值
     */
    const val get_api_park_recharge_list= "/prod-api/api/park/recharge/list"

    /**2.3.2.充值 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    money 充值金额 query false integer(int64)
    payType 支付方式，参见字典名：支付类型 query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": "200",
    "msg": "操作成功"
    }
    2.4 商品相关接口
    2.4.1.查询换购商品列表
     */
    const val post_api_park_recharge_pay= "/prod-api/api/park/recharge/pay"

    /**2.4.1.查询换购商品列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数 支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    cover 封面 query false string
    description 详情 query false string
    id 主键 id query false integer(int64)
    name 商品名 query false string
    price 价格 query false number
    saleQuantity 销量 query false integer(int32)
    score 所需积分 query false integer(int32)
    total 总数量 query false integer(int32)
    响应参数
    参数名称 参数说明 类型
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 积分商品
    cover 封面 string
    description 详情 string
    id 主键 id integer(int64)
    name 商品名 string
    price 价格 number
    saleQuantity 销量 integer(int32)
    score 所需积分 integer(int32)
    total 总数量 integer(int32)
    total 总记录数 string
    响应示例
    {
    "code": "200 ",
    "msg": "查询成功",
    "rows": [
    {
    "id": 1,
    "name": "500 元加油卡",
    "price": 500,
    "score": 300,
    "cover": "/dev-api/profile/upload/image/2021/04/12/5fe0672b-cf2
    7-41bb-b9e3-99bf2376fdb6.jpg",
    "total": 500,
    "saleQuantity": 100,
    "description": "<p></p>"
    }
    ],
    "total": "1"
    }
    2.5 广告轮播接口
    2.5.1.查询广告列表
     */
    const val get_api_park_product_list= "/prod-api/api/park/product/list"

    /**2.5.1.查询广告列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数 支持分页和排序 参数参见表格分页和排序说明
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 广告轮播实体
    advImg 广告图片 string
    advTitle 广告标题 string
    id 广告 ID integer(int64)
    remark 备注 string
    servModule 业务模块 string
    sort 排序 integer(int64)
    参数名称 参数说明 类型
    targetId 跳转详情 id integer(int64)
    total 总记录数 string
    响应示例
    {
    "code": " 200 ",
    "msg": "查询成功",
    "rows": [
    {
    "id": 18,
    "sort": 1,
    "advTitle": "新闻",
    "advImg": "http://118.190.154.52:7777/profile/upload/image/2021
    /05/05/73143911-6ae6-4423-aab5-545f619dc7ac.jpeg",
    "servModule": "新闻",
    "targetId": 1,
    "type": "2"
    }
    ],
    "total": "1"
    }
    2.6 意见反馈接口
    2.6.1.新增意见反馈
     */
    const val get_api_park_rotation_list= "/prod-api/api/park/rotation/list"

    /**2.6.1.新增意见反馈 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "content": "内容需要加强",
    "title": "发现错误"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    content 反馈内容 false string
    title 反馈标题 false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    响应示例
    {
    "code": "操作成功",
    "msg": " 200 "
    }
    2.6.2.查询意见反馈列表
     */
    const val post_api_park_feedback= "/prod-api/api/park/feedback"

    /**2.6.2.查询意见反馈列表 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数 支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    title 反馈标题 query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 反馈实体
    content 反馈内容 string
    id 反馈 ID integer(int64)
    remark 备注 string
    title 反馈标题 string
    userId 反馈人用户 ID integer(int64)
    total 总记录数 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 48,
    "title": "问题反馈",
    "content": "总有不按规定时间停车的车辆",
    "userId": 2
    }],
    "total": "1"
    }
    2.6.3.获取意见反馈详细信息
     */
    const val get_api_park_feedback_list= "/prod-api/api/park/feedback/list"

    /**2.6.3.获取意见反馈详细信息 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 反馈实体
    content 反馈内容 string
    id 反馈 ID integer(int64)
    title 反馈标题 string
    userId 反馈人用户 ID integer(int64)
    msg 返回消息内容 string
    响应示例
    {
    "code": " 200 ",
    "data": {
    "id": 4,
    "appType": "movie",
    "title": "发现错误",
    "content": "反馈内容",
    "userId": 1
    },
    "msg": "操作成功"
    }
    2.7 新闻相关接口
    2.7.1.获取新闻分类
     */
    const val get_api_park_feedback__id_= "/prod-api/api/park/feedback/{id}"

    /**2.7.1.获取新闻分类 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数 无
    支持分页和排序 参数参见表格分页和排序说明
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 新闻分类实体
    id 分类编号 integer(int64)
    name 分类名称 string
    sort 分类序号 integer(int32)
    total 总记录数 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 3,
    "name": "时事新闻",
    "sort": 1,
    }],
    "total": "1"
    }
    2.7.2.获取新闻评论列表
     */
    const val get_api_park_press_category_list= "/prod-api/api/park/press/category/list"

    /**2.7.2.获取新闻评论列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    commentDate 评论时间 query false string(date-time)
    newsId 新闻 ID query true integer(int64)
    userId 评论人 id query false integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 新闻评论实体
    commentDate 评论时间 string(date-time)
    content 评论内容 string
    id 评论 ID integer(int64)
    参数名称 参数说明 类型
    likeNum 点赞数 integer(int64)
    newsId 新闻 ID integer(int64)
    userId 评论人 id integer(int64)
    userName 用户名 string
    total 总记录数 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 7,
    "newsId": 135,
    "content": "支持",
    "commentDate": "2021-05-11 17:10:32",
    "userId": 2,
    "likeNum": 0,
    "userNum": 0,
    }],
    "total": "1"
    }
    2.7.3.获取新闻评论详细信息
     */
    const val get_api_park_press_comments_list= "/prod-api/api/park/press/comments/list"

    /**2.7.3.获取新闻评论详细信息 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 评论 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 新闻评论实体
    commentDate 评论时间 string(date-time)
    content 评论内容 string
    id 评论 ID integer(int64)
    likeNum 点赞数 integer(int64)
    newsId 新闻 ID integer(int64)
    userId 评论人 id integer(int64)
    msg 返回消息内容 string
    appType app 类型 string
    newsTitle 新闻类型 string
    响应示例
    {
    "code": 200,
    "data": {
    "id": 7,
    "appType": "living",
    "newsId": 135,
    "content": "支持",
    "commentDate": "2021-05-11 17:10:32",
    "userId": 2,
    "likeNum": 0,
    "newsTitle": "卓创资讯：猪价放量急跌 多地猪价破“10”"
    },
    "msg": "操作成功"
    }
    2.7.4.新闻点赞
     */
    const val get_api_park_press_comments__id_= "/prod-api/api/park/press/comments/{id}"

    /**2.7.4.新闻点赞 PUT
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 新闻 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    2.7.5.获取新闻列表
     */
    const val put_api_park_press_press_like__id_= "/prod-api/api/park/press/press/like/{id}"

    /**2.7.5.获取新闻列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    hot 是否热点，参见字典名：系统是否 query false string
    publishDate 发布日期 query false string(date-time)
    title 新闻标题 query false string
    top 是否推荐，参见字典名：系统是否 query false string
    type 新闻类型 id query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 新闻实体
    commentNum 评论数 integer(int64)
    content 新闻内容 string
    cover 新闻封面图片地址 string
    hot 是否热点，参见字典名：系统是否 string
    id 新闻 ID integer(int64)
    likeNum 点赞数 integer(int64)
    参数名称 参数说明 类型
    publishDate 发布日期 string(date-time)
    readNum 阅读数 integer(int64)
    subTitle 新闻副标题 string
    title 新闻标题 string
    top 是否推荐，参见字典名：系统是否 string
    total 总记录数 string
    appType app 类型 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 5,
    "appType": "park",
    "cover": "/dev-api/profile/upload/image/2021/04/01/c1eb74b2-e96
    4-4388-830a-1b606fc9699f.png",
    "title": "测试新闻标题",
    "subTitle": "测试新闻子标题",
    "content": "<p>内容<img src=\"/dev-api/profile/upload/image/202
    1/04/07/a9434ccf-5acf-4bf5-a06e-c3457c6762e9.png\"></p>",
    "status": "Y",
    "publishDate": "2021-04-01",
    "tags": null,
    "commentNum": 1,
    "likeNum": 2,
    "readNum": 10,
    "type": "2",
    "top": "Y",
    "hot": "N"
    }],
    "total": 1
    }
    2.7.6.获取新闻详细信息
     */
    const val get_api_park_press_press_list= "/prod-api/api/park/press/press/list"

    /**2.7.6.获取新闻详细信息 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 新闻 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 新闻实体
    commentNum 评论数 integer(int64)
    content 新闻内容 string
    cover 新闻封面图片地址 string
    hot 是否热点，参见字典名：系统是否 string
    id 新闻 ID integer(int64)
    likeNum 点赞数 integer(int64)
    publishDate 发布日期 string(date-time)
    readNum 阅读数 integer(int64)
    subTitle 新闻副标题 string
    参数名称 参数说明 类型
    title 新闻标题 string
    top 是否推荐，参见字典名：系统是否 string
    msg 返回消息内容 string
    appType app 类型 string
    响应示例
    {
    "code": 200,
    "data": {
    "id": 5,
    "appType": "movie",
    "cover": "/dev-api/profile/upload/image/2021/04/01/c1eb74b2-e964-
    4388-830a-1b606fc9699f.png",
    "title": "驱蚊器无去",
    "subTitle": "123123123",
    "content": "<p>企鹅王请问<img src=\"/dev-api/profile/upload/image
    /2021/04/07/a9434ccf-5acf-4bf5-a06e-c3457c6762e9.png\"></p>",
    "status": "Y",
    "publishDate": "2021-04-01",
    "tags": null,
    "commentNum": null,
    "likeNum": 3,
    "readNum": null,
    "type": "2",
    "top": "Y",
    "hot": "N"
    },
    "msg": "操作成功"
    }
    2.7.7.发表新闻评论
     */
    const val get_api_park_press_press__id_= "/prod-api/api/park/press/press/{id}"

    /**2.7.7.发表新闻评论 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "newsId": 5
    "content": "新闻评论测试"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    content 评论内容 false string
    newsId 新闻 ID true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    2.7.8.评论点赞
     */
    const val post_api_park_press_pressComment= "/prod-api/api/park/press/pressComment"

    /**2.7.8.评论点赞 PUT
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 新闻 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    2.8 积分相关接口
    2.8.1.积分兑换
     */
    const val put_api_park_press_pressComment_like__id_= "/prod-api/api/park/press/pressComment/like/{id}"

    /**2.8.1.积分兑换 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    productId productId path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    2.8.2.查询积分等级列表
     */
    const val post_api_park_score_consume__productId_= "/prod-api/api/park/score/consume/{productId}"

    /**2.8.2.查询积分等级列表 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数 无
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 积分等级
    id 主键 id integer(int64)
    name 等级名 string
    score 所需积分 integer(int64)
    参数名称 参数说明 类型
    total 总记录数 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 2,
    "name": "白金",
    "score": 1000
    }],
    "total": "1"
    }
    2.8.3.查询积分记录列表
     */
    const val get_api_park_score_level_list= "/prod-api/api/park/score/level/list"

    /**2.8.3.查询积分记录列表 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数 无
    支持分页和排序 参数参见表格分页和排序说明
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 积分记录
    changeDate 变更日期 string(date-time)
    参数名称 参数说明 类型
    event 事件，参见字典名：积分事件 string
    id 主键 id integer(int64)
    score 积分变更 string
    type 变更类型，参见字典名：积分变更类型 string
    userId 用户 integer(int64)
    total 总记录数 string
    userName 用户名 string
    响应示例
    {
    "code": "",
    "msg": "",
    "rows": [{
    "id": 2,
    "userId": 1,
    "event": "绑定车辆",
    "score": "10",
    "changeDate": "2021-04-15 15:17:36",
    "userName": null,
    "type": "获取"
    }],
    "total": 1
    }
    2.8.4.获取系统用户获取积分消息
     */
    const val get_api_park_score_list= "/prod-api/api/park/score/list"

    /**2.8.4.获取系统用户获取积分消息 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    无 支持分页和排序 参数参见表格分页和排序说明
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 积分记录
    changeDate 变更日期 string(date-time)
    event 事件，参见字典名：积分事件 string
    id 主键 id integer(int64)
    score 积分变更 string
    type 变更类型，参见字典名：积分变更类型 string
    userId 用户 integer(int64)
    userName 用户名 string
    total 总记录数 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 2,
    "userId": 1,
    "event": "绑定车辆",
    "score": "10",
    "changeDate": "2021-04-15 15:17:36",
    "userName": "admin",
    "type": "获取"
    }],
    "total": 1
    }
    2.8.5.查询积分排行榜
     */
    const val get_api_park_score_notice_list= "/prod-api/api/park/score/notice/list"

    /**2.8.5.查询积分排行榜 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    无
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） SysUser_1
    avatar 头像 string
    nickName 昵称 string
    score 积分 integer(int32)
    sex 性别，参见字典名：用户性别 string
    userId 用户 id integer(int64)
    userName 用户名 string
    total 总记录数 string
    参数名称 参数说明 类型
    depeId 部门 id string
    email 邮件 string
    phoneNumber 电话号码 string
    salt 状态 char
    sataus 登录状态 char
    delFlag 删除标识 string
    loginIp 登录 ip string
    loginDate 登录日期 string
    idCard id string
    balance 余额 string
    roles 职位 string
    roleIds 职位 id string
    postIds 邮寄地址 string
    admin 用户 string
    响应示例
    {
    "code": "",
    "msg": "",
    "rows": [{
    "avatar": "http://localhost/pic/avatar.jpg",
    "nickName": "小向量",
    "score": 1000,
    "sex": "1",
    "userId": 1,
    "userName": "ljxl"
    "deptId": null,
    "email": ""
    "phonenumber": "18623323323",
    "salt": null,
    "status": "0",
    "delFlag": "0",
    "loginIp": "",
    "loginDate": null,
    "idCard": "123456789000000001",
    "balance": 269.00,
    "roles": [],
    "roleIds": null,
    "postIds": null,
    "admin": false
    },
    "total": ""
    }
    2.9 车辆相关接口
    2.9.1.添加我的车辆信息
     */
    const val get_api_park_score_top_list= "/prod-api/api/park/score/top/list"

    /**2.9.1.添加我的车辆信息 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "plateNo": "辽 B123456",
    "type": "汽油车"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    参数名称 参数说明 请求类型 必须 数据类型
    plateNo 车牌号 false string
    type 车型，参见字典名：车辆类型 false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    2.9.2.修改我的车辆信息
     */
    const val post_api_park_car= "/prod-api/api/park/car"

    /**2.9.2.修改我的车辆信息 PUT
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "id": 4,
    "plateNo": "辽 B55555",
    "type": ""
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    参数名称 参数说明 请求类型 必须 数据类型
    parkCar parkCar body true 车辆信息
    id 主键 true integer(int64)
    plateNo 车牌号 false string
    type 车型，参见字典名：车辆类型 false string
    响应参数
    参数名称 参数说明 类型 schema
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    2.9.3.查询车辆里程信息
     */
    const val put_api_park_car= "/prod-api/api/park/car"

    /**2.9.3.查询车辆里程信息 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    plateNo 车牌号 query true string
    参数名称 参数说明 请求类型 必须 数据类型
    travelDate 行驶日期 query false string(date-time)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 油耗记录
    amount 金额（元） number
    gasFilling 加油量（升） number(double)
    id 主键 id integer(int64)
    plateNo 车牌号 string
    travelDate 行驶日期 string(date-time)
    travelDistance 行驶里程（公里） number(double)
    userId 用户 integer(int64)
    total 总记录数 string
    userName 用户名 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 2,
    "plateNo": "辽 B12345",
    "travelDate": "2021-02-01",
    "travelDistance": 100,
    "gasFilling": 50,
    "amount": 600,
    "userId": 2,
    "userName": null
    }],
    "total": "1"
    }
    2.9.4.添加车辆里程信息
     */
    const val get_api_park_car_consumption= "/prod-api/api/park/car/consumption"

    /**2.9.4.添加车辆里程信息 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "amount": 100,
    "gasFilling": 100,
    "plateNo": "辽 B444444",
    "travelDate": "2021-09-10",
    "travelDistance": 100
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    amount 金额（元） false number
    gasFilling 加油量（升） false number(double)
    plateNo 车牌号 false string
    travelDate 行驶日期 false string(date-time)
    travelDistance 行驶里程（公里） false number(double)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    2.9.5.修改车辆里程信息
     */
    const val post_api_park_car_consumption= "/prod-api/api/park/car/consumption"

    /**2.9.5.修改车辆里程信息 PUT
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "amount": 10,
    "gasFilling": 10,
    "id": 2,
    "plateNo": "",
    "travelDate": "2021-09-10",
    "travelDistance": 10
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    parkConsumption parkConsumption body true 油耗记录
    amount 金额（元） false number
    gasFilling 加油量（升） false number(double)
    参数名称 参数说明 请求类型 必须 数据类型
    id 主键 id true integer(int64)
    plateNo 车牌号 false string
    travelDate 行驶日期 false string(date-time)
    travelDistance 行驶里程（公里） false number(double)
    响应参数
    参数名称 参数说明 类型 schema
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    2.9.6.删除车辆里程信息
     */
    const val put_api_park_car_consumption= "/prod-api/api/park/car/consumption"

    /**2.9.6.删除车辆里程信息 DELETE
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id id path true integer(int64)
    响应参数
    参数名称 参数说明 类型 schema
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    2.9.7.申请挪车
     */
    const val delete_api_park_car_consumption__id_= "/prod-api/api/park/car/consumption/{id}"

    /**2.9.7.申请挪车 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    address 详细地址 query false string
    area 区 query true string
    city 市 query true string
    idCard 身份证号 query true string
    photo 现场照片路径 query true string
    plateNo 车牌号 query true string
    参数名称 参数说明 请求类型 必须 数据类型
    province 省 query true string
    tel 联系电话 query true string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 object
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "data": {
    "plateNo": "车牌号",
    "tel": "联系电话"
    },
    "msg": "操作成功"
    }
    2.9.8.查询我的车辆信息
     */
    const val post_api_park_car_move= "/prod-api/api/park/car/move"

    /**2.9.8.查询我的车辆信息 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    无 支持分页和排序 参数参见表格分页和排序说明
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 车辆信息
    id 主键 integer(int64)
    plateNo 车牌号 string
    type 车型，参见字典名：车辆类型 string
    userId 用户 id integer(int64)
    total 总记录数 string
    userName 用户名 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 1,
    "plateNo": "辽 B12345",
    "type": "新能源车",
    "userId": 2,
    "userName": null
    }],
    "total": "1"
    }
    2.9.9.删除我的车辆信息
     */
    const val get_api_park_car_my= "/prod-api/api/park/car/my"

    /**2.9.9.删除我的车辆信息 DELETE
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    2.9.10.挪车历史
     */
    const val delete_api_park_car__id_= "/prod-api/api/park/car/{id}"

    /**2.9.10.挪车历史 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    address 详细地址 query false string
    参数名称 参数说明 请求类型 必须 数据类型
    area 区 query true string
    city 市 query true string
    idCard 身份证号 query true string
    plateNo 车牌号 query true string
    province 省 query true string
    tel 联系电话 query true string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 object
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "data": {
    "plateNo": "车牌号",
    "tel": "联系电话"
    },
    "msg": "操作成功"
    }
    3 城市地铁
    3.1 广告轮播接口
    3.1.1查询广告列表
     */
    const val post_api_park_car_history_list= "/prod-api/api/park/car/history/list"

    /**3.1.1查询广告列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数 支持分页和排序 参数参见表格分页和排序说明
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 广告轮播实体
    advImg 广告图片 string
    advTitle 广告标题 string
    id 广告 ID integer(int64)
    servModule 业务模块 string
    sort 排序 integer(int64)
    targetId 跳转详情 id integer(int64)
    total 总记录数 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [
    {
    "id": 11,
    "status": "1",
    "sort": 1,
    "advTitle": "地铁广告 1",
    "advImg": "http://118.190.154.52:7777/profile/upload/image/2021
    /05/12/a2f1ed87-6d72-49e5-b749-a7277321bae6.jpg",
    "servModule": "新闻资讯",
    "targetId": 78,
    "type": "2"
    }
    ],
    "total": 3
    }
    3.2 意见反馈接口
    3.2.1.新增意见反馈
     */
    const val get_api_metro_rotation_list= "/prod-api/api/metro/rotation/list"

    /**3.2.1.新增意见反馈 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "content": "检票通道时间太短",
    "title": "乘坐反馈"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    content 反馈内容 false string
    title 反馈标题 false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    响应示例
    {
    "code": "操作成功",
    "msg": " 200 "
    }
    3.2.2.查询意见反馈列表
     */
    const val post_api_metro_feedback= "/prod-api/api/metro/feedback"

    /**3.2.2.查询意见反馈列表 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数 支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    title 反馈标题 query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 反馈实体
    content 反馈内容 string
    参数名称 参数说明 类型
    id 反馈 ID integer(int64)
    title 反馈标题 string
    userId 反馈人用户 ID integer(int64)
    total 总记录数 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [
    {
    "id": 87,
    "title": "乘坐反馈",
    "content": "检票通道时间太短",
    "userId": 2
    }
    ],
    "total": 15
    }
    3.2.3.获取意见反馈详细信息
     */
    const val get_api_metro_feedback_list= "/prod-api/api/metro/feedback/list"

    /**3.2.3.获取意见反馈详细信息 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 反馈实体
    content 反馈内容 string
    id 反馈 ID integer(int64)
    title 反馈标题 string
    userId 反馈人用户 ID integer(int64)
    msg 返回消息内容 string
    appType app 类型 string
    parentId 人员 id string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "id": 86,
    "title": "乘坐反馈",
    "content": "有时检票卡",
    "userId": 2
    "appType": "takeout"
    }
    }
    3.3 地铁资讯接口
    3.3.1.获取新闻分类
     */
    const val get_api_metro_feedback__id_= "/prod-api/api/metro/feedback/{id}"

    /**3.3.1.获取新闻分类 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 新闻分类实体
    id 分类编号 integer(int64)
    name 分类名称 string
    sort 分类序号 integer(int32)
    total 总记录数 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功",
    "data": [{
    "id": 4,
    "name": "新闻",
    "sort": 1,
    "appType": "metro",
    "parentId": null
    }
    ]
    }
    3.3.2.获取新闻评论列表
     */
    const val get_api_metro_press_category_list= "/prod-api/api/metro/press/category/list"

    /**3.3.2.获取新闻评论列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    commentDate 评论时间 query false string(date-time)
    newsId 新闻 ID query true integer(int64)
    userId 评论人 id query false integer(int64)
    请求示例： /prod-api/api/metro/press/comments/list?newsId=70
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 新闻评论实体
    commentDate 评论时间 string(date-time)
    参数名称 参数说明 类型
    content 评论内容 string
    id 评论 ID integer(int64)
    likeNum 点赞数 integer(int64)
    newsId 新闻 ID integer(int64)
    userId 评论人 id integer(int64)
    userName 用户名 string
    total 总记录数 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 9,
    "appType": "metro",
    "newsId": 70,
    "content": "这真是个好消息",
    "commentDate": "2021-05-11 20:01:36",
    "userId": 2,
    "likeNum": 0,
    "userName": "test01",
    "newsTitle": "传奈雪 6 月中上旬上市 公司回应：处于静默期
    暂不回应"
    }],
    "total": 1
    }
    3.3.3.获取新闻评论详细信息
     */
    const val get_api_metro_press_comments_list= "/prod-api/api/metro/press/comments/list"

    /**3.3.3.获取新闻评论详细信息 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 评论 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 新闻评论实体
    commentDate 评论时间 string(date-time)
    content 评论内容 string
    id 评论 ID integer(int64)
    likeNum 点赞数 integer(int64)
    newsId 新闻 ID integer(int64)
    userId 评论人 id integer(int64)
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "data": {
    "id": 9,
    "appType": "metro",
    "newsId": 70,
    "content": "这真是个好消息",
    "commentDate": "2021-05-11 20:01:36",
    "userId": 2,
    "likeNum": 0,
    "userName": "test01",
    "newsTitle": "传奈雪 6 月中上旬上市 公司回应：处于静默期 暂不回
    应"
    },
    "msg": "操作成功"
    }
    3.3.4.新闻点赞
     */
    const val get_api_metro_press_comments__id_= "/prod-api/api/metro/press/comments/{id}"

    /**3.3.4.新闻点赞 PUT
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 新闻 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    3.3.5.获取新闻列表
     */
    const val put_api_metro_press_press_like__id_= "/prod-api/api/metro/press/press/like/{id}"

    /**3.3.5.获取新闻列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请 求 示 例 ：
    /prod-api/api/metro/press/press/list?type=4&pageNum=1&pageSize=6
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    hot 是否热点，参见字典名：系统是否 query false string
    publishDate 发布日期 query false string(date-time)
    title 新闻标题 query false string
    type 新闻分类 id query false string
    top 是否推荐，参见字典名：系统是否 query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 新闻实体
    commentNum 评论数 integer(int64)
    参数名称 参数说明 类型
    content 新闻内容 string
    cover 新闻封面图片地址 string
    hot 是否热点，参见字典名：系统是否 string
    id 新闻 ID integer(int64)
    likeNum 点赞数 integer(int64)
    publishDate 发布日期 string(date-time)
    readNum 阅读数 integer(int64)
    subTitle 新闻副标题 string
    title 新闻标题 string
    top 是否推荐，参见字典名：系统是否 string
    total 总记录数 string
    appType app 类型 string
    响应示例
    {
    "total": 5,
    "rows": [
    {
    "id": 70,
    "appType": "metro",
    "cover": "http://118.190.154.52:7777/profile/upload/image/2021/
    05/08/3685afd2-a49d-4f9d-be6a-d645e1f252aa.jpg",
    "title": "传奈雪 6 月中上旬上市 公司回应：处于静默期 暂不回应",
    "subTitle": null,
    "content": "<p>5 月 8 日消息，今日，有媒体消息称，奈雪计划于 5 月 1
    3 日聆讯。按照港交所上市流程，奈雪或将在 6 月中上旬完成上市。对于上述消
    息，奈雪公关高级总监王依回应新浪财经称，感谢关注，目前公司还处于静默期，
    暂不回应相关市场传闻。</p>",
    "status": "Y",
    "publishDate": "2021-05-08",
    "tags": null,
    "commentNum": 42,
    "likeNum": 23,
    "readNum": 976,
    "type": "4",
    "top": "Y",
    "hot": "Y"
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    3.3.6.获取新闻详细信息
     */
    const val get_api_metro_press_press_list= "/prod-api/api/metro/press/press/list"

    /**3.3.6.获取新闻详细信息 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 新闻 id path true integer(int64)
    请求示例： /prod-api/api/metro/press/press/70
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 新闻实体
    参数名称 参数说明 类型
    commentNum 评论数 integer(int64)
    content 新闻内容 string
    cover 新闻封面图片地址 string
    hot 是否热点，参见字典名：系统是否 string
    id 新闻 ID integer(int64)
    likeNum 点赞数 integer(int64)
    publishDate 发布日期 string(date-time)
    readNum 阅读数 integer(int64)
    subTitle 新闻副标题 string
    title 新闻标题 string
    top 是否推荐，参见字典名：系统是否 string
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "id": 70,
    "appType": "metro",
    "cover": "http://118.190.154.52:7777/profile/upload/image/2021/05
    /08/3685afd2-a49d-4f9d-be6a-d645e1f252aa.jpg",
    "title": "传奈雪 6 月中上旬上市 公司回应：处于静默期 暂不回应",
    "subTitle": null,
    "content": "<p>5 月 8 日消息，今日，有媒体消息称，奈雪计划于 5 月 13
    日聆讯。按照港交所上市流程，奈雪或将在 6 月中上旬完成上市。对于上述消息，
    奈雪公关高级总监王依回应新浪财经称，感谢关注，目前公司还处于静默期，暂
    不回应相关市场传闻。</p>",
    "status": "Y",
    "publishDate": "2021-05-08",
    "tags": null,
    "commentNum": 42,
    "likeNum": 23,
    "readNum": 976,
    "type": "4",
    "top": "Y",
    "hot": "Y"
    }
    }
    3.3.7.发表新闻评论
     */
    const val get_api_metro_press_press__id_= "/prod-api/api/metro/press/press/{id}"

    /**3.3.7.发表新闻评论 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型 application/json
    请求示例
    {
    "newsId": 70
    "content": "这真是个好消息"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    content 评论内容 false string
    newsId 新闻 ID true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    参数名称 参数说明 类型
    msg 消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    3.3.8.评论点赞
     */
    const val post_api_metro_press_pressComment= "/prod-api/api/metro/press/pressComment"

    /**3.3.8.评论点赞 PUT
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 新闻 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    3.4 乘车码相关接口
    3.4.1.获取当前用户乘车卡信息
     接口地址
    GET /prod-api/api/metro/card
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    无
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 乘车码
    id integer(int64)
    userName 用户名 string
    idCard 身份证号 string
    phonenumber 联系电话 string
    cardNum 乘车码卡号 string
    userId 用户 id integer(int64)
    参数名称 参数说明 类型
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "id": 1,
    "userName": "王大卫",
    "idCard": "210211199909090014",
    "phonenumber": "13800000000",
    "cardNum": "2021042710153823761",
    "userId": 2
    }
    }
    3.4.2.领取乘车卡
     */
    const val put_api_metro_press_pressComment_like__id_= "/prod-api/api/metro/press/pressComment/like/{id}"

    /**3.4.2.领取乘车卡 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "idCard": "210211199909090014",
    "phonenumber": "13800000000",
    "userName": "王大卫"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    idCard 身份证号 false string
    phonenumber 联系电话 false string
    userName 用户名 false string
    响应参数
    参数名称 参数说明 类型 schema
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200
    }
    3.4.3.注销乘车卡
     */
    const val post_api_metro_card= "/prod-api/api/metro/card"

    /**3.4.3.注销乘车卡 DELETE
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/metro/card/3
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    参数名称 参数说明 请求类型 必须 数据类型
    id 乘车卡 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200
    }
    3.5 公告相关接口
    3.5.1.获取地铁公告列表
     */
    const val delete_api_metro_card__id_= "/prod-api/api/metro/card/{id}"

    /**3.5.1.获取地铁公告列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/metro/notice/list?pageNum=1&pageSize=8
    请求参数 支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    title 公告标题 query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 地铁公告
    id integer(int64)
    title 公告标题 string
    content 公告内容 string
    createTime 发布时间 string(date-time)
    total 总记录数 string
    响应示例
    {
    "total": 1,
    "rows": [
    {
    "id": 1,
    "title": "北京地铁怎么办电子卡 办电子卡方法",
    "content": "<p>\t<span style=\"color: rgb(17, 17, 17);\">下载北
    京市政一卡通 app 即可办理电子卡 见下面这个图：</span></p><p class=\"ql
    -indent-1 ql-align-justify\"><img src=\"/dev-api/profile/upload/image
    /2021/04/07/63a67ccf-b992-4356-b709-8c71c679f98c.png\"></p><p>\t<span
    style=\"color: rgb(17, 17, 17);\">如果你只是坐地铁可以不办实体卡，所
    有地铁闸机都有扫码功能，即便不下载市政一卡通 app，下载“易通行”app 也
    可以扫码坐地铁。但如果要坐公交*好还是办一下实体的，不是所有的公交线路
    都可以扫码。</span></p>"
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    3.5.2.获取地铁公告详情
     */
    const val get_api_metro_notice_list= "/prod-api/api/metro/notice/list"

    /**3.5.2.获取地铁公告详情 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/metro/notice/1
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 公告 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 地铁公告
    id integer(int64)
    title 公告标题 string
    content 公告内容 string
    createTime 发布时间 string(date-time)
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "id": 1,
    "title": "北京地铁怎么办电子卡 办电子卡方法",
    "content": "<p>\t<span style=\"color: rgb(17, 17, 17);\">下载北京
    市政一卡通 app 即可办理电子卡 见下面这个图：</span></p><p class=\"ql-i
    ndent-1 ql-align-justify\"><img src=\"/dev-api/profile/upload/image/2
    021/04/07/63a67ccf-b992-4356-b709-8c71c679f98c.png\"></p><p>\t<span s
    tyle=\"color: rgb(17, 17, 17);\">如果你只是坐地铁可以不办实体卡，所有
    地铁闸机都有扫码功能，即便不下载市政一卡通 app，下载“易通行”app 也可
    以扫码坐地铁。但如果要坐公交*好还是办一下实体的，不是所有的公交线路都
    可以扫码。</span></p>"
    }
    }
    3.5.3.获取地铁声明
     */
    const val get_api_metro_notice__id_= "/prod-api/api/metro/notice/{id}"

    /**3.5.3.获取地铁声明 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/metro/statement?type=1
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    type 类型 1 乘车须知 2 乘车卡领取通知 3 免责声明 query true string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 地铁声明
    参数名称 参数说明 类型
    id integer(int64)
    title 声明标题 string
    content 声明内容 string
    type 声明类型 1 乘车须知 2 乘车卡领取通知 3 免责声明 string
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "id": 1,
    "title": "乘车须知",
    "content": "乘车须知",
    "type": "1"
    }
    }
    3.6 失物招领相关接口
    3.6.1.获取失物列表
     */
    const val get_api_metro_statement= "/prod-api/api/metro/statement"

    /**3.6.1.获取失物列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/metro/found/list
    请求参数 无
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    data 列表数据（数组类型） 失物信息
    publishDate 失物招领发布日期 string(date-time)
    metroFoundList 失物列表 array
    id integer
    imgUrl 失物照片 string
    foundTime 拾取时间 string
    foundPlace 拾取地点 string
    claimPlace 认领地点 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "publishDate": "2021-04-06",
    "metroFoundList": [
    {
    "id": 4,
    "imgUrl": "/dev-api/profile/upload/image/2021/04/07/a86d0ef
    d-4ffb-488b-8fe0-36a84d343066.png",
    "foundTime": "2021-04-06",
    "foundPlace": "北京站",
    "claimPlace": "北京站服务中心"
    }
    ]
    }
    ]
    }
    3.6.2.获取失物详细信息
     */
    const val get_api_metro_found_list= "/prod-api/api/metro/found/list"

    /**3.6.2.获取失物详细信息 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/metro/found/4
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 失物 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 失物招领
    id integer
    imgUrl 失物照片 string
    foundTime 拾取时间 string
    foundPlace 拾取地点 string
    claimPlace 认领地点 string
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "id": 4,
    "imgUrl": "http://118.190.154.52:7777/profile/upload/image/2021/0
    5/08/429edfa6-af3a-4606-b419-bc013c248673.png",
    "foundTime": "2021-04-06",
    "foundPlace": "北京站",
    "claimPlace": "北京站服务中心"
    }
    }
    3.7 线路站点相关接口
    3.7.1.获取城市铁总览图
     */
    const val get_api_metro_found__id_= "/prod-api/api/metro/found/{id}"

    /**3.7.1.获取城市铁总览图 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数 无
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    data 地铁城市
    id integer(int64)
    name 城市名 string
    参数名称 参数说明 类型
    code 城市编码 integer(int64)
    imgUrl 城市地铁总览图 string
    msg 消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "id": 1,
    "name": "北京市",
    "code": 131,
    "imgUrl": "/dev-api/profile/upload/image/2021/04/05/896e5b9f-937a
    -499d-b7cd-2363e3f3a977.jpg"
    }
    }
    3.7.2.根据站点名和线路编号查找站点信息
     */
    const val get_api_metro_city= "/prod-api/api/metro/city"

    /**3.7.2.根据站点名和线路编号查找站点信息 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/metro/line?name=建国门&lineIds=31,33,35,38
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    lineIds 线路 id，多个以逗号分隔例如：31,33 query true string
    参数名称 参数说明 请求类型 必须 数据类型
    name 站点名 query true string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    data 线路站点
    lineList 经过该站点的线路列表 array
    cityId 城市 id integer
    cityName 城市名 string
    end 终点站 string
    endTime 末班时间 string
    first 始发站 string
    id integer
    name 路线名称 string
    remark string
    startTime 首班时间 string
    stepInfo 站点信息 站点 Vo
    crowd 拥挤度 integer
    name 站点名 string
    msg 消息内容 string
    响应示例
    "startTime": "05:15",
    "endTime": "22:30",
    "cityId": 1,
    "cityName": "北京市"
    }
    ]
    }
    }
    3.7.3.查询城市所有线路
     */
    const val get_api_metro_line= "/prod-api/api/metro/line"

    /**3.7.3.查询城市所有线路 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数 无
    响应参数
    参数名称 参数说明 类型 schema
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 站点线路 Vo 站点线路 Vo
    lineId 线路 id integer(int64)
    lineName 线路名 string
    total 总记录数 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "lineId": 1,
    "lineName": "16 号线"
    },
    {
    "lineId": 2,
    "lineName": "s1 线"
    }……
    ]
    }
    3.7.4.首页地铁站点查询
     */
    const val get_api_metro_line_list= "/prod-api/api/metro/line/list"

    /**3.7.4.首页地铁站点查询 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/metro/list?currentName=建国门
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    currentName 当前站点名称（建国门） query true string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    data 列表数据（数组类型） 地铁信息
    参数名称 参数说明 类型
    currentName 当前站点名称 string
    lineId 路线编号 integer(int64)
    lineName 路线名称 string
    nextStep 下一站信息 站点信息
    lines 经过本站点的地铁线路列表 array
    lineId 线路 id integer
    lineName 线路名 string
    name 站点名称 string
    preStep 上一站信息 站点信息
    lines 经过本站点的地铁线路列表 array
    lineId 线路 id integer
    lineName 线路名 string
    name 站点名称 string
    reachTime 达到本站时长 integer(int32)
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "lineId": 31,
    "lineName": "2 号线",
    "preStep": {
    "name": "朝阳门",
    "lines": [
    {
    "lineId": 21,
    "lineName": "6 号线"
    },
    {
    "lineId": 24,
    "lineName": "6 号线"
    },
    {
    "lineId": 31,
    "lineName": "2 号线"
    },
    {
    "lineId": 38,
    "lineName": "2 号线"
    }
    ]
    },
    "nextStep": {
    "name": "北京站",
    "lines": [
    {
    "lineId": 31,
    "lineName": "2 号线"
    },
    {
    "lineId": 38,
    "lineName": "2 号线"
    }
    ]
    },
    "currentName": "建国门",
    "reachTime": 7
    }
    ]
    }
    3.7.5.查询站点信息列表
     */
    const val get_api_metro_list= "/prod-api/api/metro/list"

    /**3.7.5.查询站点信息列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/metro/step/list?name=建国门
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    lineId 路线 id query false integer(int64)
    name 站点名称 query false string
    不传参数，则查询城市所有站点。 响应参数
    参数名称 参数说明 类型
    code 状态码 string
    data 列表数据（数组类型） 站点信息
    lines 经过本站点的地铁线路列表 array
    lineId 线路 id integer
    lineName 线路名 string
    name 站点名称 string
    msg 消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "name": "建国门",
    "lines": [
    {
    "lineId": 31,
    "lineName": "2 号线"
    },
    {
    "lineId": 33,
    "lineName": "1 号线"
    },
    {
    "lineId": 35,
    "lineName": "1 号线"
    },
    {
    "lineId": 38,
    "lineName": "2 号线"
    }
    ]
    }
    ]
    }
    3.7.6.查询地铁站详情
     */
    const val get_api_metro_step_list= "/prod-api/api/metro/step/list"

    /**3.7.6.查询地铁站详情 GET
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id id path true integer(int64)
    请求示例：/prod-api/api/metro/line/1
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    data 线路站点
    cityId 城市 id integer(int64)
    end 终点站 string
    endTime 末班时间 string
    first 始发站 string
    id integer(int64)
    km km integer(int32)
    metroStepList 地铁站实体 array
    id integer
    lineId 路线 id integer
    name 站点名称 string
    remark string
    seq 顺序号 integer
    name 路线名称 string
    remainingTime integer(int32)
    runStationsName 车辆运行站名称 string
    startTime 首班时间 string
    stationsNumber 站数 integer(int32)
    msg 消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "id": 1,
    "name": "16 号线",
    "first": "西苑",
    "end": "北安河",
    "startTime": "05:25",
    "endTime": "23:00",
    "cityId": 1,
    "stationsNumber": null,
    "km": 20,
    "runStationsName": "马连洼",
    "metroStepList": [
    {
    "searchValue": null,
    "createBy": null,
    "createTime": "2018-07-23 02:28:36",
    "updateBy": null,
    "updateTime": "2021-04-05 15:46:38",
    "remark": null,
    "params": {},
    "id": 1,
    "name": "西苑",
    "seq": 0,
    "lineId": 1,
    "firstCh": "X"
    }
    ],
    "remainingTime": 4
    }
    }
    3.8 乘车记录接口
    3.8.1获取所有用户乘车记录列表
     */
    const val get_api_metro_line__id_= "/prod-api/api/metro/line/{id}"

    /**3.8.1获取所有用户乘车记录列表 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    无，支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 乘车记录
    id integer(int64)
    lineId 线路 id integer(int64)
    offTime 下车时间 string(date-time)
    onTime 上车时间 string(date-time)
    price 价格 number
    start 上车站点 string
    stop 下车站点 string
    userId 用户 id integer(int64)
    userName 用户名 string
    参数名称 参数说明 类型
    createTime 记录创建时间 string(date-time)
    total 总记录数 string
    3.8.2 获取当前用户乘车记录列表
     */
    const val get_metro_record_list= "/prod-api/metro/record/list"

    /**3.8.2 获取当前用户乘车记录列表 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    无，支持分页和排序 参数参见表格分页和排序说明
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 乘车记录
    id integer(int64)
    lineId 线路 id integer(int64)
    offTime 下车时间 string(date-time)
    onTime 上车时间 string(date-time)
    price 价格 number
    start 上车站点 string
    参数名称 参数说明 类型
    stop 下车站点 string
    userId 用户 id integer(int64)
    userName 用户名 string
    createTime 记录创建时间 string(date-time)
    total 总记录数 string
    响应示例
    {
    "total": 13,
    "rows": [
    {
    "id": 13,
    "lineId": 33,
    "start": "军事博物馆",
    "stop": "木樨地",
    "price": 3,
    "onTime": "2021-05-09 20:02:02",
    "offTime": "2021-05-09 20:05:23",
    "userId": 2,
    "userName": "test01",
    "createTime": "2021-05-09 20:05:23"
    },
    ......
    ],
    "code": 200,
    "msg": "查询成功"
    }
    4 外卖订餐
    4.1 广告轮播接口
    4.1.1.查询广告列表
     */
    const val get_api_metro_record_list= "/prod-api/api/metro/record/list"

    /**4.1.1.查询广告列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 广告轮播实体
    advImg 广告图片 string
    advTitle 广告标题 string
    id 广告 ID integer(int64)
    servModule 业务模块 string
    sort 排序 integer(int64)
    targetId 跳转详情 id integer(int64)
    total 总记录数 string
    参数名称 参数说明 类型
    appType app 类型 string
    status 状态 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [
    {
    "id": 6,
    "appType": "takeout",
    "status": "1",
    "sort": 1,
    "advTitle": "店家 1",
    "advImg": "http://118.190.154.52:7777/profile/upload/image/2021
    /05/12/873a6039-4294-43fe-9209-408a001cf7df.png",
    "servModule": "外卖店家",
    "targetId": 1,
    "type": "2"
    }
    ],
    "total": 3
    }
    4.2 意见反馈接口
    4.2.1.新增意见反馈
     */
    const val get_api_takeout_rotation_list= "/prod-api/api/takeout/rotation/list"

    /**4.2.1.新增意见反馈 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "title": "配送问题",
    "content": "订单生成，但商家关门了",
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    content 反馈内容 false string
    title 反馈标题 false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    响应示例
    {
    "code": "操作成功",
    "msg": " 200 "
    }
    4.2.2.查询意见反馈列表
     */
    const val post_api_takeout_feedback= "/prod-api/api/takeout/feedback"

    /**4.2.2.查询意见反馈列表 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数 支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    title 反馈标题 query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 反馈实体
    content 反馈内容 string
    id 反馈 ID integer(int64)
    title 反馈标题 string
    userId 反馈人用户 ID integer(int64)
    total 总记录数 string
    appType app 类型 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [
    {
    "id": 72,
    "appType": "takeout",
    "title": "配送问题",
    "content": "订单生成，但商家关门了",
    "userId": 2
    }
    ],
    "total": 15
    }
    4.2.3.获取意见反馈详细信息
     */
    const val get_api_takeout_feedback_list= "/prod-api/api/takeout/feedback/list"

    /**4.2.3.获取意见反馈详细信息 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 反馈实体
    content 反馈内容 string
    id 反馈 ID integer(int64)
    title 反馈标题 string
    userId 反馈人用户 ID integer(int64)
    msg 返回消息内容 string
    参数名称 参数说明 类型
    appType app 类型 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "id": 72,
    "appType": "takeout",
    "title": "配送问题",
    "content": "订单生成，但商家关门了",
    "userId": 2
    }
    }
    4.3 外卖主题接口
    4.3.1.查询主题分类
     */
    const val get_api_takeout_feedback__id_= "/prod-api/api/takeout/feedback/{id}"

    /**4.3.1.查询主题分类 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数 无
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    参数名称 参数说明 类型
    msg 消息内容 string
    rows 列表数据（数组类型） 主题分类
    id integer(int64)
    imgUrl 图标 string
    sort 排序 integer(int64)
    themeDesc 描述 string
    themeName 主题名称 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "id": 1,
    "themeName": "美食",
    "themeDesc": "美食来找我",
    "imgUrl": "http://118.190.154.52:7777/profile/upload/image/2021
    /05/08/f8c06dfc-9da2-41cc-9784-8cf234c999f2.png",
    "sort": 1
    },
    ......
    ]
    }
    4.4 店家相关接口
    4.4.1.查询店家列表
     */
    const val get_api_takeout_theme_list= "/prod-api/api/takeout/theme/list"

    /**4.4.1.查询店家列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数 支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    name 店家名称 query false string
    recommend 是否推荐 Y 是 query false string
    themeId 经营主题 id query false integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 店家信息
    address 店家地址 string
    avgCost 人均消费 number
    deliveryTime 配送时间 integer(int32)
    distance 到店距离 number
    id integer(int64)
    imgUrl 店家图片 string
    introduction 店家简介 string
    参数名称 参数说明 类型
    name 店家名称 string
    recommend 是否推荐 string
    saleQuantity 月销量 integer(int64)
    score 评分 number
    themeId 经营类型 integer(int64)
    saleNum3hour 3 小时销量 integer(int64)
    total 总记录数 string
    响应示例
    {
    "total": 15,
    "rows": [
    {
    "id": 2,
    "name": "皖北刘哥牛肉板面",
    "address": "辽宁省大连市甘井子区新新园 79 号",
    "introduction": "各种汤面",
    "themeId": 5,
    "score": 4.5,
    "saleQuantity": 838,
    "deliveryTime": 32,
    "imgUrl": "http://118.190.154.52:7777/profile/upload/image/2021
    /05/08/30258b9d-3cea-44a8-9ce1-03c4790870d8.jpg",
    "avgCost": 30,
    "other": null,
    "recommend": "N",
    "distance": 1500,
    "saleNum3hour": 64
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    4.4.2.查询附近商家
     */
    const val get_api_takeout_seller_list= "/prod-api/api/takeout/seller/list"

    /**4.4.2.查询附近商家 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/takeout/seller/near?pageNum=1&pageSize=8
    请求参数
    无，支持分页和排序 参数参见表格分页和排序说明
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 店家信息
    address 店家地址 string
    avgCost 人均消费 number
    deliveryTime 配送时间 integer(int32)
    distance 到店距离 number
    id integer(int64)
    imgUrl 店家图片 string
    参数名称 参数说明 类型
    introduction 店家简介 string
    name 店家名称 string
    recommend 是否推荐 string
    remark string
    saleQuantity 销量 integer(int64)
    saleNum3hour 3 小时销量 integer(int64)
    score 评分 number
    themeId 经营类型 integer(int64)
    total 总记录数 string
    响应示例
    {
    "total": 15,
    "rows": [
    {
    "id": 5,
    "name": "炸匠先森·韩式炸鸡",
    "address": "辽宁省大连市甘井子区软件园路新新园 1 号-4",
    "introduction": "选好肉 炸好鸡",
    "themeId": 4,
    "score": 5,
    "saleQuantity": 570,
    "deliveryTime": 30,
    "imgUrl": "http://118.190.154.52:7777/profile/upload/image/2021
    /05/08/d87665c4-79e7-47aa-aea1-d7180890ba38.jpg",
    "avgCost": 20,
    "other": null,
    "recommend": "N",
    "distance": 500,
    "saleNum3hour": 16
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    4.4.3.获取店家详情
     */
    const val get_api_takeout_seller_near= "/prod-api/api/takeout/seller/near"

    /**4.4.3.获取店家详情 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求示例: /prod-api/api/takeout/seller/1
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型 schema
    id 店家 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据
    address 店家地址 string
    avgCost 人均消费 number
    deliveryTime 配送时间 integer(int32)
    distance 到店距离 number
    id integer(int64)
    参数名称 参数说明 类型
    imgUrl 店家图片 string
    introduction 店家简介 string
    name 店家名称 string
    recommend 是否推荐 string
    saleQuantity 销量 integer(int64)
    saleNum3hour 3 小时销量 integer(int64)
    score 评分 number
    themeId 经营类型 integer(int64)
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "id": 1,
    "name": "尊宝比萨",
    "address": "辽宁省大连市高新技术园区软景中心南门",
    "introduction": "各种披萨",
    "themeId": 3,
    "score": 4.9,
    "saleQuantity": 379,
    "deliveryTime": 30,
    "imgUrl": "http://118.190.154.52:7777/profile/upload/image/2021/0
    5/08/9e062202-b89d-412c-ae02-5370bb3b309b.jpg",
    "avgCost": 45,
    "other": null,
    "recommend": "N",
    "distance": 620,
    "saleNum3hour": 21
    }
    }
    4.5 菜品相关接口
    4.5.1.菜品查询店家信息
     */
    const val get_api_takeout_seller__id_= "/prod-api/api/takeout/seller/{id}"

    /**4.5.1.菜品查询店家信息 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：
    /prod-api/api/takeout/search?keyword=披萨&pageNum=1&pageSize=8
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    keyword 菜品关键词 query true string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 店家信息
    address 店家地址 string
    avgCost 人均消费 number
    deliveryTime 配送时间 integer(int32)
    参数名称 参数说明 类型
    distance 到店距离 number
    imgUrl 店家图片 string
    introduction 店家简介 string
    name 店家名称 string
    productList 店家商品列表 array
    categoryId 分类 id integer
    detail 菜品详情 string
    favorRate 好评率 number
    id integer
    imgUrl 图片地址 string
    name 菜名 string
    price 价格 number
    saleQuantity 月销量 integer
    sellerId 所属店家 integer
    status 状态 string
    saleNum3hour 3 小时销量 integer(int64)
    score 评分 number
    total 总记录数 string
    响应示例
    {
    "total": 4,
    "rows": [
    {
    "name": "MrBurger 汉堡披萨意面",
    "address": null,
    "introduction": null,
    "score": 4.7,
    "saleQuantity": null,
    "imgUrl": "http://118.190.154.52:7777/profile/upload/image/2021
    /05/09/81783889-66f7-4078-916f-07f073ae9200.jpg",
    "avgCost": 30,
    "deliveryTime": 32,
    "distance": 1800,
    "productList": [
    {
    "searchValue": null,
    "createBy": null,
    "createTime": "2021-05-09 15:24:58",
    "updateBy": null,
    "updateTime": null,
    "remark": null,
    "params": {},
    "id": 238,
    "categoryId": 38,
    "imgUrl": "http://118.190.154.52:7777/profile/upload/image/
    2021/05/09/8f5a26d8-63b0-4c52-965b-4bbcbdaf9b84.jpg",
    "name": "意大利香肠披萨",
    "price": 58.5,
    "detail": null,
    "status": "1",
    "saleQuantity": 5,
    "favorRate": 98,
    "sellerId": 12
    }
    ]
    },
    ],
    "code": 200,
    "msg": "查询成功"
    }
    4.5.2.根据查询菜品列表
     */
    const val get_api_takeout_search= "/prod-api/api/takeout/search"

    /**4.5.2.根据查询菜品列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    categoryId 分类 id query true integer(int64)
    sellerId 所属店家 query true integer(int64)
    请求示例：
    /prod-api/api/takeout/product/list?sellerId=1&categoryId=19
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    data 列表数据（数组类型） 菜品信息
    categoryId 分类 id integer(int64)
    detail 菜品详情 string
    favorRate 好评率 number
    id integer(int64)
    imgUrl 图片地址 string
    name 菜名 string
    参数名称 参数说明 类型
    price 价格 number
    saleQuantity 月销量 integer(int32)
    sellerId 所属店家 integer(int64)
    status 状态 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "id": 1,
    "categoryId": 19,
    "imgUrl": "http://118.190.154.52:7777/profile/upload/image/2021
    /05/08/88bcec33-736a-4128-ab8a-12f65776b6bd.jpg",
    "name": "柚见初夏套餐",
    "price": 12,
    "detail": "八寸香辣至尊比萨*1+新奥尔良烤翅+薯条+韩式柚子茶*2",
    "status": "1",
    "saleQuantity": 2,
    "favorRate": 98,
    "sellerId": 1
    }
    ]
    }
    4.5.3.查询店家菜品类别
     */
    const val get_api_takeout_product_list= "/prod-api/api/takeout/product/list"

    /**4.5.3.查询店家菜品类别 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求示例： /prod-api/api/takeout/category/list?sellerId=1
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    sellerId 所属店家 query true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    data 列表数据（数组类型） 菜品分类
    id integer(int64)
    name 类别名称 string
    sellerId 所属店家 integer(int64)
    sort 分类排序 integer(int32)
    themeId 所属主题 integer(int64)
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "id": 3,
    "name": "披萨",
    "sellerId": 1,
    "themeId": 5,
    "sort": 1
    }
    ]
    }
    4.6 店家收藏相关接口
    4.6.1添加店家收藏
     */
    const val get_api_takeout_category_list= "/prod-api/api/takeout/category/list"

    /**4.6.1添加店家收藏 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "sellerId": 1
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    sellerId 店家编号 true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200
    }
    4.6.2判断当前用户是否收藏店家
     */
    const val post_api_takeout_collect= "/prod-api/api/takeout/collect"

    /**4.6.2判断当前用户是否收藏店家 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/takeout/collect/check?sellerId=1
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    sellerId 店家编号 query true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    isCollect 已收藏 true，未收藏 false string
    id 收藏 id integer(int64)
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "isCollect": true,
    "id": 4,
    "msg": "已收藏"
    }
    4.6.3获取当前用户店家收藏列表
     */
    const val get_api_takeout_collect_check= "/prod-api/api/takeout/collect/check"

    /**4.6.3获取当前用户店家收藏列表 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 收藏
    address 店家地址 string
    id integer(int64)
    imgUrl 店家简介 string
    saleQuantity 销量 integer(int64)
    score 评分 number
    sellerId 店家编号 integer(int64)
    sellerName 店家名称 string
    参数名称 参数说明 类型
    userId 用户编号 integer(int64)
    createTime 收藏时间 string(date-time)
    total 总记录数 string
    响应示例
    {
    "total": 5,
    "rows": [
    {
    "id": 3,
    "userId": 2,
    "sellerId": 2,
    "sellerName": "皖北刘哥牛肉板面",
    "address": "辽宁省大连市甘井子区新新园 79 号",
    "imgUrl": "http://118.190.154.52:7777/profile/upload/image/2021
    /05/08/30258b9d-3cea-44a8-9ce1-03c4790870d8.jpg",
    "score": 4.5,
    "saleQuantity": 838,
    "userName": "test01",
    "nickName": "测试用户 01"
    },
    ],
    "code": 200,
    "msg": "查询成功"
    }
    4.6.4取消店家收藏
     */
    const val get_api_takeout_collect_list= "/prod-api/api/takeout/collect/list"

    /**4.6.4取消店家收藏 DELETE
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/takeout/collect/4
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 收藏 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200
    }
    4.7 订单相关接口
    4.7.1创建订单
     */
    const val delete_api_takeout_collect__id_= "/prod-api/api/takeout/collect/{id}"

    /**4.7.1创建订单 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "addressDetail": "大连理工大学 教学楼 A3-118",
    "label": "学校",
    "name": "王先生",
    "phone": "13800000000",
    "amount": 64,
    "orderItemList": [
    {
    "productId": 1,
    "quantity": 2
    },
    {
    "productId": 30,
    "quantity": 1
    }
    ],
    "sellerId": 1
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    addressDetail 详细地址 true string
    amount 金额 true number
    label 标签 true string
    name 收货人 true string
    orderItemList 订单项列表 true array
    productId 菜品 id true integer
    quantity 购买数量 true integer
    phone 联系电话 true string
    sellerId 店铺 Id true integer(int64)
    响应参数
    参数名称 参数说明 类型
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    orderNo 订单号 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "orderNo": "2021051120444612594"
    }
    4.7.5支付订单
     */
    const val post_api_takeout_order_create= "/prod-api/api/takeout/order/create"

    /**4.7.5支付订单 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "orderNo": "2021051120444612594",
    "paymentType":"电子支付"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    orderNo 订单号 true string
    paymentType 支付类型(参见字典名：支付类型) true string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200
    }
    4.7.6查询当前用户订单列表
     */
    const val post_api_takeout_pay= "/prod-api/api/takeout/pay"

    /**4.7.6查询当前用户订单列表 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请 求 示 例 ： /prod-api/api/takeout/order/list?status= 待 支 付
    &pageNum=1&pageSize=8
    请求参数 支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    status
    订单状态(参见字典名：外卖订单状态)
    为空的话，查询当前用户所有订单
    query true string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    参数名称 参数说明 类型
    msg 消息内容 string
    rows 列表数据（数组类型） 订单
    amount 订单总金额 number
    id integer(int64)
    orderItemList 订单项列表 array
    id integer
    orderNo 订单号 string
    productId 菜品 id integer
    productImage 菜品图片 string
    productName 菜品名 string
    productPrice 菜品单价 number
    quantity 购买数量 integer
    remark string
    totalPrice 单样菜品总价 number
    userId 用户 id integer
    orderNo 订单号 string
    payTime 支付时间 string(date-time)
    paymentType 支付类型 string
    postage 派送费 number
    receiverAddress 收货人详细地址 string
    参数名称 参数说明 类型
    receiverLabel 地址标签 string
    receiverName 收货人 string
    receiverPhone 收货人联系电话 string
    sellerId 店家 id integer(int64)
    status 订单状态 string
    userId 用户 id integer(int64)
    total 总记录数 string
    响应示例
    {
    "total": 1,
    "rows": [
    {
    "sellerInfo": {
    "id": 14,
    "name": "九叶牛肉面",
    "address": "沙河口区西南路 29-1 号",
    "introduction": "用心做好面",
    "themeId": 5,
    "score": 4.6,
    "saleQuantity": 1635,
    "deliveryTime": 42,
    "imgUrl": "http://118.190.154.52:7777/profile/upload/image/20
    21/05/09/b19808eb-8de1-4355-ace0-6cc801f00988.jpg",
    "avgCost": 30,
    "other": null,
    "recommend": "N",
    "distance": 3100,
    "saleNum3hour": 25
    },
    "orderInfo": {
    "id": 19,
    "orderNo": "2021051121282519510",
    "userId": 2,
    "sellerId": 14,
    "amount": 40,
    "postage": null,
    "status": "待支付",
    "paymentType": null,
    "payTime": null,
    "sendTime": null,
    "receiverName": "王先生",
    "receiverPhone": "13800000000",
    "receiverAddress": "大连理工大学 教学楼 A3-118",
    "receiverLabel": null,
    "houseNumber": null,
    "orderItemList": [
    {
    "id": 20,
    "userId": 2,
    "orderNo": "2021051121282519510",
    "productId": 169,
    "productName": "鱿鱼炒面",
    "productImage": "http://118.190.154.52:7777/profile/uploa
    d/image/2021/05/09/c025e6a0-f91a-4965-835d-17ce2e7efe44.jpg",
    "productPrice": 20,
    "quantity": 1,
    "totalPrice": 20
    },
    {
    "id": 21,
    "userId": 2,
    "orderNo": "2021051121282519510",
    "productId": 170,
    "productName": "芸豆蚬子打卤面",
    "productImage": "http://118.190.154.52:7777/profile/uploa
    d/image/2021/05/09/882a3bb6-6893-4658-aead-6ace164d0da0.jpg",
    "productPrice": 20,
    "quantity": 1,
    "totalPrice": 20
    }
    ]
    }
    },
    ],
    "code": 200,
    "msg": "查询成功"
    }
    4.7.7订单退款
     */
    const val get_api_takeout_order_list= "/prod-api/api/takeout/order/list"

    /**4.7.7订单退款 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "orderNo": "2021051121250557366",
    "reason": "好意思，不想要了"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    orderNo 订单号 true string
    reason 退款原因 true string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200
    }
    4.7.8查询订单详情
     */
    const val post_api_takeout_order_refound= "/prod-api/api/takeout/order/refound"

    /**4.7.8查询订单详情 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/takeout/order/2021051120444612594
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    orderNo 订单编号 path true string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 订单
    amount 订单总金额 number
    id integer(int64)
    orderItemList 订单项列表 array
    id integer
    orderNo 订单号 string
    productId 菜品 id integer
    参数名称 参数说明 类型
    productImage 菜品图片 string
    productName 菜品名 string
    productPrice 菜品单价 number
    quantity 购买数量 integer
    totalPrice 单样菜品总价 number
    userId 用户 id integer
    orderNo 订单号 string
    payTime 支付时间 string(date-time)
    paymentType 支付类型 string
    postage 派送费 number
    receiverAddress 收货人详细地址 string
    receiverLabel 地址标签 string
    receiverName 收货人 string
    receiverPhone 收货人联系电话 string
    sellerId 店家 id integer(int64)
    status 订单状态 string
    userId 用户 id integer(int64)
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "sellerInfo": {
    "id": 1,
    "name": "尊宝比萨",
    "address": "辽宁省大连市高新技术园区软景中心南门",
    "introduction": "各种披萨",
    "themeId": 3,
    "score": 4.9,
    "saleQuantity": 379,
    "deliveryTime": 30,
    "imgUrl": "http://118.190.154.52:7777/profile/upload/image/2021
    /05/08/9e062202-b89d-412c-ae02-5370bb3b309b.jpg",
    "avgCost": 45,
    "other": null,
    "recommend": "N",
    "distance": 620,
    "saleNum3hour": 21
    },
    "orderInfo": {
    "id": 15,
    "orderNo": "2021051120444612594",
    "userId": 2,
    "sellerId": 1,
    "amount": 64,
    "postage": null,
    "status": "待支付",
    "paymentType": null,
    "payTime": null,
    "sendTime": null,
    "receiverName": "王先生",
    "receiverPhone": "13800000000",
    "receiverAddress": "大连理工大学 教学楼 A3-118",
    "receiverLabel": null,
    "houseNumber": null,
    "orderItemList": [
    {
    "id": 11,
    "userId": 2,
    "orderNo": "2021051120444612594",
    "productId": 1,
    "productName": "柚见初夏套餐",
    "productImage": "http://118.190.154.52:7777/profile/upload/
    image/2021/05/08/88bcec33-736a-4128-ab8a-12f65776b6bd.jpg",
    "productPrice": 12,
    "quantity": 2,
    "totalPrice": 24
    },
    {
    "id": 12,
    "userId": 2,
    "orderNo": "2021051120444612594",
    "productId": 30,
    "productName": "10 寸人气爆款比萨",
    "productImage": "http://118.190.154.52:7777/profile/upload/
    image/2021/05/08/9aace014-d039-45a6-bf58-c5b27861b277.jpg",
    "productPrice": 40,
    "quantity": 1,
    "totalPrice": 40
    }
    ]
    }
    }
    }
    4.8 店家评论相关接口
    4.8.1添加店家评论
     */
    const val get_api_takeout_order__orderNo_= "/prod-api/api/takeout/order/{orderNo}"

    /**4.8.1添加店家评论 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "content": "真好吃，下次还来",
    "orderNo": "2021051120444612594",
    "score": 5
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    content 评论内容 true string
    orderNo 订单号 true string
    score 评分 true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200
    }
    4.8.2查询店家评论列表
     */
    const val post_api_takeout_comment= "/prod-api/api/takeout/comment"

    /**4.8.2查询店家评论列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求示例: /prod-api/api/takeout/comment/list?sellerId=10
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    参数名称 参数说明 请求类型 必须 数据类型
    sellerId 店家 id query true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 店家评论
    avatar 头像 string
    commentDate 评论时间 string(date-time)
    content 评论内容 string
    id integer(int64)
    likeNum 点赞数量 integer(int64)
    nickName 昵称 string
    replyContent 商家回复 string
    replyTime 回复时间 string(date-time)
    score 评分 integer(int64)
    sellerId 店家 id integer(int64)
    sellerName 店家名 string
    userId 用户 id integer(int64)
    userName 用户名 string
    total 总记录数 string
    响应示例
    {
    "total": 3,
    "rows": [
    {
    "id": 2,
    "userId": 101,
    "sellerId": 1,
    "score": 1,
    "content": "很好吃",
    "likeNum": 100,
    "sellerName": "八大碗",
    "userName": "user01",
    "nickName": "测试会员账号 1",
    "avatar": "",
    "commentDate": "2021-04-18 00:00:00",
    "replyContent": "谢谢你，欢迎下次光临",
    "replyTime": "2021-04-19 00:00:00"
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    4.9 收货地址相关接口
    4.9.1添加收货地址
     */
    const val get_api_takeout_comment_list= "/prod-api/api/takeout/comment/list"

    /**4.9.1添加收货地址 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "addressDetail": "大连理工大学教学楼 A3-118",
    "label": "学校",
    "name": "王大卫",
    "phone": "15898135276"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    addressDetail 详细地址 true string
    label 标签 true string
    name 姓名 true string
    phone 电话 true string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200
    }
    4.9.2修改收货地址
     */
    const val post_api_takeout_address= "/prod-api/api/takeout/address"

    /**4.9.2修改收货地址 PUT
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "id": 8,
    "name": "王大卫",
    "phone": "15898135276",
    "addressDetail": "大连理工大学 教学楼 A2-118",
    "label": "学校"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    addressDetail 详细地址 true string
    id true integer(int64)
    label 标签 true string
    name 姓名 true string
    phone 电话 true string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200
    }
    4.9.3获取当前用户收货地址列表
     */
    const val put_api_takeout_address= "/prod-api/api/takeout/address"

    /**4.9.3获取当前用户收货地址列表 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    无
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 收货地址
    addressDetail 详细地址 string
    id integer(int64)
    label 标签 string
    name 姓名 string
    phone 电话 string
    userId 用户 id integer(int64)
    total 总记录数 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "id": 8,
    "userId": 104,
    "name": "王大卫",
    "phone": "15898135276",
    "addressDetail": "大连理工大学 教学楼 A3-118",
    "label": "学校"
    }
    ]
    }
    4.9.4获取收货地址详细信息
    接口地址 请求头需要 token 参数，具体格式参见安全认证说明
    GET /prod-api/api/takeout/address/{id}
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求示例： /prod-api/api/takeout/address/8
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 地址 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 收货地址
    addressDetail 详细地址 string
    id integer(int64)
    label 标签 string
    参数名称 参数说明 类型
    name 姓名 string
    phone 电话 string
    userId 用户 id integer(int64)
    msg 返回消息内容 string
    houseNumber 地址编号 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "id": 8,
    "userId": 104,
    "name": "王大卫",
    "phone": "15898135276",
    "addressDetail": "大连理工大学",
    "houseNumber": "",
    "label": "学校"
    }
    }
    4.9.5删除收货地址
     */
    const val get_api_takeout_address_list= "/prod-api/api/takeout/address/list"

    /**4.9.5删除收货地址 DELETE
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/takeout/address/8
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200
    }
    5 找工作
    5.1 公司相关接口
    5.1.1查询公司列表
     */
    const val delete_api_takeout_address__id_= "/prod-api/api/takeout/address/{id}"

    /**5.1.1查询公司列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    companyName 公司名称 query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 公司管理
    companyName 公司名称 string
    id 主键 id integer(int64)
    introductory 公司简介 string
    total 总记录数 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "companyName": "恒但科技公司",
    "id": 4,
    "introductory": "恒但科技始终坚持“踏实、诚信、合作"
    }],
    "total": 1
    }
    5.1.2获取公司详情
     */
    const val get_api_job_company_list= "/prod-api/api/job/company/list"

    /**5.1.2获取公司详情 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 公司管理
    companyName 公司名称 string
    id 主键 id integer(int64)
    introductory 公司简介 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "data": {
    "companyName": "恒但科技公司",
    "id": 4,
    "introductory": "恒但科技始终坚持“踏实、诚信、合作"
    },
    "msg": "操作成功"
    }
    5.2 投递相关接口
    5.2.1投递简历
     */
    const val get_api_job_company__id_= "/prod-api/api/job/company/{id}"

    /**5.2.1投递简历 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "companyId": 0,
    "companyName": "",
    "id": 0,
    "money": "",
    "postId": 0,
    "postName": "",
    "remark": "",
    "satrTime": "2021-09-10",
    "userId": 0,
    "userName": ""
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    companyId 公司 id true integer(int64)
    money 薪资 false string
    satrTime 投递时间 true string(date-time)
    postId 岗位 id true integer(int64)
    postName 岗位名称 true string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    5.2.2查询投递历史列表
     */
    const val post_api_job_deliver= "/prod-api/api/job/deliver"

    /**5.2.2查询投递历史列表 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    companyId 公司 query false integer(int64)
    postName 岗位 query false integer(int64)
    params[beginSatrTi
    me] 投递开始时间 query false string(date-time)
    params[endSatrTime
    ] 投递结束时间 query false string(date-time)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 投递历史
    companyId 公司 integer(int64)
    companyName 公司名称 string
    参数名称 参数说明 类型
    id 主键 id integer(int64)
    money 薪资 string
    postId 岗位 integer(int64)
    postName 岗位名称 string
    remark string
    satrTime 投递时间 string(date-time)
    userId 用户 integer(int64)
    userName 用户名 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "rows": [{
    "id": 6,
    "userId": 1,
    "postId": 1,
    "companyId": 3,
    "companyName": "虎鱼科技",
    "money": "4000",
    "satrTime": "2021-09-10",
    "userName": "admin"
    }],
    "msg": "查询成功"
    }
    5.3 招聘相关接口
    5.3.1查询招聘列表
     */
    const val get_api_job_deliver_list= "/prod-api/api/job/deliver/list"

    /**5.3.1查询招聘列表 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    companyId 公司 query false integer(int64)
    contacts 联系人名称 query false string
    name 岗位名称 query false string
    professionId 职位 query false integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 招聘信息
    address 公司地址 string
    companyId 公司 integer(int64)
    companyName 公司名称 string
    contacts 联系人名称 string
    id 主键 id integer(int64)
    name 岗位名称 string
    参数名称 参数说明 类型
    need 职位需求 string
    obligation 岗位职责 string
    professionId 职位 integer(int64)
    professionName 职位名称 string
    salary 薪资待遇 string
    total 总记录数 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 1,
    "companyId": 3,
    "professionId": 1,
    "contacts": "张先生",
    "name": "软件开发",
    "obligation": "负责软件的设计开发测试以及上线",
    "address": "大连市万达广场",
    "need": "工作经验 1-2 年",
    "salary": "5000",
    "companyName": "虎鱼科技",
    "professionName": "java 开发工程师"
    }],
    "total": 1
    }
    5.3.2获取招聘信息详情
     */
    const val get_api_job_post_list= "/prod-api/api/job/post/list"

    /**5.3.2获取招聘信息详情 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 招聘信息
    address 公司地址 string
    companyId 公司 integer(int64)
    contacts 联系人名称 string
    id 主键 id integer(int64)
    name 岗位名称 string
    files 简历附件地址 string
    need 职位需求 string
    obligation 岗位职责 string
    professionId 职位 integer(int64)
    salary 薪资待遇 string
    msg 返回消息内容 string
    companyName 公司名称 string
    参数名称 参数说明 类型
    professionName 职位名称 string
    响应示例
    {
    "code": 200,
    "data": {
    "id": 1,
    "companyId": 3,
    "professionId": 1,
    "contacts": "张先生",
    "name": "软件开发",
    "obligation": "负责软件的设计开发测试以及上线",
    "address": "大连市万达广场",
    "need": "工作经验 1-2 年",
    "salary": "5000",
    "companyName": null,
    "professionName": null
    },
    "msg": ""
    }
    5.4 简历相关接口
    5.4.1新增当前用户简历
     */
    const val get_api_job_post__id_= "/prod-api/api/job/post/{id}"

    /**5.4.1新增当前用户简历 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "mostEducation": "博士",
    "education": "本科",
    "address": "北京",
    "experience": "1 年",
    "individualResume": "性格有点内向、乐观上进、有爱心并善于施教并行;
    对待工作认真负责，善于沟通、协调有较强的组织能力与团队精神;上进心强、
    勤于学习能不断进步自身的能力与综合素质。在未来的工作中，我将以充沛的精
    力，刻苦钻研的精神来努力工作，稳定地进步自己的工作能力，与公司同步发展。
    ",
    "money": "7000",
    "positionId": 2,
    "files": "/dev-apihttp://localhost:9090/profile/upload/2021/04/22
    /1ac5e66a-0381-4867-9026-3ec00fff3ecf.pdf"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    address 现居住地 false string
    education 教育经历 false string
    experience 工作经历 false string
    files 简历附件地址 false string
    individualResume 个人简介 false string
    money 期望薪资 false string
    mostEducation 最高学历 false string
    positionId 期望职位 id false integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    5.4.2修改当前用户简历
     */
    const val post_api_job_resume= "/prod-api/api/job/resume"

    /**5.4.2修改当前用户简历 PUT
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "id": 1,
    "mostEducation": "博士",
    "education": "本科",
    "address": "北京",
    "experience": "1 年",
    "individualResume": "性格有点内向、乐观上进、有爱心并善于施教并行;
    对待工作认真负责，善于沟通、协调有较强的组织能力与团队精神;上进心强、
    勤于学习能不断进步自身的能力与综合素质。在未来的工作中，我将以充沛的精
    力，刻苦钻研的精神来努力工作，稳定地进步自己的工作能力，与公司同步发展。
    ",
    "money": "7000",
    "positionId": 2,
    "files": "/dev-apihttp://localhost:9090/profile/upload/2021/04/22
    /1ac5e66a-0381-4867-9026-3ec00fff3ecf.pdf"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    address 现居住地 false string
    参数名称 参数说明 请求类型 必须 数据类型
    education 教育经历 false string
    experience 工作经历 false string
    files 简历附件地址 false string
    id 主键 id true integer(int64)
    individualResume 个人简介 false string
    money 期望薪资 false string
    mostEducation 最高学历 false string
    positionId 期望职位 id false integer(int64)
    响应参数
    参数名称 参数说明 类型 schema
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    5.4.3查询用户简历详情
     */
    const val put_api_job_resume= "/prod-api/api/job/resume"

    /**5.4.3查询用户简历详情 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    userId userId path true integer(int64)
    响应参数
    参数名称 参数说明 类型 schema
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 简历管理 简历管理
    address 现居住地 string
    education 教育经历 string
    experience 工作经历 string
    files 简历附件地址 string
    id 主键 id integer(int64)
    individualResume 个人简介 string
    money 期望薪资 string
    mostEducation 最高学历 string
    positionId 期望职位 id integer(int64)
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "data": {
    "id": 1,
    "userId": 1,
    "mostEducation": "博士",
    "education": "本科",
    "address": "北京",
    "experience": "1 年",
    "individualResume": "性格有点内向、乐观上进、有爱心并善于施教并行;
    对待工作认真负责，善于沟通、协调有较强的组织能力与团队精神;上进心强、
    勤于学习能不断进步自身的能力与综合素质。在未来的工作中，我将以充沛的精
    力，刻苦钻研的精神来努力工作，稳定地进步自己的工作能力，与公司同步发展。
    ",
    "money": "7000",
    "positionId": 2,
    "files": "/dev-apihttp://localhost:9090/profile/upload/2021/04/22
    /1ac5e66a-0381-4867-9026-3ec00fff3ecf.pdf",
    "positionName": null,
    "userName": null
    },
    "msg": "操作成功"
    }
    5.5 职位相关接口
    5.5.1查询职位列表
     */
    const val get_api_job_resume_queryResumeByUserId__userId_= "/prod-api/api/job/resume/queryResumeByUserId/{userId}"

    /**5.5.1查询职位列表 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    professionName 职位名称 query false string
    响应参数
    参数名称 参数说明 类型 schema
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 职位管理 职位管理
    id 主键 id integer(int64)
    professionName 职位名称 string
    total 总记录数 string
    响应示例
    {
    "code": "",
    "msg": "",
    "rows": [{
    "id": 1,
    "professionName": " java 开发工程师",
    }],
    "total": ""
    }
    6 找房子
    6.1 房源相关接口
    6.1.1查询房源列表
     */
    const val get_api_job_profession_list= "/prod-api/api/job/profession/list"

    /**6.1.1查询房源列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    houseType 房子类型，参见字典名：房源类型 query false string
    sourceName 房源名称 query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 房源信息
    address 房源地址 string
    areaSize 面积 integer(int64)
    description 详情描述 string
    houseType 房子类型，参见字典名：房源类型 string
    id 主键 id integer(int64)
    pic 房子图片地址 string
    price 价格 string
    sourceName 房源名称 string
    tel 联系电话 string
    total 总记录数 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 2,
    "sourceName": "西安路 08 年框架电梯房 70 年 LOFT 一室一厅封闭小区
    ",
    "address": "西安路 08 年框架电梯房 70 年 LOFT 一室一厅封闭小区",
    "areaSize": 88,
    "tel": "18546474547",
    "price": "28300/㎡",
    "houseType": "租房",
    "pic": "/profile/xweb.jpg",
    "description": "第五郡经典一室小房好楼层自住保持非常好小区一共
    36 栋楼,8 栋小高,28 栋洋,小区绿树"
    }],
    "total": 1
    }
    6.1.2获取房源详情
     */
    const val get_api_house_housing_list= "/prod-api/api/house/housing/list"

    /**6.1.2获取房源详情 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 房源 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 房源信息
    address 房源地址 string
    areaSize 面积 integer(int64)
    description 详情描述 string
    houseType 房子类型，参见字典名：房源类型 string
    id 主键 id integer(int64)
    pic 房子图片地址 string
    price 价格 string
    sourceName 房源名称 string
    tel 联系电话 string
    msg 返回消息内容 string
    响应示例
    {
    "code": "200",
    "data": {
    "id": 2,
    "sourceName": "西安路 08 年框架电梯房 70 年 LOFT 一室一厅封闭小区
    ",
    "address": "西安路 08 年框架电梯房 70 年 LOFT 一室一厅封闭小区",
    "areaSize": 88,
    "tel": "18546474547",
    "price": "28300/㎡",
    "houseType": "租房",
    "pic": "/profile/xweb.jpg",
    "description": "第五郡经典一室小房好楼层自住保持非常好小区一共
    36 栋楼,8 栋小高,28 栋洋,小区绿树"
    },
    "msg": "操作成功"
    }
    7 智慧交管
    7.1 广告轮播接口
    7.1.1查询广告列表
     接口地址
    GET /prod-api/api/traffic/rotation/list
     接口描述
     请求数据类型
    application/x-www-form-urlencoded
     请求参数 支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    advTitle 广告标题 query false string
    type 广告类型，参见字典名：广告类型 query false string
     响应参数
    参数名称 参数说明 类型
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 广告轮播实体
    advImg 广告图片 string
    advTitle 广告标题 string
    id 广告 ID integer(int64)
    remark 备注 string
    servModule 业务模块 string
    sort 排序 integer(int64)
    targetId 跳转详情 id integer(int64)
    total 总记录数 string
    appType app 类型 string
    status 状态 string
     响应示例
    {
    "code": " 200 ",
    "msg": "查询成功",
    "rows": [
    {
    "id": 21,
    "appType": "traffic",
    "status": "1",
    "sort": 1,
    "advTitle": "新闻",
    "advImg": "http://118.190.154.52:7777/profile/upload/image/2021
    /05/05/ff133289-6f6d-47c7-bf55-9bf6b43c1a48.jpeg",
    "servModule": "新闻",
    "targetId": 1,
    "type": "2"
    }
    ],
    "total": "1"
    }
    7.2 意见反馈接口
    7.2.1新增意见反馈
     接口地址
    POST /prod-api/api/traffic/feedback
     接口描述 请求头需要 token 参数，具体格式参见安全认证说明
     请求数据类型
    application/json
     请求示例
    {
    "content": "反馈内容",
    "title": "发现错误"
    }
     请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    content 反馈内容 false string
    title 反馈标题 false string
     响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
     响应示例
    {
    "code": "操作成功",
    "msg": " 200 "
    }
    7.2.2查询意见反馈列表
     接口地址
    GET /prod-api/api/traffic/feedback/list
     接口描述 请求头需要 token 参数，具体格式参见安全认证说明
     请求数据类型
    application/x-www-form-urlencoded
     请求参数 支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    title 反馈标题 query false string
     响应参数
    参数名称 参数说明 类型
    code 状态码 string
    参数名称 参数说明 类型
    msg 消息内容 string
    rows 列表数据（数组类型） 反馈实体
    content 反馈内容 string
    id 反馈 ID integer(int64)
    remark 备注 string
    title 反馈标题 string
    userId 反馈人用户 ID integer(int64)
    total 总记录数 string
    appType app 类型 string
     响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 39,
    "appType": "traffic",
    "title": "问题咨询",
    "content": "今天在上面提交车牌换领，怎么给退了？",
    "userId": 2
    }],
    "total": "1"
    }
    7.2.3获取意见反馈详细信息
     接口地址
    GET /prod-api/api/traffic/feedback/{id}
     接口描述 请求头需要 token 参数，具体格式参见安全认证说明
     请求数据类型
    application/x-www-form-urlencoded
     请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id id path true integer(int64)
     响应参数
    参数名称 参数说明 类型 schema
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 反馈实体 反馈实体
    content 反馈内容 string
    id 反馈 ID integer(int64)
    title 反馈标题 string
    userId 反馈人用户 ID integer(int64)
    msg 返回消息内容 string
    appType app 类型 string
     响应示例
    {
    "code": " 200 ",
    "data": {
    "id": 39,
    "appType": "takeout",
    "title": "问题咨询",
    "content": "今天在上面提交车牌换领，怎么给退了？",
    "userId": 2
    },
    "msg": "操作成功"
    }
    7.3 车辆相关接口
    7.3.1绑定车辆
     接口地址
    POST /prod-api/api/traffic/car
     接口描述 请求头需要 token 参数，具体格式参见安全认证说明
     请求数据类型
    application/json
     请求示例
    {
    "engineNo": "1212XS123113",
    "plateNo": "辽 B666666",
    "type": "小型汽车"
    }
     请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    engineNo 引擎号 false string
    plateNo 车牌号 false string
    type 号牌类型，参见字典名：号牌类型 false string
     响应参数
    参数名称 参数说明 类型 schema
    code 状态码 string
    msg 消息内容 string
     响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    7.3.2检车须知
     接口地址
    GET /prod-api/api/traffic/checkCar/grt
     接口描述 请求头需要 token 参数，具体格式参见安全认证说明
     响应参数
    参数名称 参数说明 类型 schema
    code 状态码 string
    msg 消息内容 string
     响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "searchValue": null,
    "createBy": null,
    "createTime": null,
    "updateBy": null,
    "updateTime": null,
    "remark": null,
    "params": {},
    "id": 1,
    "notice": "<p style=\\\"color:#191919;font-family:&amp;font-size:100%;fontstyle:normal;font-weight:400;margin-left:0px;text-align:left;text-decoration:none;t
    ext-indent:0px;\\\"><span style=\\\"font-size:16px;\\\">1.</span><span style=\\\"fo
    nt-size:16px;\\\">至少提前两周预约</span><span style=\\\"font-size:16px;\\\">，
    <span style=\\\"font-size:100%;\\\">预</span>约确定以支付定金为准，定金 20 元(不可退)；拍
    照排期以收到定金顺序为准。
    </span></p><span style=\\\"background-color:#FFFFFF;color:#191919;font-family:&quot;
    font-size:16px;font-style:normal;font-weight:400;line-height:1.9;text-decoration:no
    ne;\\\"></span><p style=\\\"color:#191919;font-family:&amp;font-size:100%;font-styl
    e:normal;font-weight:400;margin-left:0px;text-align:left;text-decoration:none;textindent:0px;\\\"><span style=\\\"font-size:16px;\\\">2.检车余款于拍照当日结清：支付宝／
    微信／现金均可。
    </span></p><span style=\\\"background-color:#FFFFFF;color:#191919;font-family:&quot;
    font-size:16px;font-style:normal;font-weight:400;line-height:1.9;text-decoration:no
    ne;\\\"> </span><p style=\\\"color:#191919;font-family:&amp;font-size:100%;font-sty
    le:normal;font-weight:400;margin-left:0px;text-align:left;text-decoration:none;text
    -indent:0px;\\\"><span style=\\\"font-size:16px;\\\">3.如遇个人原因临时变更，请于原定拍
    摄时间提前<span style=\\\"font-size:100%;\\\">至少 48 小时</span>与我联系更改，感谢理解；
    预约当天无特殊理由取消，订单作废，再次预约重付 20 元定金。</span></p>",
    "title": null
    }
    7.3.3查询所有检车地点
     接口地址
    GET /prod-api/api/traffic/checkCar/place/list
     接口描述 请求头需要 token 参数，具体格式参见安全认证说明
     请求数据类型
    application/json
     请求示例
    http://IP:PORT/prod-api/api/traffic/checkCar/place/list
     请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    placeName 检车公司 query false string
    Id id query false string
    address 地址 query false string
    phone 电话 query false string
     响应参数
    参数名称 参数说明 类型 schema
    code 状态码 string
    Rows 返回列表 string
    placeName 检车公司 string false
    Id id string false
    address 地址 string false
    phone 电话 string false
    remarks 备注 string false
     响应示例
    {
    "total": 15,
    "rows": [
    {
    "searchValue": null,
    "createBy": null,
    "createTime": null,
    "updateBy": null,
    "updateTime": null,
    "remark": null,
    "params": {},
    "id": 1,
    "placeName": "丰台区潘北昊盛汽车检测有限公司",
    "remarks": "周一至周五:上午 8:00—12:00;下午 13:00—17:00",
    "address": "北京市丰台区新发地潘家庙 518 号院",
    "phone": "010-87504440"
    },
    ],
    "code": 200,
    "msg": "查询成功"
    }
    7.3.4查询检车点详情
     接口地址
    POST /prod-api/api/traffic/checkCar/place/{id}
     接口描述 请求头需要 token 参数，具体格式参见安全认证说明
     请求数据类型
    application/json
     请求示例
    http://IP:PORT/prod-api/api/traffic/checkCar/place/1
     请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    placeName 检车公司 query false string
    Id id query false string
    address 地址 query false string
    phone 电话 query false string
     响应参数
    参数名称 参数说明 类型 schema
    code 状态码 string
    data 返回列表 string
    placeName 检车公司 string false
    Id id string false
    address 地址 string false
    phone 电话 string false
    remarks 备注 string false
     响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "searchValue": null,
    "createBy": null,
    "createTime": null,
    "updateBy": null,
    "updateTime": null,
    "remark": null,
    "params": {},
    "id": 1,
    "placeName": "丰台区潘北昊盛汽车检测有限公司",
    "remarks": "周一至周五:上午 8:00—12:00;下午 13:00—17:00",
    "address": "北京市丰台区新发地潘家庙 518 号院",
    "phone": "010-87504440"
    }
    }
    7.3.5预约检车
     接口地址
    POST /prod-api/api/traffic/checkCar/apply
     接口描述 请求头需要 token 参数，具体格式参见安全认证说明
     请求数据类型
    application/json
     请求示例
    {
    "userId":"1",
    "carId":"3",
    "aptTime":"2020-11-11 10:29:02",
    "addressId":"1"
    }
     请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    userId 用户 id query false string
    carId 车辆 id query false string
    aptTime 预约时间 query false string
    addressId 预约地点 Id query false string
     响应参数
    参数名称 参数说明 类型 schema
    msg 返回信息 string
    code 状态码 string
     响应示例
    {
    "msg": "操作成功",
    "code": 200
    }
    7.3.6查询预约检车订单
     接口地址
    GET/prod-api/api/traffic/checkCar/apply/list
     接口描述 请求头需要 token 参数，具体格式参见安全认证说明
     请求数据类型
    application/json
     请求示例
    http://IP:PORT/prod-api/api/traffic/checkCar/apply/list
     请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    placeName 检车公司 query false string
    Id id query false string
    engineNo
    发动机号 query false string
    plateNo
    车牌号 query false string
    aptTime 预约时间 query false string
    addressId 地址 ID query false string
    userName 用户名 query false string
    参数名称 参数说明 请求类型 必须 数据类型
    userId 用户 ID query false string
    carId 车辆 ID query false string
     响应参数
    参数名称 参数说明 类型 schema
    code 状态码 string
    Rows 返回列表 string
    placeName 检车公司 string false
    Id id false
    engineNo
    发动机号 string false
    plateNo
    车牌号 string false
    aptTime 预约时间 string false
    addressId 地址 ID string false
    userName 用户名 string false
    userId 用户 ID string false
    carId 车辆 ID string false
     响应示例
    {
    "total": 20,
    "rows": [
    {
    "searchValue": null,
    "createBy": null,
    "createTime": null,
    "updateBy": null,
    "updateTime": null,
    "remark": null,
    "params": {},
    "id": 2,
    "userId": 1,
    "carId": 2,
    "aptTime": "2020-10-24",
    "addressId": 1,
    "success": "1",
    "placeName": "丰台区潘北昊盛汽车检测有限公司",
    "userName": "admin",
    "plateNo": "辽 B12345",
    "engineNo": "EWX1383E3J9491U"
    },
    .........
    ],
    "code": 200,
    "msg": "查询成功"
    }
    7.3.7修改绑定车辆信息
     */
    const val get_api_house_housing__id_= "/prod-api/api/house/housing/{id}"

    /**7.3.7修改绑定车辆信息 PUT
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "engineNo": "555555555555",
    "plateNo": "辽 B777777",
    "type": "小型汽车"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    engineNo 引擎号 false string
    id 主键 id true integer(int64)
    plateNo 车牌号 false string
    type 号牌类型，参见字典名：号牌类型 false string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    7.3.8获取绑定车辆列表
     */
    const val put_api_traffic_car= "/prod-api/api/traffic/car"

    /**7.3.8获取绑定车辆列表 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    engineNo 引擎号 query false string
    plateNo 车牌号 query false string
    type 号牌类型，参见字典名：号牌类型 query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 车辆管理
    engineNo 引擎号 string
    id 主键 id integer(int64)
    plateNo 车牌号 string
    type 号牌类型 string
    userId 用户 integer(int64)
    total 总记录数 string
    userName 用户名称 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 2,
    "userId": 2,
    "plateNo": "辽 B12345",
    "engineNo": "1212XS123113",
    "type": "小型汽车",
    "userName": null
    }],
    "total": "1"
    }
    7.3.9解除绑定车辆信息
     */
    const val get_api_traffic_car_list= "/prod-api/api/traffic/car/list"

    /**7.3.9解除绑定车辆信息 DELETE
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    7.4 违章相关接口
    7.4.1接受违章处罚
     */
    const val delete_api_traffic_car__id_= "/prod-api/api/traffic/car/{id}"

    /**7.4.1接受违章处罚 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 违章 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    7.4.2获取违章撤销申请列表
     */
    const val post_api_traffic_illegal_accept__id_= "/prod-api/api/traffic/illegal/accept/{id}"

    /**7.4.2获取违章撤销申请列表 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    applyDate 申请日期 query false string(date-time)
    auditDate 审核日期 query false string(date-time)
    illegalId 违章编号 query false integer(int64)
    no 申请单号 query false string
    status 状态，参见字典名：撤销申请状态 query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 撤销申请
    applyDate 申请日期 string(date-time)
    auditDate 审核日期 string(date-time)
    auditRemark 审批意见 string
    auditor 审批人 integer(int64)
    auditorName 审批人姓名 string
    id 主键 id integer(int64)
    参数名称 参数说明 类型
    illegalId 违章编号 integer(int64)
    no 申请单号 string
    photo 取证照片保存地址 string
    reason 撤销原因 string
    status 状态，参见字典名：撤销申请状态 string
    total 总记录数 string
    applierId 申请人 id string
    auditor 审核人 string
    applierName 申请人名称 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": {
    "applyDate": "2021-05-08",
    "auditDate": "2021-05-08",
    "auditRemark": "同意",
    "auditor": 2,
    "auditorName": "admin",
    "id": 2,
    "illegalId": 2,
    "no": "2021050818133387542",
    "photo": "http://118.190.154.52:7777/profile/upload/i
    mage/2021/05/08/53b7cfcf-d41f-4257-95d2-5abc837deccd.jpeg",
    "reason": "避让其他车辆",
    "status": "通过"
    "applierId": 1,
    "auditor": null,
    "applierName": null,
    },
    "total": "1"
    }
    7.4.3违章撤销申请
     */
    const val get_api_traffic_illegal_apply_list= "/prod-api/api/traffic/illegal/apply/list"

    /**7.4.3违章撤销申请 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "applyDate": "2021-09-10",
    "illegalId": 2,
    "photo": "http://localhost/pic/car.jpg",
    "reason": "没违章"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型 schema
    illegalId 违章编号 false integer(int64)
    photo 取证照片保存地址 false string
    reason 撤销原因 false string
    响应参数
    参数名称 参数说明 类型 schema
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    7.4.4获取当前登录人名下车辆违章信息列表
     */
    const val post_api_traffic_illegal_cancel= "/prod-api/api/traffic/illegal/cancel"

    /**7.4.4获取当前登录人名下车辆违章信息列表 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    badTime 违章时间 query false string(date-time)
    catType 号牌种类，参见字典名：号牌类型 query false string
    disposeState 处理状态，参见字典名：违章状态 query false string
    engineNumber 发动机号 query false string
    licencePlate 车牌 query false string
    noticeNo 通知书号 query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    参数名称 参数说明 类型
    rows 列表数据（数组类型） 违章查询
    badTime 违章时间 string(date-time)
    catType 号牌种类，参见字典名：号牌类型 string
    deductMarks 扣分 string
    disposeState 处理状态，参见字典名：违章状态 string
    engineNumber 发动机号 string
    id 主键 id integer(int64)
    illegalSites 违章地点 string
    licencePlate 车牌 string
    money 金额 string
    noticeNo 通知书号 string
    performDate 处罚日期 string(date-time)
    performOffice 处罚单位 string
    plateNoList 车牌号数组 array
    trafficOffence 违章行为 string
    imgUrl 违章照片地址 string
    total 总记录数 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 1,
    "licencePlate": "辽 B123456",
    "disposeState": "已缴款",
    "badTime": "2021-04-20 11:51:17",
    "money": "200",
    "deductMarks": "6",
    "illegalSites": "大连市万达广场",
    "noticeNo": "2021042110040387379",
    "engineNumber": "12345611",
    "trafficOffence": "闯红灯",
    "catType": "大型汽车",
    "performOffice": "交警队",
    "performDate": "2021-04-20",
    "imgUrl":"/dev-api/profile/upload/image/2021/05/01/31fefb9a-a06
    b-47bd-bf71-8624e89b5044.jpg",
    }],
    "total": 1
    }
    7.4.5获取当前人处罚书列表
     */
    const val get_api_traffic_illegal_list= "/prod-api/api/traffic/illegal/list"

    /**7.4.5获取当前人处罚书列表 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    carType 号牌种类，参见字典名：号牌类型 query false string
    code 通知书编号 query false string
    deductMarks 扣分 query false integer(int64)
    fileNo 档案编号 query false string
    参数名称 参数说明 请求类型 必须 数据类型
    illegalDate 违章日期 query false string(date-time)
    illegalId 违章 id query false integer(int64)
    licenseLevel 准驾车型，参见字典名：准驾车型 query false string
    licenseNo 驾驶证号 query false string
    performDate 处罚日期 query false string(date-time)
    plateNo 车牌号 query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 处罚通知书
    auditOffice 发证机关 string
    carType 号牌种类，参见字典名：号牌类型 string
    code 通知书编号 string
    contact 联系方式 string
    deductMarks 扣分 integer(int64)
    fileNo 档案编号 string
    id 主键 id integer(int64)
    illegalAddress 违章地点 string
    illegalDate 违章日期 string(date-time)
    参数名称 参数说明 类型
    illegalEven 违章行为 string
    illegalId 违章 id integer(int64)
    licenseLevel 准驾车型，参见字典名：准驾车型 string
    licenseNo 驾驶证号 string
    money 罚款金额 number
    performDate 处罚日期 string(date-time)
    performOffice 处罚单位 string
    plateNo 车牌号 string
    userId 用户 integer(int64)
    total 总记录数 string
    userName 人员名称 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 2,
    "illegalId": 3,
    "userId": 2,
    "code": "2021042110040387379",
    "licenseNo": "210211199909090014",
    "licenseLevel": "C1",
    "carType": "大型汽车",
    "plateNo": "辽 B123456",
    "illegalDate": "2021-04-20",
    "illegalEven": "闯红灯",
    "illegalAddress": "大连市万达广场",
    "money": 200,
    "deductMarks": 6,
    "performDate": "2021-04-20",
    "performOffice": "沙河口交警队",
    "fileNo": "210211199909090014",
    "auditOffice": "沙河口交警队",
    "contact": "13800000000",
    "userName": null
    }],
    "total": 1
    }
    7.4.6获取处罚书详情
     */
    const val get_api_traffic_illegal_notice_list= "/prod-api/api/traffic/illegal/notice/list"

    /**7.4.6获取处罚书详情 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 处罚书 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 处罚通知书
    auditOffice 发证机关 string
    carType 号牌种类，参见字典名：号牌类型 string
    code 通知书编号 string
    参数名称 参数说明 类型
    contact 联系方式 string
    deductMarks 扣分 integer(int64)
    fileNo 档案编号 string
    id 主键 id integer(int64)
    illegalAddress 违章地点 string
    illegalDate 违章日期 string(date-time)
    illegalEven 违章行为 string
    illegalId 违章 id integer(int64)
    licenseLevel 准驾车型，参见字典名：准驾车型 string
    licenseNo 驾驶证号 string
    money 罚款金额 number
    performDate 处罚日期 string(date-time)
    performOffice 处罚单位 string
    plateNo 车牌号 string
    userId 用户 integer(int64)
    msg 返回消息内容 string
    userName 人员名称 string
    响应示例
    {
    "code": 200,
    "data": [{
    "id": 2,
    "illegalId": 1,
    "userId": 1,
    "code": "2021042110040387379",
    "licenseNo": "210211199909090014",
    "licenseLevel": "C1",
    "carType": "大型汽车",
    "plateNo": "辽 B123456",
    "illegalDate": "2021-04-20",
    "illegalEven": "闯红灯",
    "illegalAddress": "大连市万达广场",
    "money": 200,
    "deductMarks": 6,
    "performDate": "2021-04-20",
    "performOffice": "沙河口交警队",
    "fileNo": "210211199909090014",
    "auditOffice": "沙河口交警队",
    "contact": "13800000000",
    "userName": null
    }],
    "msg": "操作成功"
    }
    7.4.7支付罚款
     */
    const val get_api_traffic_illegal_notice__id_= "/prod-api/api/traffic/illegal/notice/{id}"

    /**7.4.7支付罚款 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 违章 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    7.4.8获取违章信息详情
     */
    const val post_api_traffic_illegal_pay__id_= "/prod-api/api/traffic/illegal/pay/{id}"

    /**7.4.8获取违章信息详情 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 违章 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 违章查询
    badTime 违章时间 string(date-time)
    参数名称 参数说明 类型
    catType 号牌种类，参见字典名：号牌类型 string
    deductMarks 扣分 string
    disposeState 处理状态 string
    engineNumber 发动机号 string
    id 主键 id integer(int64)
    illegalSites 违章地点 string
    licencePlate 车牌 string
    money 金额 string
    noticeNo 通知书号 string
    performDate 处罚日期 string(date-time)
    performOffice 处罚单位 string
    trafficOffence 违章行为 string
    imgUrl 违章照片地址 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "data": {
    "id": 2,
    "licencePlate": "京 FS1009",
    "disposeState": "撤销中",
    "badTime": "2020-10-23 00:00:00",
    "money": "200",
    "deductMarks": "6",
    "illegalSites": "大连市星海公园",
    "noticeNo": "12345712",
    "engineNumber": "12345611",
    "trafficOffence": "闯红灯",
    "catType": "小型新能源汽车",
    "performOffice": null,
    "performDate": null,
    "imgUrl":"/dev-api/profile/upload/image/2021/05/01/31fefb9a-a06b47bd-bf71-8624e89b5044.jpg",
    },
    "msg": "操作成功"
    }
    7.5 驾驶证相关接口
    7.5.1绑定驾驶证信息
     */
    const val get_api_traffic_illegal__id_= "/prod-api/api/traffic/illegal/{id}"

    /**7.5.1绑定驾驶证信息 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "applyDate": "2021-09-10",
    "auditOffice": "交警队",
    "contact": "13800000000",
    "fileNo": "12312312312",
    "idCard": "12323123123123",
    "licenseLevel": "C1",
    "licenseNo": "1231321123212",
    "timeout": "否",
    "verifyDate": "2027-09-10"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    applyDate 申领日期 false string(date-time)
    auditOffice 发证机关 false string
    contact 联系方式 false string
    fileNo 档案编号 false string
    idCard 身份证号 false string
    licenseLevel 准驾车型，参见字典名：准驾车型 false string
    licenseNo 驾驶证号 false string
    timeout 是否过期，参见字典名：系统是否 false string
    verifyDate 有效期 false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    7.5.2获取当前登录人绑定的驾驶证信息
     */
    const val post_api_traffic_license= "/prod-api/api/traffic/license"

    /**7.5.2获取当前登录人绑定的驾驶证信息 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    无
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 驾驶证管理
    applyDate 申领日期 string(date-time)
    auditOffice 发证机关 string
    contact 联系方式 string
    fileNo 档案编号 string
    id 主键 id integer(int64)
    idCard 身份证号 string
    licenseLevel 准驾车型，参见字典名：准驾车型 string
    licenseNo 驾驶证号 string
    score 分数 integer(int64)
    timeout 是否过期，参见字典名：系统是否 string
    userId 用户 integer(int64)
    verifyDate 有效期 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "data": {
    "id": 1,
    "userId": 2,
    "licenseNo": "210211199909090014",
    "licenseLevel": "C1",
    "idCard": "210211199909090014",
    "score": 6,
    "applyDate": "2020-02-12",
    "verifyDate": "10 年",
    "timeout": "N",
    "userName": null,
    "fileNo": "210211199909090014",
    "auditOffice": "大连市沙河口区交警队",
    "contact": "13800000000"
    },
    "msg": "操作成功"
    }
    7.5.3获取驾驶证详细信息
     */
    const val get_api_traffic_license_user= "/prod-api/api/traffic/license/user"

    /**7.5.3获取驾驶证详细信息 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 驾驶证 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 驾驶证管理
    applyDate 申领日期 string(date-time)
    auditOffice 发证机关 string
    contact 联系方式 string
    fileNo 档案编号 string
    id 主键 id integer(int64)
    idCard 身份证号 string
    licenseLevel 准驾车型，参见字典名：准驾车型 string
    licenseNo 驾驶证号 string
    score 分数 integer(int64)
    timeout 是否过期，参见字典名：系统是否 string
    verifyDate 有效期 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "data": {
    "id": 1,
    "userId": 2,
    "licenseNo": "210211199909090014",
    "licenseLevel": "C1",
    "idCard": "210211199909090014",
    "score": 6,
    "applyDate": "2020-02-12",
    "verifyDate": "10 年",
    "timeout": "N",
    "userName": null,
    "fileNo": "210211199909090014",
    "auditOffice": "大连市沙河口区交警队",
    "contact": "13800000000"
    },
    "msg": "操作成功"
    }
    7.5.4解除绑定驾驶证信息
     */
    const val get_api_traffic_license__id_= "/prod-api/api/traffic/license/{id}"

    /**7.5.4解除绑定驾驶证信息 DELETE
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 驾驶证 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    8 活动管理
    8.1 广告轮播接口
    8.1.1查询广告列表
     */
    const val delete_api_traffic_license__id_= "/prod-api/api/traffic/license/{id}"

    /**8.1.1查询广告列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数 支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    advTitle 广告标题 query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 广告轮播实体
    advImg 广告图片 string
    参数名称 参数说明 类型
    advTitle 广告标题 string
    id 广告 ID integer(int64)
    remark 备注 string
    servModule 业务模块 string
    sort 排序 integer(int64)
    targetId 跳转详情 id integer(int64)
    total 总记录数 string
    appType app 类型 string
    status 状态 string
     响应示例
    {
    "code": " 200 ",
    "msg": "查询成功",
    "rows": [
    {
    "id": 14,
    "appType": "activity",
    "status": "1",
    "sort": 1,
    "advTitle": "测试广告",
    "advImg": "http://152.136.210.130:7777/profile/upload/image/202
    1/04/26/183e63c6-a59d-4551-a5b4-7055ff7a9575.jpg",
    "servModule": "新闻",
    "targetId": 1,
    "type": "2"
    }
    ],
    "total": "1"
    }
    8.2 活动分类相关接口
    8.3.1获取活动分类列表
     */
    const val get_api_activity_rotation_list= "/prod-api/api/activity/rotation/list"

    /**8.3.1获取活动分类列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    data 列表数据（数组类型） 活动类别
    id integer(int64)
    name 类别名称 string
    sort 排序 integer(int32)
    imgUrl 类别图标 string
    msg 消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "id": 1,
    "name": "跑步",
    "sort": 1,
    "imgUrl": "/dev-api/profile/upload/image/2021/04/22/063b98c0-b3
    2b-4d41-89d0-108ad274b932.png"
    },
    {
    "id": 2,
    "name": "打篮球",
    "sort": 2,
    "imgUrl": "/dev-api/profile/upload/image/2021/04/22/3352be12-22
    b1-44f1-af1f-6a16cacbf204.png"
    }
    ]
    }
    8.3 活动相关接口
    8.3.1获取活动列表
     */
    const val get_api_activity_category_list= "/prod-api/api/activity/category/list"

    /**8.3.1获取活动列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：
    /prod-api/api/activity/activity/list?recommend=Y&pageNum=1&pageSize=8
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    categoryId 活动分类 id query false integer(int64)
    name 活动名称 query false string
    参数名称 参数说明 请求类型 必须 数据类型
    recommend 是否推荐 Y 是 N 否 query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    rows 列表数据（数组类型） 活动实体
    id integer(int64)
    name 活动名称 string
    content 详情内容 string
    imgUrl 活动图片 string
    categoryId 活动类别 id integer(int64)
    recommend 是否推荐 string
    signupNum 报名人数 integer(int64)
    likeNum 点赞数量 integer(int64)
    status 状态 string
    publishTime 发布时间 string(date-time)
    categoryName 活动类别 string
    msg 消息内容 string
    total 总记录数 string
    响应示例
    {
    "total": 1,
    "rows": [
    {
    "id": 1,
    "name": "相约长跑 10 公里",
    "content": "<p>相约长跑 10 公里</p>",
    "imgUrl": "/dev-api/profile/upload/image/2021/04/22/ecfee0c4-32
    31-4bdc-89ad-ab1398710d16.png",
    "categoryId": 1,
    "recommend": "Y",
    "signupNum": 46,
    "likeNum": 233,
    "status": "1",
    "publishTime": "2021-04-22 10:38:02",
    "categoryName": "跑步"
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    8.3.2获取活动详情
     */
    const val get_api_activity_activity_list= "/prod-api/api/activity/activity/list"

    /**8.3.2获取活动详情 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/activity/activity/1
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    data 活动实体
    id integer(int64)
    name 活动名称 string
    content 详情内容 string
    imgUrl 活动图片 string
    categoryId 活动类别 id integer(int64)
    recommend 是否推荐 string
    signupNum 报名人数 integer(int64)
    likeNum 点赞数量 integer(int64)
    status 状态 string
    publishTime 发布时间 string(date-time)
    categoryName 活动类别 string
    msg 消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "id": 1,
    "name": "相约长跑 10 公里",
    "content": "<p>相约长跑 10 公里</p>",
    "imgUrl": "/dev-api/profile/upload/image/2021/04/22/ecfee0c4-32
    31-4bdc-89ad-ab1398710d16.png",
    "categoryId": 1,
    "recommend": "Y",
    "signupNum": 46,
    "likeNum": 233,
    "status": "1",
    "publishTime": "2021-04-22 10:38:02",
    "categoryName": "跑步"
    }
    }
    8.4 报名相关接口
    8.4.1活动报名
     */
    const val get_api_activity_activity__id_= "/prod-api/api/activity/activity/{id}"

    /**8.4.1活动报名 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "activityId": 1
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    activityId 活动 id true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200
    }
    8.4.2判断当前用户是否报名活动
     */
    const val post_api_activity_signup= "/prod-api/api/activity/signup"

    /**8.4.2判断当前用户是否报名活动 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    activityId 活动 id query true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    isSignup 已报名 true，未报名 false string
    id 报名 id integer(int64)
    msg 返回消息内容 string
    响应示例
    {
    "msg": "已报名",
    "isSignup": true,
    "id": 3,
    "code": 200
    }
    8.5 评论相关接口
    8.5.1添加活动评论
     */
    const val get_api_activity_signup_check= "/prod-api/api/activity/signup/check"

    /**8.5.1添加活动评论 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "activityId": 1,
    "content": "我喜欢这个活动"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    activityId 活动 id true integer(int64)
    content 评论内容 true string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200
    }
    8.5.2获取活动评论列表
     */
    const val post_api_activity_comment= "/prod-api/api/activity/comment"

    /**8.5.2获取活动评论列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：
    /prod-api/api/activity/comment/list?activityId=1&pageNum=1&pageSize=8
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    activityId 活动 id query true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    rows 列表数据（数组类型） 活动评论
    id integer(int64)
    userId 用户 id integer(int64)
    activityId 活动 id integer(int64)
    参数名称 参数说明 类型
    content 评论内容 string
    commentTime 评论时间 string(date-time)
    activityName 活动名 string
    userName 评论人用户名 string
    nickName 评论人昵称 string
    avatar 评论人头像 string
    msg 消息内容 string
    total 总记录数 string
    响应示例
    {
    "total": 3,
    "rows": [
    {
    "id": 3,
    "userId": 1,
    "activityId": 1,
    "content": "我喜欢这个活动",
    "commentTime": "2021-04-26 16:35:54",
    "activityName": "相约长跑 10 公里",
    "userName": "admin",
    "nickName": "小逻辑",
    "avatar": ""
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    8.5.3获取活动评论数
     */
    const val get_api_activity_comment_list= "/prod-api/api/activity/comment/list"

    /**8.5.3获取活动评论数 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/activity/comment/number?activityId=1
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    activityId 活动 id query true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    commentNum 活动评论数 string
    msg 消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "commentNum": 3,
    "code": 200
    }
    9 生活交费
    9.1 广告轮播接口
    9.1.1查询广告列表
     */
    const val get_api_activity_comment_number= "/prod-api/api/activity/comment/number"

    /**9.1.1查询广告列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数 支持分页和排序 参数参见表格分页和排序说明
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 广告轮播实体
    advImg 广告图片 string
    advTitle 广告标题 string
    id 广告 ID integer(int64)
    remark 备注 string
    servModule 业务模块 string
    sort 排序 integer(int64)
    targetId 跳转详情 id integer(int64)
    参数名称 参数说明 类型
    total 总记录数 string
    appType app 类型 string
    status 状态 string
    响应示例
    {
    "code": 200 ,
    "msg": "查询成功",
    "rows": [
    {
    "id": 14,
    "appType": "living",
    "status": "1",
    "sort": 1,
    "advTitle": "广告 1",
    "advImg": "http://118.190.154.52:7777/profile/upload/image/2021
    /05/12/4aa010a5-2787-4aeb-aecb-6032d0d327cb.jpg",
    "servModule": "新闻资讯",
    "targetId": 185,
    "type": "2"
    ],
    "total": 3
    }
    9.2 意见反馈接口
    9.2.1新增意见反馈
     */
    const val get_api_living_rotation_list= "/prod-api/api/living/rotation/list"

    /**9.2.1新增意见反馈 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "content": "缴费服务在某些地区还未开通",
    "title": "缴费问题"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    content 反馈内容 false string
    title 反馈标题 false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    响应示例
    {
    "code": "操作成功",
    "msg": 200
    }
    9.2.2查询意见反馈列表
     */
    const val post_api_living_feedback= "/prod-api/api/living/feedback"

    /**9.2.2查询意见反馈列表 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数 支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    title 反馈标题 query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 反馈实体
    content 反馈内容 string
    id 反馈 ID integer(int64)
    remark 备注 string
    title 反馈标题 string
    userId 反馈人用户 ID integer(int64)
    total 总记录数 string
    appType app 类型 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [
    {
    "id": 63,
    "appType": "living",
    "title": "缴费问题",
    "content": "缴费服务在某些地区还未开",
    "userId": 2
    }
    ],
    "total": 13
    }
    9.2.3获取意见反馈详细信息
     */
    const val get_api_living_feedback_list= "/prod-api/api/living/feedback/list"

    /**9.2.3获取意见反馈详细信息 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 反馈实体
    content 反馈内容 string
    id 反馈 ID integer(int64)
    title 反馈标题 string
    userId 反馈人用户 ID integer(int64)
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "id": 86,
    "appType": "metro",
    "title": "缴费问题",
    "content": "缴费服务在某些地区还未开通",
    "userId": 2
    }
    }
    9.3 生活资讯接口
    9.3.1获取新闻分类
     */
    const val get_api_living_feedback__id_= "/prod-api/api/living/feedback/{id}"

    /**9.3.1获取新闻分类 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    无
    支持分页和排序 参数参见表格分页和排序说明
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    参数名称 参数说明 类型
    rows 列表数据（数组类型） 新闻分类实体
    id 分类编号 integer(int64)
    name 分类名称 string
    sort 分类序号 integer(int32)
    total 总记录数 string
    appType app 类型 string
    status 状态 string
    parentId 人员 id string
    响应示例
    {
    "code": 200,
    "msg": "操作成功",
    "data": [{
    "id": 26,
    "appType": "living",
    "name": "新闻",
    "sort": 1,
    "status": "Y",
    "parentId": null
    }
    ]
    }
    9.3.2获取新闻评论列表
     */
    const val get_api_living_press_category_list= "/prod-api/api/living/press/category/list"

    /**9.3.2获取新闻评论列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    commentDate 评论时间 query false string(date-time)
    newsId 新闻 ID query true integer(int64)
    userId 评论人 id query false integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 新闻评论实体
    commentDate 评论时间 string(date-time)
    content 评论内容 string
    id 评论 ID integer(int64)
    likeNum 点赞数 integer(int64)
    newsId 新闻 ID integer(int64)
    userId 评论人 id integer(int64)
    userName 用户名 string
    total 总记录数 string
    appType app 类型 string
    响应示例
    {
    "total": 1,
    "rows": [
    {
    "id": 11,
    "appType": "living",
    "newsId": 180,
    "content": "这真是个好消息",
    "commentDate": "2021-05-11 21:47:46",
    "userId": 2,
    "likeNum": 0,
    "userName": "test01",
    "newsTitle": "卓创资讯：猪价放量急跌 多地猪价破“10”"
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    9.3.3获取新闻评论详细信息
     */
    const val get_api_living_press_comments_list= "/prod-api/api/living/press/comments/list"

    /**9.3.3获取新闻评论详细信息 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 评论 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 新闻评论实体
    commentDate 评论时间 string(date-time)
    content 评论内容 string
    id 评论 ID integer(int64)
    likeNum 点赞数 integer(int64)
    newsId 新闻 ID integer(int64)
    userId 评论人 id integer(int64)
    msg 返回消息内容 string
    appType app 类型 string
    响应示例
    {
    "code": 200,
    "data": {
    "id": 11,
    "appType": "living",
    "newsId": 180,
    "content": "这真是个好消息",
    "commentDate": "2021-05-11 21:47:46",
    "userId": 2,
    "likeNum": 0,
    "userName": "test01",
    "newsTitle": "卓创资讯：猪价放量急跌 多地猪价破“10”"
    },
    "msg": "操作成功"
    }
    9.3.4新闻点赞
     */
    const val get_api_living_press_comments__id_= "/prod-api/api/living/press/comments/{id}"

    /**9.3.4新闻点赞 PUT
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 新闻 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    9.3.5获取新闻列表
     */
    const val put_api_living_press_press_like__id_= "/prod-api/api/living/press/press/like/{id}"

    /**9.3.5获取新闻列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    hot 是否热点，参见字典名：系统是否 query false string
    publishDate 发布日期 query false string(date-time)
    title 新闻标题 query false string
    type 新闻分类 id query false string
    top 是否推荐，参见字典名：系统是否 query false string
    请 求 示 例 ：
    /prod-api/api/living/press/press/list?type=26&pageNum=1&pageSize=6
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 新闻实体
    commentNum 评论数 integer(int64)
    content 新闻内容 string
    cover 新闻封面图片地址 string
    hot 是否热点，参见字典名：系统是否 string
    id 新闻 ID integer(int64)
    likeNum 点赞数 integer(int64)
    publishDate 发布日期 string(date-time)
    参数名称 参数说明 类型
    readNum 阅读数 integer(int64)
    subTitle 新闻副标题 string
    title 新闻标题 string
    top 是否推荐，参见字典名：系统是否 string
    total 总记录数 string
    响应示例
    {
    "total": 5,
    "rows": [
    {
    "id": 180,
    "cover": "http://118.190.154.52:7777/profile/upload/image/2021/
    05/10/b88ef8ac-7538-4984-be59-3a768ec4709f.png",
    "title": "卓创资讯：猪价放量急跌 多地猪价破“10”",
    "subTitle": null,
    "content": "<p>据卓创监测，今日生猪均价跌至 19.00 元/公斤，较月初
    跌 8.12%。多地开启急跌模式，“10 元”均价线下压到华南区域，仅极少数销区
    均价仍在 20.00 元/公斤以上。大肥猪供应过剩，二次育肥补栏偏弱，预计猪价
    或继续走低。</p>",
    "status": "Y",
    "publishDate": "2021-05-10",
    "tags": null,
    "commentNum": 16,
    "likeNum": 53,
    "readNum": 615,
    "type": "26",
    "top": "N",
    "hot": "N"
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    9.3.6获取新闻详细信息
     */
    const val get_api_living_press_press_list= "/prod-api/api/living/press/press/list"

    /**9.3.6获取新闻详细信息 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 新闻 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 新闻实体
    commentNum 评论数 integer(int64)
    content 新闻内容 string
    cover 新闻封面图片地址 string
    hot 是否热点，参见字典名：系统是否 string
    id 新闻 ID integer(int64)
    likeNum 点赞数 integer(int64)
    publishDate 发布日期 string(date-time)
    readNum 阅读数 integer(int64)
    参数名称 参数说明 类型
    subTitle 新闻副标题 string
    title 新闻标题 string
    top 是否推荐，参见字典名：系统是否 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "data": {
    "id": 180,
    "appType": "living",
    "cover": "http://118.190.154.52:7777/profile/upload/image/202
    1/05/10/b88ef8ac-7538-4984-be59-3a768ec4709f.png",
    "title": "卓创资讯：猪价放量急跌 多地猪价破“10”",
    "subTitle": null,
    "content": "<p>据卓创监测，今日生猪均价跌至 19.00 元/公斤，较月
    初跌 8.12%。多地开启急跌模式，“10 元”均价线下压到华南区域，仅极少数销
    区均价仍在 20.00 元/公斤以上。大肥猪供应过剩，二次育肥补栏偏弱，预计猪
    价或继续走低。</p>",
    "status": "Y",
    "publishDate": "2021-05-10",
    "tags": null,
    "commentNum": 16,
    "likeNum": 53,
    "readNum": 615,
    "type": "26",
    "top": "N",
    "hot": "N"
    },
    "msg": "操作成功"
    }
    9.3.7发表新闻评论
     */
    const val get_api_living_press_press__id_= "/prod-api/api/living/press/press/{id}"

    /**9.3.7发表新闻评论 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "newsId": 180
    "content": "这真是个好消息"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    content 评论内容 false string
    newsId 新闻 ID true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    9.3.8评论点赞
     */
    const val post_api_living_press_pressComment= "/prod-api/api/living/press/pressComment"

    /**9.3.8评论点赞 PUT
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 新闻 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    9.4 天气预报接口
     */
    const val put_api_living_press_pressComment_like__id_= "/prod-api/api/living/press/pressComment/like/{id}"

    /**9.4 天气预报接口 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    无
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 object
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "today": {
    "hours": [
    {
    "hour": "13:00",
    "weather": "晴",
    "temperature": 19
    },
    {
    "hour": "14:00",
    "weather": "晴",
    "temperature": 20
    }……
    ],
    "airQuantity": {
    "no2": 32,
    "pm25": 22,
    "o3": 27,
    "so2": 6,
    "pm10": 50,
    "co": 0.3
    },
    "comfortLevel": {
    "uv": 4,
    "weather": "晴",
    "humidity": "60",
    "air": "无污染",
    "apparentTemperature": "15",
    "label": "今天",
    "day": "4 月 27 日今天"
    } ……
    ]
    }
    }
    9.5 缴费分类接口
    9.5.1查询缴费分类
     */
    const val get_api_living_weather= "/prod-api/api/living/weather"

    /**9.5.1查询缴费分类 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    无
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 生活缴费分类
    id 分类 id integer(int64)
    imgUrl 图标 string
    liveName 类别名称 string
    参数名称 参数说明 类型
    remark string
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "id": 1,
    "liveName": "手机话费",
    "imgUrl": "http://118.190.154.52:7777/profile/upload/image/2021
    /05/08/95c51b0c-9674-4784-8011-324d02bd3487.pn"
    },
    {
    "id": 2,
    "liveName": "水费",
    "imgUrl": "http://118.190.154.52:7777/profile/upload/image/2021
    /05/08/72163ab8-832a-45e0-8d06-44546294affb.png"
    },
    {
    "id": 3,
    "liveName": "电费",
    "imgUrl": "http://118.190.154.52:7777/profile/upload/image/2021
    /05/08/55867f4c-461a-42b2-9822-9c4cbbf563ba.png"
    },
    {
    "id": 4,
    "liveName": "燃气费",
    "imgUrl": "http://118.190.154.52:7777/profile/upload/image/2021
    /05/08/7ddace97-4688-4260-8a1d-231070af5bf0.png"
    }
    ]
    }
    9.6 缴费接口（水、电、燃气）
    9.6.1缴费接口
     */
    const val get_api_living_category_list= "/prod-api/api/living/category/list"

    /**9.6.1缴费接口 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "billNo":"202104240819072",
    "paymentNo": "15674939",
    "paymentType": "电子支付"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    billNo 账单号 true string
    paymentNo 缴费编号 true string
    paymentType 支付方式，参见字典名：支付类型 true string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200
    }
    9.6.2查询当前用户缴费记录
     */
    const val post_api_living_recharge= "/prod-api/api/living/recharge"

    /**9.6.2查询当前用户缴费记录 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：
    /prod-api/api/living/recharge/record/list?categoryId=2&pageNum=1&page
    Size=8
    请求参数：
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    categoryId 分类 id(2 水费 3 电费 4
    燃气费) query true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 缴费记录
    amount 缴费金额 number
    billNo 账单号 string
    参数名称 参数说明 类型
    categoryId 缴费分类 integer(int64)
    id 主键 integer(int64)
    imgUrl 图标 string
    liveName 类别名称 string
    paymentNo 缴费编号 string
    paymentType 支付方式 string
    rechargeTime 缴费时间 string(date-time)
    userId 用户 id integer(int64)
    msg 返回消息内容 string
    total 总记录数 string
    响应示例
    {
    "total": 12,
    "rows": [
    {
    "id": 16,
    "paymentNo": "15666083",
    "billNo": "202104140820372",
    "amount": 56,
    "categoryId": 2,
    "paymentType": "电子支付",
    "rechargeTime": "2021-03-23 14:01:44",
    "userId": 2,
    "liveName": "水费",
    "imgUrl": "http://118.190.154.52:7777/profile/upload/image/2021
    /05/08/72163ab8-832a-45e0-8d06-44546294affb.png"
    },
    ......
    ],
    "code": 200,
    "msg": "查询成功"
    }
    9.7 缴费账单接口
    9.7.1根据缴费编号查询缴费账单
     */
    const val get_api_living_recharge_record_list= "/prod-api/api/living/recharge/record/list"

    /**9.7.1根据缴费编号查询缴费账单 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/living/bill?paymentNo=15674939&categoryId=2
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    paymentNo 缴费编号 query true string
    categoryId 分类 id(2 水费 3 电
    费 4 燃气费) query true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 缴费账单
    amount 缴费金额 number
    billNo 账单单号 string
    categoryId 分类 id integer(int64)
    参数名称 参数说明 类型
    chargeUnit 收费单位 string
    id 主键 integer(int64)
    payStatus 是否支付 string
    paymentNo 缴费编号 string
    address 家庭地址 string
    title 标题 string
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data":
    {
    "id": 25,
    "billNo": "202104271358091",
    "title": "第一季度电费",
    "amount": 100,
    "chargeUnit": "水电公司",
    "address": "大连高新园区大华锦绣 3 号楼 2 单元 2803",
    "paymentNo": "15674939",
    "categoryId": 2,
    "payStatus": "0"
    }
    }
    9.8 缴费账户接口
    9.8.1根据身份证号查询缴费编号
     */
    const val get_api_living_bill= "/prod-api/api/living/bill"

    /**9.8.1根据身份证号查询缴费编号 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：
    /prod-api/api/living/account/list?categoryId=2&idCard=210113199808242
    137
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    categoryId 分类 id(2 水费 3 电费 4 燃气费) query true integer(int64)
    idCard 身份证号 query true string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 账户信息
    address 家庭地址 string
    categoryId 类型 integer(int64)
    id 主键 integer(int64)
    idCard 身份证号 string
    ownerName 户主名 string
    paymentNo 缴费编号 string
    参数名称 参数说明 类型
    userId 用户 id integer(int64)
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data":[{
    "id": 1,
    "ownerName": "王大卫",
    "idCard": "210211199909090014",
    "address": "大连高新园区大华锦绣 3 号楼 2 单元 2803",
    "paymentNo": "15666083",
    "categoryId": 2,
    "userId": 2
    }]
    }
    9.9 话费充值相关接口
    9.9.1查询手机话费余额信息
     */
    const val get_api_living_account_list= "/prod-api/api/living/account/list"

    /**9.9.1查询手机话费余额信息 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：
    /prod-api/api/living/phone?operator=中国移动&phonenumber=15898125172
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    operator 运营商 (参见字典名：运营商) query true string
    phonenumber 手机号 query true string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 手机号信息
    id integer(int64)
    phonenumber 手机号 string
    balance 余额 number
    operator 运营商 string
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "id": 1,
    "phonenumber": "13800000000",
    "balance": 20,
    "operator": "中国移动"
    }
    }
    9.9.2手机话费充值
     */
    const val get_api_living_phone= "/prod-api/api/living/phone"

    /**9.9.2手机话费充值 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "paymentType": "电子支付",
    "phonenumber": "15898125172",
    "rechargeAmount": 50,
    "ruleId": 1,
    "type": "2"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    paymentType 支付类型：(参见字典名：支付类型) true string
    phonenumber 电话号码 true string
    rechargeAmount缴费金额，必填 true number
    ruleId 优惠策略 id，如果是优惠策略充值，此
    项必填
    false integer(int64)
    type 充值类型 1 自由充值 2 优惠策略充值 true string
    响应参数
    参数名称 参数说明 类型
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 手机话费充值记录
    id integer(int64)
    paymentAmount 支付金额 number
    paymentType 支付方式 string
    phonenumber 电话号码 string
    rechargeAmount 充值金额 number
    rechargeTime 充值时间 string(date-time)
    status 充值状态 string
    title 标题 string
    userId 用户 id integer(int64)
    msg 返回消息内容 string
    响应示例
    {
    "msg": "充值成功",
    "code": 200,
    "data": {
    "id": 2,
    "title": "话费充值",
    "phonenumber": "13800000000",
    "rechargeAmount": 50,
    "paymentAmount": 49,
    "paymentType": "电子支付",
    "rechargeTime": "2021-05-10 13:43:36",
    "userId": 2
    }
    }
    9.9.3查询当前用户话费充值记录
     */
    const val post_api_living_phone_recharge= "/prod-api/api/living/phone/recharge"

    /**9.9.3查询当前用户话费充值记录 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/living/phone/record/list?pageNum=1&pageSize=8
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 手机话费充值记录
    id integer(int64)
    paymentAmount 支付金额 number
    paymentType 支付方式 string
    phonenumber 电话号码 string
    rechargeAmount 充值金额 number
    rechargeTime 充值时间 string(date-time)
    title 标题 string
    userId 用户 id integer(int64)
    参数名称 参数说明 类型
    total 总记录数 string
    响应示例
    {
    "total": 2,
    "rows": [
    {
    "id": 15,
    "title": "话费充值",
    "phonenumber": "13800000000",
    "rechargeAmount": 20,
    "paymentAmount": 20,
    "paymentType": "电子支付",
    "rechargeTime": "2021-05-10 13:51:52",
    "userId": 2,
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    9.9.4查询话费充值优惠策略
     */
    const val get_api_living_phone_record_list= "/prod-api/api/living/phone/record/list"

    /**9.9.4查询话费充值优惠策略 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    无
    响应参数
    参数名称 参数说明 类型
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 优惠规则
    ruleId integer(int64)
    rechargeAmount 充值金额 number
    backAmount 优惠金额 number
    sort 排序 integer(int64)
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "ruleId": 1,
    "rechargeAmount": 50,
    "backAmount": 1,
    "sort": 1,
    "status": "1"
    },
    {
    "ruleId": 2,
    "rechargeAmount": 100,
    "backAmount": 2,
    "sort": 2,
    "status": "1"
    }
    ]
    }
    10 看电影
    10.1 广告轮播接口
    10.1.1查询广告列表
     */
    const val get_api_living_phone_rule_list= "/prod-api/api/living/phone/rule/list"

    /**10.1.1查询广告列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数 支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    advTitle 广告标题 query false string
    type 广告类型，参见字典名：广告类型 query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 广告轮播实体
    advImg 广告图片 string
    advTitle 广告标题 string
    id 广告 ID integer(int64)
    remark 备注 string
    参数名称 参数说明 类型
    servModule 业务模块 string
    sort 排序 integer(int64)
    targetId 跳转详情 id integer(int64)
    total 总记录数 string
    appType app 类型 string
    status 状态 string
    响应示例
    {
    "code": " 200 ",
    "msg": "查询成功",
    "rows": [
    {
    "id": 15,
    "appType": "movie",
    "status": "1",
    "sort": 1,
    "advTitle": "海报",
    "advImg": "http://152.136.210.130:7777/profile/upload/image/202
    1/04/26/183e63c6-a59d-4551-a5b4-7055ff7a9575.jpg",
    "servModule": "影片",
    "targetId": 11,
    "type": "2"
    }
    ],
    "total": "1"
    }
    10.2 影片相关接口
    10.2.1发表影片评论
     */
    const val get_api_movie_rotation_list= "/prod-api/api/movie/rotation/list"

    /**10.2.1发表影片评论 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "content": "好看",
    "movieId": 1,
    "score": 5
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    content false string
    movieId false integer(int64)
    score false integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    10.2.2评论点赞
     */
    const val post_api_movie_film_comment= "/prod-api/api/movie/film/comment"

    /**10.2.2评论点赞 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 评论 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    10.2.3查询影评信息列表
     */
    const val post_api_movie_film_comment_like__id_= "/prod-api/api/movie/film/comment/like/{id}"

    /**10.2.3查询影评信息列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    commentDate query false string(date-time)
    movieId query false integer(int64)
    score query false integer(int64)
    userId query false integer(int64)
    userName query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） FilmComment
    commentDate 评论日期 string(date-time)
    content 评论内容 string
    id 主键 id integer(int64)
    likeNum 点赞数 integer(int64)
    movieId 影片 id integer(int64)
    movieName 影片名 string
    nickName 评论人昵称 string
    参数名称 参数说明 类型
    score 打分 integer(int64)
    userId 评论人 id integer(int64)
    userName 评论人用户名 string
    total 总记录数 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 1,
    "movieId": 2,
    "userId": 2,
    "score": 5,
    "content": "一部变形金刚，令无数人不能自己",
    "commentDate": "2021-04-27",
    "likeNum": 681,
    "movieName": "变形金刚",
    "userName": "test01",
    "nickName": "测试用户 01"
    }],
    "total": 1
    }
    10.2.4看过
     */
    const val get_api_movie_film_comment_list= "/prod-api/api/movie/film/comment/list"

    /**10.2.4看过 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 影片 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    10.2.5想看
     */
    const val post_api_movie_film_favorite__id_= "/prod-api/api/movie/film/favorite/{id}"

    /**10.2.5想看 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 影片 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    10.2.6查询影片信息列表
     */
    const val post_api_movie_film_like__id_= "/prod-api/api/movie/film/like/{id}"

    /**10.2.6查询影片信息列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    category 影片类型，参见字典名：影片类型 query false string
    name 影片名称 query false string
    playDate 上映时间 query false string(date-time)
    playType 播放类型编号 query false string
    recommend 是否推荐，参见字典名：系统是否 query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 影片实体
    category 影片类型编号 string
    cover 影片封面图片地址 string
    duration 时长 integer(int64)
    favoriteNum 看过人数 integer(int64)
    id 编号 integer(int64)
    introduction 简介 string
    language 语言 string
    likeNum 想看人数 integer(int64)
    name 影片名称 string
    playDate 上映时间 string(date-time)
    playType 播放类型编号 string
    recommend 是否推荐 string
    score 评分 integer(int32)
    total 总记录数 string
    other 其他 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 3,
    "name": "悬崖之上",
    "category": "3",
    "cover": "http://118.190.154.52:7777/profile/upload/image/2021/
    05/08/a7924153-1dc6-4c3c-9d89-67acbbfb1880.jpg",
    "playType": "3",
    "score": 5,
    "duration": 120,
    "playDate": "2021-04-30",
    "likeNum": 143137,
    "favoriteNum": 198026,
    "language": "中文",
    "introduction": "<p>上世纪三十年代，四位曾在苏联接受特训的共产党
    特</p>",
    "other": null,
    "recommend": "Y"
    }],
    "total": 1
    }
    10.2.7查询电影预告信息列表
     */
    const val get_api_movie_film_list= "/prod-api/api/movie/film/list"

    /**10.2.7查询电影预告信息列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    name 片名 query false string
    playDate 上映日期 query false string(date-time)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 预告片实体
    cover 封面图片地址 string
    id ID integer(int64)
    introduction 影片介绍 string
    name 片名 string
    playDate 播放日期，格式 yyyy-MM-dd string(date-time)
    video 视频地址 string
    total 总记录数 string
    响应示例
    {
    "code": 200,
    "msg": "",
    "rows": [{
    "id": 2,
    "name": "悬崖之上",
    "cover": "http://118.190.154.52:7777/profile/upload/image/2021/
    05/09/db9448dd-7383-4f0a-ad9c-ee9ca0a17920.jpg",
    "video": "http://118.190.154.52:7777http://118.190.154.52:7777/
    profile/upload/2021/05/09/07c6e6ae-80e6-424e-96ac-e076c498078e.mp4",
    "playDate": "2021-05-01",
    "introduction": "<p>上世纪三十年代，四位曾在苏联接受特训的共产党
    特</p>"
    }],
    "total": 1
    }
    10.2.8获取电影预告信息详细信息
     */
    const val get_api_movie_film_preview_list= "/prod-api/api/movie/film/preview/list"

    /**10.2.8获取电影预告信息详细信息 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 电影预告 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 预告片实体
    cover 封面图片地址 string
    id ID integer(int64)
    introduction 影片介绍 string
    name 片名 string
    playDate yyyy-MM-dd string(date-time)
    video 视频地址 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "data": {
    "id": 2,
    "name": "悬崖之上",
    "cover": "http://118.190.154.52:7777/profile/upload/image/2021/
    05/09/db9448dd-7383-4f0a-ad9c-ee9ca0a17920.jpg",
    "video": "http://118.190.154.52:7777http://118.190.154.52:7777/
    profile/upload/2021/05/09/07c6e6ae-80e6-424e-96ac-e076c498078e.mp4",
    "playDate": "2021-05-01",
    "introduction": "<p>上世纪三十年代，四位曾在苏联接受特训的共产党
    特</p>"
    },
    "msg": "操作成功"
    }
    10.2.9获取影片信息详细信息
     */
    const val get_api_movie_film_preview__id_= "/prod-api/api/movie/film/preview/{id}"

    /**10.2.9获取影片信息详细信息 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 影片 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 影片实体
    参数名称 参数说明 类型
    category 影片类型，参见字典名：影片类型 string
    cover 影片封面图片地址 string
    duration 时长 integer(int64)
    favoriteNum 看过人数 integer(int64)
    id 编号 integer(int64)
    introduction 简介 string
    language 语言 string
    likeNum 想看人数 integer(int64)
    name 影片名称 string
    playDate 上映时间 string(date-time)
    playType 播放类型编号 string
    recommend 是否推荐 string
    score 评分 integer(int32)
    msg 返回消息内容 string
    other 其他 string
    响应示例
    {
    "code": 200,
    "data": {
    "id": 3,
    "name": "悬崖之上",
    "category": "3",
    "cover": "http://118.190.154.52:7777/profile/upload/image/2021/
    05/08/a7924153-1dc6-4c3c-9d89-67acbbfb1880.jpg",
    "playType": "3",
    "score": 5,
    "duration": 120,
    "playDate": "2021-04-30",
    "likeNum": 143137,
    "favoriteNum": 198026,
    "language": "中文",
    "introduction": "<p>上世纪三十年代，四位曾在苏联接受特训的共产党
    特</p>",
    "other": null,
    "recommend": "Y"
    },
    "msg": "操作成功"
    }
    10.3 影院相关接口
    10.3.1查询影院信息列表
     */
    const val get_api_movie_film_detail__id_= "/prod-api/api/movie/film/detail/{id}"

    /**10.3.1查询影院信息列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    address 详细地址 query false string
    area 所在区域 query false string
    city 所在城市 query false string
    name 影院名称 query false string
    参数名称 参数说明 请求类型 必须 数据类型
    province 所在省份 query false string
    timesId 场次 id query false integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 影院实体
    address 详细地址 string
    area 所在区域 string
    city 所在城市 string
    cover 封面图片地址 string
    distance 距离 string
    id 编号 integer(int64)
    name 影院名称 string
    province 所在省份 string
    score 评分 integer(int32)
    total 总记录数 string
    status 状态 string
    movieId 影片 id string
    timesId 时间 id string
    参数名称 参数说明 类型
    tags 标签 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": {
    "id": 11,
    "name": "金逸影城",
    "cover": "http://118.190.154.52:7777/profile/upload/image/2021/
    05/08/326d388c-0621-4514-b977-4b012d7801ed.jpg",
    "province": "辽宁省",
    "city": "大连市",
    "area": "沙河口区",
    "address": "西安路 99 号福佳新天地 5 层",
    "score": 5,
    "tags": null,
    "brand": "万达",
    "distance": "500 米",
    "status": "Y",
    "movieId": null,
    "timesId": null
    },
    "total": 1
    }
    10.3.2查询场次座位信息
     */
    const val get_api_movie_theatre_list= "/prod-api/api/movie/theatre/list"

    /**10.3.2查询场次座位信息 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    col 座号 query false string
    roomId 影厅 ID query true integer(int64)
    id 场次 id query true integer(int64)
    row 排号 query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据（数组类型） 座位实体
    col 座号 string
    roomId 影厅 ID integer(int64)
    row 排号 string
    id 场次 id integer(int64)
    status 座位状态，参见字典名：场次座位状态 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "data": [{
    "col": "1",
    "id": 2,
    "roomId": 3,
    "row": "2",
    "status": "0"
    }],
    "msg": "查询成功"
    }
    10.3.3查询影厅信息列表
     */
    const val get_api_movie_theatre_list4times= "/prod-api/api/movie/theatre/list4times"

    /**10.3.3查询影厅信息列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    name 影厅名 query false string
    status 是否开放，参见字典名：系统是否 query false string
    theaterId 影院 ID query false integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 影厅实体
    id 编号 integer(int64)
    name 影厅名 string
    status 是否开放，参见字典名：系统是否 string
    theaterId 影院 ID integer(int64)
    参数名称 参数说明 类型
    total 总记录数 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 3,
    "theaterId": 1,
    "name": "2 厅",
    "status": "N"
    }],
    "total": "1"
    }
    10.3.4查询影厅详情
     */
    const val get_api_movie_theatre_room_list= "/prod-api/api/movie/theatre/room/list"

    /**10.3.4查询影厅详情 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 影厅 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    参数名称 参数说明 类型
    data 返回业务数据 影厅实体
    id 编号 integer(int64)
    name 影厅名 string
    status 是否开放 string
    theaterId 影院 ID integer(int64)
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "data": {
    "id": 3,
    "theaterId": 1,
    "name": "2 厅",
    "status": "N"
    },
    "msg": "操作成功"
    }
    10.3.5查询座位信息列表
     */
    const val get_api_movie_theatre_room__id_= "/prod-api/api/movie/theatre/room/{id}"

    /**10.3.5查询座位信息列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    col 座号 query false string
    roomId 影厅 ID query true integer(int64)
    row 排号 query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 座位实体
    col 座号 string
    id 座位 id integer(int64)
    roomId 影厅 ID integer(int64)
    row 排号 string
    total 总记录数 string
    status 状态 string
    type 类型 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 11,
    "roomId": 2,
    "row": "1",
    "col": "10",
    "type": "1",
    "status": null
    }],
    "total": "1"
    }
    10.3.6获取座位信息详细信息
     */
    const val get_api_movie_theatre_seat_list= "/prod-api/api/movie/theatre/seat/list"

    /**10.3.6获取座位信息详细信息 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 座位 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 座位实体
    col 座号 string
    id 座位 id integer(int64)
    roomId 影厅 ID integer(int64)
    row 排号 string
    msg 返回消息内容 string
    参数名称 参数说明 类型
    type 类型 string
    status 状态 string
    响应示例
    {
    "code": 200,
    "data": {
    "id": 13,
    "roomId": 2,
    "row": "2",
    "col": "1",
    "type": null,
    "status": null
    },
    "msg": "操作成功"
    }
    10.3.7查询影片场次列表
     */
    const val get_api_movie_theatre_seat__id_= "/prod-api/api/movie/theatre/seat/{id}"

    /**10.3.7查询影片场次列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    endTime 结束时间 query false string
    movieId 影片 id query false integer(int64)
    playDate 播放日期 query false string(date-time)
    参数名称 参数说明 请求类型 必须 数据类型
    playType 播放类型，参见字典名：播放类型 query false string
    roomId 影厅 id query false integer(int64)
    startTime 开始时间 query false string
    theaterId 影院 id query false integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 影片场次实体
    endTime 结束时间 string
    id 编号 integer(int64)
    movieId 影片 id integer(int64)
    movieName 影片名 string
    playDate 播放日期 string(date-time)
    playType 播放类型 id string
    price 价格 number
    roomId 影厅 id integer(int64)
    roomName 影厅名 string
    saleNum 已售数量 integer(int64)
    startTime 开始时间 string
    参数名称 参数说明 类型
    theaterId 影院 id integer(int64)
    theatreName 影院名 string
    totalNum 总票数 integer(int64)
    total 总记录数 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 1,
    "theaterId": 1,
    "roomId": 2,
    "movieId": 2,
    "startTime": "07:45",
    "endTime": "18:45",
    "price": 50.9,
    "playType": "3",
    "playDate": "2021-04-07",
    "saleNum": 10,
    "totalNum": 100,
    "status": "1",
    "theatreName": "测试",
    "roomName": "1 厅",
    "movieName": "变形金刚"
    }],
    "total": 1
    }
    10.3.8获取影院信息详细信息
     */
    const val get_api_movie_theatre_times_list= "/prod-api/api/movie/theatre/times/list"

    /**10.3.8获取影院信息详细信息 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 影院 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 影院实体
    address 详细地址 string
    area 所在区域 string
    city 所在城市 string
    cover 封面图片地址 string
    distance 距离 string
    id 编号 integer(int64)
    name 影院名称 string
    province 所在省份 string
    score 评分 integer(int32)
    msg 返回消息内容 string
    tags 标签 string
    movieId 影片 id string
    参数名称 参数说明 类型
    timesId 时间 id string
    响应示例
    {
    "code": 200,
    "data": {
    "id": 11,
    "name": "金逸影城",
    "cover": "http://118.190.154.52:7777/profile/upload/image/2021/
    05/08/326d388c-0621-4514-b977-4b012d7801ed.jpg",
    "province": "辽宁省",
    "city": "大连市",
    "area": "沙河口区",
    "address": "西安路 99 号福佳新天地 5 层",
    "score": 5,
    "brand": "万达",
    "distance": "500 米",
    "tags": null,
    "movieId": null,
    "timesId": null
    },
    "msg": "操作成功"
    }
    10.4 意见反馈接口
    10.4.1新增意见反馈
     */
    const val get_api_movie_theatre__id_= "/prod-api/api/movie/theatre/{id}"

    /**10.4.1新增意见反馈 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "content": "座位不舒服",
    "title": "改善意见"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    content 反馈内容 false string
    title 反馈标题 false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    响应示例
    {
    "code": "操作成功",
    "msg": " 200 "
    }
    10.4.2查询意见反馈列表
     */
    const val post_api_movie_feedback= "/prod-api/api/movie/feedback"

    /**10.4.2查询意见反馈列表 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数 支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    title 反馈标题 query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 反馈实体
    content 反馈内容 string
    id 反馈 ID integer(int64)
    remark 备注 string
    title 反馈标题 string
    userId 反馈人用户 ID integer(int64)
    total 总记录数 string
    appType app 类型 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 20,
    "appType": "movie",
    "title": "观影反馈",
    "content": "观影时总有杂音",
    "userId": 1
    }],
    "total": "1"
    }
    10.4.3获取意见反馈详细信息
     */
    const val get_api_movie_feedback_list= "/prod-api/api/movie/feedback/list"

    /**10.4.3获取意见反馈详细信息 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 反馈实体
    content 反馈内容 string
    id 反馈 ID integer(int64)
    title 反馈标题 string
    userId 反馈人用户 ID integer(int64)
    msg 返回消息内容 string
    参数名称 参数说明 类型
    appType app 类型 string
    响应示例
    {
    "code": " 200 ",
    "data": {
    "id": 20,
    "appType": "takeout",
    "title": "观影反馈",
    "content": "观影时总有杂音",
    "userId": 1
    },
    "msg": "操作成功"
    }
    10.5 新闻相关接口
    10.5.1获取新闻分类
     */
    const val get_api_movie_feedback__id_= "/prod-api/api/movie/feedback/{id}"

    /**10.5.1获取新闻分类 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    无
    支持分页和排序 参数参见表格分页和排序说明
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    参数名称 参数说明 类型
    msg 消息内容 string
    rows 列表数据（数组类型） 新闻分类实体
    id 分类编号 integer(int64)
    name 分类名称 string
    sort 分类序号 integer(int32)
    total 总记录数 string
    appType app 类型 string
    status 状态 string
    parentId 人员 id string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 2,
    "appType": "movie",
    "name": "热映影片",
    "sort": 1,
    "status": "Y",
    "parentId": null
    }],
    "total": "1"
    }
    10.5.2获取新闻评论列表
     */
    const val get_api_movie_press_category_list= "/prod-api/api/movie/press/category/list"

    /**10.5.2获取新闻评论列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    commentDate 评论时间 query false string(date-time)
    newsId 新闻 ID query true integer(int64)
    userId 评论人 id query false integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 新闻评论实体
    commentDate 评论时间 string(date-time)
    content 评论内容 string
    id 评论 ID integer(int64)
    likeNum 点赞数 integer(int64)
    newsId 新闻 ID integer(int64)
    userId 评论人 id integer(int64)
    userName 用户名 string
    total 总记录数 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 2,
    "newsId": 1,
    "content": "好看",
    "commentDate": "2021-04-02 00:00:00",
    "userId": 1,
    "likeNum": 1,
    "userName": "张三",
    }],
    "total": "1"
    }
    10.5.3获取新闻评论详细信息
     */
    const val get_api_movie_press_comments_list= "/prod-api/api/movie/press/comments/list"

    /**10.5.3获取新闻评论详细信息 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 新闻评论 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    参数名称 参数说明 类型
    data 返回业务数据 新闻评论实体
    commentDate 评论时间 string(date-time)
    content 评论内容 string
    id 评论 ID integer(int64)
    likeNum 点赞数 integer(int64)
    newsId 新闻 ID integer(int64)
    userId 评论人 id integer(int64)
    msg 返回消息内容 string
    appType app 类型 string
    userName 人员姓名 string
    newsTitle 新闻标题 string
    响应示例
    {
    "code": 200,
    "data": {
    "id": 1,
    "appType": "living",
    "newsId": 1,
    "content": "123133123",
    "commentDate": "2021-04-02 10:10:10",
    "userId": 1,
    "likeNum": 16,
    "userName": "user1",
    "newsTitle": "卓创资讯：猪价放量急跌 多地猪价破“10”
    },
    "msg": "操作成功"
    }
    10.5.4新闻点赞
     */
    const val get_api_movie_press_comments__id_= "/prod-api/api/movie/press/comments/{id}"

    /**10.5.4新闻点赞 PUT
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 新闻 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    10.5.5获取新闻列表
     */
    const val put_api_movie_press_press_like__id_= "/prod-api/api/movie/press/press/like/{id}"

    /**10.5.5获取新闻列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    hot 是否热点，参见字典名：系统是否 query false string
    publishDate 发布日期 query false string(date-time)
    title 新闻标题 query false string
    top 是否推荐，参见字典名：系统是否 query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 新闻实体
    commentNum 评论数 integer(int64)
    content 新闻内容 string
    cover 新闻封面图片地址 string
    hot 是否热点，参见字典名：系统是否 string
    id 新闻 ID integer(int64)
    likeNum 点赞数 integer(int64)
    publishDate 发布日期 string(date-time)
    readNum 阅读数 integer(int64)
    参数名称 参数说明 类型
    subTitle 新闻副标题 string
    title 新闻标题 string
    top 是否推荐，参见字典名：系统是否 string
    total 总记录数 string
    appType app 类型 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 99,
    "appType": "movie",
    "cover": "http://118.190.154.52:7777/profile/upload/image/202
    1/05/10/e0844f6e-50f4-4e64-b0c9-0867c73f86ef.jpg",
    "title": "真·三国无双",
    "subTitle": null,
    "content": "<p>导演: 周显扬</p><p>编剧: 杜致朗</p><p>主演: 古天
    nasty Warriors</p><p>&nbsp;</p><p>真·三国无双的剧情简介</p><
    p>· · · · · ·</p><p> 电影根据同名游戏改编，讲述了动荡的东汉末
    年，汉室摇摇欲坠，董卓入京霸占朝野，引起天下动荡，身怀绝世武艺的曹操、
    吕布、刘备、关羽、张飞等各路英雄豪杰纷纷崛起，一场群雄逐鹿的大混战正式
    拉开序幕。在乱世中，到底谁才是真正的无双英雄……</p>",
    "status": "Y",
    "publishDate": "2021-05-10",
    "tags": null,
    "commentNum": null,
    "likeNum": 24,
    "readNum": 5632,
    "type": "2",
    "top": "N",
    "hot": "N"
    }],
    "total": 1
    }
    10.5.6获取新闻详细信息
     */
    const val get_api_movie_press_press_list= "/prod-api/api/movie/press/press/list"

    /**10.5.6获取新闻详细信息 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 新闻 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 新闻实体
    commentNum 评论数 integer(int64)
    content 新闻内容 string
    cover 新闻封面图片地址 string
    hot 是否热点，参见字典名：系统是否 string
    id 新闻 ID integer(int64)
    参数名称 参数说明 类型
    likeNum 点赞数 integer(int64)
    publishDate 发布日期 string(date-time)
    readNum 阅读数 integer(int64)
    subTitle 新闻副标题 string
    title 新闻标题 string
    top 是否推荐，参见字典名：系统是否 string
    msg 返回消息内容 string
    appType app 类型 string
    响应示例
    {
    "code": 200,
    "data": {
    "id": 11,
    "appType": "movie",
    "cover": "http://118.190.154.52:7777/profile/upload/image/202
    1/05/10/e0844f6e-50f4-4e64-b0c9-0867c73f86ef.jpg",
    "title": "真·三国无双",
    "subTitle": null,
    "content": "<p>导演: 周显扬</p><p>编剧: 杜致朗</p><p>主演:
    / Dynasty Warriors</p><p>&nbsp;</p><p>真·三国无双的剧情简介</p><
    p>· · · · · ·</p><p> 电影根据同名游戏改编，讲述了动荡的东汉末
    年，汉室摇摇欲坠，董卓入京霸占朝野，引起天下动荡，身怀绝世武艺的曹操、
    吕布、刘备、关羽、张飞等各路英雄豪杰纷纷崛起，一场群雄逐鹿的大混战正式
    拉开序幕。在乱世中，到底谁才是真正的无双英雄……</p>",
    "status": "Y",
    "publishDate": "2021-05-10",
    "tags": null,
    "commentNum": null,
    "likeNum": 24,
    "readNum": 5632,
    "type": "2",
    "top": "N",
    "hot": "N"
    },
    "msg": "操作成功"
    }
    10.5.7发表新闻评论
     */
    const val get_api_movie_press_press__id_= "/prod-api/api/movie/press/press/{id}"

    /**10.5.7发表新闻评论 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "newsId": 5
    "content": "新闻评论测试"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    content 评论内容 false string
    newsId 新闻 ID true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    参数名称 参数说明 类型
    msg 消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    10.5.8评论点赞
     */
    const val post_api_movie_press_pressComment= "/prod-api/api/movie/press/pressComment"

    /**10.5.8评论点赞 PUT
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 新闻 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    10.6 购票相关接口
    10.6.1提交订单
     */
    const val put_api_movie_press_pressComment_like__id_= "/prod-api/api/movie/press/pressComment/like/{id}"

    /**10.6.1提交订单 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "endTime": "06:00",
    "movieId": 5,
    "orderItems": [
    {
    "price": 36.00,
    "seatCol": "5",
    "seatId": 6,
    "seatRow": "7"
    }
    ],
    "playDate": "2021-09-10",
    "price": 50.00,
    "roomId": 1,
    "startTime": "04:30",
    "theaterId": 16,
    "timesId": 21
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    filmOrder filmOrder body true 订单实体
    参数名称 参数说明 请求类型 必须 数据类型
    endTime 结束时间 false string
    movieId 影片 id true integer(int64)
    orderItems 订单明细 false array
    price 影票价格 false number
    seatCol 座位号 false string
    seatId 座位 id true integer
    seatRow 排号 false string
    playDate 播放日期 false string(date-time)
    price 总价 false number
    roomId 影厅 id true integer(int64)
    startTime 开始时间 false string
    theaterId 影院 id true integer(int64)
    timesId 场次 id true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    10.6.2查询影票信息列表
     */
    const val post_api_movie_ticket= "/prod-api/api/movie/ticket"

    /**10.6.2查询影票信息列表 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    buyDate 购买时间 query false string(date-time)
    movieId 影片 id query false integer(int64)
    orderItemId 订单明细 id query false integer(int64)
    roomId 影厅 id query false integer(int64)
    seatId 座位 id query false integer(int64)
    status 取票码状态，参见字典名：影票状态 query false string
    theaterId 影院 id query false integer(int64)
    timesId 场次 id query false integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 影票实体
    参数名称 参数说明 类型
    buyDate 购买时间 string(date-time)
    code 取票码 string
    id 影票 id integer(int64)
    movieId 影片 id integer(int64)
    orderItemId 订单明细 id integer(int64)
    roomId 影厅 id integer(int64)
    seatId 座位 id integer(int64)
    status 取票码状态，参见字典名：影票状态 string
    theaterId 影院 id integer(int64)
    timesId 场次 id integer(int64)
    userId 用户 id integer(int64)
    total 总记录数 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "buyDate": "2021-09-10 09:25:35",
    "code": "123424",
    "id": 1,
    "movieId": 2,
    "orderItemId": 3,
    "roomId": 4,
    "seatId": 5,
    "status": "2",
    "theaterId": 6,
    "timesId": 7,
    "userId": 8
    }],
    "total": 1
    }
    10.6.3查询订单信息列表
     */
    const val get_api_movie_ticket_list= "/prod-api/api/movie/ticket/list"

    /**10.6.3查询订单信息列表 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    id 订单 id query false integer(int64)
    movieId 影片 id query false integer(int64)
    orderNo 订单号 query false string
    payTime 支付时间 query false string(date-time)
    roomId 影厅 id query false integer(int64)
    status 是否支付，参见字典名：系统是否 query false string
    theaterId 影院 id query false integer(int64)
    theatreName 影院名 query false string
    timesId 场次 id query false integer(int64)
    响应参数
    参数名称 参数说明 类型
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 订单实体
    endTime 结束时间 string
    id 订单 id integer(int64)
    movieId 影片 id integer(int64)
    movieName 影片名 string
    orderNo 订单号 string
    payTime 支付时间 string(date-time)
    playDate 播放日期 string(date-time)
    price 总价 number
    roomId 影厅 id integer(int64)
    roomName 影厅名 string
    startTime 开始时间 string
    status 是否支付，参见字典名：系统是否 string
    theaterId 影院 id integer(int64)
    theatreName 影院名 string
    timesId 场次 id integer(int64)
    total 总记录数 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功",
    "rows": [{
    "id": 3,
    "orderNo": "2021050900095356434",
    "theaterId": 13,
    "roomId": 4,
    "seatId": null,
    "timesId": 2,
    "movieId": 3,
    "price": 50,
    "status": "Y",
    "userId": 2,
    "paymentType": null,
    "theatreName": "北联影城",
    "roomName": "1 号厅",
    "seatRow": null,
    "seatCol": null,
    "movieName": "悬崖之上",
    "userName": null,
    "startTime": "10:30",
    "endTime": "11:45",
    "playDate": "2021-05-09",
    "payTime": "2021-05-09 00:09:51",
    }],
    "total": 1
    }
    10.6.4订单支付
     */
    const val get_api_movie_ticket_order_list= "/prod-api/api/movie/ticket/order/list"

    /**10.6.4订单支付 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 订单 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    10.6.5获取订单信息详细信息
     */
    const val get_api_movie_ticket_order_pay__id_= "/prod-api/api/movie/ticket/order/pay/{id}"

    /**10.6.5获取订单信息详细信息 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 订单 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 订单实体
    id 订单 id integer(int64)
    movieId 影片 id integer(int64)
    orderItems 订单明细 array
    id 编号 integer
    orderId 订单 id integer
    price 影票价格 number
    seatId 座位 id integer
    orderNo 订单号 string
    payTime 支付时间 string(date-time)
    price 总价 number
    roomId 影厅 id integer(int64)
    status 是否支付，参见字典名：系统是否 string
    theaterId 影院 id integer(int64)
    timesId 场次 id integer(int64)
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "data": {
    "id": 3,
    "orderNo": "2021050900095356434",
    "theaterId": 13,
    "roomId": 4,
    "seatId": null,
    "timesId": 2,
    "movieId": 3,
    "price": 50,
    "status": "Y",
    "userId": 2,
    "paymentType": null,
    "theatreName": "北联影城",
    "roomName": "1 号厅",
    "seatRow": null,
    "seatCol": null,
    "movieName": "悬崖之上",
    "userName": null,
    "startTime": "10:30",
    "endTime": "11:45",
    "playDate": "2021-05-09",
    "payTime": "2021-05-09 00:09:51",
    "orderItems": [
    {
    "id": 1,
    "orderId": 3,
    "price": 101.8,
    "seatId": 6,
    }
    ],
    },
    "msg": "操作成功"
    }
    10.6.6删除订单信息
     */
    const val get_api_movie_ticket_order__id_= "/prod-api/api/movie/ticket/order/{id}"

    /**10.6.6删除订单信息 DELETE
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 订单 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    11 门诊预约
    11.1 医院相关接口
    11.1.1获取医院详情轮播图
     */
    const val delete_api_movie_ticket_order__id_= "/prod-api/api/movie/ticket/order/{id}"

    /**11.1.1获取医院详情轮播图 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/hospital/banner/list?hospitalId=1
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    hospitalId 医院 id query true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    data 列表数据（数组类型） 医院轮播图
    hospitalId 医院 id integer(int64)
    id integer(int64)
    imgUrl 图片地址 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "id": 1,
    "imgUrl": "http://118.190.154.52:7777/profile/upload/image/2021
    /05/11/921ee654-d6c3-4876-8450-16ac272e18df.jpg",
    "hospitalId": 1
    }
    ......
    ]
    }
    11.1.2获取医院信息列表
     */
    const val get_api_hospital_banner_list= "/prod-api/api/hospital/banner/list"

    /**11.1.2获取医院信息列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：
    /prod-api/api/hospital/hospital/list?hospitalName= 专 科
    &pageNum=1&pageSize=8
    请求参数
    支持分页和排序 参数参见表格分页和排序说明。
    参数名称 参数说明 请求类型 必须 数据类型
    hospitalName 医院名称 query false integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 医院信息
    id integer(int64)
    hospitalName 医院名称 string
    brief 简介 string
    imgUrl 封面 string
    level 星级 integer(int32)
    total 总记录数 string
    响应示例
    {
    "total": 9,
    "rows": [
    {
    "id": 10,
    "hospitalName": "大连市专科医院",
    "brief": "大连市专科创建于 1952 年 6 月 1 日，经过几代儿医人的艰苦
    奋斗，已成长为一所学科门类齐全、师资力量雄厚、医疗技术精湛、诊疗设备先
    进的辽宁省规模最大的综合性儿童医院。担负着辽东半岛 18 岁以下儿童的医疗、
    预防、康复、保健任务",
    "level": 4,
    "imgUrl": "http://118.190.154.52:7777/profile/upload/image/2021
    /05/08/e5d369ab-6f50-4f06-9b8d-515ddd15d887.jpg"
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    11.1.3获取医院详细信息
     */
    const val get_api_hospital_hospital_list= "/prod-api/api/hospital/hospital/list"

    /**11.1.3获取医院详细信息 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/hospital/hospital/1
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 医院 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    参数名称 参数说明 类型
    data 返回业务数据 医院信息
    id integer(int64)
    hospitalName 医院名称 string
    brief 简介 string
    imgUrl 封面 string
    level 星级 integer(int32)
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "id": 1,
    "hospitalName": "大连市儿童医院",
    "brief": "<p>大连市儿童医院创建于 1952 年 6 月 1 日，经过几代儿医人的
    艰苦奋斗，已成长为一所学科门类齐全、师资力量雄厚、医疗技术精湛、诊疗设
    备先进的辽宁省规模最大的综合性儿童医院。担负着辽东半岛 18 岁以下儿童的
    医疗、预防、康复、保健任务。2013 年 2 月 6 日，签约成为大连医科大学附属
    大连市儿童医院。系国家儿科、儿外科住院医师规范化培训基地，辽宁省首批儿
    科、儿外科住院医师规范化培训基地。医院设有 36 个学科，大连市快速提升医
    疗软实力建设项目小儿心脏病诊疗基地 1 个，大连市一级医学重点学科 6 个。<
    /p>",
    "level": 3,
    "imgUrl": "http://118.190.154.52:7777/profile/upload/image/2021/0
    5/08/5398a863-df13-445e-a21c-7be32a81b461.jpg"
    }
    }
    11.2 查询专家诊与普通诊的科室分类
     */
    const val get_api_hospital_hospital__id_= "/prod-api/api/hospital/hospital/{id}"

    /**11.2 查询专家诊与普通诊的科室分类 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请 求 示 例 ：
    /prod-api/api/hospital/category/list?type=1&pageNum=1&pageSize=8
    请求参数
    支持分页和排序 参数参见表格分页和排序说明。
    参数名称 参数说明 请求类型 必须 数据类型
    type 门诊类型 (参见字典名：门诊预约类型) query false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 科室分类
    id integer(int64)
    type 门诊类型 (参见字典名：门诊预约类型) string
    categoryName 科室名称 string
    money 所需金额 number
    total 总记录数 string
    响应示例
    {
    "total": 8,
    "rows": [
    {
    "id": 3,
    "type": "1",
    "categoryName": "神经内科",
    "money": 6
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    11.3 就诊卡相关接口
    11.3.1新增就诊卡片
     */
    const val get_api_hospital_category_list= "/prod-api/api/hospital/category/list"

    /**11.3.1新增就诊卡片 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "address": "大连市甘井子区",
    "birthday": "2001-09-10",
    "cardId": "210882199001302318",
    "name": "张三",
    "sex": "0",
    "tel": "15800000000"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    参数名称 参数说明 请求类型 必须 数据类型
    address 家庭住址 true string
    birthday 出生年月日 true string(date-time)
    cardId 身份证 true string
    name 姓名 true string
    sex 性别 0 男 1 女 true string
    tel 电话 true string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200
    }
    11.3.2修改就诊人卡片
     */
    const val post_api_hospital_patient= "/prod-api/api/hospital/patient"

    /**11.3.2修改就诊人卡片 PUT
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "id": 24,
    "address": "大连市甘井子区大华小区",
    "birthday": "2001-09-10",
    "cardId": "210021199000000000",
    "name": "张亮",
    "sex": "1",
    "tel": "15810000000"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id true integer(int64)
    address 家庭住址 false string
    birthday 出生年月日 false string(date-time)
    cardId 身份证 false string
    name 姓名 false string
    sex 性别 (参见字典名：用户性别) false string
    tel 电话 false string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200
    }
    11.3.3查询当前用户下的就诊人卡片
     */
    const val put_api_hospital_patient= "/prod-api/api/hospital/patient"

    /**11.3.3查询当前用户下的就诊人卡片 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/hospital/patient/list?pageNum=1&pageSize=8
    请求参数
    无，支持分页和排序 参数参见表格分页和排序说明。 响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 就诊卡片
    address 家庭住址 string
    birthday 出生年月日 string(date-time)
    cardId 身份证 string
    id integer(int64)
    imgUrl 图片 string
    name 姓名 string
    参数名称 参数说明 类型
    sex 性别 string
    tel 电话 string
    userId 用户 id integer(int64)
    total 总记录数 string
    响应示例
    {
    "total": 3,
    "rows": [
    {
    "id": 1,
    "name": "王大卫",
    "cardId": "210211199909090014",
    "tel": "13800000000",
    "sex": "0",
    "birthday": "1999-09-09",
    "imgUrl": "/updata/1.jpg",
    "address": "大连市高新区",
    "userId": 2
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    11.4 预约相关接口
    11.4.1.生成预约单
     */
    const val get_api_hospital_patient_list= "/prod-api/api/hospital/patient/list"

    /**11.4.1.生成预约单 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "categoryId": 3,
    "money": 6,
    "patientName": "张三",
    "reserveTime": "2021-09-10 10:30",
    "type": 1
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    categoryId 科室分类编号 true integer(int64)
    money 金额 true number
    patientName 患者姓名 true string
    reserveTime 预约时间 true string(date-time)
    type 门诊类型 (参见字典名：门诊预约类型) true string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200
    }
    11.4.2.查询预约详情
     */
    const val post_api_hospital= "/prod-api/api/hospital"

    /**11.4.2.查询预约详情 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/hospital/reservation/1
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 预约 id path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 预约信息
    categoryId 科室分类编号 integer(int64)
    categoryName 科室类别名称 string
    id 预约编号 integer(int64)
    money 金额 number
    orderNo 预约单号 string
    参数名称 参数说明 类型
    patientName 患者姓名 string
    reserveTime 预约时间 string(date-time)
    status 订单状态 (参见字典名：订单状态) string
    type 门诊类型 (参见字典名：门诊预约类型) string
    userId 用户 id integer(int64)
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "id": 1,
    "orderNo": "1603537663212",
    "patientName": "张三",
    "categoryId": 5,
    "type": "1",
    "money": 5,
    "reserveTime": "2020-10-24 00:00",
    "status": "1",
    "categoryName": "胸外科",
    "userId": 1
    }
    }
    11.4.3.查询预约列表
     */
    const val get_api_hospital_reservation__id_= "/prod-api/api/hospital/reservation/{id}"

    /**11.4.3.查询预约列表 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请 求 示 例 ：
    /prod-api/api/hospital/reservation/list?pageNum=1&pageSize=6
    请求参数
    支持分页和排序 参数参见表格分页和排序说明。 响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 预约信息
    categoryId 科室分类编号 integer(int64)
    categoryName 科室类别名称 string
    id integer(int64)
    money 金额 number
    orderNo 预约单号 string
    patientName 患者姓名 string
    reserveTime 预约时间 string(date-time)
    status 订单状态 string
    type 门诊类型 (参见字典名：门诊预约类型) string
    userId 用户 id integer(int64)
    total 总记录数 string
    响应示例
    {
    "total": 10,
    "rows": [
    {
    "id": 1,
    "orderNo": "1603537663212",
    "patientName": "王大卫",
    "categoryId": 5,
    "type": "1",
    "money": 5,
    "reserveTime": "2021-06-02 09:00",
    "status": "1",
    "categoryName": "胸外科",
    "userId": 2
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    12 智慧巴士
    12.1 站点相关接口
    12.1.1.查询站点信息
     */
    const val get_api_hospital_reservation_list= "/prod-api/api/hospital/reservation/list"

    /**12.1.1.查询站点信息 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/bus/stop/list?linesId=1&pageNum=1&pageSize=8
    请求参数
    支持分页和排序 参数参见表格分页和排序说明
    参数名称 参数说明 请求类型 必须 数据类型
    linesId 路线 id query true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 巴士站点
    linesId 路线 id integer(int64)
    stepsId 站点 id integer(int64)
    name 站点名称 string
    sequence 顺序 integer(int32)
    total 总记录数 string
    响应示例
    {
    "total": 4,
    "rows": [
    {
    "linesId": 1,
    "stepsId": 1,
    "name": "光谷金融街",
    "sequence": 1
    },
    {
    "linesId": 1,
    "stepsId": 2,
    "name": "解放路",
    "sequence": 2
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    12.2 线路相关接口
    12.2.1.查询路线列表
     */
    const val get_api_bus_stop_list= "/prod-api/api/bus/stop/list"

    /**12.2.1.查询路线列表 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/bus/line/list?pageNum=1&pageSize=8
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 巴士路线
    id integer(int64)
    name 路线名称 string
    first 起点 string
    end 终点 string
    startTime 首发时间 string
    endTime 末班时间 string
    price 价格 number
    参数名称 参数说明 类型
    mileage 里程 string
    total 总记录数 string
    响应示例
    {
    "total": 4,
    "rows": [
    {
    "id": 1,
    "name": "一号线",
    "first": "光谷金融街",
    "end": "南湖大厦",
    "startTime": "6:30",
    "endTime": "19:45",
    "price": 8,
    "mileage": "20"
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    12.2.2.查询路线详情
     */
    const val get_api_bus_line_list= "/prod-api/api/bus/line/list"

    /**12.2.2.查询路线详情 GET
    接口描述
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/bus/line/1
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 线路编号 path true integer(int64)
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    data 返回业务数据 巴士路线
    id integer(int64)
    name 路线名称 string
    first 起点 string
    end 终点 string
    startTime 首发时间 string
    endTime 末班时间 string
    price 价格 number
    mileage 里程 string
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "id": 1,
    "name": "一号线",
    "first": "光谷金融街",
    "end": "南湖大厦",
    "startTime": "6:30",
    "endTime": "19:45",
    "price": 8,
    "mileage": "20"
    }
    }
    12.3 订单相关接口
    12.3.1.新增巴士订单
     */
    const val get_api_bus_line__id_= "/prod-api/api/bus/line/{id}"

    /**12.3.1.新增巴士订单 POST
    接口描述：请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "start":"泰德大厦",
    "end":"大连北站",
    "price":"8",
    "path":"一号线",
    "status":1
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    start 起点 true string
    end 终点 true string
    path 路线 true string
    price 价格 true number
    status 订单状态 (参见字典名：订单状态) true string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200
    "orderNum": "52042107"
    }
    12.3.2.查询订单列表
     */
    const val post_api_bus_order= "/prod-api/api/bus/order"

    /**12.3.2.查询订单列表 GET
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/x-www-form-urlencoded
    请求示例：/prod-api/api/bus/order/list?pageNum=1&pageSize=8
    响应参数
    参数名称 参数说明 类型
    code 状态码 string
    msg 消息内容 string
    rows 列表数据（数组类型） 巴士订单
    id integer(int64)
    orderNum 订单号 string
    参数名称 参数说明 类型
    path 路线 string
    price 价格 number
    start 起点 string
    end 终点 string
    status 订单状态 (参见字典名：订单状态) integer(int32)
    userId 用户 id integer(int64)
    userName 用户姓名 string
    userTel 用户电话 string
    total 总记录数 string
    响应示例
    {
    "total": 9,
    "rows": [
    {
    "id": 1,
    "orderNum": "60353861",
    "path": "一号线",
    "start": "泰德大厦",
    "end": "大连北站",
    "price": 8,
    "userName": "张三",
    "userTel": "12345611",
    "userId": 2,
    "status": 0
    "paymentType": "电子支付",
    "payTime": "2021-05-14 16:04:27"
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    12.3.3.支付巴士订单
     */
    const val get_api_bus_order_list= "/prod-api/api/bus/order/list"

    /**12.3.3.支付巴士订单 POST
    接口描述 请求头需要 token 参数，具体格式参见安全认证说明
    请求数据类型
    application/json
    请求示例
    {
    "orderNum": "22669095",
    "paymentType": "电子支付"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    orderNum 订单号 true string
    paymentType 支付类型(参见字典名：支付类型) true string
    响应参数
    参数名称 参数说明 类型
    code 状态码，200 正确，其他错误 string
    msg 返回消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200
    }
    13 政府服务热线
    13.1 诉求分类
    13.1.1 查询所有诉求分类
     */
    const val post_api_bus_pay= "/prod-api/api/bus/pay"

    /**13.1.1 查询所有诉求分类 GET
    接口描述 分页获取所有的诉求分类，也可不传分页参数来获取全部的诉求分类
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/gov-service-hotline/appeal-category/list?pageNum=1&page
    Size=10
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    pageSize 分页大小 false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    rows 全部数据列表 array
    参数名称 参数说明 类型
    id 诉求分类 ID integer
    name 诉求分类名称 string
    sort 排序 integer
    imgUrl 诉求图标 URL string
    响应示例
    {
    "total": 1,
    "rows": [
    {
    "searchValue": null,
    "createBy": null,
    "createTime": null,
    "updateBy": null,
    "updateTime": null,
    "remark": null,
    "params": {},
    "id": 4,
    "name": "衣食住行",
    "sort": 1,
    "imgUrl": "/dev-api/profile/upload/image/2022/02/24/aed84
    b53-f416-4af1-be5e-e70a9ddb8027.png"
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    13.2 诉求
    13.2.1 分页查询某个诉求分类下的所有诉求
     */
    const val get_api_gov_service_hotline_appeal_category_list= "/prod-api/api/gov-service-hotline/appeal-category/list"

    /**13.2.1 分页查询某个诉求分类下的所有诉求 GET
    接口描述 分页获取指定诉求分类下的所有的诉求
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/gov-service-hotline/appeal/list?appealCategoryId=4&page
    Num=1&pageSize=10
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    pageSize 分页大小 false string
    appealCategoryId 所属诉求分类 ID true integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    rows 全部数据列表 array
    id 诉求 ID integer
    content 诉求内容 string
    undertaker 承办单位 integer
    imgUrl 诉求图片 URL string
    appealCategoryName 诉求分类名称 string
    detailResult 处理结果 string
    state
    诉 求 处 理 状 态 [ 字 典 ：
    gsh_appeal_state]
    string
    响应示例
    {
    "total": 1,
    "rows": [
    {
    "createTime": "2022-02-24 15:38:50",
    "id": 4,
    "userId": 105,
    "appealCategoryId": 4,
    "title": "这是一个诉求",
    "content": "因为疫情，物价是在太高了，请处理一下。",
    "undertaker": "物价局",
    "state": "1",
    "detailResult": "以让他们降价了",
    "imgUrl": "/dev-api/profile/upload/image/2022/02/24/82a57
    055-3298-4b74-94e0-d2a222d3d19e.png",
    "appealCategoryName": "衣食住行"
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    13.2.2 分页查询我提交的所有诉求
     */
    const val get_api_gov_service_hotline_appeal_list= "/prod-api/api/gov-service-hotline/appeal/list"

    /**13.2.2 分页查询我提交的所有诉求 GET
    接口描述 分页获取我提交的所有诉求
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/gov-service-hotline/appeal/my-list?pageNum=1&pageSize=1
    0
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    pageSize 分页大小 false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    rows 全部数据列表 array
    id 诉求 ID integer
    content 诉求内容 string
    undertaker 承办单位 integer
    imgUrl 诉求图片 URL string
    appealCategoryName 诉求分类名称 string
    detailResult 处理结果 string
    state
    诉 求 处 理 状 态 [ 字 典 ：
    gsh_appeal_state]
    string
    响应示例
    {
    "total": 1,
    "rows": [
    {
    "createTime": "2022-02-24 15:38:50",
    "id": 4,
    "userId": 105,
    "appealCategoryId": 4,
    "title": "这是一个诉求",
    "content": "因为疫情，物价是在太高了，请处理一下。",
    "undertaker": "物价局",
    "state": "1",
    "detailResult": "以让他们降价了",
    "imgUrl": "/dev-api/profile/upload/image/2022/02/24/82a57
    055-3298-4b74-94e0-d2a222d3d19e.png",
    "appealCategoryName": "衣食住行"
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    13.2.3 创建提交诉求
     */
    const val get_api_gov_service_hotline_appeal_my_list= "/prod-api/api/gov-service-hotline/appeal/my-list"

    /**13.2.3 创建提交诉求 POST
    接口描述 通过 API 创建新的诉求
    请求数据类型
    application/json
    请求示例
    {
    "appealCategoryId": 5,
    "title": "测试诉求 001",
    "content": "诉求内容诉求内容诉求内容诉求内容诉求内容",
    "undertaker": "大连市政府",
    "imgUrl": "/profile/abc.png"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    appealCategoryId 所属诉求分类 ID true integer
    title 诉求标题 true string
    content 诉求内容 true string
    参数名称 参数说明 请求类型 必须 数据类型
    undertaker 承办单位 true string
    imgUrl 诉求图片 URL true string
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200
    }
    13.2.4 获取诉求详情
     */
    const val post_api_gov_service_hotline_appeal= "/prod-api/api/gov-service-hotline/appeal"

    /**13.2.4 获取诉求详情 GET
    接口描述 通过 ID 获取指定诉求的详细信息
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/gov-service-hotline/appeal/4
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 诉求 ID false integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    data 全部数据列表 array
    id 诉求 ID integer
    content 诉求内容 string
    undertaker 承办单位 integer
    imgUrl 诉求图片 URL string
    appealCategoryName 诉求分类名称 string
    detailResult 处理结果 string
    state
    诉 求 处 理 状 态 [ 字 典 ：
    gsh_appeal_state]
    string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "createTime": "2022-02-24 15:38:50",
    "id": 4,
    "userId": 105,
    "appealCategoryId": 4,
    "title": "这是一个诉求",
    "content": "因为疫情，物价是在太高了，请处理一下。",
    "undertaker": "物价局",
    "state": "1",
    "detailResult": "以让他们降价了",
    "imgUrl": "/dev-api/profile/upload/image/2022/02/24/82a57055-
    3298-4b74-94e0-d2a222d3d19e.png",
    "appealCategoryName": "衣食住行"
    }
    }
    13.3 广告轮播图
    13.3.1 获取所有广告轮播图
     */
    const val get_api_gov_service_hotline_appeal__id_= "/prod-api/api/gov-service-hotline/appeal/{id}"

    /**13.3.1 获取所有广告轮播图 GET
    接口描述 分页获取指定诉求分类下的所有的诉求
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/gov-service-hotline/ad-banner/list
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    data 全部数据列表 array
    id 轮播图 ID integer
    title 轮播图标题 string
    sort 轮播图排序序号 integer
    imgUrl 轮播图图片图片 URL string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "id": 4,
    "title": "测试图片",
    "sort": 1,
    "imgUrl": "/dev-api/profile/upload/image/2022/02/24/8d1e9
    174-7333-44c4-8d17-a64579c2677f.jpg"
    }
    ]
    }
    14 法律咨询
    14.1 法律专长
    14.1.1 获取所有法律专长
     */
    const val get_api_gov_service_hotline_ad_banner_list= "/prod-api/api/gov-service-hotline/ad-banner/list"

    /**14.1.1 获取所有法律专长 GET
    接口描述 获取全部的法律专长列表
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/lawyer-consultation/legal-expertise/list
    请求参数
    响应参数
    参数名称 参数说明 类型
    参数名称 参数说明 请求类型 必须 数据类型
    无
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    rows 全部数据列表 array
    id 法律专长 ID integer
    name 法律专长名称 string
    sort 法律专长排序 integer
    imgUrl 法律专长图标 URL string
    响应示例
    {
    "total": 3,
    "rows": [
    {
    "id": 7,
    "name": "民事纠纷",
    "sort": 1,
    "imgUrl": "/dev-api/profile/upload/image/2022/02/25/a1b44
    9dc-dae3-4a89-aab6-8bd9b5be3c1b.png"
    },
    {
    "id": 8,
    "name": "交通事故",
    "sort": 2,
    "imgUrl": "/dev-api/profile/upload/image/2022/02/25/1f7db
    3c5-49f4-4756-95f3-7d5a4809a80d.png"
    },
    {
    "id": 9,
    "name": "婚姻财产",
    "sort": 3,
    "imgUrl": "/dev-api/profile/upload/image/2022/02/25/4b3f3
    381-defe-4ef2-b6e6-67639b1c71d5.png"
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    14.2 律师
    14.2.1 分页获取律师列表
     */
    const val get_api_lawyer_consultation_legal_expertise_list= "/prod-api/api/lawyer-consultation/legal-expertise/list"

    /**14.2.1 分页获取律师列表 GET
    接口描述 分页获取指定法律专长下的律师列表
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/lawyer-consultation/lawyer/list?legalExpertiseId=7&name
    =刘&sort=workStartAt
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    pageSize 分页大小 false string
    legalExpertiseId 法律专长 ID false integer
    name
    要搜索的律师名字关
    键字
    false string
    sort
    排序方式：从业年限
    (workStartAt)、服务人
    数(serviceTimes)、好
    评率(favorableRate)
    false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    rows 全部数据列表 array
    id 律师 ID integer
    name 律师名字 string
    legalExpertiseId 所属法律专长 ID integer
    avatarUrl 律师头像图片 URL string
    baseInfo 律师简介 string
    eduInfo 律师教育背景 string
    licenseNo 执业证编号 string
    certificateImgUrl 执业证图片 URL string
    workStartAt 工作起始时间 string
    serviceTimes 咨询人数 integer
    favorableRate 好评率 integer
    legalExpertiseName 擅长的法律专长名称 string
    favorableCount 好评人数
    响应示例
    {
    "total": 1,
    "rows": [
    {
    "id": 7,
    "name": "刘律师",
    "legalExpertiseId": 7,
    "avatarUrl": "/dev-api/profile/upload/image/2022/02/25/b6
    798bdc-c577-4ec6-8c64-ed35a4047688.png",
    "baseInfo": "罗翔，1977 年出生，湖南耒阳人，中国政法大学刑
    事司法学院教授、刑法学研究所所长。",
    "eduInfo": "2002 年—2005 年博士就读于北京大学法学院，毕业
    获得刑法学博士学位；2005 年进入中国政法大学执教 [20] ；2009 年—2010
    年在美国加州大学伯克利分校做访问学者；2013 年—2014 年在美国杜克大学做
    访问学者",
    "licenseNo": "14309200110160424",
    "certificateImgUrl": "/dev-api/profile/upload/2022/03/09/
    9733821c-1624-4fa6-bb44-8e7d71572eba.jpeg",
    "workStartAt": "2020-11-01",
    "serviceTimes": 3,
    "favorableRate": 67,
    "legalExpertiseName": "民事纠纷",
    "favorableCount": 2,
    "sort": "favorableRate"
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    14.2.2 获取指定律师的详细信息
     */
    const val get_api_lawyer_consultation_lawyer_list= "/prod-api/api/lawyer-consultation/lawyer/list"

    /**14.2.2 获取指定律师的详细信息 GET
    接口描述 根据 ID 获取指定律师的详细信息
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/lawyer-consultation/lawyer/7
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    参数名称 参数说明 请求类型 必须 数据类型
    id 律师 ID true integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    data 律师信息数据 array
    id 律师 ID integer
    name 律师名字 string
    legalExpertiseId 所属法律专长 ID integer
    avatarUrl 律师头像图片 URL string
    baseInfo 律师简介 string
    eduInfo 律师教育背景 string
    licenseNo 执业证编号 string
    certificateImgUrl 执业证图片 URL string
    workStartAt 工作起始时间 string
    serviceTimes 咨询人数 integer
    favorableRate 好评率 integer
    legalExpertiseName 擅长的法律专长名称 string
    favorableCount 好评人数 integer
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "id": 7,
    "name": "刘律师",
    "legalExpertiseId": 7,
    "avatarUrl": "/dev-api/profile/upload/image/2022/02/25/b6798b
    dc-c577-4ec6-8c64-ed35a4047688.png",
    "baseInfo": "罗翔，1977 年出生，湖南耒阳人，中国政法大学刑事司
    法学院教授、刑法学研究所所长。",
    "eduInfo": "2002 年—2005 年博士就读于北京大学法学院，毕业获得
    刑法学博士学位；2005 年进入中国政法大学执教 [20] ；2009 年—2010 年在
    美国加州大学伯克利分校做访问学者；2013 年—2014 年在美国杜克大学做访问
    学者",
    "licenseNo": "14309200110160424",
    "certificateImgUrl": "/dev-api/profile/upload/2022/03/09/9733
    821c-1624-4fa6-bb44-8e7d71572eba.jpeg",
    "workStartAt": "2020-11-01",
    "serviceTimes": 3,
    "favorableRate": 67,
    "legalExpertiseName": "民事纠纷",
    "favorableCount": 2,
    "sort": "favorableRate"
    }
    }
    14.2.3 查询好评率最高的律师列表
     */
    const val get_api_lawyer_consultation_lawyer__id_= "/prod-api/api/lawyer-consultation/lawyer/{id}"

    /**14.2.3 查询好评率最高的律师列表 GET
    接口描述 获取当前好评率最高的律师列表（前十名）
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/gov-service-hotline/appeal/list?appealCategoryId=4&page
    Num=1&pageSize=10
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    无
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    data 律师信息数据 array
    id 律师 ID integer
    name 律师名字 string
    legalExpertiseId 所属法律专长 ID integer
    avatarUrl 律师头像图片 URL string
    baseInfo 律师简介 string
    eduInfo 律师教育背景 string
    licenseNo 执业证编号 string
    certificateImgUrl 执业证图片 URL string
    workStartAt 工作起始时间 string
    serviceTimes 咨询人数 integer
    favorableRate 好评率 integer
    legalExpertiseName 擅长的法律专长名称 string
    参数名称 参数说明 类型
    favorableCount 好评人数 integer
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "params": {},
    "id": 9,
    "name": "孙律师",
    "legalExpertiseId": 9,
    "avatarUrl": "/dev-api/profile/upload/image/2022/02/25/91
    4c5a08-1edb-4894-93cc-76481a855dc0.png",
    "baseInfo": "中共第十五届中央候补委员，十六届、十七届、十
    八届、十九届中央委员，十七届中央政治局委员、常委、中央书记处书记，十八
    届、十九届中央政治局委员、常委、中央委员会总书记。",
    "eduInfo": "在职研究生学历，法学博士学位。",
    "licenseNo": "7897897878789",
    "certificateImgUrl": "/dev-api/profile/upload/image/2022/
    02/25/a732904d-920a-428e-8e02-f9104593aba5.jpeg",
    "workStartAt": "2021-01-12",
    "serviceTimes": 1,
    "favorableRate": 100,
    "legalExpertiseName": "婚姻财产",
    "favorableCount": 0,
    "sort": "favorableRate"
    },
    {
    "id": 8,
    "name": "王律师",
    "legalExpertiseId": 8,
    "avatarUrl": "/dev-api/profile/upload/image/2022/02/25/9d
    e9c25e-aecb-4348-9a91-4aeffcdd0c3b.png",
    "baseInfo": "１９５３年６月生，陕西富平人，１９７４年１月
    加入中国共产党，１９６９年１月参加工作，清华大学人文社会学院马克思主义
    理论与思想政治教育专业毕业，在职研究生学历，法学博士学位。",
    "eduInfo": "1969-1975 年 陕西省延川县文安驿公社梁家河大
    队知青、党支部书记",
    "licenseNo": "3213213213212321",
    "certificateImgUrl": "/dev-api/profile/upload/image/2022/
    02/25/d1cb84d9-18a7-47a9-9ed7-82bb9a51cb23.jpeg",
    "workStartAt": "2021-09-14",
    "serviceTimes": 3,
    "favorableRate": 80,
    "legalExpertiseName": "交通事故",
    "favorableCount": 0,
    "sort": "favorableRate"
    },
    {
    "id": 7,
    "name": "刘律师",
    "legalExpertiseId": 7,
    "avatarUrl": "/dev-api/profile/upload/image/2022/02/25/b6
    798bdc-c577-4ec6-8c64-ed35a4047688.png",
    "baseInfo": "罗翔，1977 年出生，湖南耒阳人，中国政法大学刑
    事司法学院教授、刑法学研究所所长。",
    "eduInfo": "2002 年—2005 年博士就读于北京大学法学院，毕业
    获得刑法学博士学位；2005 年进入中国政法大学执教 [20] ；2009 年—2010
    年在美国加州大学伯克利分校做访问学者；2013 年—2014 年在美国杜克大学做
    访问学者",
    "licenseNo": "14309200110160424",
    "certificateImgUrl": "/dev-api/profile/upload/2022/03/09/
    9733821c-1624-4fa6-bb44-8e7d71572eba.jpeg",
    "workStartAt": "2020-11-01",
    "serviceTimes": 3,
    "favorableRate": 67,
    "legalExpertiseName": "民事纠纷",
    "favorableCount": 2,
    "sort": "favorableRate"
    }
    ]
    }
    14.2.4 分页获取律师的全部评价列表
     */
    const val get_api_lawyer_consultation_lawyer_list_top10= "/prod-api/api/lawyer-consultation/lawyer/list-top10"

    /**14.2.4 分页获取律师的全部评价列表 GET
    接口描述 分页获取指定诉求分类下的所有的诉求
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/lawyer-consultation/lawyer/list-evaluate?lawyerId=7
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    lawyerId 律师 ID true integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    rows 全部数据列表 array
    id 评价 ID integer
    fromUserName 评论人姓名 string
    fromUserAvatar 评论人头像 string
    evaluateContent 评价内容 string
    score 打分（0-5 分） integer
    likeCount 点赞数量 integer
    myLikeState 我点赞状态 boolean
    响应示例
    {
    "total": 3,
    "rows": [
    {
    "fromUserName": "admin",
    "fromUserAvatar": " 1",
    "createTime": "2022-02-25T15:19:30.000+0800",
    "evaluateContent": "挺好的",
    "score": 5,
    "likeCount": 0,
    "myLikeState": false
    },
    {
    "fromUserName": "ljxl",
    "fromUserAvatar": "",
    "createTime": "2022-02-27T07:21:11.000+0800",
    "evaluateContent": null,
    "score": 0,
    "likeCount": 0,
    "myLikeState": false
    },
    {
    "fromUserName": "admin",
    "fromUserAvatar": " 1",
    "createTime": "2022-02-27T07:23:19.000+0800",
    "evaluateContent": "挺负责的，挺好",
    "score": 5,
    "likeCount": 0,
    "myLikeState": false
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    14.3 法律咨询
    14.3.1 提交法律咨询
     */
    const val get_api_lawyer_consultation_lawyer_list_evaluate= "/prod-api/api/lawyer-consultation/lawyer/list-evaluate"

    /**14.3.1 提交法律咨询 POST
    接口描述 提交创建法律咨询
    请求数据类型
    application/json
    请求示例
    {
    "lawyerId": 10,
    "legalExpertiseId": 7,
    "content": "要把沙发装冰箱，总共分几步？",
    "imageUrls":
    "/dev-api/profile/upload/image/2022/02/25/19d10a51-2950-46b0-ad70-daf
    7c5160320.jpg,/dev-api/profile/upload/image/2022/02/25/7dd5505a-8ffb49d5-81e2-58a66f08d34a.png",
    "phone": "18842656666"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    lawyerId 律师 ID true integer
    legalExpertiseId 法律专长 ID true integer
    content 提问内容 true string
    imageUrls
    相关图片，多张图片
    之间使用英文半角逗
    号做分隔
    tring string
    phone 联系电话 true string
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200
    }
    14.3.2 分页获取当前用户提交的法律咨询列表
     */
    const val post_api_lawyer_consultation_legal_advice= "/prod-api/api/lawyer-consultation/legal-advice"

    /**14.3.2 分页获取当前用户提交的法律咨询列表 GET
    接口描述 分页我曾经提交过的所有法律咨询列表
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/lawyer-consultation/legal-advice/list?pageNum=1&pageSiz
    e=10&state=0
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    pageSize 分页大小 false string
    state
    筛 选 状 态 [ 字 典 ：
    lc_legal_advice_state]
    true integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    rows 全部数据列表 array
    id 法律咨询 ID integer
    参数名称 参数说明 类型
    fromUserId 发起人 ID integer
    lawyerId 律师 ID integer
    legalExpertiseId 法律专长 ID string
    content 问题内容 string
    imageUrls
    相关图片 URL，多张图片使用英
    文半角逗号分隔
    string
    phone 电话 string
    state
    当 前 处 理 状 态 [ 字 典 ：
    lc_legal_advice_state]
    string
    score
    当完成后打的分数，未完成时始
    终为 0
    lawyerName 律师名字
    legalExpertiseName 法律专长名称
    响应示例
    {{
    "total": 1,
    "rows": [
    {
    "createTime": "2022-02-27 07:24:04",
    "id": 11,
    "fromUserId": 1,
    "lawyerId": 8,
    "legalExpertiseId": 7,
    "content": "律师您好，我有问题是 xxxxxx？",
    "imageUrls": "/dev-api/profile/upload/image/2022/02/25/19
    d10a51-2950-46b0-ad70-daf7c5160320.jpg,/dev-api/profile/upload/image/
    2022/02/25/7dd5505a-8ffb-49d5-81e2-58a66f08d34a.png",
    "phone": "18842656666",
    "state": "0",
    "score": 0,
    "lawyerName": "王律师",
    "legalExpertiseName": "民事纠纷",
    "likeCount": null
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    14.3.3 获取法律咨询详情
     */
    const val get_api_lawyer_consultation_legal_advice_list= "/prod-api/api/lawyer-consultation/legal-advice/list"

    /**14.3.3 获取法律咨询详情 GET
    接口描述 获取某条法律咨询的详细信息
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/lawyer-consultation/legal-advice/7
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    Id 法律咨询 ID true integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    id 法律咨询 ID integer
    fromUserId 发起人 ID integer
    lawyerId 律师 ID integer
    参数名称 参数说明 类型
    legalExpertiseId 法律专长 ID string
    content 问题内容 string
    imageUrls
    相关图片 URL，多张图片使用英
    文半角逗号分隔
    string
    phone 电话 string
    state
    当 前 处 理 状 态 [ 字 典 ：
    lc_legal_advice_state]
    string
    score
    当完成后打的分数，未完成时始
    终为 0
    lawyerName 律师名字
    legalExpertiseName 法律专长名称
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "createTime": "2022-02-25 15:19:30",
    "id": 7,
    "fromUserId": 1,
    "lawyerId": 7,
    "legalExpertiseId": 7,
    "content": "请问我和邻居打了一架，需要负法律责任吗？",
    "imageUrls": "/dev-api/profile/upload/image/2022/02/25/19d10a
    51-2950-46b0-ad70-daf7c5160320.jpg",
    "phone": "18842656880",
    "state": "2",
    "score": 5,
    "evaluate": "挺好的",
    "lawyerName": "刘律师",
    "legalExpertiseName": "民事纠纷",
    }
    }
    14.3.4 对某条已完成的法律咨询进行评价
     */
    const val get_api_lawyer_consultation_legal_advice__id_= "/prod-api/api/lawyer-consultation/legal-advice/{id}"

    /**14.3.4 对某条已完成的法律咨询进行评价 POST
    接口描述 针对某条已完成的法律咨询提交评价
    请求数据类型
    application/json
    请求示例
    {
    "id": 10,
    "evaluate": "挺负责的，挺好",
    "score": 5
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    Id 法律咨询 ID true integer
    evaluate 评价内容 true string
    score 本次评分[0-5 分] true integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    14.3.5 对某条已完成的法律咨询评价进行点赞（取消赞）
     */
    const val post_api_lawyer_consultation_legal_advice_evaluate= "/prod-api/api/lawyer-consultation/legal-advice/evaluate"

    /**14.3.5 对某条已完成的法律咨询评价进行点赞（取消赞） POST
    接口描述 对某条已完成的法律评价提交点赞状态（点赞或取消点赞）
    请求数据类型
    application/json
    请求示例
    {
    "adviceId": 7,
    "like": false
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    adviceId 法律咨询 ID true integer
    like
    新状态，true 点赞，
    false 取消点赞
    true boolean
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    14.4 广告轮播图
    14.4.1 获取所有广告轮播图
     */
    const val post_api_lawyer_consultation_legal_advice_evaluate_like= "/prod-api/api/lawyer-consultation/legal-advice/evaluate-like"

    /**14.4.1 获取所有广告轮播图 GET
    接口描述 获取所有广告轮播图
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/lawyer-consultation/ad-banner/list
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    无
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    data 全部数据列表 array
    id 轮播图 ID integer
    title 轮播图标题 string
    sort 轮播图排序序号 integer
    参数名称 参数说明 类型
    imgUrl 轮播图图片图片 URL string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "id": 4,
    "title": "测试图片",
    "sort": 1,
    "imgUrl": "/dev-api/profile/upload/image/2022/02/24/8d1e9
    174-7333-44c4-8d17-a64579c2677f.jpg"
    }
    ]
    }
    15 志愿活动
    15.1 新闻
    15.1.1 分页查询所有新闻列表
     */
    const val get_api_lawyer_consultation_ad_banner_list= "/prod-api/api/lawyer-consultation/ad-banner/list"

    /**15.1.1 分页查询所有新闻列表 GET
    接口描述 分页获取所有新闻列表
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/volunteer-service/news/list?pageNum=1&pageSize=10
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    pageSize 分页大小 false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    rows 全部数据列表 array
    id 新闻 ID integer
    title 新闻标题 string
    imgUrl 新闻封面图片 integer
    summary 新闻摘要信息 string
    响应示例
    {{
    "total": 2,
    "rows": [
    {
    "createTime": "2022-03-02 10:23:37",
    "id": 5,
    "title": "“中国首善”如何捐赠",
    "imgUrl": "/dev-api/profile/upload/image/2022/03/02/79129
    741-d7ab-4ddf-9ee9-837a79f2f0be.png",
    "summary": "12 年前，一群人喊着“寻找中国的卡耐基”的口号，
    编制了中国首份慈善排行榜。上榜 50 人在 2003 年捐赠了 10 余亿元，其中金源
    房地产黄如论和神奇集团张芝庭分别捐赠 2.112 亿元和 1.28 亿元。",
    "content": ""
    },
    {
    "createTime": "2022-03-02 10:26:29",
    "id": 6,
    "title": "中国慈善榜的三个版本",
    "imgUrl": "/dev-api/profile/upload/image/2022/03/02/095c6
    09c-9ede-4902-aa4c-d357460c168b.jpeg",
    "summary": "10.29 亿元、219.02 亿元，这两个数字分别是第一届
    中国慈善榜和第十二届中国慈善榜上榜慈善家合计捐赠的善款总数。从 2003 年
    到 2014 年，12 年间，这个数字增长了 200 多亿。",
    "content": ""
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    15.1.2 查询新闻详情
     */
    const val get_api_volunteer_service_news_list= "/prod-api/api/volunteer-service/news/list"

    /**15.1.2 查询新闻详情 GET
    接口描述 根据 ID 查询指定新闻的详情信息
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/volunteer-service/news/5
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    id 新闻 ID true integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    参数名称 参数说明 类型
    msg 消息内容 string
    data 全部数据 object
    id 新闻 ID integer
    title 新闻标题 string
    imgUrl 新闻封面图片 integer
    summary 新闻摘要信息 string
    content 新闻详细信息富文本 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "createTime": "2022-03-02 10:23:37",
    "id": 5,
    "title": "“中国首善”如何捐赠",
    "imgUrl": "/dev-api/profile/upload/image/2022/03/02/79129741-
    d7ab-4ddf-9ee9-837a79f2f0be.png",
    "summary": "12 年前，一群人喊着“寻找中国的卡耐基”的口号，编
    制了中国首份慈善排行榜。上榜 50 人在 2003 年捐赠了 10 余亿元，其中金源房
    地产黄如论和神奇集团张芝庭分别捐赠 2.112 亿元和 1.28 亿元。",
    "content": "<p>&nbsp;12 年前，一群人喊着“寻找中国的卡耐基”的
    口号，编制了中国首份慈善排行榜。上榜 50 人在 2003 年捐赠了 10 余亿元，其
    中金源房地产黄如论和神奇集团张芝庭分别捐赠 2.112 亿元和 1.28 亿元。榜单
    上，最年长的是余彭年，82 岁，以 6180 万元位列第四；最年轻的是盛大网络陈
    天桥，31 岁，捐赠 1000 万元，名列 27。</p><p>&nbsp;&nbsp;&nbsp;&nbsp;这
    份榜单开启了中国富人投身公益慈善的编年史。</p>"
    }
    }
    15.2 志愿活动
    15.2.1 分页查询所有志愿活动列表
     */
    const val get_api_volunteer_service_news__id_= "/prod-api/api/volunteer-service/news/{id}"

    /**15.2.1 分页查询所有志愿活动列表 GET
    接口描述 分页获取指定诉求分类下的所有的诉求
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/volunteer-service/activity/list?pageSize=10&pageNum=1
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    pageSize 分页大小 false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    rows 全部数据列表 array
    id 活动 ID integer
    title 活动标题 string
    undertaker 承办单位 string
    startAt 活动日期 string
    参数名称 参数说明 类型
    appealCategoryName 诉求分类名称 string
    requireText 报名要求 string
    detail 活动详情 string
    响应示例
    {{
    "total": 2,
    "rows": [
    {
    "id": 5,
    "title": "我国第一部 1000 集双语版国学片杀青",
    "undertaker": "新华城市",
    "startAt": "2022-03-10",
    "requireText": "18 周岁以下",
    "detail": "为发展慈善教育事业，为关心祖国下一代的成长，为
    落实习近平总书记关于“期盼着孩子们能成长得更好”的指示，北京康盟慈善基
    金会、圆梦基金、大学府基金、奖学金管委会联合组织力量拍摄完成了我国第一
    部 1000 集大型双语版（手语口语）国学片《家长育儿宝典国学片》。1000 集影
    片涵盖我国诗歌、散文、故事、课文等领域的全部优秀作品。今年，该片将通过
    公益渠道和爱心企业渠道以及本活动首席志愿者单位北京第九大道文化传播、北
    京银软网络技术有限公司、山东远洋网络科技有限公司等多种途径向全国亿万家
    长免费赠送。"
    },
    {
    "id": 6,
    "title": "多 想——志愿活动感怀",
    "undertaker": "于韵",
    "startAt": "2022-03-01",
    "requireText": "33 周岁以下男女均可",
    "detail": "这，是她期待的一天，\n\n 此刻，她面前是一群
    懵懂的少年。\n\n 像幼苗离开了生养他的田地，\n\n 像小河告别了他流
    淌的村庄，\n\n 跟随辛劳打工的父母，\n\n 他们来到这钢筋水泥筑就的
    他乡。\n\n 这，是她给自己的一份礼物，\n\n 与这些可爱的孩子共度音
    乐的时光。\n\n 像迷茫的鸟儿飞进新奇的树林，\n\n 像羞涩的鱼儿游入
    陌生的池塘，\n\n 他们怯怯而又欣喜地打量，\n\n 打量这梦幻般的艺术
    殿堂。\n\n 跳跃的音符在空中飘荡，\n\n 美妙的音乐打开了稚嫩的心房，
    \n\n 嘹亮的歌声是那么激昂，\n\n 唤起他们从未有过的梦想。\n\n
    望着大剧院美丽的拱顶，\n\n 她似乎看见孩子们的心在广阔的苍穹飞扬。\
    n\n 这，只是一滴雨露，不足以安抚滋润的渴望。\n\n 多想，无数雨露
    汇成甘甜的清泉，\n\n 浇灌幼苗健康地成长，\n\n 让城市成为他们生命
    中的第二故乡。\n\n 这，只是一段旋律，不足以构成完整的歌唱。\n\n
    多想，无数爱心奠定温暖的基调，\n\n 融合四面八方的音部，\n\n 奏响
    神州大地和谐的乐章。"
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    15.2.2 获取志愿活动详情
     */
    const val get_api_volunteer_service_activity_list= "/prod-api/api/volunteer-service/activity/list"

    /**15.2.2 获取志愿活动详情 GET
    接口描述 获取志愿活动详情
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/volunteer-service/activity/6
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    Id 志愿活动 ID false integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    data 全部数据 object
    id 活动 ID integer
    参数名称 参数说明 类型
    title 活动标题 string
    undertaker 承办单位 string
    startAt 活动日期 string
    appealCategoryName 诉求分类名称 string
    requireText 报名要求 string
    detail 活动详情 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "id": 6,
    "title": "多 想——志愿活动感怀",
    "undertaker": "于韵",
    "startAt": "2022-03-01",
    "requireText": "33 周岁以下男女均可",
    "detail": "这，是她期待的一天，\n\n 此刻，她面前是一群懵懂
    的少年。\n\n 像幼苗离开了生养他的田地，\n\n 像小河告别了他流淌的
    村庄，\n\n 跟随辛劳打工的父母，\n\n 他们来到这钢筋水泥筑就的他乡。
    \n\n 这，是她给自己的一份礼物，\n\n 与这些可爱的孩子共度音乐的时
    光。\n\n 像迷茫的鸟儿飞进新奇的树林，\n\n 像羞涩的鱼儿游入陌生的
    池塘，\n\n 他们怯怯而又欣喜地打量，\n\n 打量这梦幻般的艺术殿堂。
    \n\n 跳跃的音符在空中飘荡，\n\n 美妙的音乐打开了稚嫩的心房，\n\
    n 嘹亮的歌声是那么激昂，\n\n 唤起他们从未有过的梦想。\n\n 望
    着大剧院美丽的拱顶，\n\n 她似乎看见孩子们的心在广阔的苍穹飞扬。\n\
    n 这，只是一滴雨露，不足以安抚滋润的渴望。\n\n 多想，无数雨露汇
    成甘甜的清泉，\n\n 浇灌幼苗健康地成长，\n\n 让城市成为他们生命中
    的第二故乡。\n\n 这，只是一段旋律，不足以构成完整的歌唱。\n\n 多
    想，无数爱心奠定温暖的基调，\n\n 融合四面八方的音部，\n\n 奏响神
    州大地和谐的乐章。"
    }
    }
    15.2.3 分页查询当前用户报名的活动列表
     */
    const val get_api_volunteer_service_activity__id_= "/prod-api/api/volunteer-service/activity/{id}"

    /**15.2.3 分页查询当前用户报名的活动列表 GET
    接口描述 分页获取指定诉求分类下的所有的诉求
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/volunteer-service/activity/my-list/1?pageNum=1&pageSize
    =10
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    state
    活动报名状态筛选[字
    典:vs_register_state]
    true string
    pageSize 分页大小 false integer
    pageNum 分页页码 false integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    rows 全部数据 array
    id 活动 ID integer
    title 活动标题 string
    undertaker 承办单位 string
    参数名称 参数说明 类型
    startAt 活动日期 string
    appealCategoryName 诉求分类名称 string
    requireText 报名要求 string
    detail 活动详情 string
    响应示例
    {
    "total": 1,
    "rows": [
    {
    "id": 5,
    "title": "我国第一部 1000 集双语版国学片杀青",
    "undertaker": "新华城市",
    "startAt": "2022-03-10",
    "requireText": "18 周岁以下",
    "detail": "为发展慈善教育事业，为关心祖国下一代的成长，为
    落实习近平总书记关于“期盼着孩子们能成长得更好”的指示，北京康盟慈善基
    金会、圆梦基金、大学府基金、奖学金管委会联合组织力量拍摄完成了我国第一
    部 1000 集大型双语版（手语口语）国学片《家长育儿宝典国学片》。1000 集影
    片涵盖我国诗歌、散文、故事、课文等领域的全部优秀作品。今年，该片将通过
    公益渠道和爱心企业渠道以及本活动首席志愿者单位北京第九大道文化传播、北
    京银软网络技术有限公司、山东远洋网络科技有限公司等多种途径向全国亿万家
    长免费赠送。"
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    15.3 志愿活动报名
    15.3.1 报名/取消报名某场志愿活动
     */
    const val get_api_volunteer_service_activity_my_list__state_= "/prod-api/api/volunteer-service/activity/my-list/{state}"

    /**15.3.1 报名/取消报名某场志愿活动 POST
    接口描述 API 提交当前用户报名或者取消报名某场志愿活动
    请求数据类型
    application/json
    请求示例
    {
    "activityId": 5,
    "newState": true
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    activityId 活动 ID true integer
    newState
    新 状 态 [true 报 名 ，
    false 取消报名]
    true boolean
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    15.4 广告轮播图
    15.4.1 获取所有广告轮播图
     */
    const val post_api_volunteer_service_register= "/prod-api/api/volunteer-service/register"

    /**15.4.1 获取所有广告轮播图 GET
    接口描述 获取所有广告轮播图
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/volunteer-service/ad-banner/list
    请求参数
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    无
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    data 全部数据列表 array
    id 轮播图 ID integer
    title 轮播图标题 string
    sort 轮播图排序序号 integer
    imgUrl 轮播图图片图片 URL string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "id": 4,
    "title": "测试图片",
    "sort": 1,
    "imgUrl": "/dev-api/profile/upload/image/2022/02/24/8d1e9
    174-7333-44c4-8d17-a64579c2677f.jpg"
    }
    ]
    }
    16 数字图书馆
    16.1 图书馆
    16.1.1 分页查询所有图书馆列表
     */
    const val get_api_volunteer_service_ad_banner_list= "/prod-api/api/volunteer-service/ad-banner/list"

    /**16.1.1 分页查询所有图书馆列表 GET
    接口描述 分页获取所有图书馆列表
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/digital-library/library/list?pageNum=1&pageSize=10
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    参数名称 参数说明 请求类型 必须 数据类型
    pageSize 分页大小 false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    rows 全部数据列表 array
    id 图书馆 ID integer
    name 图书馆名称 string
    address 图书馆地址 string
    imgUrl 图书馆图片 URL string
    mapUrl 图书馆地图图片 URL string
    businessHours 营业时间 string
    businessState
    营 业 状 态 [ 字 典 ：
    dl_library_business_state
    ]
    string
    description 图书馆详细描述 string
    响应示例
    {
    "total": 1,
    "rows": [
    {
    "id": 8,
    "name": "大连市图书馆",
    "address": "辽宁省大连市西岗区长白街 7 号",
    "imgUrl": "/dev-api/profile/upload/image/2022/03/02/acc66
    4d5-09a9-4fff-9342-2c91abb26c44.jpeg",
    "mapUrl": "",
    "businessHours": "9:00-18:00",
    "businessState": "1",
    "description": ""
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    16.1.2 获取图书馆详情
     */
    const val get_api_digital_library_library_list= "/prod-api/api/digital-library/library/list"

    /**16.1.2 获取图书馆详情 GET
    接口描述 根据 ID 获取图书馆详情信息
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/digital-library/library/8
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    Id 图书馆 ID true integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    dadta 全部数据列表 object
    id 图书馆 ID integer
    参数名称 参数说明 类型
    name 图书馆名称 string
    address 图书馆地址 string
    imgUrl 图书馆图片 URL string
    mapUrl 图书馆地图图片 URL string
    businessHours 营业时间 string
    businessState
    营 业 状 态 [ 字 典 ：
    dl_library_business_state
    ]
    string
    description 图书馆详细描述 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "id": 8,
    "name": "大连市图书馆",
    "address": "辽宁省大连市西岗区长白街 7 号",
    "imgUrl": "/dev-api/profile/upload/image/2022/03/02/acc664d5-
    09a9-4fff-9342-2c91abb26c44.jpeg",
    "mapUrl": "/dev-api/profile/upload/image/2022/03/02/89b27169-
    edda-4eff-b797-43daedcec429.png",
    "businessHours": "9:00-18:00",
    "businessState": "1",
    "description": "大连图书馆位于西岗区长白街，集文献收藏、信息咨
    询、社会教育、学术研究于一体的大型综合性现代化公共图书馆，是大连城市最
    大的文献信息集散地和社会文化教育中心；也是全国首批重点古籍保护单位、国
    家级首批中华优秀传统文化实践基地；自 1999 年开始，连续五次被文化部评为
    “国家一级图书馆”。 [1]\n\n 大连图书馆的前身是始建于 1907 年的南满洲铁
    道株式会社大连图书馆，1981 年更名为大连图书馆。1999 年市政府投资对图书
    馆进行改扩建。2008 年被国务院确定为全国首批重点古籍保护单位。\n\n 据 20
    21 年 1 月该图书馆官网数据显示，大连图书馆建筑面积近 7 万多平方米，设有 1
    5 个机构部门；馆藏各类文献（含电子书）720.6 万册，其中特色古籍 55 万册，
    数字资源存储总量达 124TB。"
    }
    }
    16.2 图书馆评论
    16.2.1 分页获取某个图书馆的所有评论列表
     */
    const val get_api_digital_library_library__id_= "/prod-api/api/digital-library/library/{id}"

    /**16.2.1 分页获取某个图书馆的所有评论列表 GET
    接口描述 根据图书馆 ID 分页获取评论列表
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/digital-library/library-comment/list?libraryId=8&pageNu
    m=1&pageSize=10
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    pageSize 分页大小 false string
    libraryId 图书馆 ID true integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    参数名称 参数说明 类型
    rows 全部数据列表 array
    id 评论 ID integer
    createTime 评论时间 string
    userId 评论人 ID integer
    libraryId 图书馆 ID integer
    content 评论内容 string
    myLikeState 我点赞的状态 boolean
    userName 评论人名字 string
    响应示例
    {{
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "createTime": "2022-03-02 17:41:05",
    "id": 10,
    "userId": 1,
    "libraryId": 8,
    "content": "嗯嗯嗯，很不错的图书馆，书很全",
    "myLikeState": true,
    "userName": "admin"
    },
    {
    "createTime": "2022-03-02 17:40:13",
    "id": 9,
    "userId": 1,
    "libraryId": 8,
    "content": "嗯嗯嗯，很不错的图书馆，书很全",
    "myLikeState": false,
    "userName": "admin"
    },
    {
    "createTime": "2022-03-02 17:14:10",
    "id": 8,
    "userId": 1,
    "libraryId": 8,
    "content": "这个图书馆挺不错的",
    "myLikeState": false,
    "userName": "admin"
    }
    ]
    }
    16.2.2 提交对某个图书馆的评论
     */
    const val get_api_digital_library_library_comment_list= "/prod-api/api/digital-library/library-comment/list"

    /**16.2.2 提交对某个图书馆的评论 POST
    接口描述 针对某个图书馆发起评论
    请求数据类型
    application/json
    请求示例
    {
    "libraryId": 8,
    "content": "嗯嗯嗯，很不错的图书馆，书很全"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    libraryId 图书馆 ID true integer
    content 评论内容 true string
    响应参数
    参数名称 参数说明 类型
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    16.2.3 对某条评论进行点赞/取消赞
     */
    const val post_api_digital_library_library_comment= "/prod-api/api/digital-library/library-comment"

    /**16.2.3 对某条评论进行点赞/取消赞 POST
    接口描述 对某条评论设置点赞状态
    请求数据类型
    application/json
    请求示例
    {
    "commentId": 10,
    "like": true
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    commentId 评论 ID true integer
    like 点赞状态 true boolean
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    17 垃圾分类宝典
    17.1 新闻分类
    17.1.1 获取所有新闻分类
     */
    const val post_api_digital_library_library_comment_like= "/prod-api/api/digital-library/library-comment/like"

    /**17.1.1 获取所有新闻分类 GET
    接口描述 获取所有新闻分类列表
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/garbage-classification/news-type/list
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    无
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    rows 全部数据列表 array
    id 新闻分类 ID integer
    name 新闻分类名称 string
    sort 排序字段 integer
    响应示例
    {
    "total": 3,
    "rows": [
    {
    "id": 8,
    "name": "党员在行动",
    "sort": 2
    },
    {
    "id": 9,
    "name": "分类达人",
    "sort": 3
    },
    {
    "id": 10,
    "name": "社区动态",
    "sort": 4
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    17.2 新闻
    17.2.1 分页查询某个新闻分类下的新闻列表
     */
    const val get_api_garbage_classification_news_type_list= "/prod-api/api/garbage-classification/news-type/list"

    /**17.2.1 分页查询某个新闻分类下的新闻列表 GET
    接口描述 分页获取指定诉求分类下的所有的诉求
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/garbage-classification/news/list?type=7&pageNum=1&pageS
    ize=10
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    pageSize 分页大小 false integer
    type 分类 ID true integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    rows 全部数据列表 array
    id 诉求 ID integer
    title 新闻标题 string
    imgUrl 新闻图片 string
    参数名称 参数说明 类型
    content 新闻内容 string
    author 新闻作者 string
    响应示例
    {
    "total": 1,
    "rows": [
    {
    "createTime": "2022-03-05 21:13:27",
    "id": 7,
    "type": 7,
    "title": " 中敖幼儿园 2021 年垃圾分类系列活动总结",
    "imgUrl": "/dev-api/profile/upload/image/2022/03/05/9fcad
    6cf-4ac4-4ffb-925a-cab98ed8a431.jpg",
    "content": "",
    "author": "刘一一"
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    17.2.2 查询指定新闻的详情信息
     */
    const val get_api_garbage_classification_news_list= "/prod-api/api/garbage-classification/news/list"

    /**17.2.2 查询指定新闻的详情信息 GET
    接口描述 根据 ID 获取新闻详情
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/garbage-classification/news/7
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    Id 新闻 ID false integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    data 全部数据列表 array
    id 诉求 ID integer
    title 新闻标题 string
    imgUrl 新闻图片 string
    content 新闻内容 string
    author 新闻作者 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "createTime": "2022-03-05 21:13:27",
    "id": 7,
    "type": 7,
    "title": " 中敖幼儿园 2021 年垃圾分类系列活动总结",
    "imgUrl": "/dev-api/profile/upload/image/2022/03/05/9fcad6cf4ac4-4ffb-925a-cab98ed8a431.jpg",
    "content": "<p><span style=\"color: rgb(51, 51, 51);\">为深入
    贯彻落实习近平总书记关于生活垃圾分类工作的重要指示和生态文明重要思想，
    中敖幼儿园 2021 年 11 月 26 日-30 日开展了“小手拉大手&nbsp;垃圾分类我能
    行”系列活动，让垃圾分类成为全园教职工、幼儿行为习惯和文明新风尚，为师
    幼创设优良的学习生活环境。</span></p><p><span style=\"color: rgb(51,
    51, 51);\"><span class=\"ql-cursor\"> </span>孩子们利用国旗下的情景
    表演，让全园师幼认识了垃圾分类的重要性和不同种类垃圾的正确投放方法，倡
    议大家保护环境，从我做起，垃圾分类，校园美十分。</span></p>",
    "author": "刘一一"
    }
    }
    17.3 垃圾分类
    17.3.1 获取所有垃圾分类
     */
    const val get_api_garbage_classification_news__id_= "/prod-api/api/garbage-classification/news/{id}"

    /**17.3.1 获取所有垃圾分类 GET
    接口描述 获取所有垃圾分类列表
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/garbage-classification/garbage-classification/list?page
    Num=1&pageSize=10&name=湿
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    pageSize 分页大小 false string
    Name 搜索关键字 true string
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    参数名称 参数说明 类型
    msg 消息内容 string
    rows 全部数据列表 array
    id 垃圾分类 ID integer
    Name 垃圾分类名称 string
    sort 排序字段 integer
    imgUrl 分类图片 URL string
    introduce 垃圾分类介绍 string
    guide 投放指导 string
    响应示例
    {
    "total": 1,
    "rows": [
    {
    "id": 7,
    "name": "湿垃圾",
    "sort": 1,
    "imgUrl": "/dev-api/profile/upload/image/2022/03/05/e632f
    eb0-52b6-4dd1-94b4-4e90158656d6.jpg",
    "introduce": "即易腐垃圾，易腐的生物质生活废弃物。湿垃圾应
    从产生时就与其他品种垃圾分开收集。投放前尽量沥干水分，有外包装的应去除
    外包装投放。",
    "guide": "1、湿垃圾投放需破袋处理。盛放湿垃圾的容器，如塑
    料袋等，在投放时应予去除。\n\n\n\n2、湿垃圾应从产生时就与其他湿垃圾应
    从产生时就与其他品种垃圾分开收集，投放前尽量沥干水分。\n\n\n\n3、有包
    装物的湿垃圾应将包装物去除后分类投放，包装物应投放到对应的可回收物或干
    垃圾收集容器。"
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    17.3.2 获取所有垃圾分类搜索热词
     */
    const val get_api_garbage_classification_garbage_classification_list= "/prod-api/api/garbage-classification/garbage-classification/list"

    /**17.3.2 获取所有垃圾分类搜索热词 GET
    接口描述 获取所有分类及分类搜索热词（也可分页）
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/garbage-classification/garbage-classification/hot/list?
    pageNum=1&pageSize=10
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    pageSize 分页大小 false integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    data 全部数据列表 array
    keyword 关键词 string
    searchTimes 被搜索次数 integer
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "id": 8,
    "keyword": "湿",
    "searchTimes": 4
    },
    {
    "id": 7,
    "keyword": "湿垃圾",
    "searchTimes": 1
    }
    ]
    }
    17.4 垃圾分类举例
    17.4.1 获取某个垃圾分类下方的所有举例
     */
    const val get_api_garbage_classification_garbage_classification_hot_list= "/prod-api/api/garbage-classification/garbage-classification/hot/list"

    /**17.4.1 获取某个垃圾分类下方的所有举例 GET
    接口描述 分页获取指定诉求分类下的所有的诉求
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/garbage-classification/garbage-example/list?type=7
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    pageSize 分页大小 false string
    appealCategoryId 所属诉求分类 ID true integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    rows 全部数据列表 array
    id 垃圾分类举例 ID integer
    type 垃圾分类 ID string
    name 垃圾分类举例名称 integer
    imgUrl 垃圾分类举例图片 string
    响应示例
    {
    "total": 4,
    "rows": [
    {
    "id": 7,
    "type": 7,
    "name": "菜叶",
    "imgUrl": "/dev-api/profile/upload/image/2022/03/05/79619
    2e3-0b3b-4f1a-b170-df40a7aa7418.jpg"
    },
    {
    "id": 8,
    "type": 7,
    "name": "橙皮",
    "imgUrl": "/dev-api/profile/upload/image/2022/03/05/87a94
    b7d-3756-4ba8-ab91-733a8d78a142.jpg"
    },
    {
    "id": 9,
    "type": 7,
    "name": "葱",
    "imgUrl": "/dev-api/profile/upload/image/2022/03/05/888bd
    9dc-e291-46cb-87fc-e9c0f7724dc2.jpg"
    },
    {
    "id": 10,
    "type": 7,
    "name": "饼干",
    "imgUrl": "/dev-api/profile/upload/image/2022/03/05/bae75
    b6a-1558-4657-8f30-367e378cc269.jpg"
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    17.5 广告轮播图
    17.5.1 获取所有广告轮播图
     */
    const val get_api_garbage_classification_garbage_example_list= "/prod-api/api/garbage-classification/garbage-example/list"

    /**17.5.1 获取所有广告轮播图 GET
    接口描述 获取所有广告轮播图
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/garbage-classification/ad-banner/list
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    无
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    参数名称 参数说明 类型
    msg 消息内容 string
    data 全部数据列表 array
    id 轮播图 ID integer
    title 轮播图标题 string
    sort 轮播图排序序号 integer
    imgUrl 轮播图图片图片 URL string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "id": 4,
    "title": "测试图片",
    "sort": 1,
    "imgUrl": "/dev-api/profile/upload/image/2022/02/24/8d1e9
    174-7333-44c4-8d17-a64579c2677f.jpg"
    }
    ]
    }
    17.6 宣传海报
    17.6.1 获取所有宣传海报
     */
    const val get_api_garbage_classification_ad_banner_list= "/prod-api/api/garbage-classification/ad-banner/list"

    /**17.6.1 获取所有宣传海报 GET
    接口描述 分页获取指定诉求分类下的所有的诉求
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/garbage-classification/poster/list
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    无
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    data 全部数据列表 array
    id 海报 ID integer
    title 海报标题 string
    sort 海报排序序号 integer
    imgUrl 海报图片 URL string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "id": 4,
    "title": "测试图片",
    "sort": 1,
    "imgUrl": "/dev-api/profile/upload/image/2022/02/24/8d1e9
    174-7333-44c4-8d17-a64579c2677f.jpg"
    }
    ]
    }
    17.7 新闻评论
    17.7.1 发表新闻评论
     */
    const val get_api_garbage_classification_poster_list= "/prod-api/api/garbage-classification/poster/list"

    /**17.7.1 发表新闻评论 POST
    接口描述 针对某条新闻发表评论
    请求数据类型
    application/json
    请求示例
    {
    "newsId": 7,
    "content": "这是通过 API 新增的评论哈哈哈哈"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    newsId 要评论的新闻 ID true integer
    content 评论内容 false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    17.7.2 获取某个新闻的所有评论
     */
    const val post_api_garbage_classification_news_comment= "/prod-api/api/garbage-classification/news-comment"

    /**17.7.2 获取某个新闻的所有评论 GET
    接口描述 获取指定新闻的全部评论
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/garbage-classification/news-comment/list?newsId=7
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    pageSize 分页大小 false string
    newsId 新闻 ID true integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    rows 全部数据列表 array
    id 评论 ID integer
    参数名称 参数说明 类型
    newsId 新闻 ID string
    userId 评论用户 ID integer
    content 评论内容 string
    响应示例
    {
    "total": 4,
    "rows": [
    {
    "createTime": "2022-03-10 14:10:12",
    "id": 11,
    "newsId": 7,
    "userId": 1,
    "content": "这是通过 API 新增的评论哈哈哈哈"
    },
    {
    "createTime": "2022-03-05 22:21:56",
    "id": 10,
    "newsId": 7,
    "userId": 1,
    "content": "这是通过 API 新增的评论哈哈哈哈"
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    18 青年驿站
    18.1 人才政策区域
    18.1.1 获取所有人才政策区域
     */
    const val get_api_garbage_classification_news_comment_list= "/prod-api/api/garbage-classification/news-comment/list"

    /**18.1.1 获取所有人才政策区域 GET
    接口描述 获取人才区域列表
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/youth-inn/talent-policy-area/list
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    无
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    data 全部数据列表 array
    id 人才政策区域 ID integer
    name 人才政策区域名称 string
    Introduce 区域介绍 integer
    imgUrl 标志性建筑图片 URL string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "id": 7,
    "name": "大连市中山区",
    "imgUrl": "/dev-api/profile/upload/image/2022/03/06/93958
    a7c-3bc3-46b7-98b1-ca450e8d9eae.jpg",
    "introduce": ""
    },
    {
    "id": 8,
    "name": "大连市沙河口区",
    "imgUrl": "/dev-api/profile/upload/image/2022/03/06/d95b2
    7bb-305b-40b0-bb20-8b2b641fc6c0.jpg",
    "introduce": ""
    }
    ]
    }
    18.1.2 获取人才政策区域详情
     */
    const val get_api_youth_inn_talent_policy_area_list= "/prod-api/api/youth-inn/talent-policy-area/list"

    /**18.1.2 获取人才政策区域详情 GET
    接口描述 获取指定人才政策区域的详细信息
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/youth-inn/talent-policy-area/7
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    Id 人才政策区域 ID true integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    参数名称 参数说明 类型
    msg 消息内容 string
    data 全部数据列表 array
    id 人才政策区域 ID integer
    name 人才政策区域名称 string
    Introduce 区域介绍 integer
    imgUrl 标志性建筑图片 URL string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "id": 7,
    "name": "大连市中山区",
    "imgUrl": "/dev-api/profile/upload/image/2022/03/06/93958a7c3bc3-46b7-98b1-ca450e8d9eae.jpg",
    "introduce": "中山区，隶属于辽宁省大连市，是大连市的金融和商业
    中心。中山区位于大连市区东部。截至 2018 年，中山区陆地面积 47.41 平方千
    米，海岸线和岛岸线总长 42.53 千米 。属海洋性暖温带季风气候，辖 9 个街道，
    政府驻地位于桂林街道。根据第七次全国人口普查数据，截至 2020 年 11 月 1
    日零时，中山区常住人口 388564 人。"
    }
    }
    18.2 人才政策
    18.2.1 分页获取某个区域的所有人才政策
     */
    const val get_api_youth_inn_talent_policy_area__id_= "/prod-api/api/youth-inn/talent-policy-area/{id}"

    /**18.2.1 分页获取某个区域的所有人才政策 GET
    接口描述 获取获取指定区域的人才政策
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/youth-inn/talent-policy/list?areaId=7
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    pageSize 分页大小 false string
    areaId 人才政策区域 ID true integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    data 全部数据列表 array
    id 人才政策 ID integer
    areId 人才政策区域 ID string
    title 政策标题 integer
    author 政策发布人 string
    content 政策内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "createTime": "2022-03-06 07:58:28",
    "id": 7,
    "areaId": 7,
    "title": " 大连市中山区人才补贴政策 2022 年最新版",
    "author": "刘先生",
    "content": ""
    }
    ]
    }
    18.2.2 获取指定人才政策的详情
     */
    const val get_api_youth_inn_talent_policy_list= "/prod-api/api/youth-inn/talent-policy/list"

    /**18.2.2 获取指定人才政策的详情 GET
    接口描述 根据 ID 获取指定人才政策的详细信息
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/youth-inn/talent-policy/7
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    Id 人才政策 ID true integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    参数名称 参数说明 类型
    data 全部数据 object
    id 人才政策 ID integer
    areId 人才政策区域 ID string
    title 政策标题 integer
    author 政策发布人 string
    content 政策内容 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "createTime": "2022-03-06 07:58:28",
    "id": 7,
    "areaId": 7,
    "title": " 大连市中山区人才补贴政策 2022 年最新版",
    "author": "刘先生",
    "content": "<p>01, 坚持把稳定和扩大就业作为经济社会发展的优先
    目标，坚持创造更多就业岗位和稳定现有就业岗位并重，创造更充分的劳动力要
    素合理畅通有序流动机会。</p><p><br></p><p>02 大力实施新型城镇化建设和
    乡村振兴战略，引导资金、技术、人才、信息等城乡各类要素双向流动、平等交
    换、合理配置。主动对接京津冀、长江三角洲地区产业转移，大力发展“飞地经
    济”，推动区域经济高质量发展。</p><p><br></p><p>03 加强基础学科建设，
    推进高等教育、职业教育等深化产教融合。促进教育链、人才链与产业链、创新
    链有机衔接，推进人才培养和产业结构要素全方位融合，加快高层次技术技能型
    人才培养。</p><p><br></p><p>04&nbsp;深入推进“一网通办”，拓宽政务服务
    渠道，围绕高效办成“一件事”再造审批流程，进一步增强劳动力和人才流动动
    力。放宽主城区综合积分落户条件。</p><p><br></p><p>05&nbsp;统筹推进普通
    劳动者落户和人才落户，放宽主城区综合积分落户条件，放开金普新区和北部地
    区落户限制，取消旅顺口区、金普新区综合积分落户政策。 全面优化户籍迁入
    办理业务手续、流程和时限。</p><p><br></p><p>06&nbsp;坚持和完善统筹城乡
    的民生保障制度，推进我市优质公共服务资源向乡村地区、薄弱环节、重点人群
    倾斜，逐步实现全市城乡基本公共服务均等化。</p>"
    }
    }
    18.3 驿站
    18.3.1 分页获取所有驿站列表
     */
    const val get_api_youth_inn_talent_policy__id_= "/prod-api/api/youth-inn/talent-policy/{id}"

    /**18.3.1 分页获取所有驿站列表 GET
    接口描述 分页获取所有驿站列表
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/youth-inn/youth-inn/list
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    pageSize 分页大小 false integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    rows 全部数据列表 array
    id 驿站 ID integer
    coverImgUrl 驿站封面图 URL string
    参数名称 参数说明 类型
    imageUrlList
    驿站照片 URL 列表，多个 URL
    使用英文半角逗号分隔
    string
    bedsCountBoy 剩余男床位 integer
    bedsCountGirl 剩余女床位 integer
    address 驿站地点 string
    phone 电话 string
    workTime 工作办理入住时间 string
    introduce 公寓介绍 string
    internalFacilities 内部配置 string
    surroundingFacilities 周边配套 string
    specialService 特色服务 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "rows": [
    {
    "id": 7,
    "name": "香蕉公寓",
    "coverImgUrl": "/dev-api/profile/upload/image/2022/03/06/
    89c3e658-ee25-4fbb-9fbe-ffbbbd4186d2.jpg",
    "imageUrls": "",
    "bedsCountBoy": 123,
    "bedsCountGirl": 321,
    "address": "大连市中山区友好广场 XX 路 XX 号 10",
    "phone": "18888884242",
    "workTime": "工作日早 8:00-15:00",
    "introduce": "本驿站为中山区高等驿站，位于中山区中心地带友
    好广场附近，设施齐全，场地宽敞。本驿站为中山区高等驿站，位于中山区中心
    地带友好广场附近，设施齐全，场地宽敞。本驿站为中山区高等驿站，位于中山
    区中心地带友好广场附近，设施齐全，场地宽敞。",
    "internalFacilities": "",
    "surroundingFacilities": "",
    "specialService": "",
    "imageUrlList": null
    }
    ]
    }
    18.3.2 获取指定驿站的详情
     */
    const val get_api_youth_inn_youth_inn_list= "/prod-api/api/youth-inn/youth-inn/list"

    /**18.3.2 获取指定驿站的详情 GET
    接口描述 根据 ID 获取指定驿站的详情
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/youth-inn/youth-inn/7
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    Id 驿站 ID true integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    data 全部数据列表 array
    id 驿站 ID integer
    coverImgUrl 驿站封面图 URL string
    参数名称 参数说明 类型
    imageUrlList
    驿站照片 URL 列表，多个 URL
    使用英文半角逗号分隔
    string
    bedsCountBoy 剩余男床位 integer
    bedsCountGirl 剩余女床位 integer
    address 驿站地点 string
    phone 电话 string
    workTime 工作办理入住时间 string
    introduce 公寓介绍 string
    internalFacilities 内部配置 string
    surroundingFacilities 周边配套 string
    specialService 特色服务 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "id": 7,
    "name": "香蕉公寓",
    "coverImgUrl": "/dev-api/profile/upload/image/2022/03/06/89c3
    e658-ee25-4fbb-9fbe-ffbbbd4186d2.jpg",
    "imageUrls": "/dev-api/profile/upload/image/2022/03/06/de35b4
    2b-af6d-44fa-bb1e-c14dbc9a41cf.jpg,/dev-api/profile/upload/image/2022
    /03/06/7ed73ffe-dfb6-4f14-a5af-762dac4f48f2.jpg",
    "bedsCountBoy": 123,
    "bedsCountGirl": 321,
    "address": "大连市中山区友好广场 XX 路 XX 号 10",
    "phone": "18888884242",
    "workTime": "工作日早 8:00-15:00",
    "introduce": "本驿站为中山区高等驿站，位于中山区中心地带友好广
    场附近，设施齐全，场地宽敞。本驿站为中山区高等驿站，位于中山区中心地带
    友好广场附近，设施齐全，场地宽敞。本驿站为中山区高等驿站，位于中山区中
    心地带友好广场附近，设施齐全，场地宽敞。",
    "internalFacilities": "WiFi，热水，双人床，写字桌。",
    "surroundingFacilities": "中山广场商圈，中山小学",
    "specialService": "免费早餐",
    "imageUrlList": [
    "/dev-api/profile/upload/image/2022/03/06/de35b42b-af6d-4
    4fa-bb1e-c14dbc9a41cf.jpg",
    "/dev-api/profile/upload/image/2022/03/06/7ed73ffe-dfb6-4
    f14-a5af-762dac4f48f2.jpg"
    ]
    }
    }
    19 爱心公益
    19.1 公益分类
    19.1.1 获取所有公益分类
     */
    const val get_api_youth_inn_youth_inn__id_= "/prod-api/api/youth-inn/youth-inn/{id}"

    /**19.1.1 获取所有公益分类 GET
    接口描述 获取全部爱心公益分类
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/public-welfare/public-welfare-type/list
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    无
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    data 全部数据列表 array
    id 公益分类 ID integer
    name 公益分类名称 string
    sort 排序字段 integer
    imgUrl 诉求图片 URL string
    appealCategoryName 诉求分类名称 string
    detailResult 处理结果 string
    state
    诉 求 处 理 状 态 [ 字 典 ：
    gsh_appeal_state]
    string
    响应示例
    {
    "total": 1,
    "data": [
    {
    "createTime": "2022-02-24 15:38:50",
    "id": 4,
    "userId": 105,
    "appealCategoryId": 4,
    "title": "这是一个诉求",
    "content": "因为疫情，物价是在太高了，请处理一下。",
    "undertaker": "物价局",
    "state": "1",
    "detailResult": "以让他们降价了",
    "imgUrl": "/dev-api/profile/upload/image/2022/02/24/82a57
    055-3298-4b74-94e0-d2a222d3d19e.png",
    "appealCategoryName": "衣食住行"
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    19.2 公益活动
    19.2.1 获取所有被推荐的公益活动
     */
    const val get_api_public_welfare_public_welfare_type_list= "/prod-api/api/public-welfare/public-welfare-type/list"

    /**19.2.1 获取所有被推荐的公益活动 GET
    接口描述 分页获取所有在后台被设置了推荐状态的公益活动列表
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/public-welfare/public-welfare-activity/recommend-list?p
    ageNum=1&pageSize=10
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    pageSize 分页大小 false integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    rows 全部数据列表 array
    参数名称 参数说明 类型
    id 公益活动 ID integer
    Name 公益活动名称 string
    author 创办者负责人 integer
    imgUrl 公益活动图片 URL string
    activityAt 公益活动时间 string
    moneyTotal 总计所需捐款 integer
    moneyNow 当前已筹款数额 integer
    description 公益活动描述 string
    isRecommend
    活 动 是 否 被 推 荐 ， 字 典 ：
    public_welfare_activity_is_recom
    mend
    string
    detailsList 捐款活动明细 array
    type 所属公益活动分类信息 object
    type.name 公益活动分类名称 string
    type.imgUrl 公益活动分类图标 URL string
    donateCount 捐款次数 integer
    响应示例
    {
    "total": 3,
    "rows": [
    {
    "createTime": "2022-03-07 08:07:09",
    "id": 7,
    "imgUrl": "/dev-api/profile/upload/image/2022/03/07/00353
    cbb-bfe8-4cf7-9665-5b95825d755a.jpg",
    "typeId": 7,
    "name": "公益 0101",
    "author": "刘零一",
    "activityAt": "2022-03-16",
    "moneyTotal": 54321,
    "moneyNow": 12345,
    "description": "",
    "isRecommend": "1",
    "detailsList": null,
    "type": {
    "id": 7,
    "name": "公益分类 1",
    "sort": 0,
    "imgUrl": "/dev-api/profile/upload/image/2022/03/07/5
    d2db62f-c339-4c81-bc0b-c8a4d3333ca1.jpg"
    },
    "donateCount": 3
    },
    {
    "createTime": "2022-03-07 08:10:31",
    "id": 8,
    "imgUrl": "/dev-api/profile/upload/image/2022/03/07/8d6aa
    a88-e911-40cb-800a-b99dfdad0500.jpg",
    "typeId": 7,
    "name": "公益分类 0102",
    "author": "刘零二",
    "activityAt": "2022-03-15",
    "moneyTotal": 55555,
    "moneyNow": 33333,
    "description": "",
    "isRecommend": "1",
    "detailsList": null,
    "type": {
    "id": 7,
    "name": "公益分类 1",
    "sort": 0,
    "imgUrl": "/dev-api/profile/upload/image/2022/03/07/5
    d2db62f-c339-4c81-bc0b-c8a4d3333ca1.jpg"
    },
    "donateCount": 0
    },
    {
    "createTime": "2022-03-09 14:28:30",
    "id": 10,
    "imgUrl": "/dev-api/profile/upload/image/2022/03/09/50c4a
    e81-a7ff-4db1-b19c-ded915be61bf.jpeg",
    "typeId": 7,
    "name": "公益活动 1",
    "author": "哈哈哈",
    "activityAt": "2022-03-09",
    "moneyTotal": 222,
    "moneyNow": 321,
    "description": "",
    "isRecommend": "1",
    "detailsList": null,
    "type": {
    "id": 7,
    "name": "公益分类 1",
    "sort": 0,
    "imgUrl": "/dev-api/profile/upload/image/2022/03/07/5
    d2db62f-c339-4c81-bc0b-c8a4d3333ca1.jpg"
    },
    "donateCount": 1
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    19.2.2 分页获取某个分类下的所有公益活动
     */
    const val get_api_public_welfare_public_welfare_activity_recommend_list= "/prod-api/api/public-welfare/public-welfare-activity/recommend-list"

    /**19.2.2 分页获取某个分类下的所有公益活动 GET
    接口描述 分页获取指定分类 ID 下的所有公益活动
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/public-welfare/public-welfare-activity/list?typeId=7&pa
    geNum=1&pageSize=10&name=02
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    pageSize 分页大小 false integer
    typeId 公益分类 ID true integer
    name
    根据公益名称搜索的
    关键词
    false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    rows 全部数据列表 array
    id 公益活动 ID integer
    Name 公益活动名称 string
    author 创办者负责人 integer
    imgUrl 公益活动图片 URL string
    activityAt 公益活动时间 string
    moneyTotal 总计所需捐款 integer
    moneyNow 当前已筹款数额 integer
    description 公益活动描述 string
    isRecommend
    活 动 是 否 被 推 荐 ， 字 典 ：
    public_welfare_activity_is_recom
    mend
    string
    detailsList 捐款活动明细 array
    参数名称 参数说明 类型
    type 所属公益活动分类信息 object
    type.name 公益活动分类名称 string
    type.imgUrl 公益活动分类图标 URL string
    donateCount 捐款次数 integer
    响应示例
    {
    "total": 1,
    "rows": [
    {
    "createTime": "2022-03-07 08:10:31",
    "id": 8,
    "imgUrl": "/dev-api/profile/upload/image/2022/03/07/8d6aa
    a88-e911-40cb-800a-b99dfdad0500.jpg",
    "typeId": 7,
    "name": "公益分类 0102",
    "author": "刘零二",
    "activityAt": "2022-03-15",
    "moneyTotal": 55555,
    "moneyNow": 33333,
    "description": "",
    "isRecommend": "1",
    "detailsList": null,
    "type": {
    "id": 7,
    "name": "公益分类 1",
    "sort": 0,
    "imgUrl": "/dev-api/profile/upload/image/2022/03/07/5
    d2db62f-c339-4c81-bc0b-c8a4d3333ca1.jpg"
    },
    "donateCount": 0
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    19.3 捐助记录
    19.3.1 获取公益活动的最新捐助记录
     */
    const val get_api_public_welfare_public_welfare_activity_list= "/prod-api/api/public-welfare/public-welfare-activity/list"

    /**19.3.1 获取公益活动的最新捐助记录 GET
    接口描述 分页获取公益活动的捐助记录列表
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/public-welfare/donate-record/list?activityId=7&pageNum=
    1&pageSize=10
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    pageSize 分页大小 false integer
    activityId 公益活动 ID true integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    rows 全部数据列表 array
    id 捐款记录 ID integer
    activityId 公益活动 ID string
    参数名称 参数说明 类型
    userId 捐助人 ID integer
    donateMoney 捐款金额 string
    userName 捐助用户名字 string
    activityName 公益活动名字 string
    响应示例
    {
    "total": 3,
    "msg": "操作成功",
    "code": 200,
    "rows": [
    {
    "createTime": "2022-03-07 09:50:51",
    "id": 9,
    "activityId": 7,
    "userId": 1,
    "donateMoney": 123,
    "userName": "admin",
    "activityName": "公益 0101"
    },
    {
    "createTime": "2022-03-07 08:22:46",
    "id": 8,
    "activityId": 7,
    "userId": 1,
    "donateMoney": 3321,
    "userName": "admin",
    "activityName": "公益 0101"
    },
    {
    "createTime": "2022-03-07 08:22:35",
    "id": 7,
    "activityId": 7,
    "userId": 1,
    "donateMoney": 112,
    "userName": "admin",
    "activityName": "公益 0101"
    }
    ]
    }
    19.3.2 发起捐助
     */
    const val get_api_public_welfare_donate_record_list= "/prod-api/api/public-welfare/donate-record/list"

    /**19.3.2 发起捐助 POST
    接口描述 发起捐助 API 提交捐助信息
    请求数据类型
    application/json
    请求示例
    {
    "activityId": 7,
    "donateMoney": 123
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    activityId 公益活动 ID true integer
    donateMoney 捐助金额 true integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "操作成功"
    }
    19.4 广告轮播图
    19.4.1 获取所有广告轮播图
     */
    const val post_api_public_welfare_donate_record= "/prod-api/api/public-welfare/donate-record"

    /**19.4.1 获取所有广告轮播图 GET
    接口描述 获取全部广告轮播图
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/public-welfare/ad-banner/list
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    无
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    data 全部数据列表 array
    id 轮播图 ID integer
    title 轮播图标题 string
    参数名称 参数说明 类型
    sort 轮播图排序序号 integer
    imgUrl 轮播图图片图片 URL string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "id": 4,
    "title": "测试图片",
    "sort": 1,
    "imgUrl": "/dev-api/profile/upload/image/2022/02/24/8d1e9
    174-7333-44c4-8d17-a64579c2677f.jpg"
    }
    ]
    }
    20 物流查询
    20.1 物流公司
    20.1.1 获取所有物流公司
     */
    const val get_api_public_welfare_ad_banner_list= "/prod-api/api/public-welfare/ad-banner/list"

    /**20.1.1 获取所有物流公司 GET
    接口描述 获取全部物流公司
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/logistics-inquiry/logistics_company/list
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    pageSize 分页大小 false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    data 全部数据列表 array
    id 物流公司 ID integer
    name 物流公司名称 string
    sort 排序字段 integer
    imgUrl 物流公司 logo 图片 URL string
    introduce 物流公司介绍 string
    shippingMethod 运输方式 string
    phone 电话 string
    priceList 价格列表 array
    newsList 物流公司新闻列表 array
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "id": 6,
    "name": "申通物流",
    "sort": 1,
    "imgUrl": "/dev-api/profile/upload/image/2022/03/07/14ae5
    0ff-9326-44de-a127-75c7bf61eae0.jpeg",
    "introduce": "",
    "shippingMethod": "",
    "phone": "18842424242",
    "priceList": null,
    "newsList": null
    },
    {
    "id": 7,
    "name": "圆通物流",
    "sort": 2,
    "imgUrl": "/dev-api/profile/upload/image/2022/03/07/47c1f
    659-30a9-4199-a441-c05586738ddb.jpeg",
    "introduce": "",
    "shippingMethod": "",
    "phone": "18842421231",
    "priceList": null,
    "newsList": null
    },
    {
    "id": 8,
    "name": "京东物流",
    "sort": 3,
    "imgUrl": "/dev-api/profile/upload/image/2022/03/07/0a309
    613-7beb-4902-acad-08ee5aac2382.jpeg",
    "introduce": "",
    "shippingMethod": "",
    "phone": "18842656666",
    "priceList": null,
    "newsList": null
    }
    ]
    }
    20.1.2 获取物流公司详情
     */
    const val get_api_logistics_inquiry_logistics_company_list= "/prod-api/api/logistics-inquiry/logistics_company/list"

    /**20.1.2 获取物流公司详情 GET
    接口描述 获取物流公司详情
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/logistics-inquiry/logistics_company/6
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    Id 物流公司 ID true integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    data 全部数据列表 array
    id 物流公司 ID integer
    name 物流公司名称 string
    sort 排序字段 integer
    imgUrl 物流公司 logo 图片 URL string
    introduce 物流公司介绍 string
    shippingMethod 运输方式 string
    phone 电话 string
    priceList 价格列表 array
    参数名称 参数说明 类型
    priceList.areaName 价格 目的地 string
    priceList.fileStart 价格 文件首重 integer
    priceList.fileStep 价格 文件递增价格 integer
    priceList.objStart 价格 物品首重 integer
    priceList.objStep 价格 物品递增价格 integer
    newsList 新闻咨询列表 array
    newsList.id 新闻咨询 ID integer
    newsList.title 新闻咨询标题 string
    newsList.imgUrl 新闻咨询图片 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "id": 6,
    "name": "申通物流",
    "sort": 1,
    "imgUrl": "/dev-api/profile/upload/image/2022/03/07/14ae50ff9326-44de-a127-75c7bf61eae0.jpeg",
    "introduce": "申通快递品牌初创于 1993 年，公司致力于民族品牌的
    建设和发展，不断完善终端网络、中转运输网络和信息网络三网一体的立体运行
    体系，立足传统快递业务，全面进入电子商务领域，以专业的服务和严格的质量
    管。",
    "shippingMethod": "空运,陆运,海运,大件慢速物流",
    "phone": "18842424242",
    "priceList": [
    {
    "id": 6,
    "companyId": 6,
    "sort": 1,
    "areaName": "中国大陆",
    "fileStart": 12,
    "fileStep": 4,
    "objStart": 14,
    "objStep": 4
    },
    {
    "id": 7,
    "companyId": 6,
    "sort": 2,
    "areaName": "中国香港",
    "fileStart": 15,
    "fileStep": 5,
    "objStart": 17,
    "objStep": 12
    },
    {
    "id": 8,
    "companyId": 6,
    "sort": 3,
    "areaName": "中国香港",
    "fileStart": 14,
    "fileStep": 8,
    "objStart": 20,
    "objStep": 4
    }
    ],
    "newsList": [
    {
    "id": 6,
    "companyId": 6,
    "sort": 1,
    "imgUrl": "/dev-api/profile/upload/image/2022/03/07/d
    48f5bd9-11ee-41e6-978d-02aba96d291a.jpg",
    "title": "新闻资讯 001"
    }
    ]
    }
    }
    20.2 物流信息
    20.2.1 根据运单号查询物流信息
     */
    const val get_api_logistics_inquiry_logistics_company__id_= "/prod-api/api/logistics-inquiry/logistics_company/{id}"

    /**20.2.1 根据运单号查询物流信息 GET
    接口描述 分页获取指定诉求分类下的所有的诉求
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/logistics-inquiry/logistics_info/ST0000001
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    no 快递单号 true string
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    data 全部数据列表 array
    id 快递单 ID integer
    companyId 所属快递公司 ID string
    infoNo 快递单号 integer
    company 快递公司详细信息 string
    company.name 快递公司名称 string
    参数名称 参数说明 类型
    company.imgUrl 快递公司 LOGO 图片 URL string
    company.introduce 快递公司介绍 string
    company.shippingMethod 快递公司运输方式 string
    company.phone 快递公司投诉电话 string
    stepList 物流进度事件列表 array
    stepList.infoId 物流进度事件 ID integer
    stepList.eventAt 物流进度产生时间 string
    stepList.stateName 物流事件名称 string
    stepList.addressAt 物流时间产生地点 string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "createTime": "2022-03-07 11:32:51",
    "id": 6,
    "companyId": 6,
    "infoNo": "ST0000001",
    "company": {
    "id": 6,
    "name": "申通物流",
    "sort": 1,
    "imgUrl": "/dev-api/profile/upload/image/2022/03/07/14ae5
    0ff-9326-44de-a127-75c7bf61eae0.jpeg",
    "introduce": "申通快递品牌初创于 1993 年，公司致力于民族品
    牌的建设和发展，不断完善终端网络、中转运输网络和信息网络三网一体的立体
    运行体系，立足传统快递业务，全面进入电子商务领域，以专业的服务和严格的
    质量管。",
    "shippingMethod": "空运,陆运,海运,大件慢速物流",
    "phone": "18842424242",
    "priceList": null,
    "newsList": null
    },
    "stepList": [
    {
    "id": 7,
    "infoId": 6,
    "eventAt": "2022-03-02",
    "stateName": "快递发出",
    "addressAt": "辽宁省大连市甘井子区中转站"
    },
    {
    "id": 6,
    "infoId": 6,
    "eventAt": "2022-03-01",
    "stateName": "快递被揽收",
    "addressAt": "辽宁省大连市中转场"
    }
    ]
    }
    }
    20.3 物流投诉
    20.3.1 发起物流投诉
     */
    const val get_api_logistics_inquiry_logistics_info__no_= "/prod-api/api/logistics-inquiry/logistics_info/{no}"

    /**20.3.1 发起物流投诉 POST
    接口描述 发起物流投诉，通过 API 接口提交物流投诉信息
    请求数据类型
    application/json
    请求示例
    {
    "companyId": 7,
    "infoNo": "ST0000001",
    "questionType": "1",
    "description": "帮我看看这个快递到底是怎么回事，谢谢。"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    companyId 物流公司 ID true integer
    infoNo 快递单号 true string
    questionType
    投 诉 类 型 ， 字 典 ：
    li-complaint-questio
    n-type
    true string
    description 投诉的详细描述 true string
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功"
    }
    20.3.2 分页获取当前用户的所有投诉记录
     */
    const val post_api_logistics_inquiry_logistics_complaint= "/prod-api/api/logistics-inquiry/logistics_complaint"

    /**20.3.2 分页获取当前用户的所有投诉记录 GET
    接口描述 分页当前用户的所有投诉历史记录
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/logistics-inquiry/logistics_complaint/my-list?pageNum=1
    &pageSize=10
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    pageSize 分页大小 false string
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    rows 全部数据列表 array
    id 投诉 ID integer
    companyId 快递公司 ID integer
    userId 投诉发起人 ID integer
    infoNo 快递单号 string
    questionType
    投 诉 类 型 ， 字 典 ：
    li-complaint-question-type
    string
    description 投诉描述信息 string
    company 投诉关联的快递公司信息 string
    company.name 投诉关联的快递公司名称 string
    company.imgUrl 投诉关联的快递公司 LOGO 图片
    URL
    string
    响应示例
    {
    "total": 3,
    "rows": [
    {
    "createTime": "2022-03-10 15:21:58",
    "id": 8,
    "companyId": 7,
    "userId": 1,
    "infoNo": "ST0000001",
    "questionType": "1",
    "description": "帮我看看这个快递到底是怎么回事，谢谢。",
    "company": {
    "id": 7,
    "name": "圆通物流",
    "sort": 2,
    "imgUrl": "/dev-api/profile/upload/image/2022/03/07/4
    7c1f659-30a9-4199-a441-c05586738ddb.jpeg",
    "introduce": "圆通物流",
    "shippingMethod": "陆运,海运",
    "phone": "18842421231",
    "priceList": null,
    "newsList": null
    }
    },
    {
    "createTime": "2022-03-07 13:07:10",
    "id": 7,
    "companyId": 7,
    "userId": 1,
    "infoNo": "ST0000001",
    "questionType": "1",
    "description": "帮我看看这个快递到底是怎么回事，谢谢。",
    "company": {
    "id": 7,
    "name": "圆通物流",
    "sort": 2,
    "imgUrl": "/dev-api/profile/upload/image/2022/03/07/4
    7c1f659-30a9-4199-a441-c05586738ddb.jpeg",
    "introduce": "圆通物流",
    "shippingMethod": "陆运,海运",
    "phone": "18842421231",
    "priceList": null,
    "newsList": null
    }
    },
    {
    "createTime": "2022-03-07 11:26:29",
    "id": 6,
    "companyId": 6,
    "userId": 1,
    "infoNo": "123123123123",
    "questionType": "0",
    "description": "我去菜鸟驿站取快递，告诉我已经被取走了",
    "company": {
    "id": 6,
    "name": "申通物流",
    "sort": 1,
    "imgUrl": "/dev-api/profile/upload/image/2022/03/07/1
    4ae50ff-9326-44de-a127-75c7bf61eae0.jpeg",
    "introduce": "申通快递品牌初创于 1993 年，公司致力于民
    族品牌的建设和发展，不断完善终端网络、中转运输网络和信息网络三网一体的
    立体运行体系，立足传统快递业务，全面进入电子商务领域，以专业的服务和严
    格的质量管。",
    "shippingMethod": "空运,陆运,海运,大件慢速物流",
    "phone": "18842424242",
    "priceList": null,
    "newsList": null
    }
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    20.4 广告轮播图
    20.4.1 获取所有首页广告轮播图
     */
    const val get_api_logistics_inquiry_logistics_complaint_my_list= "/prod-api/api/logistics-inquiry/logistics_complaint/my-list"

    /**20.4.1 获取所有首页广告轮播图 GET
    接口描述 获取全部广告轮播图
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/logistics-inquiry/ad-banner/list
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    无
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    data 全部数据列表 array
    id 轮播图 ID integer
    title 轮播图标题 string
    sort 轮播图排序序号 integer
    imgUrl 轮播图图片图片 URL string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "id": 4,
    "title": "测试图片",
    "sort": 1,
    "imgUrl": "/dev-api/profile/upload/image/2022/02/24/8d1e9
    174-7333-44c4-8d17-a64579c2677f.jpg"
    }
    ]
    }
    21 宠物医院
    21.1 宠物分类
    21.1.1 获取所有宠物分类
     */
    const val get_api_logistics_inquiry_ad_banner_list= "/prod-api/api/logistics-inquiry/ad-banner/list"

    /**21.1.1 获取所有宠物分类 GET
    接口描述 获取全部后台配置的宠物分类相关信息列表
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/gov-service-hotline/appeal/list?appealCategoryId=4&page
    Num=1&pageSize=10
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    无
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    data 全部数据列表 array
    id 宠物分类 ID integer
    name 宠物分类名称 string
    imgUrl 宠物分类图片 URL string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "id": 9,
    "name": "小猫咪",
    "imgUrl": "/dev-api/profile/upload/image/2022/03/08/a1834
    509-c402-46ae-870f-6dfdebfa31e3.jpg"
    },
    {
    "id": 10,
    "name": "小狗",
    "imgUrl": "/dev-api/profile/upload/image/2022/03/08/b8f1e
    697-1d18-4afe-92e5-7fdc03690b56.jpg"
    },
    {
    "id": 11,
    "name": "鹦鹉",
    "imgUrl": "/dev-api/profile/upload/image/2022/03/08/f8ef8
    5e1-80fb-4b53-a62a-fb119d946458.jpg"
    },
    {
    "id": 12,
    "name": "金鱼",
    "imgUrl": "/dev-api/profile/upload/image/2022/03/08/e3dc8
    c21-ca7d-4dd7-8d18-6aa81c05215a.jpg"
    },
    {
    "id": 13,
    "name": "兔子",
    "imgUrl": "/dev-api/profile/upload/image/2022/03/08/7beed
    6cb-b652-46c7-88d8-4c3253e710a7.jpg"
    }
    ]
    }
    21.2 宠物医生
    21.2.1 分页获取所有宠物医生
     */
    const val get_api_pet_hospital_pet_type_list= "/prod-api/api/pet-hospital/pet-type/list"

    /**21.2.1 分页获取所有宠物医生 GET
    接口描述 分页获取指定宠物分类下的所有宠物医生
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/pet-hospital/pet-doctor/list?typeId=9&name= 王
    &pageSize=10&pageNum=1
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    pageSize 分页大小 false string
    typeId 宠物分类 ID true integer
    name
    宠物医生名称搜索关
    键词
    False string
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    rows 全部数据列表 array
    id 宠物医生 ID integer
    参数名称 参数说明 类型
    typeId 宠物医生所属宠物分类 ID integer
    name 宠物医生名字 string
    avatar 宠物医生头像图片 URL string
    jobName 宠物医生职称 string
    practiceNo 宠物医生执业证号 string
    workingYears 工作年限 string
    goodAt 擅长方向 string
    响应示例
    {
    "total": 1,
    "rows": [
    {
    "id": 9,
    "typeId": 9,
    "name": "王医生",
    "avatar": "/dev-api/profile/upload/image/2022/03/08/fa1e6
    595-d69b-4713-b6bd-8f5b075e8edf.jpg",
    "jobName": "主任医师",
    "practiceNo": "SK0000001",
    "workingYears": 15,
    "goodAt": "治疗小猫咪不睡觉"
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    21.3 问诊
    21.3.1 创建问题咨询
     */
    const val get_api_pet_hospital_pet_doctor_list= "/prod-api/api/pet-hospital/pet-doctor/list"

    /**21.3.1 创建问题咨询 POST
    接口描述 分页获取指定诉求分类下的所有的诉求
    请求数据类型
    application/json
    请求示例
    {
    "doctorId": 9,
    "question": "我们家小猫一年没睡觉了，怎么办？",
    "imageUrls":
    "/dev-api/profile/upload/image/2022/03/08/21322108-5f54-4356-b1da-272
    91a7a0bbb.jpg"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    doctorId 宠物医生 ID true integer
    Question 问诊问题描述 true string
    imageUrls
    问诊相关图片 URL，
    多个图片使用英文半
    角逗号分隔
    true string
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功"
    }
    21.3.2 分页查询当前用户的所有问诊记录
     */
    const val post_api_pet_hospital_inquiry= "/prod-api/api/pet-hospital/inquiry"

    /**21.3.2 分页查询当前用户的所有问诊记录 GET
    接口描述 分页查询当前用户曾经提交的所有问诊记录
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/pet-hospital/inquiry/my-list?pageNum=1&pageSize=10
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    pageSize 分页大小 false integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    参数名称 参数说明 类型
    msg 消息内容 string
    rows 全部数据列表 array
    id 问诊记录 ID integer
    doctorId 宠物医生 ID integer
    userId 发起用户 ID integer
    question 提问问题内容 string
    imageUrls
    提问问题相关的图片地址，多个
    图片之间采用英文半角逗号分隔
    string
    doctor 医生信息 object
    doctor.name 宠物医生名字 string
    doctor.avatar 宠物医生头像 string
    doctor.jobName 宠物医生职称 string
    doctor.practiceNo 宠物医生执业编号 string
    doctor.workingYears 宠物医生工作年限 integer
    doctor.goodAt 宠物医生工作擅长方向 string
    响应示例
    {
    "total": 4,
    "rows": [
    {
    "createTime": "2022-03-10 15:34:32",
    "id": 12,
    "doctorId": 9,
    "userId": 1,
    "question": "我们家小猫一年没睡觉了，怎么办？",
    "imageUrls": "/dev-api/profile/upload/image/2022/03/08/21
    322108-5f54-4356-b1da-27291a7a0bbb.jpg",
    "doctor": {
    "id": 9,
    "typeId": 9,
    "name": "王医生",
    "avatar": "/dev-api/profile/upload/image/2022/03/08/f
    a1e6595-d69b-4713-b6bd-8f5b075e8edf.jpg",
    "jobName": "主任医师",
    "practiceNo": "SK0000001",
    "workingYears": 15,
    "goodAt": "治疗小猫咪不睡觉"
    }
    },
    {
    "createTime": "2022-03-08 17:04:59",
    "id": 11,
    "doctorId": 9,
    "userId": 1,
    "question": "我们家小猫一年没睡觉了，怎么办？",
    "imageUrls": "/dev-api/profile/upload/image/2022/03/08/21
    322108-5f54-4356-b1da-27291a7a0bbb.jpg",
    "doctor": {
    "id": 9,
    "typeId": 9,
    "name": "王医生",
    "avatar": "/dev-api/profile/upload/image/2022/03/08/f
    a1e6595-d69b-4713-b6bd-8f5b075e8edf.jpg",
    "jobName": "主任医师",
    "practiceNo": "SK0000001",
    "workingYears": 15,
    "goodAt": "治疗小猫咪不睡觉"
    }
    },
    {
    "createTime": "2022-03-08 16:45:08",
    "id": 10,
    "doctorId": 9,
    "userId": 1,
    "question": "我家小猫一周没睡觉了，怎么办？",
    "imageUrls": "/dev-api/profile/upload/image/2022/03/08/b2
    7de15c-fe07-4b73-b736-47fef488d9c6.jpg",
    "doctor": {
    "searchValue": null,
    "id": 9,
    "typeId": 9,
    "name": "王医生",
    "avatar": "/dev-api/profile/upload/image/2022/03/08/f
    a1e6595-d69b-4713-b6bd-8f5b075e8edf.jpg",
    "jobName": "主任医师",
    "practiceNo": "SK0000001",
    "workingYears": 15,
    "goodAt": "治疗小猫咪不睡觉"
    }
    },
    {
    "createTime": "2022-03-08 15:51:28",
    "id": 9,
    "doctorId": 9,
    "userId": 1,
    "question": "请问我家小猫为啥天天喵喵叫不睡觉，咋的才能让
    他睡觉？",
    "imageUrls": "/dev-api/profile/upload/image/2022/03/08/21
    322108-5f54-4356-b1da-27291a7a0bbb.jpg",
    "doctor": {
    "id": 9,
    "typeId": 9,
    "name": "王医生",
    "avatar": "/dev-api/profile/upload/image/2022/03/08/f
    a1e6595-d69b-4713-b6bd-8f5b075e8edf.jpg",
    "jobName": "主任医师",
    "practiceNo": "SK0000001",
    "workingYears": 15,
    "goodAt": "治疗小猫咪不睡觉"
    }
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    21.3.3 查询所有公开的问诊案例
     */
    const val get_api_pet_hospital_inquiry_my_list= "/prod-api/api/pet-hospital/inquiry/my-list"

    /**21.3.3 查询所有公开的问诊案例 GET
    接口描述 分页获取所有公开的问诊案例
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/pet-hospital/inquiry/list?pageNum=1&pageSize=10
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    pageSize 分页大小 false integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    rows 全部数据列表 array
    id 问诊记录 ID integer
    doctorId 宠物医生 ID integer
    userId 发起用户 ID integer
    question 提问问题内容 string
    imageUrls
    提问问题相关的图片地址，多个
    图片之间采用英文半角逗号分隔
    string
    doctor 医生信息 object
    doctor.name 宠物医生名字 string
    doctor.avatar 宠物医生头像 string
    doctor.jobName 宠物医生职称 string
    参数名称 参数说明 类型
    doctor.practiceNo 宠物医生执业编号 string
    doctor.workingYears 宠物医生工作年限 integer
    doctor.goodAt 宠物医生工作擅长方向 string
    响应示例
    {
    "total": 4,
    "rows": [
    {
    "createTime": "2022-03-10 15:34:32",
    "id": 12,
    "doctorId": 9,
    "userId": 1,
    "question": "我们家小猫一年没睡觉了，怎么办？",
    "imageUrls": "/dev-api/profile/upload/image/2022/03/08/21
    322108-5f54-4356-b1da-27291a7a0bbb.jpg",
    "doctor": {
    "id": 9,
    "typeId": 9,
    "name": "王医生",
    "avatar": "/dev-api/profile/upload/image/2022/03/08/f
    a1e6595-d69b-4713-b6bd-8f5b075e8edf.jpg",
    "jobName": "主任医师",
    "practiceNo": "SK0000001",
    "workingYears": 15,
    "goodAt": "治疗小猫咪不睡觉"
    }
    },
    {
    "createTime": "2022-03-08 17:04:59",
    "id": 11,
    "doctorId": 9,
    "userId": 1,
    "question": "我们家小猫一年没睡觉了，怎么办？",
    "imageUrls": "/dev-api/profile/upload/image/2022/03/08/21
    322108-5f54-4356-b1da-27291a7a0bbb.jpg",
    "doctor": {
    "id": 9,
    "typeId": 9,
    "name": "王医生",
    "avatar": "/dev-api/profile/upload/image/2022/03/08/f
    a1e6595-d69b-4713-b6bd-8f5b075e8edf.jpg",
    "jobName": "主任医师",
    "practiceNo": "SK0000001",
    "workingYears": 15,
    "goodAt": "治疗小猫咪不睡觉"
    }
    },
    {
    "createTime": "2022-03-08 16:45:08",
    "id": 10,
    "doctorId": 9,
    "userId": 1,
    "question": "我家小猫一周没睡觉了，怎么办？",
    "imageUrls": "/dev-api/profile/upload/image/2022/03/08/b2
    7de15c-fe07-4b73-b736-47fef488d9c6.jpg",
    "doctor": {
    "id": 9,
    "typeId": 9,
    "name": "王医生",
    "avatar": "/dev-api/profile/upload/image/2022/03/08/f
    a1e6595-d69b-4713-b6bd-8f5b075e8edf.jpg",
    "jobName": "主任医师",
    "practiceNo": "SK0000001",
    "workingYears": 15,
    "goodAt": "治疗小猫咪不睡觉"
    }
    },
    {
    "createTime": "2022-03-08 15:51:28",
    "id": 9,
    "doctorId": 9,
    "userId": 1,
    "question": "请问我家小猫为啥天天喵喵叫不睡觉，咋的才能让
    他睡觉？",
    "imageUrls": "/dev-api/profile/upload/image/2022/03/08/21
    322108-5f54-4356-b1da-27291a7a0bbb.jpg",
    "doctor": {
    "id": 9,
    "typeId": 9,
    "name": "王医生",
    "avatar": "/dev-api/profile/upload/image/2022/03/08/f
    a1e6595-d69b-4713-b6bd-8f5b075e8edf.jpg",
    "jobName": "主任医师",
    "practiceNo": "SK0000001",
    "workingYears": 15,
    "goodAt": "治疗小猫咪不睡觉"
    }
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    21.4 问诊聊天
    21.4.1 查询某个问诊中的所有聊天
     */
    const val get_api_pet_hospital_inquiry_list= "/prod-api/api/pet-hospital/inquiry/list"

    /**21.4.1 查询某个问诊中的所有聊天 GET
    接口描述 分页获取某个问诊的所有聊天记录
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/pet-hospital/inquiry-message/list?pageNum=1&pageSize=10
    &inquiryId=11
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    pageSize 分页大小 false string
    inquiryId 问诊 ID true integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    rows 全部数据列表 array
    id 聊天消息 ID integer
    inquiryId 问诊 ID Integer
    content 问诊聊天内容 String
    fromRole
    来源对象，0 问诊人，1 宠物医
    生
    string
    fromId
    如果 fromRole 是 0，那么本字段
    为问诊人用户 ID，如果 fromRole
    是 1，那么本字段为宠物医生 ID
    string
    响应示例
    {
    "total": 2,
    "rows": [
    {
    "createTime": "2022-03-09 15:33:51",
    "id": 12,
    "inquiryId": 11,
    "content": "哈哈哈",
    "fromRole": "1",
    "fromId": 9
    },
    {
    "createTime": "2022-03-08 17:09:59",
    "id": 11,
    "inquiryId": 11,
    "content": "这小猫从出生到现在一岁了，就没睡过觉，咋整啊医
    生~",
    "fromRole": "0",
    "fromId": 1
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    21.4.2 追问某个问诊聊天
     */
    const val get_api_pet_hospital_inquiry_message_list= "/prod-api/api/pet-hospital/inquiry-message/list"

    /**21.4.2 追问某个问诊聊天 POST
    接口描述 API 提交某个问诊的聊天
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    {
    "inquiryId": 11,
    "content": "这小猫从出生到现在一岁了，就没睡过觉，咋整啊医生~"
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    inquiryId 问诊 ID true string
    content 问诊聊天消息内容 true string
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    参数名称 参数说明 类型
    msg 消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功"
    }
    22 厨房助手
    22.1 菜品
    22.1.1 分页获取所有菜品
     */
    const val post_api_pet_hospital_inquiry_message= "/prod-api/api/pet-hospital/inquiry-message"

    /**22.1.1 分页获取所有菜品 GET
    接口描述 分页获取所有赛品列表
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/kitchen-helper/dishes/list?name=红烧
    &pageNum=1&pageSize=10&authorId=7
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    pageSize 分页大小 false string
    authorId 作者 ID，如果需要获
    取指定作者的推荐菜
    false integer
    参数名称 参数说明 请求类型 必须 数据类型
    品的时候传入， 其他
    情况下不需要传入
    name 搜索菜名关键字 False string
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    rows 全部数据列表 array
    id 菜品 ID integer
    name 菜品名称 string
    authorId 菜品作者（推荐人）ID integer
    imgUrl 菜品图片 URL string
    ingredients 菜品配料表 string
    likeCount 点赞数量 integer
    collectionCount 收藏数量 integer
    myLikeState 我的点赞状态 boolean
    myCollectionState 我的收藏状态 boolean
    响应示例
    {
    "total": 1,
    "rows": [
    {
    "id": 8,
    "name": "红烧狮子头",
    "imgUrl": "/dev-api/profile/upload/image/2022/03/08/e7442
    7a7-6a80-4068-9399-8c0fb387b6f9.jpg",
    "authorId": 7,
    "ingredients": "白面，狮子头，肉",
    "likeCount": 0,
    "collectionCount": 0,
    "myLikeState": false,
    "myCollectionState": false,
    "stepList": null,
    "author": null
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    22.1.2 获取某个菜品详情
     */
    const val get_api_kitchen_helper_dishes_list= "/prod-api/api/kitchen-helper/dishes/list"

    /**22.1.2 获取某个菜品详情 GET
    接口描述 根据 ID 获取菜品详细信息
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/kitchen-helper/dishes/7
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    Id 菜品 ID true integer
    响应参数
    参数名称 参数说明 类型
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    data 全部数据列表 array
    id 菜品 ID integer
    name 菜品名称 string
    authorId 菜品作者（推荐人）ID integer
    imgUrl 菜品图片 URL string
    ingredients 菜品配料表 string
    likeCount 点赞数量 integer
    collectionCount 收藏数量 integer
    myLikeState 我的点赞状态 boolean
    myCollectionState 我的收藏状态 boolean
    stepList 烹饪步骤列表 array
    stepList.id 烹饪步骤 ID integer
    stepList.content 烹饪步骤描述内容 string
    stepList.imgUrl 烹饪步骤图片 URL string
    stepList.sort 烹饪步骤排序 integer
    author 菜品推荐人（作者）信息 object
    author.id 菜品推荐人 ID integer
    author.name 菜品推荐人名字 string
    参数名称 参数说明 类型
    author.avatar 菜品推荐人头像 URL string
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": {
    "id": 7,
    "name": "锅包肉",
    "imgUrl": "/dev-api/profile/upload/image/2022/03/08/07bfdf31-
    cbb3-40fd-bb7e-63b8c28172ef.jpg",
    "authorId": 7,
    "ingredients": "猪里脊肉 300g，鸡蛋 1 个，胡萝卜丝少许，香菜几
    片，盐 10g，料酒 1 勺，淀粉 100g，糖 60g，白醋 90g，米醋 10g，京葱丝、姜
    丝、蒜末适量",
    "likeCount": 1,
    "collectionCount": 1,
    "myLikeState": true,
    "myCollectionState": true,
    "stepList": [
    {
    "id": 7,
    "content": "300g 猪里脊肉洗净，切成 3mm 厚的肉片，加 7g
    盐、1 勺料酒、1 个鸡蛋、100g 淀粉和 100g 清水拌匀，腌制 15 分钟。",
    "imgUrl": "/dev-api/profile/upload/image/2022/03/08/a
    d5d331e-ffee-4ae3-9890-abf4111350a0.jpg",
    "sort": 1,
    "dishesId": 7
    },
    {
    "id": 8,
    "content": "盛出，点缀几片香菜，锅包肉完成！",
    "imgUrl": "/dev-api/profile/upload/image/2022/03/08/3
    40c8f21-e61c-4210-868a-cd9c5a3b8326.jpg",
    "sort": 2,
    "dishesId": 7
    }
    ],
    "author": {
    "id": 7,
    "name": "一条小鱼儿",
    "avatar": "/dev-api/profile/upload/image/2022/03/08/94761
    27e-b738-45f9-bc7c-1edc7452569f.jpg"
    }
    }
    }
    22.1.3 获取热门搜索词列表
     */
    const val get_api_kitchen_helper_dishes__id_= "/prod-api/api/kitchen-helper/dishes/{id}"

    /**22.1.3 获取热门搜索词列表 GET
    接口描述 分页获取历史搜索热词列表
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/kitchen-helper/dishes/hot-keywords
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    appealCategoryId 所属诉求分类 ID true integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    data 全部数据列表 array
    id 搜索热词记录 ID integer
    参数名称 参数说明 类型
    keyword 搜索热词内容 string
    searchTimes 被搜索次数 integer
    响应示例
    {
    "msg": "操作成功",
    "code": 200,
    "data": [
    {
    "id": 9,
    "keyword": "红烧",
    "searchTimes": 4
    }
    ]
    }
    22.2 菜品收藏
    22.2.1 收藏/取消收藏某个菜品
     */
    const val get_api_kitchen_helper_dishes_hot_keywords= "/prod-api/api/kitchen-helper/dishes/hot-keywords"

    /**22.2.1 收藏/取消收藏某个菜品 POST
    接口描述 提交对某到菜品的收藏状态（收藏/取消收藏）
    请求数据类型
    application/json
    请求示例
    {
    "dishesId": 8,
    "newState": false
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    dishesId 菜品 ID true integer
    newState
    新状态（true 收藏 ，
    false 取消收藏）
    true boolean
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功"
    }
    22.2.2 分页获取当前用户收藏的所有菜品
     */
    const val post_api_kitchen_helper_dishes_collection= "/prod-api/api/kitchen-helper/dishes-collection"

    /**22.2.2 分页获取当前用户收藏的所有菜品 GET
    接口描述 分页获取当前用户收藏的所有菜品列表
    请求数据类型
    application/x-www-form-urlencoded
    请求示例
    /prod-api/api/kitchen-helper/dishes-collection/list?appealCategoryId=
    4&pageNum=1&pageSize=10
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    参数名称 参数说明 请求类型 必须 数据类型
    pageNum 分页页码 false integer
    pageSize 分页大小 false integer
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    rows 全部数据列表 array
    id 菜品 ID integer
    name 菜品名称 string
    authorId 菜品作者（推荐人）ID integer
    imgUrl 菜品图片 URL string
    ingredients 菜品配料表 string
    likeCount 点赞数量 integer
    collectionCount 收藏数量 integer
    myLikeState 我的点赞状态 boolean
    myCollectionState 我的收藏状态 boolean
    响应示例
    {
    "total": 1,
    "rows": [
    {
    "id": 7,
    "name": "锅包肉",
    "imgUrl": "/dev-api/profile/upload/image/2022/03/08/07bfd
    f31-cbb3-40fd-bb7e-63b8c28172ef.jpg",
    "authorId": 7,
    "ingredients": "猪里脊肉 300g，鸡蛋 1 个，胡萝卜丝少许，香
    菜几片，盐 10g，料酒 1 勺，淀粉 100g，糖 60g，白醋 90g，米醋 10g，京葱丝、
    姜丝、蒜末适量",
    "likeCount": 1,
    "collectionCount": 1,
    "myLikeState": true,
    "myCollectionState": true,
    "stepList": null,
    "author": null
    }
    ],
    "code": 200,
    "msg": "查询成功"
    }
    22.3 菜品点赞
    22.3.1 点赞/取消点赞某个菜品
     */
    const val get_api_kitchen_helper_dishes_collection_list= "/prod-api/api/kitchen-helper/dishes-collection/list"

    /**22.3.1 点赞/取消点赞某个菜品 POST
    接口描述 分页获取指定诉求分类下的所有的诉求
    请求数据类型
    application/json
    请求示例
    {
    "dishesId": 7,
    "newState": true
    }
    请求参数
    参数名称 参数说明 请求类型 必须 数据类型
    参数名称 参数说明 请求类型 必须 数据类型
    dishesId 菜品 ID true integer
    newState
    新状态（true 收藏，
    false 取消收藏）
    true boolean
    响应参数
    参数名称 参数说明 类型
    code 状态码 integer
    msg 消息内容 string
    响应示例
    {
    "code": 200,
    "msg": "查询成功"
    }
     */
    const val post_api_kitchen_helper_dishes_like= "/prod-api/api/kitchen-helper/dishes-like"


}