drop table if exists cms_category;
drop table if exists cms_article;
drop table if exists cms_article_data;
drop table if exists cms_comment;
drop table if exists cms_guestbook;
drop table if exists cms_link;
drop table if exists cms_site;

create table if not exists cms_category (
  id bigint NOT NULL AUTO_INCREMENT COMMENT '编号',
  site_id bigint DEFAULT 1 COMMENT '站点编号',
  office_id bigint  COMMENT '归属机构',
  parent_id bigint NOT NULL COMMENT '父级编号',
  parent_ids varchar(255) NOT NULL COMMENT '所有父级编号',
  module varchar(20)  DEFAULT NULL COMMENT '栏目模块（article：文章；picture：图片；download：下载；link：链接；special：专题）',
  name varchar(100)  NOT NULL COMMENT '栏目名称',
  image varchar(255)  DEFAULT NULL COMMENT '栏目图片',
  href varchar(255)  DEFAULT NULL COMMENT '链接',
  target varchar(20)  DEFAULT NULL COMMENT '目标（ _blank、_self、_parent、_top）',
  description varchar(255)  DEFAULT NULL COMMENT '描述，填写有助于搜索引擎优化',
  keywords varchar(255)  DEFAULT NULL COMMENT '关键字，填写有助于搜索引擎优化',
  sort int DEFAULT 6 COMMENT '排序（升序）',
  in_menu int DEFAULT 1 COMMENT '是否在导航中显示（1：显示；0：不显示）',
  in_list int  DEFAULT 1 COMMENT '是否在分类页中显示列表（1：显示；0：不显示）',
  show_modes int  DEFAULT 0 COMMENT '展现方式（0:有子栏目显示栏目列表，无子栏目显示内容列表;1：首栏目内容列表；2：栏目第一条内容）',
  allow_comment int  DEFAULT 0 COMMENT '是否允许评论',
  is_audit int  DEFAULT 1 COMMENT '是否需要审核',
  remarks varchar(255)  DEFAULT NULL COMMENT '备注信息',
  del_flag int  NOT NULL DEFAULT 0 COMMENT '删除标记（0：正常；1：删除）',
  create_by bigint NOT NULL COMMENT '创建者',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_by bigint NOT NULL COMMENT '更新者',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  PRIMARY KEY (id),
  KEY cms_category_module (module),
  KEY cms_category_del_flag (del_flag)
) ENGINE=InnoDB  CHARSET=utf8 COLLATE=utf8_bin COMMENT='栏目表';

create table if not exists cms_article (
  id bigint NOT NULL AUTO_INCREMENT COMMENT '编号',
  category_id bigint NOT NULL COMMENT '栏目编号',
  title varchar(255) NOT NULL COMMENT '标题',
  color varchar(50) COMMENT '标题颜色（red：红色；green：绿色；blue：蓝色；yellow：黄色；orange：橙色）',
  image varchar(255)  COMMENT '文章图片',
  keywords varchar(255)  DEFAULT NULL COMMENT '关键字',
  description varchar(255)  DEFAULT NULL COMMENT '描述、摘要',
  weight int DEFAULT 0 COMMENT '权重，越大越靠前',
  weight_date datetime COMMENT '权重期限，过期后将权重设置为：0',
  hits int DEFAULT 0 COMMENT '点击数',
  posid varchar(10)  COMMENT '推荐位，多选（1：首页焦点图；2：栏目页文章推荐；）',
  remarks varchar(255)  DEFAULT NULL COMMENT '备注信息',
  del_flag int  NOT NULL DEFAULT 0 COMMENT '删除标记（0：正常；1：删除）',
  copyfrom varchar(255) COMMENT '文章来源',
  relation varchar(255) COMMENT '相关文章',
  allow_comment int COMMENT '是否允许评论',
  create_by bigint COMMENT '创建者',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_by bigint  COMMENT '更新者',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  PRIMARY KEY (id),
  KEY cms_article_keywords (keywords),
  KEY cms_article_del_flag (del_flag),
  KEY cms_article_weight (weight),
  KEY cms_article_update_date (update_time),
  KEY cms_article_category_id (category_id)
) ENGINE=InnoDB CHARSET=utf8 COLLATE=utf8_bin COMMENT='文章表';

create table if not exists cms_article_data (
  id bigint NOT NULL AUTO_INCREMENT COMMENT '编号',
  content text  COMMENT '文章内容',
  PRIMARY KEY (id)
) ENGINE=InnoDB CHARSET=utf8 COLLATE=utf8_bin COMMENT='文章详表';

create table if not exists cms_comment (
  id bigint NOT NULL AUTO_INCREMENT COMMENT '编号',
  category_id bigint NOT NULL COMMENT '栏目编号',
  content_id bigint NOT NULL COMMENT '栏目内容的编号（Article.id、Photo.id、Download.id）',
  title varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '栏目内容的标题（Article.title、Photo.title、Download.title）',
  content varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '评论内容',
  name varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '评论姓名',
  ip varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '评论IP',
  audit_user_id bigint DEFAULT NULL COMMENT '审核人',
  audit_date datetime DEFAULT NULL COMMENT '审核时间',
  del_flag int NOT NULL DEFAULT 0 COMMENT '删除标记（0：正常；1：删除）',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  PRIMARY KEY (id),
  KEY cms_comment_category_id (category_id) ,
  KEY cms_comment_content_id (content_id) ,
  KEY cms_comment_status (del_flag)
) ENGINE=InnoDB CHARSET=utf8 COLLATE=utf8_bin COMMENT='评论表';

create table if not exists cms_guestbook (
  id bigint NOT NULL AUTO_INCREMENT COMMENT '编号',
  type int  NOT NULL COMMENT '留言分类（271咨询、272建议、273投诉、274其它）',
  content varchar(255) COLLATE utf8_bin NOT NULL COMMENT '留言内容',
  name varchar(100) COLLATE utf8_bin  COMMENT '姓名',
  email varchar(100) COLLATE utf8_bin  COMMENT '邮箱',
  phone varchar(100) COLLATE utf8_bin  COMMENT '电话',
  workunit varchar(100) COLLATE utf8_bin  COMMENT '单位',
  ip varchar(20) COLLATE utf8_bin NOT NULL COMMENT 'IP',
  create_date datetime NOT NULL COMMENT '留言时间',
  re_user_id bigint DEFAULT NULL COMMENT '回复人',
  re_date datetime DEFAULT NULL COMMENT '回复时间',
  re_content varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '回复内容',
  del_flag int NOT NULL DEFAULT 0 COMMENT '删除标记（0：正常；1：删除）',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  PRIMARY KEY (id),
  KEY cms_guestbook_del_flag (del_flag)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='留言板';

create table if not exists cms_link (
  id bigint NOT NULL AUTO_INCREMENT COMMENT '编号',
  category_id bigint NOT NULL COMMENT '栏目编号',
  title varchar(255) COLLATE utf8_bin NOT NULL COMMENT '链接名称',
  color varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '标题颜色（red：红色；green：绿色；blue：蓝色；yellow：黄色；orange：橙色）',
  image varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '链接图片，如果上传了图片，则显示为图片链接',
  href varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '链接地址',
  weight int DEFAULT 0 COMMENT '权重，越大越靠前',
  weight_date datetime COMMENT '权重期限，过期后将权重设置为：0',
  remarks varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '备注信息',
  del_flag int NOT NULL DEFAULT 0 COMMENT '删除标记（0：正常；1：删除）',
  create_by bigint COMMENT '创建者',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_by bigint  COMMENT '更新者',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  PRIMARY KEY (id),
  KEY cms_link_category_id (category_id),
  KEY cms_link_title (title),
  KEY cms_link_del_flag (del_flag),
  KEY cms_link_weight (weight),
  KEY cms_link_create_by (create_by),
  KEY cms_link_update_time (update_time)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='友情链接';

create table if not exists cms_site (
  id bigint NOT NULL AUTO_INCREMENT COMMENT '编号',
  name varchar(100) COLLATE utf8_bin NOT NULL COMMENT '站点名称',
  title varchar(100) COLLATE utf8_bin NOT NULL COMMENT '站点标题',
  description varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '描述，填写有助于搜索引擎优化',
  keywords varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '关键字，填写有助于搜索引擎优化',
  theme varchar(255) COLLATE utf8_bin DEFAULT 'default' COMMENT '主题',
  copyright text COLLATE utf8_bin COMMENT '版权信息',
  remarks varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '备注信息',
  del_flag int NOT NULL DEFAULT 0 COMMENT '删除标记（0：正常；1：删除）',
  create_by bigint COMMENT '创建者',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_by bigint  COMMENT '更新者',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  PRIMARY KEY (id),
  KEY cms_site_del_flag (del_flag)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='站点表'


