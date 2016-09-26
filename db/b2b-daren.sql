drop table if exists TALENT_BANK;

drop table if exists TALENT_GAINS;

drop table if exists TALENT_LEVEL;

drop table if exists TALENT_PRIZES;

drop table if exists TALENT_SCALE;

drop table if exists TALENT_USER;

/*==============================================================*/
/* Table: TALENT_BANK                                           */
/*==============================================================*/
create table TALENT_BANK
(
   ID                   bigint(18) not null auto_increment comment 'ID',
   BANK_NAME            varchar(100) not null comment '姓名',
   BANK_MOBILE          varchar(32) not null comment '手机号',
   ID_CARD              varchar(32) not null comment '身份证号码',
   BANK_TYPE            int(1) not null comment '银行类型',
   BANK_NO              varchar(100) not null comment '银行卡号',
   DELETE_FLAG          int(1) default 0 comment '删除标记@0：有效数据 1：无效数据',
   CREATE_TIME          datetime not null comment '创建时间',
   UPDATE_TIME          timestamp comment '修改时间',
   primary key (ID)
);

alter table TALENT_BANK comment '聚贸达人银行信息';

/*==============================================================*/
/* Table: TALENT_GAINS                                          */
/*==============================================================*/
create table TALENT_GAINS
(
   ID                   bigint(18) not null auto_increment comment 'ID',
   ORDER_NO             bigint(18) comment '订单编码',
   GOODS_NAME           bigint(18) comment '商品名称',
   REFERRAL_CODE        varchar(32) not null comment '推荐码',
   TALENT_USER_ID       bigint(18) comment '用户ID',
   BUYER_NAME           varchar(100) comment '买方名称',
   SELLER_NAME          varchar(100) comment '卖方名称',
   ORDER_TIME           datetime comment '订单时间',
   ORDER_UNIT           int(8) comment '销售单位',
   SCALE_TOTAL          int(8) comment '销量',
   SCALE_BALANCE        bigint(18) comment '销售额',
   GAINS_BALANCE        bigint(18) comment '收益金额',
   CREATE_TIME          datetime comment '创建时间',
   UPDATE_TIME          timestamp comment '修改时间',
   primary key (ID)
);

alter table TALENT_GAINS comment '聚贸达人收益';

/*==============================================================*/
/* Table: TALENT_LEVEL                                          */
/*==============================================================*/
create table TALENT_LEVEL
(
   ID                   bigint(18) not null auto_increment,
   SCALE_ID             bigint(18) not null comment '比例ID',
   LEVEL                int(2) not null comment '级别',
   VALUE                varchar(32) not null comment '值',
   RANGE_START          varchar(32) comment '开始范围',
   RANGE_END            varchar(32) comment '结束范围',
   CREATE_TIME          datetime comment '创建时间',
   UPDATE_TIME          timestamp comment '修改时间',
   DELETE_FLAG          int(1) default 0 comment '0:有效 1：无效',
   primary key (ID)
);

alter table TALENT_LEVEL comment '收益比例级别';

/*==============================================================*/
/* Table: TALENT_PRIZES                                         */
/*==============================================================*/
create table TALENT_PRIZES
(
   ID                   bigint(18) not null auto_increment comment 'ID',
   TALENT_USER_ID       bigint(18) comment '聚贸达人ID',
   MONTH_NUM            int(2) comment '月数',
   STATUS               int(1) comment '0：完成 1：取消   2：违规',
   REMARK               varchar(2000) comment '备注',
   CREATE_TIME          datetime not null comment '创建时间-注册时间',
   UPDATE_TIME          timestamp comment '修改时间',
   MONEY                decimal(10,4) comment '金额',
   primary key (ID)
);

/*==============================================================*/
/* Table: TALENT_SCALE                                          */
/*==============================================================*/
create table TALENT_SCALE
(
   ID                   bigint(18) not null auto_increment,
   INDUSTRY_ID          int(8) not null comment '品种 -行业ID',
   CATE_ID              int(8) not null comment '分类',
   SOURCE_TYPE          int(1) not null comment '0：销售额 1：销售量',
   SCALE_TYPE           int(1) not null comment '0： 比例 1：金额',
   CREATE_TIME          datetime not null comment '创建时间',
   UPDATE_TIME          timestamp comment '修改时间',
   DELETE_FLAG          int(1) default 0 comment '删除标记@0：有效数据 1：无效数据',
   primary key (ID)
);

alter table TALENT_SCALE comment '比例管理';

/*==============================================================*/
/* Table: TALENT_USER                                           */
/*==============================================================*/
create table TALENT_USER
(
   ID                   bigint(18) not null auto_increment comment 'ID',
   NAME                 varchar(100) not null comment '聚贸达人名字',
   MOBILE               varchar(32) not null comment '聚贸达人手机号',
   ID_CARD              varchar(32) not null comment '身份证号',
   PRODUCT              int(8) comment '擅长品种',
   REFERRAL_CODE        varchar(32) not null comment '推荐码',
   PARENT_ID            bigint(18) not null comment '上级ID',
   USER_ID              bigint(18) not null comment '关联用户ID',
   INDUSTRY_ID          bigint(18) comment '行业ID',
   STATUS               int(1) comment '状态@0:启用 1:停用',
   NO_TIME              datetime comment '停用时间',
   OPEN_TIME            datetime comment '启用时间',
   CREATE_TIME          datetime not null comment '创建时间-注册时间',
   UPDATE_TIME          timestamp comment '修改时间',
   REMART               varchar(255) comment '描述',
   USER_TYPE            int(1) comment '用户类型',
   USERNAME             varchar(32) default '0' comment '用户名',
   PASSWORD             varchar(32) comment '密码',
   primary key (ID)
);

alter table TALENT_USER comment '聚贸达人用户表';
