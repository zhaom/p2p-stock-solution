drop table if exists cms_category;


create table if not exists cms_category (
  id bigint NOT NULL AUTO_INCREMENT COMMENT '编号',
  parent_id bigint NOT NULL COMMENT '父级编号',
  parent_ids varchar(255) NOT NULL COMMENT '所有父级编号',
  module varchar(20)  DEFAULT NULL COMMENT '栏目模块（article：文章；picture：图片；download：下载；link：链接；special：专题）',
  name varchar(100)  NOT NULL COMMENT '栏目名称',
  image varchar(255)  DEFAULT NULL COMMENT '栏目图片',
  href varchar(255)  DEFAULT NULL COMMENT '链接',
  target varchar(20)  DEFAULT NULL COMMENT '目标（ _blank、_self、_parent、_top）',
  description varchar(255)  DEFAULT NULL COMMENT '描述，填写有助于搜索引擎优化',
  keywords varchar(255)  DEFAULT NULL COMMENT '关键字，填写有助于搜索引擎优化',
  sort int DEFAULT '30' COMMENT '排序（升序）',
  in_menu int DEFAULT 1 COMMENT '是否在导航中显示（1：显示；0：不显示）',
  in_list int  DEFAULT 1 COMMENT '是否在分类页中显示列表（1：显示；0：不显示）',
  show_modes int  DEFAULT 0 COMMENT '展现方式（0:有子栏目显示栏目列表，无子栏目显示内容列表;1：首栏目内容列表；2：栏目第一条内容）',
  allow_comment int  DEFAULT NULL COMMENT '是否允许评论',
  is_audit int  DEFAULT NULL COMMENT '是否需要审核',
  create_by bigint DEFAULT NULL COMMENT '创建者',
  create_date datetime DEFAULT NULL COMMENT '创建时间',
  update_by bigint DEFAULT NULL COMMENT '更新者',
  update_date datetime DEFAULT NULL COMMENT '更新时间',
  remarks varchar(255)  DEFAULT NULL COMMENT '备注信息',
  del_flag int  NOT NULL DEFAULT 0 COMMENT '删除标记（0：正常；1：删除）',
  PRIMARY KEY (id),
  KEY cms_category_parent_id (parent_id),
  KEY cms_category_parent_ids (parent_ids),
  KEY cms_category_module (module),
  KEY cms_category_name (name),
  KEY cms_category_sort (sort),
  KEY cms_category_del_flag (del_flag)
) ENGINE=InnoDB  CHARSET=utf8 COLLATE=utf8_bin COMMENT='栏目表'
