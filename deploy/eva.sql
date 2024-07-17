-- 创建csv data的头信息表
USE eva;

-- 创建场景信息表
CREATE TABLE `eva_scene_info` (
  `scene_id` BIGINT(20) AUTO_INCREMENT,
  `scene_name` VARCHAR(255) NOT NULL,
  `start_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `end_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `create_by` VARCHAR(255) DEFAULT NULL,
  `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `is_delete` INT(11) DEFAULT '0',
  PRIMARY KEY (`scene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='场景信息表';

-- 新建场景
INSERT INTO eva_scene_info (scene_name, is_delete, create_by) VALUES ('sug列表基准评测', 0, 'zhouyaping04');

-- 创建任务信息表
CREATE TABLE `eva_scene_task_info` (
  `scene_task_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `scene_id` BIGINT(20) NOT NULL,
  `eva_data_id` BIGINT(20) DEFAULT NULL,
  `metric_package_id` BIGINT(20) DEFAULT NULL,
  `result_id` CHAR(36) DEFAULT NULL,
  `status` INT(11) NOT NULL,
  `status_description` VARCHAR(255) DEFAULT NULL,
  `start_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `end_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `label` VARCHAR(255) DEFAULT NULL,
  `QPS` INT(11) DEFAULT NULL,
  `host_a` VARCHAR(255) DEFAULT NULL,
  `host_b` VARCHAR(255) DEFAULT NULL,
  `count` INT(11) DEFAULT NULL,
  `execute_by` VARCHAR(255) DEFAULT NULL,
  `task_type` INT(11) DEFAULT NULL,
  `create_by` VARCHAR(255) DEFAULT NULL,
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_by` VARCHAR(255) DEFAULT NULL,
  `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`scene_task_id`)
) ENGINE=InnoDB AUTO_INCREMENT=105 DEFAULT CHARSET=utf8 COMMENT='任务信息表';

-- 新建任务
INSERT INTO `eva_scene_task_info`
(`scene_id`, `eva_data_id`, `metric_package_id`, `status`, `status_description`, `label`, `QPS`, `host_a`, `host_b`, `task_type`, `execute_by`, `create_by`, `update_by`)
VALUES
(1, 2, 1, 1, '未开始', 'pipeline流水线任务', 5, '10.188.82.118:8410', '10.184.41.47:8410', 2, 'pipeline', 'pipeline', 'pipeline');

-- 创建套餐信息表
CREATE TABLE `eva_metric_package_info` (
    `eva_package_id` BIGINT(20) AUTO_INCREMENT,
    `description` VARCHAR(255),
    `business` VARCHAR(255) NOT NULL,
    `product` VARCHAR(255) NOT NULL,
    `interface_eva` VARCHAR(255) NOT NULL,
    `create_by` VARCHAR(255),
    `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `update_by` VARCHAR(255),
    `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`eva_package_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='套餐信息表';

-- 插入套餐信息
INSERT INTO eva_metric_package_info
(description, business, product, interface_eva, create_by, update_by)
VALUES
('sug列表基础评测包', '地图', '搜索', 'sug', 'zhouyaping04', 'zhouyaping04');

-- 创建指标信息表
CREATE TABLE `eva_metric_info` (
  `eva_metric_id` BIGINT(20) AUTO_INCREMENT,
  `busniess` VARCHAR(255) NOT NULL,
  `product` VARCHAR(255) NOT NULL,
  `interface_eva` VARCHAR(255) NOT NULL,
  `module` VARCHAR(255) NOT NULL,
  `eva_id` VARCHAR(255) NOT NULL,
  `eva_name` VARCHAR(255) NOT NULL,
  `metric_type` INT(11) DEFAULT NULL,
  `priority` INT(11) DEFAULT NULL,
  `category_1` VARCHAR(255) DEFAULT NULL,
  `category_2` VARCHAR(255) DEFAULT NULL,
  `description` TEXT,
  `pattern` TEXT,
  `cacl_description` TEXT,
  `threadhold` DOUBLE DEFAULT NULL,
  `create_by` VARCHAR(255) DEFAULT NULL,
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_by` VARCHAR(255) DEFAULT NULL,
  `update_time` TIMESTAMP ON UPDATE CURRENT_TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`eva_metric_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='指标信息表';

-- 插入指标信息
INSERT INTO `eva_metric_info`
(`busniess`, `product`, `interface_eva`, `module`, `eva_id`, `eva_name`, `metric_type`, `priority`, `category_1`, `category_2`, `description`, `pattern`, `cacl_description`, `threadhold`, `create_by`)
VALUES
('地图', '搜索', 'sug', 'list', '0001', 'consistency_rate', 2, 1, 'all', 'all', 'count一致率,比较实验组结果列表页的count与对照组一致的数量占比', '$.sug_infos[*].id', 'count一致数/总请求量', 0.99, 'zhouyaping04');

-- 创建套餐指标关联表
CREATE TABLE `eva_metric_package_relation` (
  `eva_package_id` BIGINT(20) NOT NULL,
  `eva_metric_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`eva_package_id`, `eva_metric_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='套餐指标关联表';

-- 插入套餐指标关联数据
INSERT INTO `eva_metric_package_relation` (`eva_package_id`, `eva_metric_id`) VALUES (1, 1);

-- 创建csv格式评测数据header信息表
CREATE TABLE IF NOT EXISTS `csv_info` (
    `csv_info_id` BIGINT AUTO_INCREMENT NOT NULL,
    `eva_data_id` BIGINT NOT NULL,
    `header_info` TEXT,
    `create_by` VARCHAR(255) NOT NULL,
    `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `update_by` VARCHAR(255) NOT NULL,
    `update_time` TIMESTAMP ON UPDATE CURRENT_TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`csv_info_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='csv格式评测数据header信息表';

-- 创建评测数据信息表
CREATE TABLE IF NOT EXISTS `eva_data_info` (
  `eva_data_id` BIGINT(20) AUTO_INCREMENT NOT NULL,
  `data_name` VARCHAR(255) DEFAULT NULL,
  `slice_num` INT(11) DEFAULT NULL,
  `business` VARCHAR(255) DEFAULT NULL,
  `product` VARCHAR(255) DEFAULT NULL,
  `data_paths` TEXT DEFAULT NULL,
  `create_by` VARCHAR(255) DEFAULT NULL,
  `create_time` DATETIME DEFAULT NULL,
  `update_by` VARCHAR(255) DEFAULT NULL,
  `update_time` DATETIME DEFAULT NULL,
  `expire_time` DATETIME DEFAULT NULL,
  `is_delete` INT(11) DEFAULT NULL,
  `size` BIGINT(20) DEFAULT NULL,
  `readable_size` VARCHAR(255) DEFAULT NULL,
  `line` BIGINT(20) DEFAULT NULL,
  `data_type` INT(11) DEFAULT NULL,
  `start_index` INT(11) DEFAULT NULL,
  `page` INT(11) DEFAULT NULL,
  `page_size` INT(11) DEFAULT NULL,
  PRIMARY KEY (`eva_data_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='评测数据信息表';

-- 创建评测结果表
CREATE TABLE `eva_result` (
    `id` BIGINT(20) AUTO_INCREMENT,
    `scene_task_id` BIGINT(20) NOT NULL,
    `result_id` CHAR(36) NOT NULL,
    `patrol_version` VARCHAR(255) NOT NULL,
    `module_name` VARCHAR(255) NOT NULL,
    `cn_module_name` VARCHAR(255) NOT NULL,
    `strategy_code` VARCHAR(255) NOT NULL,
    `strategy_name` VARCHAR(255) NOT NULL,
    `cn_strategy_name` VARCHAR(255) NOT NULL,
    `priority` TINYINT,
    `is_stages` BOOLEAN NOT NULL,
    `hit_volume` DOUBLE NOT NULL,
    `hit_rate` DOUBLE NOT NULL,
    `top_k` INT(11) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='评测结果表';

-- 创建场景配置信息表
CREATE TABLE `scene_config` (
 `id` BIGINT(18) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `scene_id` BIGINT(18) NOT NULL COMMENT '场景id',
 `config_type` INT(3) NOT NULL COMMENT '配置类型',
 `config_value` TEXT NOT NULL COMMENT '配置内容（json字符串）',
 `is_delete` INT(1) DEFAULT 0 COMMENT '是否已删除（0:未删除; 1:已删除）',
 `create_by` VARCHAR(50) DEFAULT NULL COMMENT '创建人',
 `create_time` DATETIME DEFAULT NULL COMMENT '创建时间',
 `update_by` VARCHAR(50) DEFAULT NULL COMMENT '修改人',
 `updatetime` DATETIME DEFAULT NULL COMMENT '修改时间',
 PRIMARY KEY (`id`),
 KEY INDEX_NORMAL_SCENE_ID (`scene_id`),
 KEY INDEX_NORMAL_UPDATETIME (`updatetime`)
) ENGINE=InnoDB CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='场景配置信息表';
